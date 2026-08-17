package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.TouchEventType;
import i7.C2750m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0017J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010%\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0016\u00100\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R$\u0010\u000f\u001a\u00020\r2\u0006\u00102\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b6\u00105¨\u00068"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "viewTag", "Lcom/facebook/react/uimanager/events/TouchEventType;", "touchEventType", "Landroid/view/MotionEvent;", "motionEventToCopy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "gestureStartTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewX", "viewY", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "touchEventCoalescingKeyHelper", "Li7/B;", "init", "(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "verifyMotionEvent", "()Z", "getMotionEvent", "()Landroid/view/MotionEvent;", "getTouchEventType", "()Lcom/facebook/react/uimanager/events/TouchEventType;", "onDispose", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getEventName", "()Ljava/lang/String;", "canCoalesce", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCoalescingKey", "()S", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "dispatchModern", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "getEventCategory", "()I", "motionEvent", "Landroid/view/MotionEvent;", "Lcom/facebook/react/uimanager/events/TouchEventType;", "coalescingKey", "S", "value", "F", "getViewX", "()F", "getViewY", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TouchEvent extends Event<TouchEvent> {
    private static final int TOUCH_EVENTS_POOL_SIZE = 3;
    public static final long UNSET = Long.MIN_VALUE;
    private short coalescingKey;
    private MotionEvent motionEvent;
    private TouchEventType touchEventType;
    private float viewX;
    private float viewY;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = TouchEvent.class.getSimpleName();
    private static final H0.f EVENTS_POOL = new H0.f(3);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewTag", "Lcom/facebook/react/uimanager/events/TouchEventType;", "touchEventType", "Landroid/view/MotionEvent;", "motionEventToCopy", PointerEventHelper.POINTER_TYPE_UNKNOWN, "gestureStartTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "viewX", "viewY", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEvent;", "obtain", "(ILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;", "surfaceId", "(IILcom/facebook/react/uimanager/events/TouchEventType;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;)Lcom/facebook/react/uimanager/events/TouchEvent;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "LH0/f;", "EVENTS_POOL", "LH0/f;", "UNSET", "J", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TouchEvent obtain(int viewTag, TouchEventType touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            AbstractC2855l.g(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            return obtain(-1, viewTag, touchEventType, (MotionEvent) AbstractC3007a.c(motionEventToCopy), gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
        }

        private Companion() {
        }

        public final TouchEvent obtain(int surfaceId, int viewTag, TouchEventType touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            AbstractC2855l.g(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            TouchEvent touchEvent = (TouchEvent) TouchEvent.EVENTS_POOL.acquire();
            if (touchEvent == null) {
                touchEvent = new TouchEvent(null);
            }
            TouchEvent touchEvent2 = touchEvent;
            Object objC = AbstractC3007a.c(motionEventToCopy);
            AbstractC2855l.f(objC, "assertNotNull(...)");
            touchEvent2.init(surfaceId, viewTag, touchEventType, (MotionEvent) objC, gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
            return touchEvent2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int surfaceId, int viewTag, TouchEventType touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        super.init(surfaceId, viewTag, motionEventToCopy.getEventTime());
        short coalescingKey = 0;
        SoftAssertions.assertCondition(gestureStartTime != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEventToCopy.getAction() & 255;
        if (action == 0) {
            touchEventCoalescingKeyHelper.addCoalescingKey(gestureStartTime);
        } else if (action == 1) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
        } else if (action == 2) {
            coalescingKey = touchEventCoalescingKeyHelper.getCoalescingKey(gestureStartTime);
        } else if (action == 3) {
            touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
        } else if (action == 5 || action == 6) {
            touchEventCoalescingKeyHelper.incrementCoalescingKey(gestureStartTime);
        }
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.touchEventType = touchEventType;
        this.coalescingKey = coalescingKey;
        this.viewX = viewX;
        this.viewY = viewY;
    }

    public static final TouchEvent obtain(int i10, int i11, TouchEventType touchEventType, MotionEvent motionEvent, long j10, float f10, float f11, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i10, i11, touchEventType, motionEvent, j10, f10, f11, touchEventCoalescingKeyHelper);
    }

    private final boolean verifyMotionEvent() {
        if (this.motionEvent != null) {
            return true;
        }
        String TAG2 = TAG;
        AbstractC2855l.f(TAG2, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG2, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        TouchEventType touchEventType = (TouchEventType) AbstractC3007a.c(this.touchEventType);
        int i10 = touchEventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.touchEventType);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        AbstractC2855l.g(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            int uIManagerType = ViewUtil.getUIManagerType(getViewTag(), getSurfaceId());
            if (uIManagerType == 1) {
                TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
            } else {
                if (uIManagerType != 2) {
                    return;
                }
                TouchesHelper.sendTouchEvent(rctEventEmitter, this);
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public int getEventCategory() {
        TouchEventType touchEventType = this.touchEventType;
        if (touchEventType == null) {
            return 2;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 4;
        }
        throw new C2750m();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        Object objC = AbstractC3007a.c(this.touchEventType);
        AbstractC2855l.f(objC, "assertNotNull(...)");
        return companion.getJSEventName((TouchEventType) objC);
    }

    public final MotionEvent getMotionEvent() {
        Object objC = AbstractC3007a.c(this.motionEvent);
        AbstractC2855l.f(objC, "assertNotNull(...)");
        return (MotionEvent) objC;
    }

    public final TouchEventType getTouchEventType() {
        Object objC = AbstractC3007a.c(this.touchEventType);
        AbstractC2855l.f(objC, "assertNotNull(...)");
        return (TouchEventType) objC;
    }

    public final float getViewX() {
        return this.viewX;
    }

    public final float getViewY() {
        return this.viewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e10) {
            String TAG2 = TAG;
            AbstractC2855l.f(TAG2, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG2, e10);
        }
    }

    private TouchEvent() {
    }

    public static final TouchEvent obtain(int i10, TouchEventType touchEventType, MotionEvent motionEvent, long j10, float f10, float f11, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i10, touchEventType, motionEvent, j10, f10, f11, touchEventCoalescingKeyHelper);
    }
}
