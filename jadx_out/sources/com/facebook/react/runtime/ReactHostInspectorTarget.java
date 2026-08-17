package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTarget;
import com.facebook.react.devsupport.perfmonitor.PerfMonitorUpdateListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.soloader.SoLoader;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\b\u0001\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002-.B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014H\u0086 ¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u000f¢\u0006\u0004\b&\u0010\u0011R\u001a\u0010'\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u000eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTarget;", "Ljava/io/Closeable;", "Lcom/facebook/react/runtime/ReactHostImpl;", "reactHostImpl", "<init>", "(Lcom/facebook/react/runtime/ReactHostImpl;)V", "Ljava/util/concurrent/Executor;", "executor", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/util/concurrent/Executor;)Lcom/facebook/jni/HybridData;", "Li7/B;", "sendDebuggerResumeCommand", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "startBackgroundTrace", "()Z", "stopAndMaybeEmitBackgroundTrace", "stopAndDiscardBackgroundTrace", PointerEventHelper.POINTER_TYPE_UNKNOWN, "tracingStateAsInt", "()I", "Lcom/facebook/react/devsupport/interfaces/TracingState;", "getTracingState", "()Lcom/facebook/react/devsupport/interfaces/TracingState;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;", "listener", "addPerfMonitorListener", "(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;)V", "pauseAndAnalyzeBackgroundTrace", "resumeBackgroundTrace", "stopBackgroundTrace", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "handleNativePerfIssueAdded", "(Ljava/lang/String;)V", "close", "isValid", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", PointerEventHelper.POINTER_TYPE_UNKNOWN, "perfMonitorListeners", "Ljava/util/Set;", "Companion", "UIThreadConditionalSyncExecutor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UnstableReactNativeAPI
public final class ReactHostInspectorTarget implements PerfMonitorInspectorTarget, Closeable {
    private static final Companion Companion = new Companion(null);
    private final HybridData mHybridData;
    private final Set<PerfMonitorUpdateListener> perfMonitorListeners;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/runtime/ReactHostInspectorTarget$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/runtime/ReactHostInspectorTarget$UIThreadConditionalSyncExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Li7/B;", "execute", "(Ljava/lang/Runnable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class UIThreadConditionalSyncExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC2855l.g(command, "command");
            if (UiThreadUtil.isOnUiThread()) {
                command.run();
            } else {
                UiThreadUtil.runOnUiThread(command);
            }
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public ReactHostInspectorTarget(ReactHostImpl reactHostImpl) {
        AbstractC2855l.g(reactHostImpl, "reactHostImpl");
        this.mHybridData = initHybrid(reactHostImpl, new UIThreadConditionalSyncExecutor());
        this.perfMonitorListeners = new LinkedHashSet();
    }

    private final native HybridData initHybrid(ReactHostImpl reactHostImpl, Executor executor);

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorEventDispatcher
    public void addPerfMonitorListener(PerfMonitorUpdateListener listener) {
        AbstractC2855l.g(listener, "listener");
        this.perfMonitorListeners.add(listener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTargetBinding
    public TracingState getTracingState() {
        return (TracingState) TracingState.getEntries().get(tracingStateAsInt());
    }

    public final void handleNativePerfIssueAdded(String name) {
        AbstractC2855l.g(name, "name");
        Iterator<T> it = this.perfMonitorListeners.iterator();
        while (it.hasNext()) {
            ((PerfMonitorUpdateListener) it.next()).onPerfIssueAdded(name);
        }
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTargetBinding
    public boolean pauseAndAnalyzeBackgroundTrace() {
        boolean zStopAndMaybeEmitBackgroundTrace = stopAndMaybeEmitBackgroundTrace();
        Iterator<T> it = this.perfMonitorListeners.iterator();
        while (it.hasNext()) {
            ((PerfMonitorUpdateListener) it.next()).onRecordingStateChanged(TracingState.DISABLED);
        }
        return zStopAndMaybeEmitBackgroundTrace;
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTargetBinding
    public void resumeBackgroundTrace() {
        startBackgroundTrace();
        Iterator<T> it = this.perfMonitorListeners.iterator();
        while (it.hasNext()) {
            ((PerfMonitorUpdateListener) it.next()).onRecordingStateChanged(TracingState.ENABLEDINBACKGROUNDMODE);
        }
    }

    public final native void sendDebuggerResumeCommand();

    public final native boolean startBackgroundTrace();

    public final native void stopAndDiscardBackgroundTrace();

    public final native boolean stopAndMaybeEmitBackgroundTrace();

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorInspectorTargetBinding
    public void stopBackgroundTrace() {
        stopAndDiscardBackgroundTrace();
        Iterator<T> it = this.perfMonitorListeners.iterator();
        while (it.hasNext()) {
            ((PerfMonitorUpdateListener) it.next()).onRecordingStateChanged(TracingState.DISABLED);
        }
    }

    public final native int tracingStateAsInt();

    private static /* synthetic */ void getMHybridData$annotations() {
    }
}
