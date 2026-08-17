package com.facebook.react.views.scroll;

import P8.q;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\tstuvwxyz{B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ7\u0010\u0012\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ/\u0010\f\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\f\u0010\u0017J?\u0010\f\u001a\u00020\u000b\"\u000e\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u000fJ\u0019\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\"\u0010 J\u0019\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b+\u0010*J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020,H\u0007¢\u0006\u0004\b/\u0010.JC\u00105\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010\u0013JE\u00109\u001a\u00020\u0011\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u000101*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b9\u0010:J3\u0010;\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b;\u0010\u000fJ-\u0010<\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b<\u0010\u000fJ5\u0010A\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b?\u0010@JI\u0010B\u001a\u00020\u000b\" \b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u00010\u0004*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\bB\u0010\rJ-\u0010C\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\bC\u0010\u000fJM\u0010I\u001a\u00020H\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u000101*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u0011H\u0007¢\u0006\u0004\bI\u0010JJ)\u0010O\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0011H\u0007¢\u0006\u0004\bO\u0010PJ'\u0010T\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\u00112\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u0011H\u0007¢\u0006\u0004\bT\u0010UJ;\u0010;\u001a\u00020\u000b\"\u0014\b\u0000\u0010\u0006*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010V\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u0011¢\u0006\u0004\b;\u0010\u0013J1\u0010X\u001a\u00020\u000b\"\u001a\b\u0000\u0010\u0006*\u0004\u0018\u000100*\u0004\u0018\u000101*\u0004\u0018\u000102*\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\bX\u0010\u000fR\u001c\u0010Z\u001a\n Y*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020Q8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010[R\u0014\u0010_\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010[R\u0014\u0010`\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010[R\u0014\u0010b\u001a\u00020a8\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010[R\u0014\u0010e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010[R\u0014\u0010f\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010[R\u0014\u0010g\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010j\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bj\u0010hR\u0014\u0010k\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bk\u0010hR \u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR\u0016\u0010q\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010hR\u0016\u0010r\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010]¨\u0006|"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "Landroid/view/ViewGroup;", "T", "scrollView", PointerEventHelper.POINTER_TYPE_UNKNOWN, "xVelocity", "yVelocity", "Li7/B;", "emitScrollEvent", "(Landroid/view/ViewGroup;FF)V", "emitScrollBeginDragEvent", "(Landroid/view/ViewGroup;)V", "emitScrollEndDragEvent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "emitScrollMomentumBeginEvent", "(Landroid/view/ViewGroup;II)V", "emitScrollMomentumEndEvent", "Lcom/facebook/react/views/scroll/ScrollEventType;", "scrollEventType", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;)V", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V", "notifyUserDrivenScrollEnded_internal", "notifyUserDrivenScrollEnded", "emitLayoutEvent", "emitLayoutChangeEvent", PointerEventHelper.POINTER_TYPE_UNKNOWN, "jsOverScrollMode", "parseOverScrollMode", "(Ljava/lang/String;)I", "alignment", "parseSnapToAlignment", "Landroid/content/Context;", "context", "getDefaultScrollAnimationDuration", "(Landroid/content/Context;)I", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "listener", "addScrollListener", "(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;)V", "removeScrollListener", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "addLayoutChangeListener", "(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;)V", "removeLayoutChangeListener", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "x", "y", "smoothScrollTo", "currentValue", "postAnimationValue", "velocity", "getNextFlingStartValue", "(Landroid/view/ViewGroup;III)I", "updateFabricScrollState", "forceUpdateState", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "loadFabricScrollState$ReactAndroid_release", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/StateWrapper;)V", "loadFabricScrollState", "updateStateOnScrollChanged", "dispatchMomentumEndOnAnimationEnd", "velocityX", "velocityY", "maximumOffsetX", "maximumOffsetY", "Landroid/graphics/Point;", "predictFinalScrollPosition", "(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;", "host", "Landroid/view/View;", "focused", "direction", "findNextFocusableView", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "horizontal", ViewProps.LAYOUT_DIRECTION, "resolveAbsoluteDirection", "(IZI)I", "scrollX", "scrollY", "registerFlingAnimator", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "DEBUG_MODE", "Z", "CONTENT_OFFSET_LEFT", "CONTENT_OFFSET_TOP", "SCROLL_AWAY_PADDING_TOP", PointerEventHelper.POINTER_TYPE_UNKNOWN, "MOMENTUM_DELAY", "J", "OVER_SCROLL_ALWAYS", "AUTO", "OVER_SCROLL_NEVER", "SNAP_ALIGNMENT_DISABLED", "I", "SNAP_ALIGNMENT_START", "SNAP_ALIGNMENT_CENTER", "SNAP_ALIGNMENT_END", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "scrollListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "layoutChangeListeners", "SMOOTH_SCROLL_DURATION", "smoothScrollDurationInitialized", "ScrollListener", "LayoutChangeListener", "HasStateWrapper", "OverScrollerDurationGetter", "ReactScrollViewScrollState", "HasScrollState", "HasFlingAnimator", "HasScrollEventThrottle", "HasSmoothScroll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewHelper {
    public static final String AUTO = "auto";
    private static final String CONTENT_OFFSET_LEFT = "contentOffsetLeft";
    private static final String CONTENT_OFFSET_TOP = "contentOffsetTop";
    private static final boolean DEBUG_MODE = false;
    public static final long MOMENTUM_DELAY = 20;
    public static final String OVER_SCROLL_ALWAYS = "always";
    public static final String OVER_SCROLL_NEVER = "never";
    private static final String SCROLL_AWAY_PADDING_TOP = "scrollAwayPaddingTop";
    public static final int SNAP_ALIGNMENT_CENTER = 2;
    public static final int SNAP_ALIGNMENT_DISABLED = 0;
    public static final int SNAP_ALIGNMENT_END = 3;
    public static final int SNAP_ALIGNMENT_START = 1;
    private static boolean smoothScrollDurationInitialized;
    public static final ReactScrollViewHelper INSTANCE = new ReactScrollViewHelper();
    private static final String TAG = ReactScrollView.class.getSimpleName();
    private static final CopyOnWriteArrayList<WeakReference<ScrollListener>> scrollListeners = new CopyOnWriteArrayList<>();
    private static final CopyOnWriteArrayList<WeakReference<LayoutChangeListener>> layoutChangeListeners = new CopyOnWriteArrayList<>();
    private static int SMOOTH_SCROLL_DURATION = 250;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, ViewProps.END, "Li7/B;", "startFlingAnimator", "(II)V", "Landroid/animation/ValueAnimator;", "getFlingAnimator", "()Landroid/animation/ValueAnimator;", "velocity", "getFlingExtrapolatedDistance", "(I)I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasFlingAnimator {
        ValueAnimator getFlingAnimator();

        int getFlingExtrapolatedDistance(int velocity);

        void startFlingAnimator(int start, int end);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "scrollEventThrottle", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getScrollEventThrottle", "()I", "setScrollEventThrottle", "(I)V", "lastScrollDispatchTime", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getLastScrollDispatchTime", "()J", "setLastScrollDispatchTime", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollEventThrottle {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j10);

        void setScrollEventThrottle(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "reactScrollViewScrollState", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "getReactScrollViewScrollState", "()Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "setReactScrollViewScrollState", "(Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollState {
        ReactScrollViewScrollState getReactScrollViewScrollState();

        void setReactScrollViewScrollState(ReactScrollViewScrollState reactScrollViewScrollState);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "y", "Li7/B;", "reactSmoothScrollTo", "(II)V", "scrollToPreservingMomentum", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasSmoothScroll {
        void reactSmoothScrollTo(int x10, int y10);

        void scrollToPreservingMomentum(int x10, int y10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasStateWrapper {
        StateWrapper getStateWrapper();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/ViewGroup;", "scrollView", "Li7/B;", "onLayoutChange", "(Landroid/view/ViewGroup;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LayoutChangeListener {
        void onLayoutChange(ViewGroup scrollView);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$OverScrollerDurationGetter;", "Landroid/widget/OverScroller;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "startX", "startY", "dx", "dy", "duration", "Li7/B;", "startScroll", "(IIIII)V", "currentScrollAnimationDuration", "I", "getScrollAnimationDuration", "()I", "scrollAnimationDuration", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OverScrollerDurationGetter extends OverScroller {
        private int currentScrollAnimationDuration;

        public OverScrollerDurationGetter(Context context) {
            super(context);
            this.currentScrollAnimationDuration = 250;
        }

        public final int getScrollAnimationDuration() {
            super.startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            this.currentScrollAnimationDuration = duration;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005J\u0016\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u00062"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "finalAnimatedPositionScroll", "Landroid/graphics/Point;", ReactScrollViewHelper.SCROLL_AWAY_PADDING_TOP, PointerEventHelper.POINTER_TYPE_UNKNOWN, "lastStateUpdateScroll", "isCanceled", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isFinished", "decelerationRate", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isUpdatedByScroll", "<init>", "(Landroid/graphics/Point;ILandroid/graphics/Point;ZZFZ)V", "getFinalAnimatedPositionScroll", "()Landroid/graphics/Point;", "getScrollAwayPaddingTop", "()I", "setScrollAwayPaddingTop", "(I)V", "getLastStateUpdateScroll", "()Z", "setCanceled", "(Z)V", "setFinished", "getDecelerationRate", "()F", "setDecelerationRate", "(F)V", "setUpdatedByScroll", "setFinalAnimatedPositionScroll", "finalAnimatedPositionScrollX", "finalAnimatedPositionScrollY", "setLastStateUpdateScroll", "lastStateUpdateScrollX", "lastStateUpdateScrollY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReactScrollViewScrollState {
        private float decelerationRate;
        private final Point finalAnimatedPositionScroll;
        private boolean isCanceled;
        private boolean isFinished;
        private boolean isUpdatedByScroll;
        private final Point lastStateUpdateScroll;
        private int scrollAwayPaddingTop;

        public ReactScrollViewScrollState() {
            this(null, 0, null, false, false, 0.0f, false, 127, null);
        }

        public static /* synthetic */ ReactScrollViewScrollState copy$default(ReactScrollViewScrollState reactScrollViewScrollState, Point point, int i10, Point point2, boolean z10, boolean z11, float f10, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                point = reactScrollViewScrollState.finalAnimatedPositionScroll;
            }
            if ((i11 & 2) != 0) {
                i10 = reactScrollViewScrollState.scrollAwayPaddingTop;
            }
            if ((i11 & 4) != 0) {
                point2 = reactScrollViewScrollState.lastStateUpdateScroll;
            }
            if ((i11 & 8) != 0) {
                z10 = reactScrollViewScrollState.isCanceled;
            }
            if ((i11 & 16) != 0) {
                z11 = reactScrollViewScrollState.isFinished;
            }
            if ((i11 & 32) != 0) {
                f10 = reactScrollViewScrollState.decelerationRate;
            }
            if ((i11 & 64) != 0) {
                z12 = reactScrollViewScrollState.isUpdatedByScroll;
            }
            float f11 = f10;
            boolean z13 = z12;
            boolean z14 = z11;
            Point point3 = point2;
            return reactScrollViewScrollState.copy(point, i10, point3, z10, z14, f11, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        public final ReactScrollViewScrollState copy(Point finalAnimatedPositionScroll, int scrollAwayPaddingTop, Point lastStateUpdateScroll, boolean isCanceled, boolean isFinished, float decelerationRate, boolean isUpdatedByScroll) {
            AbstractC2855l.g(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            AbstractC2855l.g(lastStateUpdateScroll, "lastStateUpdateScroll");
            return new ReactScrollViewScrollState(finalAnimatedPositionScroll, scrollAwayPaddingTop, lastStateUpdateScroll, isCanceled, isFinished, decelerationRate, isUpdatedByScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactScrollViewScrollState)) {
                return false;
            }
            ReactScrollViewScrollState reactScrollViewScrollState = (ReactScrollViewScrollState) other;
            return AbstractC2855l.b(this.finalAnimatedPositionScroll, reactScrollViewScrollState.finalAnimatedPositionScroll) && this.scrollAwayPaddingTop == reactScrollViewScrollState.scrollAwayPaddingTop && AbstractC2855l.b(this.lastStateUpdateScroll, reactScrollViewScrollState.lastStateUpdateScroll) && this.isCanceled == reactScrollViewScrollState.isCanceled && this.isFinished == reactScrollViewScrollState.isFinished && Float.compare(this.decelerationRate, reactScrollViewScrollState.decelerationRate) == 0 && this.isUpdatedByScroll == reactScrollViewScrollState.isUpdatedByScroll;
        }

        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        public int hashCode() {
            return (((((((((((this.finalAnimatedPositionScroll.hashCode() * 31) + Integer.hashCode(this.scrollAwayPaddingTop)) * 31) + this.lastStateUpdateScroll.hashCode()) * 31) + Boolean.hashCode(this.isCanceled)) * 31) + Boolean.hashCode(this.isFinished)) * 31) + Float.hashCode(this.decelerationRate)) * 31) + Boolean.hashCode(this.isUpdatedByScroll);
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final boolean isUpdatedByScroll() {
            return this.isUpdatedByScroll;
        }

        public final void setCanceled(boolean z10) {
            this.isCanceled = z10;
        }

        public final void setDecelerationRate(float f10) {
            this.decelerationRate = f10;
        }

        public final ReactScrollViewScrollState setFinalAnimatedPositionScroll(int finalAnimatedPositionScrollX, int finalAnimatedPositionScrollY) {
            this.finalAnimatedPositionScroll.set(finalAnimatedPositionScrollX, finalAnimatedPositionScrollY);
            return this;
        }

        public final void setFinished(boolean z10) {
            this.isFinished = z10;
        }

        public final ReactScrollViewScrollState setLastStateUpdateScroll(int lastStateUpdateScrollX, int lastStateUpdateScrollY) {
            this.lastStateUpdateScroll.set(lastStateUpdateScrollX, lastStateUpdateScrollY);
            return this;
        }

        public final void setScrollAwayPaddingTop(int i10) {
            this.scrollAwayPaddingTop = i10;
        }

        public final void setUpdatedByScroll(boolean z10) {
            this.isUpdatedByScroll = z10;
        }

        public String toString() {
            return "ReactScrollViewScrollState(finalAnimatedPositionScroll=" + this.finalAnimatedPositionScroll + ", scrollAwayPaddingTop=" + this.scrollAwayPaddingTop + ", lastStateUpdateScroll=" + this.lastStateUpdateScroll + ", isCanceled=" + this.isCanceled + ", isFinished=" + this.isFinished + ", decelerationRate=" + this.decelerationRate + ", isUpdatedByScroll=" + this.isUpdatedByScroll + ")";
        }

        public ReactScrollViewScrollState(Point finalAnimatedPositionScroll, int i10, Point lastStateUpdateScroll, boolean z10, boolean z11, float f10, boolean z12) {
            AbstractC2855l.g(finalAnimatedPositionScroll, "finalAnimatedPositionScroll");
            AbstractC2855l.g(lastStateUpdateScroll, "lastStateUpdateScroll");
            this.finalAnimatedPositionScroll = finalAnimatedPositionScroll;
            this.scrollAwayPaddingTop = i10;
            this.lastStateUpdateScroll = lastStateUpdateScroll;
            this.isCanceled = z10;
            this.isFinished = z11;
            this.decelerationRate = f10;
            this.isUpdatedByScroll = z12;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ReactScrollViewScrollState(android.graphics.Point r2, int r3, android.graphics.Point r4, boolean r5, boolean r6, float r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L9
                android.graphics.Point r2 = new android.graphics.Point
                r2.<init>()
            L9:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Lf
                r3 = r0
            Lf:
                r10 = r9 & 4
                if (r10 == 0) goto L19
                android.graphics.Point r4 = new android.graphics.Point
                r10 = -1
                r4.<init>(r10, r10)
            L19:
                r10 = r9 & 8
                if (r10 == 0) goto L1e
                r5 = r0
            L1e:
                r10 = r9 & 16
                if (r10 == 0) goto L23
                r6 = 1
            L23:
                r10 = r9 & 32
                if (r10 == 0) goto L2a
                r7 = 1065101558(0x3f7c28f6, float:0.985)
            L2a:
                r9 = r9 & 64
                if (r9 == 0) goto L37
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3f
            L37:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3f:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollViewHelper.ReactScrollViewScrollState.<init>(android.graphics.Point, int, android.graphics.Point, boolean, boolean, float, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/view/ViewGroup;", "scrollView", "Lcom/facebook/react/views/scroll/ScrollEventType;", "scrollEventType", PointerEventHelper.POINTER_TYPE_UNKNOWN, "xVelocity", "yVelocity", "Li7/B;", "onScroll", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V", "onLayout", "(Landroid/view/ViewGroup;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ScrollListener {
        void onLayout(ViewGroup scrollView);

        void onScroll(ViewGroup scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity);
    }

    private ReactScrollViewHelper() {
    }

    public static final void addLayoutChangeListener(LayoutChangeListener listener) {
        AbstractC2855l.g(listener, "listener");
        layoutChangeListeners.add(new WeakReference<>(listener));
    }

    public static final void addScrollListener(ScrollListener listener) {
        AbstractC2855l.g(listener, "listener");
        scrollListeners.add(new WeakReference<>(listener));
    }

    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle> void dispatchMomentumEndOnAnimationEnd(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC2855l.g(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC2855l.g(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC2855l.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC2855l.g(animator, "animator");
            }
        });
    }

    public static final void emitLayoutChangeEvent(ViewGroup scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            LayoutChangeListener layoutChangeListener = it.next().get();
            if (layoutChangeListener != null) {
                layoutChangeListener.onLayoutChange(scrollView);
            }
        }
    }

    public static final void emitLayoutEvent(ViewGroup scrollView) {
        AbstractC2855l.g(scrollView, "scrollView");
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            ScrollListener scrollListener = it.next().get();
            if (scrollListener != null) {
                scrollListener.onLayout(scrollView);
            }
        }
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollBeginDragEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.BEGIN_DRAG);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEndDragEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.END_DRAG, xVelocity, yVelocity);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.SCROLL, xVelocity, yVelocity);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumBeginEvent(T scrollView, int xVelocity, int yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_BEGIN, xVelocity, yVelocity);
    }

    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumEndEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View findNextFocusableView(ViewGroup host, View focused, int direction) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        int iIntValue;
        int[] relativeAncestorList;
        Set<Integer> setH0;
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(focused, "focused");
        if (!(host instanceof ReactClippingViewGroup)) {
            return null;
        }
        Context context = host.getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManager = UIManagerHelper.getUIManager((ReactContext) context, 2);
        if (uIManager == null || (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManager).findNextFocusableElement(host.getId(), focused.getId(), direction)) == null || (relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), (iIntValue = numFindNextFocusableElement.intValue()))) == null || (setH0 = AbstractC2793j.H0(relativeAncestorList)) == null) {
            return null;
        }
        setH0.add(numFindNextFocusableElement);
        ((ReactClippingViewGroup) host).updateClippingRect(setH0);
        return host.findViewById(iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void forceUpdateState(T scrollView) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i10 = lastStateUpdateScroll.x;
        int i11 = lastStateUpdateScroll.y;
        if (DEBUG_MODE) {
            AbstractC2325a.u(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StateWrapper stateWrapper = scrollView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(CONTENT_OFFSET_LEFT, PixelUtil.toDIPFromPixel(i10));
            writableNativeMap.putDouble(CONTENT_OFFSET_TOP, PixelUtil.toDIPFromPixel(i11));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_TOP, PixelUtil.toDIPFromPixel(scrollAwayPaddingTop));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int getDefaultScrollAnimationDuration(Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new OverScrollerDurationGetter(context).getScrollAnimationDuration();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> int getNextFlingStartValue(T scrollView, int currentValue, int postAnimationValue, int velocity) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.isFinished() || (reactScrollViewScrollState.isCanceled() && ((velocity != 0 ? velocity / Math.abs(velocity) : 0) * (postAnimationValue - currentValue) > 0))) ? postAnimationValue : currentValue;
    }

    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void loadFabricScrollState$ReactAndroid_release(T scrollView, StateWrapper stateWrapper) {
        ReadableNativeMap stateData;
        AbstractC2855l.g(stateWrapper, "stateWrapper");
        T t10 = scrollView;
        if (t10.getReactScrollViewScrollState().isUpdatedByScroll() || (stateData = stateWrapper.getStateData()) == null) {
            return;
        }
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_LEFT));
        int pixelFromDIP2 = (int) PixelUtil.toPixelFromDIP(stateData.getDouble(CONTENT_OFFSET_TOP));
        ReactScrollViewScrollState reactScrollViewScrollStateCopy$default = ReactScrollViewScrollState.copy$default(t10.getReactScrollViewScrollState(), null, (int) PixelUtil.toPixelFromDIP(stateData.getDouble(SCROLL_AWAY_PADDING_TOP)), null, false, false, 0.0f, false, 125, null);
        reactScrollViewScrollStateCopy$default.setLastStateUpdateScroll(pixelFromDIP, pixelFromDIP2);
        t10.setReactScrollViewScrollState(reactScrollViewScrollStateCopy$default);
    }

    public static final void notifyUserDrivenScrollEnded_internal(ViewGroup scrollView) {
        NativeAnimatedModule nativeAnimatedModule;
        AbstractC2855l.g(scrollView, "scrollView");
        Context context = scrollView.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null) {
            return;
        }
        nativeAnimatedModule.userDrivenScrollEnded(scrollView.getId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int parseOverScrollMode(String jsOverScrollMode) {
        if (jsOverScrollMode != null) {
            int iHashCode = jsOverScrollMode.hashCode();
            if (iHashCode != -1414557169) {
                if (iHashCode != 3005871) {
                    if (iHashCode == 104712844 && jsOverScrollMode.equals("never")) {
                        return 2;
                    }
                }
            } else if (jsOverScrollMode.equals("always")) {
                return 0;
            }
            AbstractC2325a.I(ReactConstants.TAG, "wrong overScrollMode: " + jsOverScrollMode);
            return 1;
        }
        return 1;
    }

    public static final int parseSnapToAlignment(String alignment) {
        if (alignment == null) {
            return 0;
        }
        if (q.x(ViewProps.START, alignment, true)) {
            return 1;
        }
        if (q.x("center", alignment, true)) {
            return 2;
        }
        if (AbstractC2855l.b(ViewProps.END, alignment)) {
            return 3;
        }
        AbstractC2325a.I(ReactConstants.TAG, "wrong snap alignment value: " + alignment);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> Point predictFinalScrollPosition(T scrollView, int velocityX, int velocityY, int maximumOffsetX, int maximumOffsetY) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(scrollView.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (scrollView.getWidth() - scrollView.getPaddingStart()) - scrollView.getPaddingEnd();
        int height = (scrollView.getHeight() - scrollView.getPaddingBottom()) - scrollView.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(getNextFlingStartValue(scrollView, scrollView.getScrollX(), finalAnimatedPositionScroll.x, velocityX), getNextFlingStartValue(scrollView, scrollView.getScrollY(), finalAnimatedPositionScroll.y, velocityY), velocityX, velocityY, 0, maximumOffsetX, 0, maximumOffsetY, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void removeLayoutChangeListener(LayoutChangeListener listener) {
        AbstractC2855l.g(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<LayoutChangeListener> next = it.next();
            LayoutChangeListener layoutChangeListener = next.get();
            if (layoutChangeListener == null || AbstractC2855l.b(layoutChangeListener, listener)) {
                arrayList.add(next);
            }
        }
        layoutChangeListeners.removeAll(arrayList);
    }

    public static final void removeScrollListener(ScrollListener listener) {
        AbstractC2855l.g(listener, "listener");
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            WeakReference<ScrollListener> next = it.next();
            ScrollListener scrollListener = next.get();
            if (scrollListener == null || AbstractC2855l.b(scrollListener, listener)) {
                arrayList.add(next);
            }
        }
        scrollListeners.removeAll(arrayList);
    }

    public static final int resolveAbsoluteDirection(int direction, boolean horizontal, int layoutDirection) {
        boolean z10 = layoutDirection == 1;
        if (direction != 1 && direction != 2) {
            return direction;
        }
        if (horizontal) {
            return (direction == 2) != z10 ? 66 : 17;
        }
        return direction == 2 ? 130 : 33;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void smoothScrollTo(T scrollView, int x10, int y10) {
        if (DEBUG_MODE) {
            AbstractC2325a.u(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(x10), Integer.valueOf(y10));
        }
        T t10 = scrollView;
        ValueAnimator flingAnimator = t10.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            INSTANCE.registerFlingAnimator(scrollView);
        }
        scrollView.getReactScrollViewScrollState().setFinalAnimatedPositionScroll(x10, y10);
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY();
        if (scrollX != x10) {
            t10.startFlingAnimator(scrollX, x10);
        }
        if (scrollY != y10) {
            t10.startFlingAnimator(scrollY, y10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
        emitScrollEvent(scrollView, xVelocity, yVelocity);
    }

    public final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void registerFlingAnimator(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.registerFlingAnimator.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC2855l.g(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setCanceled(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC2855l.g(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setFinished(true);
                ReactScrollViewHelper.notifyUserDrivenScrollEnded_internal(scrollView);
                ReactScrollViewHelper.updateFabricScrollState(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC2855l.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC2855l.g(animator, "animator");
                ReactScrollViewScrollState reactScrollViewScrollState = ((HasScrollState) scrollView).getReactScrollViewScrollState();
                reactScrollViewScrollState.setCanceled(false);
                reactScrollViewScrollState.setFinished(false);
            }
        });
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType) {
        emitScrollEvent(scrollView, scrollEventType, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewGroup & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView, int scrollX, int scrollY) {
        if (DEBUG_MODE) {
            AbstractC2325a.u(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(scrollX), Integer.valueOf(scrollY));
        }
        if (ViewUtil.getUIManagerType(scrollView.getId()) == 1 || scrollView.getStateWrapper() == null) {
            return;
        }
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        reactScrollViewScrollState.setUpdatedByScroll(true);
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(scrollX, scrollY)) {
            return;
        }
        reactScrollViewScrollState.setLastStateUpdateScroll(scrollX, scrollY);
        forceUpdateState(scrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (scrollEventType == ScrollEventType.SCROLL) {
            if (r1.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - scrollView.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = AbstractC2800q.P0(scrollListeners).iterator();
        while (it.hasNext()) {
            ScrollListener scrollListener = (ScrollListener) ((WeakReference) it.next()).get();
            if (scrollListener != null) {
                scrollListener.onScroll(scrollView, scrollEventType, xVelocity, yVelocity);
            }
        }
        Context context = scrollView.getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, scrollView.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(ScrollEvent.INSTANCE.obtain(surfaceId, scrollView.getId(), scrollEventType, scrollView.getScrollX(), scrollView.getScrollY(), xVelocity, yVelocity, childAt.getWidth(), childAt.getHeight(), scrollView.getWidth(), scrollView.getHeight()));
            if (scrollEventType == ScrollEventType.SCROLL) {
                scrollView.setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }
}
