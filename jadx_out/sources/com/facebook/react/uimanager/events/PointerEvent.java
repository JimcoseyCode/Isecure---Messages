package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.events.Event;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002;:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010-R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u00100R\u001b\u00106\u001a\u0002018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetTag", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "eventState", "Landroid/view/MotionEvent;", "motionEventToCopy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "coalescingKey", "Li7/B;", "init", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/WritableMap;", "createW3CPointerEvents", "()Ljava/util/List;", "pointerEvent", "modifierKeyMask", "addModifierKeyData", "(Lcom/facebook/react/bridge/WritableMap;I)V", "index", "createW3CPointerEvent", "(I)Lcom/facebook/react/bridge/WritableMap;", "createPointersEventData", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "onDispose", "getCoalescingKey", "()S", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "dispatchModern", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "motionEvent", "Landroid/view/MotionEvent;", "_eventName", "Ljava/lang/String;", "S", "pointersEventData", "Ljava/util/List;", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec$delegate", "Lkotlin/Lazy;", "getEventAnimationDriverMatchSpec", "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;", "eventAnimationDriverMatchSpec", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isClickEvent", "()Z", "Companion", "PointerEventState", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointerEvent extends Event<PointerEvent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final H0.f EVENTS_POOL;
    private static final int POINTER_EVENTS_POOL_SIZE = 6;
    private static final String TAG;
    private static final short UNSET_COALESCING_KEY = -1;
    private String _eventName;
    private short coalescingKey;

    /* JADX INFO: renamed from: eventAnimationDriverMatchSpec$delegate, reason: from kotlin metadata */
    private final Lazy eventAnimationDriverMatchSpec;
    private PointerEventState eventState;
    private MotionEvent motionEvent;
    private List<? extends WritableMap> pointersEventData;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "eventName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetTag", "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", "eventState", "Landroid/view/MotionEvent;", "motionEventToCopy", "Lcom/facebook/react/uimanager/events/PointerEvent;", "obtain", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/PointerEvent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "coalescingKey", "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/PointerEvent;", "TAG", "Ljava/lang/String;", "POINTER_EVENTS_POOL_SIZE", "I", "LH0/f;", "EVENTS_POOL", "LH0/f;", "UNSET_COALESCING_KEY", "S", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PointerEvent obtain(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy) {
            AbstractC2855l.g(eventName, "eventName");
            AbstractC2855l.g(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object objC = AbstractC3007a.c(motionEventToCopy);
            AbstractC2855l.f(objC, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) objC, (short) 0);
            return pointerEvent2;
        }

        private Companion() {
        }

        public final PointerEvent obtain(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey) {
            AbstractC2855l.g(eventName, "eventName");
            AbstractC2855l.g(eventState, "eventState");
            PointerEvent pointerEvent = (PointerEvent) PointerEvent.EVENTS_POOL.acquire();
            if (pointerEvent == null) {
                pointerEvent = new PointerEvent(null);
            }
            PointerEvent pointerEvent2 = pointerEvent;
            Object objC = AbstractC3007a.c(motionEventToCopy);
            AbstractC2855l.f(objC, "assertNotNull(...)");
            pointerEvent2.init(eventName, targetTag, eventState, (MotionEvent) objC, coalescingKey);
            return pointerEvent2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001e\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "primaryPointerId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "activePointerId", "lastButtonState", "surfaceId", "offsetByPointerId", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "hitPathByPointerId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;", "eventCoordinatesByPointerId", "screenCoordinatesByPointerId", "hoveringPointerIds", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V", "getPrimaryPointerId", "()I", "getActivePointerId", "getLastButtonState", "getOffsetByPointerId", "()Ljava/util/Map;", "getHitPathByPointerId", "getEventCoordinatesByPointerId", "getScreenCoordinatesByPointerId", "getHoveringPointerIds", "()Ljava/util/Set;", "getSurfaceId", "supportsHover", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pointerId", "hitPathForActivePointer", "getHitPathForActivePointer", "()Ljava/util/List;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PointerEventState {
        private final int activePointerId;
        private final Map<Integer, float[]> eventCoordinatesByPointerId;
        private final Map<Integer, List<TouchTargetHelper.ViewTarget>> hitPathByPointerId;
        private final Set<Integer> hoveringPointerIds;
        private final int lastButtonState;
        private final Map<Integer, float[]> offsetByPointerId;
        private final int primaryPointerId;
        private final Map<Integer, float[]> screenCoordinatesByPointerId;
        private final int surfaceId;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventState(int i10, int i11, int i12, int i13, Map<Integer, float[]> offsetByPointerId, Map<Integer, ? extends List<TouchTargetHelper.ViewTarget>> hitPathByPointerId, Map<Integer, float[]> eventCoordinatesByPointerId, Map<Integer, float[]> screenCoordinatesByPointerId, Set<Integer> hoveringPointerIds) {
            AbstractC2855l.g(offsetByPointerId, "offsetByPointerId");
            AbstractC2855l.g(hitPathByPointerId, "hitPathByPointerId");
            AbstractC2855l.g(eventCoordinatesByPointerId, "eventCoordinatesByPointerId");
            AbstractC2855l.g(screenCoordinatesByPointerId, "screenCoordinatesByPointerId");
            AbstractC2855l.g(hoveringPointerIds, "hoveringPointerIds");
            this.primaryPointerId = i10;
            this.activePointerId = i11;
            this.lastButtonState = i12;
            this.surfaceId = i13;
            this.offsetByPointerId = offsetByPointerId;
            this.hitPathByPointerId = hitPathByPointerId;
            this.eventCoordinatesByPointerId = eventCoordinatesByPointerId;
            this.screenCoordinatesByPointerId = screenCoordinatesByPointerId;
            this.hoveringPointerIds = new HashSet(hoveringPointerIds);
        }

        public final int getActivePointerId() {
            return this.activePointerId;
        }

        public final Map<Integer, float[]> getEventCoordinatesByPointerId() {
            return this.eventCoordinatesByPointerId;
        }

        public final Map<Integer, List<TouchTargetHelper.ViewTarget>> getHitPathByPointerId() {
            return this.hitPathByPointerId;
        }

        public final List<TouchTargetHelper.ViewTarget> getHitPathForActivePointer() {
            List<TouchTargetHelper.ViewTarget> list = this.hitPathByPointerId.get(Integer.valueOf(this.activePointerId));
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final Set<Integer> getHoveringPointerIds() {
            return this.hoveringPointerIds;
        }

        public final int getLastButtonState() {
            return this.lastButtonState;
        }

        public final Map<Integer, float[]> getOffsetByPointerId() {
            return this.offsetByPointerId;
        }

        public final int getPrimaryPointerId() {
            return this.primaryPointerId;
        }

        public final Map<Integer, float[]> getScreenCoordinatesByPointerId() {
            return this.screenCoordinatesByPointerId;
        }

        public final int getSurfaceId() {
            return this.surfaceId;
        }

        public final boolean supportsHover(int pointerId) {
            return this.hoveringPointerIds.contains(Integer.valueOf(pointerId));
        }
    }

    static {
        String simpleName = PointerEvent.class.getSimpleName();
        AbstractC2855l.f(simpleName, "getSimpleName(...)");
        TAG = simpleName;
        EVENTS_POOL = new H0.f(6);
    }

    public /* synthetic */ PointerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void addModifierKeyData(WritableMap pointerEvent, int modifierKeyMask) {
        pointerEvent.putBoolean("ctrlKey", (modifierKeyMask & 4096) != 0);
        pointerEvent.putBoolean("shiftKey", (modifierKeyMask & 1) != 0);
        pointerEvent.putBoolean("altKey", (modifierKeyMask & 2) != 0);
        pointerEvent.putBoolean("metaKey", (modifierKeyMask & 65536) != 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OUT) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_CANCEL) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.CLICK) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_UP) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_OVER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_MOVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return createW3CPointerEvents();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_DOWN) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_LEAVE) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r1.equals(com.facebook.react.uimanager.events.PointerEventHelper.POINTER_ENTER) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        return j7.AbstractC2800q.e(createW3CPointerEvent(r0));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<WritableMap> createPointersEventData() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int actionIndex = motionEvent.getActionIndex();
        String str = this._eventName;
        if (str == null) {
            AbstractC2855l.y("_eventName");
            str = null;
        }
        switch (str.hashCode()) {
            case -1786514288:
                break;
            case -1780335505:
                break;
            case -1304584214:
                break;
            case -1304316135:
                break;
            case -1304250340:
                break;
            case -1065042973:
                break;
            case -992108237:
                break;
            case 383186882:
                break;
            case 1343400710:
                break;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WritableMap createW3CPointerEvent(int index) {
        boolean z10;
        String str;
        double pressure;
        WritableMap writableMapCreateMap = Arguments.createMap();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerId = motionEvent.getPointerId(index);
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String w3CPointerType = PointerEventHelper.getW3CPointerType(motionEvent.getToolType(index));
        writableMapCreateMap.putString("pointerType", w3CPointerType);
        if (isClickEvent()) {
            z10 = false;
        } else {
            PointerEventState pointerEventState = this.eventState;
            if (pointerEventState == null) {
                AbstractC2855l.y("eventState");
                pointerEventState = null;
            }
            if (!pointerEventState.supportsHover(pointerId)) {
                PointerEventState pointerEventState2 = this.eventState;
                if (pointerEventState2 == null) {
                    AbstractC2855l.y("eventState");
                    pointerEventState2 = null;
                }
                if (pointerId == pointerEventState2.getPrimaryPointerId()) {
                }
            }
            z10 = true;
        }
        writableMapCreateMap.putBoolean("isPrimary", z10);
        PointerEventState pointerEventState3 = this.eventState;
        if (pointerEventState3 == null) {
            AbstractC2855l.y("eventState");
            pointerEventState3 = null;
        }
        float[] fArr = pointerEventState3.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr2 = fArr;
        double dIPFromPixel = PixelUtil.toDIPFromPixel(fArr2[0]);
        double dIPFromPixel2 = PixelUtil.toDIPFromPixel(fArr2[1]);
        writableMapCreateMap.putDouble("clientX", dIPFromPixel);
        writableMapCreateMap.putDouble("clientY", dIPFromPixel2);
        PointerEventState pointerEventState4 = this.eventState;
        if (pointerEventState4 == null) {
            AbstractC2855l.y("eventState");
            pointerEventState4 = null;
        }
        float[] fArr3 = pointerEventState4.getScreenCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        if (fArr3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr4 = fArr3;
        double dIPFromPixel3 = PixelUtil.toDIPFromPixel(fArr4[0]);
        double dIPFromPixel4 = PixelUtil.toDIPFromPixel(fArr4[1]);
        writableMapCreateMap.putDouble("screenX", dIPFromPixel3);
        writableMapCreateMap.putDouble("screenY", dIPFromPixel4);
        writableMapCreateMap.putDouble("x", dIPFromPixel);
        writableMapCreateMap.putDouble("y", dIPFromPixel2);
        writableMapCreateMap.putDouble("pageX", dIPFromPixel);
        writableMapCreateMap.putDouble("pageY", dIPFromPixel2);
        PointerEventState pointerEventState5 = this.eventState;
        if (pointerEventState5 == null) {
            AbstractC2855l.y("eventState");
            pointerEventState5 = null;
        }
        float[] fArr5 = pointerEventState5.getOffsetByPointerId().get(Integer.valueOf(pointerId));
        if (fArr5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float[] fArr6 = fArr5;
        writableMapCreateMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(fArr6[0]));
        writableMapCreateMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(fArr6[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt("detail", 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        if (AbstractC2855l.b(w3CPointerType, PointerEventHelper.POINTER_TYPE_MOUSE) || isClickEvent()) {
            writableMapCreateMap.putDouble("width", 1.0d);
            writableMapCreateMap.putDouble("height", 1.0d);
        } else {
            double dIPFromPixel5 = PixelUtil.toDIPFromPixel(motionEvent.getTouchMajor(index));
            writableMapCreateMap.putDouble("width", dIPFromPixel5);
            writableMapCreateMap.putDouble("height", dIPFromPixel5);
        }
        int buttonState = motionEvent.getButtonState();
        PointerEventState pointerEventState6 = this.eventState;
        if (pointerEventState6 == null) {
            AbstractC2855l.y("eventState");
            pointerEventState6 = null;
        }
        writableMapCreateMap.putInt("button", PointerEventHelper.getButtonChange(w3CPointerType, pointerEventState6.getLastButtonState(), buttonState));
        String str2 = this._eventName;
        if (str2 == null) {
            AbstractC2855l.y("_eventName");
            str2 = null;
        }
        writableMapCreateMap.putInt("buttons", PointerEventHelper.getButtons(str2, w3CPointerType, buttonState));
        if (isClickEvent()) {
            pressure = 0.0d;
        } else {
            int i10 = writableMapCreateMap.getInt("buttons");
            String str3 = this._eventName;
            if (str3 == null) {
                AbstractC2855l.y("_eventName");
                str = null;
            } else {
                str = str3;
            }
            pressure = PointerEventHelper.getPressure(i10, str);
        }
        writableMapCreateMap.putDouble("pressure", pressure);
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        addModifierKeyData(writableMapCreateMap, motionEvent.getMetaState());
        return writableMapCreateMap;
    }

    private final List<WritableMap> createW3CPointerEvents() {
        ArrayList arrayList = new ArrayList();
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            arrayList.add(createW3CPointerEvent(i10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event.EventAnimationDriverMatchSpec eventAnimationDriverMatchSpec_delegate$lambda$1(final PointerEvent pointerEvent) {
        return new Event.EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.g
            @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
            public final boolean match(int i10, String str) {
                return PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(this.f20603a, i10, str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(PointerEvent pointerEvent, int i10, String eventName) {
        AbstractC2855l.g(eventName, "eventName");
        String str = pointerEvent._eventName;
        PointerEventState pointerEventState = null;
        if (str == null) {
            AbstractC2855l.y("_eventName");
            str = null;
        }
        if (!AbstractC2855l.b(eventName, str)) {
            return false;
        }
        if (!PointerEventHelper.isBubblingEvent(eventName)) {
            return pointerEvent.getViewTag() == i10;
        }
        PointerEventState pointerEventState2 = pointerEvent.eventState;
        if (pointerEventState2 == null) {
            AbstractC2855l.y("eventState");
        } else {
            pointerEventState = pointerEventState2;
        }
        Iterator<TouchTargetHelper.ViewTarget> it = pointerEventState.getHitPathForActivePointer().iterator();
        while (it.hasNext()) {
            if (it.next().getViewId() == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(String eventName, int targetTag, PointerEventState eventState, MotionEvent motionEventToCopy, short coalescingKey) {
        super.init(eventState.getSurfaceId(), targetTag, motionEventToCopy.getEventTime());
        this._eventName = eventName;
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.coalescingKey = coalescingKey;
        this.eventState = eventState;
    }

    private final boolean isClickEvent() {
        String str = this._eventName;
        if (str == null) {
            AbstractC2855l.y("_eventName");
            str = null;
        }
        return AbstractC2855l.b(str, PointerEventHelper.CLICK);
    }

    public static final PointerEvent obtain(String str, int i10, PointerEventState pointerEventState, MotionEvent motionEvent) {
        return INSTANCE.obtain(str, i10, pointerEventState, motionEvent);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            int viewTag = getViewTag();
            String str = this._eventName;
            if (str == null) {
                AbstractC2855l.y("_eventName");
                str = null;
            }
            rctEventEmitter.receiveEvent(viewTag, str, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        if (this.motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"));
            return;
        }
        if (this.pointersEventData == null) {
            this.pointersEventData = createPointersEventData();
        }
        List<? extends WritableMap> list = this.pointersEventData;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z10 = list.size() > 1;
        for (WritableMap writableMapCopy : list) {
            if (z10) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this._eventName;
            String str2 = null;
            if (str == null) {
                AbstractC2855l.y("_eventName");
                str = null;
            }
            short s10 = this.coalescingKey;
            boolean z11 = s10 != -1;
            String str3 = this._eventName;
            if (str3 == null) {
                AbstractC2855l.y("_eventName");
            } else {
                str2 = str3;
            }
            rctEventEmitter.receiveEvent(surfaceId, viewTag, str, z11, s10, writableMap, PointerEventHelper.getEventCategory(str2));
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public Event.EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        return (Event.EventAnimationDriverMatchSpec) this.eventAnimationDriverMatchSpec.getValue();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        String str = this._eventName;
        if (str != null) {
            return str;
        }
        AbstractC2855l.y("_eventName");
        return null;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.pointersEventData = null;
        MotionEvent motionEvent = this.motionEvent;
        this.motionEvent = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private PointerEvent() {
        this.coalescingKey = UNSET_COALESCING_KEY;
        this.eventAnimationDriverMatchSpec = AbstractC2746i.a(EnumC2749l.f28718i, new InterfaceC3487a() { // from class: com.facebook.react.uimanager.events.h
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return PointerEvent.eventAnimationDriverMatchSpec_delegate$lambda$1(this.f20604g);
            }
        });
    }

    public static final PointerEvent obtain(String str, int i10, PointerEventState pointerEventState, MotionEvent motionEvent, short s10) {
        return INSTANCE.obtain(str, i10, pointerEventState, motionEvent, s10);
    }
}
