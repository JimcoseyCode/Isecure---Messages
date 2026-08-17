package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.events.TouchEvent;
import com.facebook.react.uimanager.events.TouchEventCoalescingKeyHelper;
import com.facebook.react.uimanager.events.TouchEventType;
import d2.AbstractC2325a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J'\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/facebook/react/uimanager/JSTouchDispatcher;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/ViewGroup;", "viewGroup", "<init>", "(Landroid/view/ViewGroup;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "surfaceId", "reactTag", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Li7/B;", "markActiveTouchForTag", "(IILcom/facebook/react/bridge/ReactContext;)V", "sweepActiveTouchForTag", "Landroid/view/MotionEvent;", "ev", "findTargetTagAndSetCoordinates", "(Landroid/view/MotionEvent;)I", "androidEvent", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "dispatchCancelEvent", "(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "onChildStartedNativeGesture", "(Landroid/view/MotionEvent;Lcom/facebook/react/uimanager/events/EventDispatcher;Lcom/facebook/react/bridge/ReactContext;)V", "onChildEndedNativeGesture", "handleTouchEvent", "Landroid/view/ViewGroup;", "targetTag", "I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "targetCoordinates", "[F", PointerEventHelper.POINTER_TYPE_UNKNOWN, "childIsHandlingNativeGesture", "Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "gestureStartTime", "J", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSTouchDispatcher {
    private boolean childIsHandlingNativeGesture;
    private long gestureStartTime;
    private final float[] targetCoordinates;
    private int targetTag;
    private final TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper;
    private final ViewGroup viewGroup;

    public JSTouchDispatcher(ViewGroup viewGroup) {
        AbstractC2855l.g(viewGroup, "viewGroup");
        this.viewGroup = viewGroup;
        this.targetTag = -1;
        this.targetCoordinates = new float[2];
        this.gestureStartTime = Long.MIN_VALUE;
        this.touchEventCoalescingKeyHelper = new TouchEventCoalescingKeyHelper();
    }

    private final void dispatchCancelEvent(MotionEvent androidEvent, EventDispatcher eventDispatcher) {
        if (this.targetTag == -1) {
            AbstractC2325a.I(ReactConstants.TAG, "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        AbstractC3007a.b(!this.childIsHandlingNativeGesture, "Expected to not have already sent a cancel for this gesture");
        EventDispatcher eventDispatcher2 = (EventDispatcher) AbstractC3007a.c(eventDispatcher);
        TouchEvent.Companion companion = TouchEvent.INSTANCE;
        int surfaceId = UIManagerHelper.getSurfaceId(this.viewGroup);
        int i10 = this.targetTag;
        TouchEventType touchEventType = TouchEventType.CANCEL;
        long j10 = this.gestureStartTime;
        float[] fArr = this.targetCoordinates;
        eventDispatcher2.dispatchEvent(companion.obtain(surfaceId, i10, touchEventType, androidEvent, j10, fArr[0], fArr[1], this.touchEventCoalescingKeyHelper));
    }

    private final int findTargetTagAndSetCoordinates(MotionEvent ev) {
        return TouchTargetHelper.findTargetTagAndCoordinatesForTouch(ev.getX(), ev.getY(), this.viewGroup, this.targetCoordinates, null);
    }

    private final void markActiveTouchForTag(int surfaceId, int reactTag, ReactContext reactContext) {
        UIManager uIManager;
        if (reactContext == null || (uIManager = UIManagerHelper.getUIManager(reactContext, 2)) == null) {
            return;
        }
        uIManager.markActiveTouchForTag(surfaceId, reactTag);
    }

    private final void sweepActiveTouchForTag(int surfaceId, int reactTag, ReactContext reactContext) {
        UIManager uIManager;
        if (reactContext == null || (uIManager = UIManagerHelper.getUIManager(reactContext, 2)) == null) {
            return;
        }
        uIManager.sweepActiveTouchForTag(surfaceId, reactTag);
    }

    public final void handleTouchEvent(MotionEvent ev, EventDispatcher eventDispatcher) {
        AbstractC2855l.g(ev, "ev");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        handleTouchEvent(ev, eventDispatcher, null);
    }

    public final void onChildEndedNativeGesture(MotionEvent androidEvent, EventDispatcher eventDispatcher) {
        AbstractC2855l.g(androidEvent, "androidEvent");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        this.childIsHandlingNativeGesture = false;
    }

    public final void onChildStartedNativeGesture(MotionEvent androidEvent, EventDispatcher eventDispatcher) {
        AbstractC2855l.g(androidEvent, "androidEvent");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        onChildStartedNativeGesture(androidEvent, eventDispatcher, null);
    }

    public final void handleTouchEvent(MotionEvent ev, EventDispatcher eventDispatcher, ReactContext reactContext) {
        AbstractC2855l.g(ev, "ev");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        int action = ev.getAction() & 255;
        if (action == 0) {
            if (this.targetTag != -1) {
                AbstractC2325a.m(ReactConstants.TAG, "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.childIsHandlingNativeGesture = false;
            this.gestureStartTime = ev.getEventTime();
            this.targetTag = findTargetTagAndSetCoordinates(ev);
            markActiveTouchForTag(UIManagerHelper.getSurfaceId(this.viewGroup), this.targetTag, reactContext);
            TouchEvent.Companion companion = TouchEvent.INSTANCE;
            int surfaceId = UIManagerHelper.getSurfaceId(this.viewGroup);
            int i10 = this.targetTag;
            TouchEventType touchEventType = TouchEventType.START;
            long j10 = this.gestureStartTime;
            float[] fArr = this.targetCoordinates;
            eventDispatcher.dispatchEvent(companion.obtain(surfaceId, i10, touchEventType, ev, j10, fArr[0], fArr[1], this.touchEventCoalescingKeyHelper));
            return;
        }
        if (this.childIsHandlingNativeGesture) {
            return;
        }
        int i11 = this.targetTag;
        if (i11 == -1) {
            AbstractC2325a.m(ReactConstants.TAG, "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            findTargetTagAndSetCoordinates(ev);
            int surfaceId2 = UIManagerHelper.getSurfaceId(this.viewGroup);
            TouchEvent.Companion companion2 = TouchEvent.INSTANCE;
            int i12 = this.targetTag;
            TouchEventType touchEventType2 = TouchEventType.END;
            long j11 = this.gestureStartTime;
            float[] fArr2 = this.targetCoordinates;
            eventDispatcher.dispatchEvent(companion2.obtain(surfaceId2, i12, touchEventType2, ev, j11, fArr2[0], fArr2[1], this.touchEventCoalescingKeyHelper));
            sweepActiveTouchForTag(surfaceId2, this.targetTag, reactContext);
            this.targetTag = -1;
            this.gestureStartTime = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            findTargetTagAndSetCoordinates(ev);
            TouchEvent.Companion companion3 = TouchEvent.INSTANCE;
            int surfaceId3 = UIManagerHelper.getSurfaceId(this.viewGroup);
            int i13 = this.targetTag;
            TouchEventType touchEventType3 = TouchEventType.MOVE;
            long j12 = this.gestureStartTime;
            float[] fArr3 = this.targetCoordinates;
            eventDispatcher.dispatchEvent(companion3.obtain(surfaceId3, i13, touchEventType3, ev, j12, fArr3[0], fArr3[1], this.touchEventCoalescingKeyHelper));
            return;
        }
        if (action == 5) {
            TouchEvent.Companion companion4 = TouchEvent.INSTANCE;
            int surfaceId4 = UIManagerHelper.getSurfaceId(this.viewGroup);
            int i14 = this.targetTag;
            TouchEventType touchEventType4 = TouchEventType.START;
            long j13 = this.gestureStartTime;
            float[] fArr4 = this.targetCoordinates;
            eventDispatcher.dispatchEvent(companion4.obtain(surfaceId4, i14, touchEventType4, ev, j13, fArr4[0], fArr4[1], this.touchEventCoalescingKeyHelper));
            return;
        }
        if (action == 6) {
            TouchEvent.Companion companion5 = TouchEvent.INSTANCE;
            int surfaceId5 = UIManagerHelper.getSurfaceId(this.viewGroup);
            int i15 = this.targetTag;
            TouchEventType touchEventType5 = TouchEventType.END;
            long j14 = this.gestureStartTime;
            float[] fArr5 = this.targetCoordinates;
            eventDispatcher.dispatchEvent(companion5.obtain(surfaceId5, i15, touchEventType5, ev, j14, fArr5[0], fArr5[1], this.touchEventCoalescingKeyHelper));
            return;
        }
        if (action == 3) {
            if (this.touchEventCoalescingKeyHelper.hasCoalescingKey(ev.getDownTime())) {
                dispatchCancelEvent(ev, eventDispatcher);
            } else {
                AbstractC2325a.m(ReactConstants.TAG, "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            sweepActiveTouchForTag(UIManagerHelper.getSurfaceId(this.viewGroup), this.targetTag, reactContext);
            this.targetTag = -1;
            this.gestureStartTime = Long.MIN_VALUE;
            return;
        }
        AbstractC2325a.I(ReactConstants.TAG, "Warning : touch event was ignored. Action=" + action + " Target=" + i11);
    }

    @UnstableReactNativeAPI
    public final void onChildStartedNativeGesture(MotionEvent androidEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        AbstractC2855l.g(androidEvent, "androidEvent");
        AbstractC2855l.g(eventDispatcher, "eventDispatcher");
        if (this.childIsHandlingNativeGesture) {
            return;
        }
        dispatchCancelEvent(androidEvent, eventDispatcher);
        this.childIsHandlingNativeGesture = true;
        if (this.targetTag != -1 && ReactNativeFeatureFlags.sweepActiveTouchOnChildNativeGesturesAndroid()) {
            sweepActiveTouchForTag(UIManagerHelper.getSurfaceId(this.viewGroup), this.targetTag, reactContext);
        }
        this.targetTag = -1;
    }
}
