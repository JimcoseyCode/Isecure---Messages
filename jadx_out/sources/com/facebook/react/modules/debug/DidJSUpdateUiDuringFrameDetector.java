package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\nR$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetector;", "Lcom/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener;", "Lcom/facebook/react/uimanager/debug/NotThreadSafeViewHierarchyUpdateDebugListener;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "startTime", "endTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "didEndFrameIdle", "(JJ)Z", "Li7/B;", "onTransitionToBridgeIdle", "onTransitionToBridgeBusy", "onBridgeDestroyed", "onViewHierarchyUpdateEnqueued", "onViewHierarchyUpdateFinished", "frameStartTimeNanos", "frameEndTimeNanos", "getDidJSHitFrameAndCleanup", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "transitionToIdleEvents", "Ljava/util/ArrayList;", "transitionToBusyEvents", "viewHierarchyUpdateEnqueuedEvents", "viewHierarchyUpdateFinishedEvents", "wasIdleAtEndOfLastFrame", "Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DidJSUpdateUiDuringFrameDetector implements NotThreadSafeBridgeIdleDebugListener, NotThreadSafeViewHierarchyUpdateDebugListener {
    private final ArrayList<Long> transitionToIdleEvents = new ArrayList<>(20);
    private final ArrayList<Long> transitionToBusyEvents = new ArrayList<>(20);
    private final ArrayList<Long> viewHierarchyUpdateEnqueuedEvents = new ArrayList<>(20);
    private final ArrayList<Long> viewHierarchyUpdateFinishedEvents = new ArrayList<>(20);
    private volatile boolean wasIdleAtEndOfLastFrame = true;

    private final boolean didEndFrameIdle(long startTime, long endTime) {
        long lastEventBetweenTimestamps = DidJSUpdateUiDuringFrameDetectorKt.getLastEventBetweenTimestamps(this.transitionToIdleEvents, startTime, endTime);
        long lastEventBetweenTimestamps2 = DidJSUpdateUiDuringFrameDetectorKt.getLastEventBetweenTimestamps(this.transitionToBusyEvents, startTime, endTime);
        return (lastEventBetweenTimestamps == -1 && lastEventBetweenTimestamps2 == -1) ? this.wasIdleAtEndOfLastFrame : lastEventBetweenTimestamps > lastEventBetweenTimestamps2;
    }

    public final synchronized boolean getDidJSHitFrameAndCleanup(long frameStartTimeNanos, long frameEndTimeNanos) {
        boolean z10;
        try {
            boolean zHasEventBetweenTimestamps = DidJSUpdateUiDuringFrameDetectorKt.hasEventBetweenTimestamps(this.viewHierarchyUpdateFinishedEvents, frameStartTimeNanos, frameEndTimeNanos);
            boolean zDidEndFrameIdle = didEndFrameIdle(frameStartTimeNanos, frameEndTimeNanos);
            z10 = true;
            if (!zHasEventBetweenTimestamps && (!zDidEndFrameIdle || DidJSUpdateUiDuringFrameDetectorKt.hasEventBetweenTimestamps(this.viewHierarchyUpdateEnqueuedEvents, frameStartTimeNanos, frameEndTimeNanos))) {
                z10 = false;
            }
            DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.transitionToIdleEvents, frameEndTimeNanos);
            DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.transitionToBusyEvents, frameEndTimeNanos);
            DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.viewHierarchyUpdateEnqueuedEvents, frameEndTimeNanos);
            DidJSUpdateUiDuringFrameDetectorKt.cleanUp(this.viewHierarchyUpdateFinishedEvents, frameEndTimeNanos);
            this.wasIdleAtEndOfLastFrame = zDidEndFrameIdle;
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.transitionToBusyEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.transitionToIdleEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public synchronized void onViewHierarchyUpdateEnqueued() {
        this.viewHierarchyUpdateEnqueuedEvents.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener
    public synchronized void onViewHierarchyUpdateFinished() {
        this.viewHierarchyUpdateFinishedEvents.add(Long.valueOf(System.nanoTime()));
    }
}
