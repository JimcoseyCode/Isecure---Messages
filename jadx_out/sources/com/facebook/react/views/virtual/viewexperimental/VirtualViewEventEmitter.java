package com.facebook.react.views.virtual.viewexperimental;

import android.graphics.Rect;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.virtual.VirtualViewMode;
import com.facebook.react.views.virtual.VirtualViewModeChangeEmitter;
import com.facebook.react.views.virtual.VirtualViewModeChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/virtual/viewexperimental/VirtualViewEventEmitter;", "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewId", "surfaceId", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "dispatcher", "<init>", "(IILcom/facebook/react/uimanager/events/EventDispatcher;)V", "Lcom/facebook/react/views/virtual/VirtualViewMode;", "mode", "Landroid/graphics/Rect;", "targetRect", "thresholdRect", PointerEventHelper.POINTER_TYPE_UNKNOWN, "synchronous", "Li7/B;", "emitModeChange", "(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V", "I", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VirtualViewEventEmitter implements VirtualViewModeChangeEmitter {
    private final EventDispatcher dispatcher;
    private final int surfaceId;
    private final int viewId;

    public VirtualViewEventEmitter(int i10, int i11, EventDispatcher dispatcher) {
        AbstractC2855l.g(dispatcher, "dispatcher");
        this.viewId = i10;
        this.surfaceId = i11;
        this.dispatcher = dispatcher;
    }

    @Override // com.facebook.react.views.virtual.VirtualViewModeChangeEmitter
    public void emitModeChange(VirtualViewMode mode, Rect targetRect, Rect thresholdRect, boolean synchronous) {
        AbstractC2855l.g(mode, "mode");
        AbstractC2855l.g(targetRect, "targetRect");
        AbstractC2855l.g(thresholdRect, "thresholdRect");
        this.dispatcher.dispatchEvent(new VirtualViewModeChangeEvent(this.surfaceId, this.viewId, mode, targetRect, thresholdRect, synchronous));
    }
}
