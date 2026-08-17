package com.facebook.react.devsupport.perfmonitor;

import android.app.Activity;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorUpdateListener;", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;", "devHelper", "Lkotlin/Function0;", "Li7/B;", "onRequestOpenDevTools", "<init>", "(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;Lw7/a;)V", "handleRecordingButtonPress", "()V", "enable", "disable", "startBackgroundTrace", "stopBackgroundTrace", "Lcom/facebook/react/devsupport/interfaces/TracingState;", "state", "onRecordingStateChanged", "(Lcom/facebook/react/devsupport/interfaces/TracingState;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "onPerfIssueAdded", "(Ljava/lang/String;)V", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorDevHelper;", "Lw7/a;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.ENABLED, "Z", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;", "view", "Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;", "tracingState", "Lcom/facebook/react/devsupport/interfaces/TracingState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "perfIssueCount", "I", "isEnabled", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PerfMonitorOverlayManager implements PerfMonitorUpdateListener {
    private final PerfMonitorDevHelper devHelper;
    private boolean enabled;
    private final InterfaceC3487a onRequestOpenDevTools;
    private int perfIssueCount;
    private TracingState tracingState;
    private PerfMonitorOverlayView view;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLEDINBACKGROUNDMODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.ENABLEDINCDPMODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PerfMonitorOverlayManager(PerfMonitorDevHelper devHelper, InterfaceC3487a onRequestOpenDevTools) {
        AbstractC2855l.g(devHelper, "devHelper");
        AbstractC2855l.g(onRequestOpenDevTools, "onRequestOpenDevTools");
        this.devHelper = devHelper;
        this.onRequestOpenDevTools = onRequestOpenDevTools;
        this.tracingState = TracingState.ENABLEDINCDPMODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disable$lambda$1(PerfMonitorOverlayManager perfMonitorOverlayManager) {
        PerfMonitorOverlayView perfMonitorOverlayView = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView != null) {
            perfMonitorOverlayView.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0(PerfMonitorOverlayManager perfMonitorOverlayManager) {
        Activity currentActivity = perfMonitorOverlayManager.devHelper.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        if (perfMonitorOverlayManager.view == null) {
            perfMonitorOverlayManager.view = new PerfMonitorOverlayView(currentActivity, new PerfMonitorOverlayManager$enable$1$1(perfMonitorOverlayManager));
        }
        PerfMonitorOverlayView perfMonitorOverlayView = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView != null) {
            perfMonitorOverlayView.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRecordingButtonPress() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.tracingState.ordinal()];
        if (i10 == 1) {
            PerfMonitorInspectorTarget inspectorTarget = this.devHelper.getInspectorTarget();
            if (inspectorTarget == null || inspectorTarget.pauseAndAnalyzeBackgroundTrace()) {
                return;
            }
            this.onRequestOpenDevTools.invoke();
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new C2750m();
            }
        } else {
            PerfMonitorInspectorTarget inspectorTarget2 = this.devHelper.getInspectorTarget();
            if (inspectorTarget2 != null) {
                inspectorTarget2.resumeBackgroundTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPerfIssueAdded$lambda$5(PerfMonitorOverlayManager perfMonitorOverlayManager) {
        PerfMonitorOverlayView perfMonitorOverlayView = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView != null) {
            int i10 = perfMonitorOverlayManager.perfIssueCount + 1;
            perfMonitorOverlayManager.perfIssueCount = i10;
            perfMonitorOverlayView.updatePerfIssueCount(i10);
        }
        PerfMonitorOverlayView perfMonitorOverlayView2 = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView2 != null) {
            perfMonitorOverlayView2.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRecordingStateChanged$lambda$4(PerfMonitorOverlayManager perfMonitorOverlayManager, TracingState tracingState) {
        PerfMonitorOverlayView perfMonitorOverlayView = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView != null) {
            perfMonitorOverlayView.updateRecordingState(tracingState);
        }
        PerfMonitorOverlayView perfMonitorOverlayView2 = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView2 != null) {
            perfMonitorOverlayView2.updatePerfIssueCount(perfMonitorOverlayManager.perfIssueCount);
        }
        PerfMonitorOverlayView perfMonitorOverlayView3 = perfMonitorOverlayManager.view;
        if (perfMonitorOverlayView3 != null) {
            perfMonitorOverlayView3.show();
        }
    }

    public final void disable() {
        this.enabled = false;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.perfmonitor.c
            @Override // java.lang.Runnable
            public final void run() {
                PerfMonitorOverlayManager.disable$lambda$1(this.f20377g);
            }
        });
    }

    public final void enable() {
        if (this.enabled) {
            return;
        }
        this.enabled = true;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.perfmonitor.d
            @Override // java.lang.Runnable
            public final void run() {
                PerfMonitorOverlayManager.enable$lambda$0(this.f20378g);
            }
        });
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorUpdateListener
    public void onPerfIssueAdded(String name) {
        AbstractC2855l.g(name, "name");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.perfmonitor.a
            @Override // java.lang.Runnable
            public final void run() {
                PerfMonitorOverlayManager.onPerfIssueAdded$lambda$5(this.f20374g);
            }
        });
    }

    @Override // com.facebook.react.devsupport.perfmonitor.PerfMonitorUpdateListener
    public void onRecordingStateChanged(final TracingState state) {
        AbstractC2855l.g(state, "state");
        this.tracingState = state;
        if (state != TracingState.DISABLED) {
            this.perfIssueCount = 0;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.perfmonitor.b
            @Override // java.lang.Runnable
            public final void run() {
                PerfMonitorOverlayManager.onRecordingStateChanged$lambda$4(this.f20375g, state);
            }
        });
    }

    public final void startBackgroundTrace() {
        PerfMonitorInspectorTarget inspectorTarget;
        if (this.enabled && (inspectorTarget = this.devHelper.getInspectorTarget()) != null) {
            inspectorTarget.resumeBackgroundTrace();
            onRecordingStateChanged(inspectorTarget.getTracingState());
        }
    }

    public final void stopBackgroundTrace() {
        PerfMonitorInspectorTarget inspectorTarget;
        if (this.enabled && (inspectorTarget = this.devHelper.getInspectorTarget()) != null) {
            inspectorTarget.stopBackgroundTrace();
            onRecordingStateChanged(inspectorTarget.getTracingState());
        }
    }
}
