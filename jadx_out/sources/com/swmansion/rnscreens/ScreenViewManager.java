package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.C2311y;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = ScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0014\u0010\u001eJ!\u0010+\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b3\u0010,J!\u00105\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010,J!\u00107\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u0010,J!\u00109\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b<\u0010,J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010=\u001a\u00020/H\u0017¢\u0006\u0004\b>\u00102J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010?\u001a\u00020/H\u0017¢\u0006\u0004\b@\u00102J!\u0010B\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bB\u0010:J\u001f\u0010D\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010C\u001a\u00020/H\u0017¢\u0006\u0004\bD\u00102J\u001f\u0010F\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010E\u001a\u00020/H\u0017¢\u0006\u0004\bF\u00102J\u001f\u0010H\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010G\u001a\u00020/H\u0017¢\u0006\u0004\bH\u00102J!\u0010J\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bJ\u0010\u001eJ!\u0010L\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010K\u001a\u00020/H\u0017¢\u0006\u0004\bL\u00102J!\u0010N\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010M\u001a\u00020/H\u0017¢\u0006\u0004\bN\u00102J#\u0010O\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bO\u0010,J!\u0010P\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bP\u00102J!\u0010Q\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0016¢\u0006\u0004\bQ\u0010\u001eJ!\u0010R\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bR\u00102J!\u0010S\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bS\u00102J#\u0010U\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bW\u00102J!\u0010X\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bX\u00102J#\u0010Y\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u0010,J#\u0010Z\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u0010,J#\u0010[\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u0010,J#\u0010\\\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\\\u0010,J#\u0010]\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u0010,J!\u0010^\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\b^\u00102J!\u0010_\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\b_\u00102J!\u0010a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010`H\u0017¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bc\u0010\u001eJ\u001f\u0010d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\bd\u00102J\u001f\u0010e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0012H\u0017¢\u0006\u0004\be\u0010\u0015J\u001f\u0010f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\bf\u00102J\u001f\u0010g\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bg\u0010\u001eJ!\u0010h\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bh\u0010,J\u001b\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0iH\u0016¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020lH\u0014¢\u0006\u0004\bm\u0010nR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/y;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "propName", "Li7/B;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/y;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "activityState", "setActivityState", "(Lcom/swmansion/rnscreens/y;F)V", "parent", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "addView", "(Lcom/swmansion/rnscreens/y;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/y;I)V", "removeView", "(Lcom/swmansion/rnscreens/y;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "updateState", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/y;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/y;Ljava/lang/String;)V", "animation", "setStackAnimation", PointerEventHelper.POINTER_TYPE_UNKNOWN, "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/y;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/y;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "sheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setSynchronousShadowStateUpdatesEnabled", "setAndroidResetScreenShadowStateOnOrientationChangeEnabled", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<C2311y> implements RNSScreenManagerInterface<C2311y> {
    public static final String REACT_CLASS = "RNSScreen";
    private final ViewManagerDelegate<C2311y> delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<C2311y> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return j7.K.m(i7.t.a("topDismissed", j7.K.k(i7.t.a("registrationName", "onDismissed"))), i7.t.a("topWillAppear", j7.K.k(i7.t.a("registrationName", "onWillAppear"))), i7.t.a("topAppear", j7.K.k(i7.t.a("registrationName", "onAppear"))), i7.t.a("topWillDisappear", j7.K.k(i7.t.a("registrationName", "onWillDisappear"))), i7.t.a("topDisappear", j7.K.k(i7.t.a("registrationName", "onDisappear"))), i7.t.a("topHeaderHeightChange", j7.K.k(i7.t.a("registrationName", "onHeaderHeightChange"))), i7.t.a("topHeaderBackButtonClicked", j7.K.k(i7.t.a("registrationName", "onHeaderBackButtonClicked"))), i7.t.a("topTransitionProgress", j7.K.k(i7.t.a("registrationName", "onTransitionProgress"))), i7.t.a("topSheetDetentChanged", j7.K.k(i7.t.a("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setBottomScrollEdgeEffect(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeShadowEnabled(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(C2311y view, ReadableMap value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setLeftScrollEdgeEffect(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setRightScrollEdgeEffect(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(C2311y view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTopScrollEdgeEffect(C2311y view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(C2311y view, int value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C2311y createViewInstance(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new C2311y(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C2311y view) {
        AbstractC2855l.g(view, "view");
        super.onAfterUpdateTransaction(view);
        view.v();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(C2311y parent, View view) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(view, "view");
        super.removeView(parent, view);
        if (view instanceof D) {
            parent.setFooter(null);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(C2311y view, float activityState) {
        AbstractC2855l.g(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C2311y view, boolean gestureEnabled) {
        AbstractC2855l.g(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C2311y view, boolean nativeBackButtonDismissalEnabled) {
        AbstractC2855l.g(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C2311y view, Integer navigationBarColor) {
        AbstractC2855l.g(view, "view");
        logNotAvailable("navigationBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarHidden")
    public void setNavigationBarHidden(C2311y view, boolean navigationBarHidden) {
        AbstractC2855l.g(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(C2311y view, boolean navigationBarTranslucent) {
        AbstractC2855l.g(view, "view");
        logNotAvailable("navigationBarTranslucent");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(C2311y view, String animation) {
        C2311y.c cVar;
        AbstractC2855l.g(view, "view");
        if (animation == null || AbstractC2855l.b(animation, "pop")) {
            cVar = C2311y.c.f25439h;
        } else {
            if (!AbstractC2855l.b(animation, "push")) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = C2311y.c.f25438g;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setScreenId(C2311y view, String value) {
        AbstractC2855l.g(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(C2311y view, String screenOrientation) {
        AbstractC2855l.g(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(C2311y view, ReadableArray value) {
        ?? E9;
        AbstractC2855l.g(view, "view");
        if (value == null || value.size() <= 0) {
            E9 = AbstractC2800q.e(Double.valueOf(1.0d));
        } else {
            int size = value.size();
            E9 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                E9.add(Double.valueOf(value.getDouble(i10)));
            }
        }
        view.setSheetDetents(new L6.p(E9));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetCornerRadius")
    public void setSheetCornerRadius(C2311y view, float value) {
        AbstractC2855l.g(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetDefaultResizeAnimationEnabled")
    public void setSheetDefaultResizeAnimationEnabled(C2311y view, boolean sheetDefaultResizeAnimationEnabled) {
        if (view != null) {
            view.setSheetDefaultResizeAnimationEnabled(sheetDefaultResizeAnimationEnabled);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetElevation")
    public void setSheetElevation(C2311y view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(C2311y view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(C2311y view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetInitialDetent")
    public void setSheetInitialDetent(C2311y view, int value) {
        AbstractC2855l.g(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(C2311y view, int value) {
        AbstractC2855l.g(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "sheetShouldOverflowTopInset")
    public void setSheetShouldOverflowTopInset(C2311y view, boolean sheetShouldOverflowTopInset) {
        if (view != null) {
            view.setSheetShouldOverflowTopInset(sheetShouldOverflowTopInset);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals(com.facebook.hermes.intl.Constants.COLLATION_DEFAULT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackAnimation(C2311y view, String animation) {
        C2311y.d dVar;
        AbstractC2855l.g(view, "view");
        if (animation != null) {
            switch (animation.hashCode()) {
                case -1418955385:
                    break;
                case -1198710326:
                    if (animation.equals("ios_from_left")) {
                        dVar = C2311y.d.f25450o;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -427095442:
                    if (animation.equals("slide_from_left")) {
                        dVar = C2311y.d.f25447l;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case -349395819:
                    if (animation.equals("slide_from_right")) {
                        dVar = C2311y.d.f25446k;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3135100:
                    if (animation.equals("fade")) {
                        dVar = C2311y.d.f25444i;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 3145837:
                    break;
                case 3387192:
                    if (animation.equals("none")) {
                        dVar = C2311y.d.f25443h;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 182437661:
                    if (animation.equals("fade_from_bottom")) {
                        dVar = C2311y.d.f25448m;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1500346553:
                    if (animation.equals("ios_from_right")) {
                        dVar = C2311y.d.f25449n;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                case 1544803905:
                    break;
                case 1601504978:
                    if (animation.equals("slide_from_bottom")) {
                        dVar = C2311y.d.f25445j;
                        break;
                    }
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
                default:
                    throw new JSApplicationIllegalArgumentException("Unknown animation type " + animation);
            }
        } else {
            dVar = C2311y.d.f25442g;
        }
        view.setStackAnimation(dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.C2311y.e.f25454h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.C2311y.e.f25455i;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setStackPresentation(C2311y view, String presentation) {
        C2311y.e eVar;
        AbstractC2855l.g(view, "view");
        if (presentation != null) {
            switch (presentation.hashCode()) {
                case -76271493:
                    break;
                case 3452698:
                    if (presentation.equals("push")) {
                        eVar = C2311y.e.f25453g;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
                case 104069805:
                    break;
                case 438078970:
                    break;
                case 872434704:
                    break;
                case 955284238:
                    break;
                case 1171936146:
                    break;
                case 1798290171:
                    if (presentation.equals("formSheet")) {
                        eVar = C2311y.e.f25456j;
                        view.setStackPresentation(eVar);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown presentation type " + presentation);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(C2311y view, String statusBarAnimation) {
        AbstractC2855l.g(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || AbstractC2855l.b("none", statusBarAnimation)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C2311y view, Integer statusBarColor) {
        AbstractC2855l.g(view, "view");
        logNotAvailable("statusBarColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(C2311y view, boolean statusBarHidden) {
        AbstractC2855l.g(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(C2311y view, String statusBarStyle) {
        AbstractC2855l.g(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C2311y view, boolean statusBarTranslucent) {
        AbstractC2855l.g(view, "view");
        logNotAvailable("statusBarTranslucent");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C2311y view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        AbstractC2855l.g(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C2311y parent, View child, int index) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        if (child instanceof B) {
            parent.z((B) child);
        } else if (child instanceof D) {
            parent.setFooter((D) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C2311y parent, int index) {
        AbstractC2855l.g(parent, "parent");
        if (parent.getChildAt(index) instanceof D) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(C2311y view, int activityState) {
        AbstractC2855l.g(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(C2311y.a.f25433g);
        } else if (activityState == 1) {
            view.setActivityState(C2311y.a.f25434h);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(C2311y.a.f25435i);
        }
    }

    private final void logNotAvailable(String propName) {
    }
}
