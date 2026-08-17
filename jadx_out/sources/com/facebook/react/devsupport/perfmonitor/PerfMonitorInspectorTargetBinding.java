package com.facebook.react.devsupport.perfmonitor;

import com.facebook.react.devsupport.interfaces.TracingState;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorInspectorTargetBinding;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/TracingState;", "getTracingState", "()Lcom/facebook/react/devsupport/interfaces/TracingState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pauseAndAnalyzeBackgroundTrace", "()Z", "Li7/B;", "resumeBackgroundTrace", "()V", "stopBackgroundTrace", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PerfMonitorInspectorTargetBinding {
    TracingState getTracingState();

    boolean pauseAndAnalyzeBackgroundTrace();

    void resumeBackgroundTrace();

    void stopBackgroundTrace();
}
