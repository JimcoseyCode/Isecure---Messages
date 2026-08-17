package com.swmansion.rnscreens.gamma.tabs;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerDelegate;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = TabsHostViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u00100J!\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b3\u0010'J!\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b4\u0010'J!\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b5\u00100J!\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u00100J\u001f\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b7\u0010.J!\u00108\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b9\u0010'J!\u0010:\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b:\u0010'J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010.J!\u0010<\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b<\u0010'J!\u0010=\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b=\u0010+J!\u0010>\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b>\u0010'J!\u0010?\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b?\u00100R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/l;", "Lcom/facebook/react/viewmanagers/RNSBottomTabsManagerInterface;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/tabs/l;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "parent", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "Li7/B;", "addView", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V", "removeView", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;)V", "removeViewAt", "(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "value", "setTabBarBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V", "setTabBarTintColor", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setTabBarItemTitleFontSize", "(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "setControlNavigationStateInJS", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V", "setTabBarItemTitleFontFamily", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V", "setTabBarItemTitleFontWeight", "setTabBarItemTitleFontStyle", "setTabBarItemTitleFontColor", "setTabBarItemIconColor", "setTabBarMinimizeBehavior", "setTabBarControllerMode", "setTabBarHidden", "setNativeContainerBackgroundColor", "setTabBarItemTitleFontColorActive", "setTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorEnabled", "setTabBarItemIconColorActive", "setTabBarItemTitleFontSizeActive", "setTabBarItemRippleColor", "setTabBarItemLabelVisibilityMode", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabsHostViewManager extends ViewGroupManager<l> implements RNSBottomTabsManagerInterface<l> {
    public static final String REACT_CLASS = "RNSBottomTabs";
    private final ViewManagerDelegate<l> delegate;

    public TabsHostViewManager() {
        super(null, 1, null);
        this.delegate = new RNSBottomTabsManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<l> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return K.m(Q6.a.a(S6.e.f10310d));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    public void setControlNavigationStateInJS(l view, boolean value) {
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    public void setTabBarControllerMode(l view, String value) {
        AbstractC2855l.g(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    public void setTabBarMinimizeBehavior(l view, String value) {
        AbstractC2855l.g(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    public void setTabBarTintColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, l view) {
        AbstractC2855l.g(reactContext, "reactContext");
        AbstractC2855l.g(view, "view");
        super.addEventEmitters(reactContext, view);
        view.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        return new l(reactContext);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(l parent) {
        AbstractC2855l.g(parent, "parent");
        parent.D();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(l parent, View child) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        if (!(child instanceof a)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to detach child that is not of type javaClass");
        }
        parent.G((a) child);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "nativeContainerBackgroundColor")
    public void setNativeContainerBackgroundColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setNativeContainerBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarBackgroundColor")
    public void setTabBarBackgroundColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarBackgroundColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarHidden")
    public void setTabBarHidden(l view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarHidden(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemActiveIndicatorColor")
    public void setTabBarItemActiveIndicatorColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemActiveIndicatorColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemActiveIndicatorEnabled")
    public void setTabBarItemActiveIndicatorEnabled(l view, boolean value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemActiveIndicatorEnabled(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemIconColor")
    public void setTabBarItemIconColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemIconColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemIconColorActive")
    public void setTabBarItemIconColorActive(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemIconColorActive(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemLabelVisibilityMode")
    public void setTabBarItemLabelVisibilityMode(l view, String value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemLabelVisibilityMode(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemRippleColor")
    public void setTabBarItemRippleColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemRippleColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemTitleFontColor")
    public void setTabBarItemTitleFontColor(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemTitleFontColor(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(customType = "Color", name = "tabBarItemTitleFontColorActive")
    public void setTabBarItemTitleFontColorActive(l view, Integer value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemTitleFontColorActive(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemTitleFontFamily")
    public void setTabBarItemTitleFontFamily(l view, String value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemTitleFontFamily(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemTitleFontSize")
    public void setTabBarItemTitleFontSize(l view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSize(Float.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemTitleFontSizeActive")
    public void setTabBarItemTitleFontSizeActive(l view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSizeActive(Float.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemTitleFontStyle")
    public void setTabBarItemTitleFontStyle(l view, String value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemTitleFontStyle(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface
    @ReactProp(name = "tabBarItemTitleFontWeight")
    public void setTabBarItemTitleFontWeight(l view, String value) {
        AbstractC2855l.g(view, "view");
        view.setTabBarItemTitleFontWeight(value);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(l parent, View child, int index) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        if (child instanceof a) {
            parent.A((a) child, index);
            return;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(l parent, int index) {
        AbstractC2855l.g(parent, "parent");
        parent.H(index);
    }
}
