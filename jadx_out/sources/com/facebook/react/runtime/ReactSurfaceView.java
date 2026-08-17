package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\u00020\u0001:\u0001FB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u000eH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010AR\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010AR\u0014\u0010E\u001a\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView;", "Lcom/facebook/react/ReactRootView;", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "surface", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "widthMeasureSpec", "heightMeasureSpec", "Li7/B;", "onMeasure", "(II)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", "childView", "Landroid/view/MotionEvent;", "ev", "onChildStartedNativeGesture", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "onChildEndedNativeGesture", PointerEventHelper.POINTER_TYPE_UNKNOWN, "t", "handleException", "(Ljava/lang/Throwable;)V", "isFabric", "setIsFabric", "getUIManagerType", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getJSModuleName", "()Ljava/lang/String;", "event", "dispatchJSTouchEvent", "(Landroid/view/MotionEvent;)V", "isCapture", "dispatchJSPointerEvent", "(Landroid/view/MotionEvent;Z)V", "hasActiveReactContext", "()Z", "hasActiveReactInstance", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "isViewAttachedToReactInstance", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "jsTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", "jsPointerDispatcher", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", "wasMeasured", "Z", "I", "Landroid/graphics/Point;", "getViewportOffset", "()Landroid/graphics/Point;", "viewportOffset", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSurfaceView extends ReactRootView {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "ReactSurfaceView";
    private int heightMeasureSpec;
    private JSPointerDispatcher jsPointerDispatcher;
    private final JSTouchDispatcher jsTouchDispatcher;
    private final ReactSurfaceImpl surface;
    private boolean wasMeasured;
    private int widthMeasureSpec;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TAG", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceView(Context context, ReactSurfaceImpl surface) {
        super(context);
        AbstractC2855l.g(surface, "surface");
        this.surface = surface;
        this.jsTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView
    protected void dispatchJSPointerEvent(MotionEvent event, boolean isCapture) {
        AbstractC2855l.g(event, "event");
        if (this.jsPointerDispatcher == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC2325a.I(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            AbstractC2325a.I(TAG, "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, eventDispatcher$ReactAndroid_release, isCapture);
        }
    }

    @Override // com.facebook.react.ReactRootView
    protected void dispatchJSTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            AbstractC2325a.I(TAG, "Unable to dispatch touch events to JS as the React instance has not been attached");
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.handleTouchEvent(event, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
    }

    @Override // com.facebook.react.ReactRootView
    public ReactContext getCurrentReactContext() {
        ReactHostImpl reactHost$ReactAndroid_release;
        if (!this.surface.isAttached$ReactAndroid_release() || (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) == null) {
            return null;
        }
        return reactHost$ReactAndroid_release.getCurrentReactContext();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    public String getJSModuleName() {
        return this.surface.getModuleName();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void handleException(Throwable t10) {
        AbstractC2855l.g(t10, "t");
        String string = Objects.toString(t10.getMessage(), PointerEventHelper.POINTER_TYPE_UNKNOWN);
        AbstractC2855l.f(string, "toString(...)");
        IllegalViewOperationException illegalViewOperationException = new IllegalViewOperationException(string, this, t10);
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        if (reactHost$ReactAndroid_release == null) {
            throw illegalViewOperationException;
        }
        reactHost$ReactAndroid_release.handleHostException$ReactAndroid_release(illegalViewOperationException);
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactContext() {
        if (!this.surface.isAttached$ReactAndroid_release()) {
            return false;
        }
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        return (reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null) != null;
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactInstance() {
        ReactHostImpl reactHost$ReactAndroid_release;
        return this.surface.isAttached$ReactAndroid_release() && (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) != null && reactHost$ReactAndroid_release.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView
    public boolean isViewAttachedToReactInstance() {
        return this.surface.isAttached$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View childView, MotionEvent ev) {
        AbstractC2855l.g(childView, "childView");
        AbstractC2855l.g(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        this.jsTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher$ReactAndroid_release);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View childView, MotionEvent ev) {
        JSPointerDispatcher jSPointerDispatcher;
        AbstractC2855l.g(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
        if (childView == null || (jSPointerDispatcher = this.jsPointerDispatcher) == null) {
            return;
        }
        jSPointerDispatcher.onChildStartedNativeGesture(childView, ev, eventDispatcher$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.wasMeasured && changed) {
            Point viewportOffset = getViewportOffset();
            this.surface.updateLayoutSpecs$ReactAndroid_release(this.widthMeasureSpec, this.heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int size2;
        B3.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(size, size2);
        this.wasMeasured = true;
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
        Point viewportOffset = getViewportOffset();
        this.surface.updateLayoutSpecs$ReactAndroid_release(widthMeasureSpec, heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        B3.a.i(0L);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void setIsFabric(boolean isFabric) {
        super.setIsFabric(true);
    }
}
