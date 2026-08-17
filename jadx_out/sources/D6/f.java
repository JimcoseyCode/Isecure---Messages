package D6;

import D6.h;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import i7.C2735B;
import kotlin.jvm.internal.AbstractC2855l;
import r6.AbstractC3274c;
import r6.AbstractC3277f;
import v6.C3429a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends ReactViewGroup implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThemedReactContext f809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSTouchDispatcher f810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private EventDispatcher f812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private StateWrapper f813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f814l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ThemedReactContext reactContext) {
        super(reactContext);
        AbstractC2855l.g(reactContext, "reactContext");
        this.f809g = reactContext;
        this.f810h = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f811i = new c(this);
        }
    }

    private final void d(int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", AbstractC3277f.a(i10));
        writableNativeMap.putDouble("screenHeight", AbstractC3277f.a(i11));
        StateWrapper stateWrapper = this.f813k;
        if (stateWrapper != null) {
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public final boolean c() {
        return this.f814l;
    }

    public final EventDispatcher getEventDispatcher$react_native_keyboard_controller_release() {
        return this.f812j;
    }

    public final StateWrapper getStateWrapper$react_native_keyboard_controller_release() {
        return this.f813k;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(Throwable t10) {
        AbstractC2855l.g(t10, "t");
        this.f809g.getReactApplicationContext().handleException(new RuntimeException(t10));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointB = AbstractC3274c.b(this.f809g);
        d(pointB.x, pointB.y);
        this.f814l = true;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View childView, MotionEvent ev) {
        AbstractC2855l.g(childView, "childView");
        AbstractC2855l.g(ev, "ev");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null) {
            this.f810h.onChildEndedNativeGesture(ev, eventDispatcher);
        }
        c cVar = this.f811i;
        if (cVar != null) {
            cVar.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        h.a.a(this, motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d(0, 0);
        this.f814l = false;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        c cVar;
        AbstractC2855l.g(event, "event");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null && (cVar = this.f811i) != null) {
            cVar.c(event, eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        c cVar;
        AbstractC2855l.g(event, "event");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null && (cVar = this.f811i) != null) {
            cVar.c(event, eventDispatcher, true);
        }
        return super.onInterceptHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null) {
            try {
                this.f810h.handleTouchEvent(event, eventDispatcher);
                c cVar = this.f811i;
                if (cVar != null) {
                    cVar.c(event, eventDispatcher, true);
                    C2735B c2735b = C2735B.f28704a;
                }
            } catch (RuntimeException e10) {
                C3429a.f32948a.c(g.f815a, "Can not handle touch event", e10);
                C2735B c2735b2 = C2735B.f28704a;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null) {
            try {
                this.f810h.handleTouchEvent(event, eventDispatcher);
                c cVar = this.f811i;
                if (cVar != null) {
                    cVar.c(event, eventDispatcher, false);
                    C2735B c2735b = C2735B.f28704a;
                }
            } catch (RuntimeException e10) {
                C3429a.f32948a.c(g.f815a, "Can not handle touch event", e10);
                C2735B c2735b2 = C2735B.f28704a;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z10) {
        this.f814l = z10;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(EventDispatcher eventDispatcher) {
        this.f812j = eventDispatcher;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(StateWrapper stateWrapper) {
        this.f813k = stateWrapper;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View view, MotionEvent ev) {
        AbstractC2855l.g(ev, "ev");
        EventDispatcher eventDispatcher = this.f812j;
        if (eventDispatcher != null) {
            this.f810h.onChildStartedNativeGesture(ev, eventDispatcher);
            c cVar = this.f811i;
            if (cVar != null) {
                cVar.onChildStartedNativeGesture(view, ev, eventDispatcher);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
    }
}
