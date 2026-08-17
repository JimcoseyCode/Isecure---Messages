package com.reactnativekeyboardcontroller;

import B6.g;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.KeyboardGestureAreaManagerDelegate;
import com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w6.C3485d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\u001e\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00000\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerInterface;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "LB6/g;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/g;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "value", "Li7/B;", "setOffset", "(Lcom/facebook/react/views/view/ReactViewGroup;D)V", "setInterpolator", "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setShowOnSwipeUp", "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V", "setEnableSwipeToDismiss", "setTextInputNativeID", "Lw6/d;", "manager", "Lw6/d;", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;", "kotlin.jvm.PlatformType", "mDelegate", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardGestureAreaViewManager extends ReactViewManager implements KeyboardGestureAreaManagerInterface<ReactViewGroup> {
    private final C3485d manager = new C3485d();
    private final KeyboardGestureAreaManagerDelegate<ReactViewGroup, KeyboardGestureAreaViewManager> mDelegate = new KeyboardGestureAreaManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardGestureArea";
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "textInputNativeID")
    public void setTextInputNativeID(ReactViewGroup view, String value) {
        AbstractC2855l.g(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "enableSwipeToDismiss")
    public void setEnableSwipeToDismiss(ReactViewGroup view, boolean value) {
        C3485d c3485d = this.manager;
        AbstractC2855l.e(view, "null cannot be cast to non-null type com.reactnativekeyboardcontroller.views.KeyboardGestureAreaReactViewGroup");
        c3485d.d((g) view, value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "interpolator")
    public void setInterpolator(ReactViewGroup view, String value) {
        AbstractC2855l.g(view, "view");
        C3485d c3485d = this.manager;
        g gVar = (g) view;
        if (value == null) {
            value = "linear";
        }
        c3485d.b(gVar, value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "offset")
    public void setOffset(ReactViewGroup view, double value) {
        AbstractC2855l.g(view, "view");
        this.manager.c((g) view, value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "showOnSwipeUp")
    public void setShowOnSwipeUp(ReactViewGroup view, boolean value) {
        AbstractC2855l.g(view, "view");
        this.manager.e((g) view, value);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public g createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return this.manager.a(context);
    }
}
