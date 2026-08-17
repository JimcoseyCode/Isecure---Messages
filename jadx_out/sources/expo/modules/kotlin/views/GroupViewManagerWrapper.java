package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ReactStylesDiffMapHelperKt;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import j7.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0017J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0!H\u0016¢\u0006\u0004\b\"\u0010\u001fJ'\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/ViewGroup;", "viewToUpdate", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Li7/B;", "updateProperties", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ReactStylesDiffMap;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", PointerEventHelper.POINTER_TYPE_UNKNOWN, "updateState", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements ViewWrapperDelegateHolder {
    private final ViewManagerWrapperDelegate viewWrapperDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupViewManagerWrapper(ViewManagerWrapperDelegate viewWrapperDelegate) {
        super(null, 1, null);
        AbstractC2855l.g(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapO;
        Map<String, Object> exportedCustomDirectEventTypeConstants = getViewWrapperDelegate().getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = K.i();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants2 = super.getExportedCustomDirectEventTypeConstants();
        return (exportedCustomDirectEventTypeConstants2 == null || (mapO = K.o(exportedCustomDirectEventTypeConstants2, exportedCustomDirectEventTypeConstants)) == null) ? exportedCustomDirectEventTypeConstants : mapO;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_" + getViewWrapperDelegate().getName();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry<String, AnyViewProp> entry : getViewWrapperDelegate().getProps().entrySet()) {
            String key = entry.getKey();
            AnyViewProp value = entry.getValue();
            AbstractC2855l.d(nativeProps);
            nativeProps.put(key, String.valueOf(value.getType().getKType().getClassifier()));
        }
        AbstractC2855l.d(nativeProps);
        return nativeProps;
    }

    @Override // expo.modules.kotlin.views.ViewWrapperDelegateHolder
    public ViewManagerWrapperDelegate getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        C2735B c2735b;
        Function2 removeViewAction;
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(view, "view");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (removeViewAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAction()) == null) {
            c2735b = null;
        } else {
            removeViewAction.invoke(parent, view);
            c2735b = C2735B.f28704a;
        }
        if (c2735b == null) {
            super.removeView(parent, view);
            C2735B c2735b2 = C2735B.f28704a;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public void addView(ViewGroup parent, View child, int index) {
        C2735B c2735b;
        o addViewAction;
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(child, "child");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (addViewAction = viewGroupDefinition$expo_modules_core_release.getAddViewAction()) == null) {
            c2735b = null;
        } else {
            addViewAction.invoke(parent, child, Integer.valueOf(index));
            c2735b = C2735B.f28704a;
        }
        if (c2735b == null) {
            super.addView(parent, child, index);
            C2735B c2735b2 = C2735B.f28704a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        View viewCreateView = getViewWrapperDelegate().createView(reactContext);
        AbstractC2855l.e(viewCreateView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewCreateView;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public View getChildAt(ViewGroup parent, int index) {
        Function2 getChildAtAction;
        AbstractC2855l.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        return (viewGroupDefinition$expo_modules_core_release == null || (getChildAtAction = viewGroupDefinition$expo_modules_core_release.getGetChildAtAction()) == null) ? super.getChildAt(parent, index) : (View) getChildAtAction.invoke(parent, Integer.valueOf(index));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(ViewGroup parent) {
        Function1 getChildCountAction;
        AbstractC2855l.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        Integer numValueOf = (viewGroupDefinition$expo_modules_core_release == null || (getChildCountAction = viewGroupDefinition$expo_modules_core_release.getGetChildCountAction()) == null) ? null : (Integer) getChildCountAction.invoke(parent);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.getChildCount(parent));
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ViewGroup view) {
        AbstractC2855l.g(view, "view");
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().onViewDidUpdateProps(view);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        AbstractC2855l.g(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().onDestroy(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(ViewGroup parent, int index) {
        C2735B c2735b;
        Function2 removeViewAtAction;
        AbstractC2855l.g(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (removeViewAtAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAtAction()) == null) {
            c2735b = null;
        } else {
            removeViewAtAction.invoke(parent, Integer.valueOf(index));
            c2735b = C2735B.f28704a;
        }
        if (c2735b == null) {
            super.removeViewAt(parent, index);
            C2735B c2735b2 = C2735B.f28704a;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(ViewGroup viewToUpdate, ReactStylesDiffMap props) {
        AbstractC2855l.g(viewToUpdate, "viewToUpdate");
        AbstractC2855l.g(props, "props");
        ReadableMap backingMap = ReactStylesDiffMapHelperKt.getBackingMap(props);
        super.updateProperties(viewToUpdate, new ReactStylesDiffMap(new FilteredReadableMap(backingMap, getViewWrapperDelegate().updateProperties(viewToUpdate, backingMap))));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ViewGroup view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        AbstractC2855l.g(view, "view");
        ExpoView expoView = view instanceof ExpoView ? (ExpoView) view : null;
        if (expoView == null) {
            return null;
        }
        expoView.setStateWrapper(stateWrapper);
        return super.updateState(expoView, props, stateWrapper);
    }
}
