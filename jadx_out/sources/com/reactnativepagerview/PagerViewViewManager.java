package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.RNCViewPagerManagerDelegate;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;
import com.facebook.soloader.SoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import o3.AbstractC3007a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = "RNCViewPager")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b2\u0010)J#\u00103\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b3\u00101J!\u00104\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b4\u0010)J!\u00105\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020\u001aH\u0017¢\u0006\u0004\b5\u0010)J#\u00106\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b6\u00101J!\u00107\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010-\u001a\u00020*H\u0017¢\u0006\u0004\b7\u0010/J#\u00108\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b8\u00101J'\u0010;\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020*¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010)J!\u0010>\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u00109\u001a\u00020\u001aH\u0016¢\u0006\u0004\b>\u0010)J!\u0010@\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020*H\u0016¢\u0006\u0004\b@\u0010/J'\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0B0AH\u0016¢\u0006\u0004\bC\u0010DR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/b;", "Lcom/facebook/react/viewmanagers/RNCViewPagerManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Li7/B;", "receiveCommand", "(Lcom/reactnativepagerview/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/reactnativepagerview/b;", "host", "Landroid/view/View;", "child", PointerEventHelper.POINTER_TYPE_UNKNOWN, "index", "addView", "(Lcom/reactnativepagerview/b;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/b;)I", "getChildAt", "(Lcom/reactnativepagerview/b;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/b;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/b;)V", "removeViewAt", "(Lcom/reactnativepagerview/b;I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/b;Z)V", "setLayoutDirection", "(Lcom/reactnativepagerview/b;Ljava/lang/String;)V", "setInitialPage", "setOrientation", "setOffscreenPageLimit", "setPageMargin", "setOverScrollMode", "setOverdrag", "setKeyboardDismissMode", "selectedPage", "scrollWithAnimation", "goTo", "(Lcom/reactnativepagerview/b;IZ)V", "setPage", "setPageWithoutAnimation", "scrollEnabled", "setScrollEnabledImperatively", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-pager-view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PagerViewViewManager extends ViewGroupManager<com.reactnativepagerview.b> implements RNCViewPagerManagerInterface<com.reactnativepagerview.b> {
    private final ViewManagerDelegate<com.reactnativepagerview.b> mDelegate;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends ViewPager2.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThemedReactContext f24880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.reactnativepagerview.b f24881b;

        b(ThemedReactContext themedReactContext, com.reactnativepagerview.b bVar) {
            this.f24880a = themedReactContext;
            this.f24881b = bVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            String str;
            super.a(i10);
            if (i10 == 0) {
                str = "idle";
            } else if (i10 == 1) {
                str = "dragging";
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported pageScrollState");
                }
                str = "settling";
            }
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f24880a, this.f24881b.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new E6.b(this.f24881b.getId(), str));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i10, float f10, int i11) {
            super.b(i10, f10, i11);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f24880a, this.f24881b.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new E6.a(this.f24881b.getId(), i10, f10));
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            super.c(i10);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f24880a, this.f24881b.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new E6.c(this.f24881b.getId(), i10));
            }
        }
    }

    static {
        String str = a.f24882a;
        if (str != null) {
            SoLoader.t(str);
        }
    }

    public PagerViewViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNCViewPagerManagerDelegate(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(ViewPager2 viewPager2, ThemedReactContext themedReactContext, com.reactnativepagerview.b bVar) {
        viewPager2.g(new b(themedReactContext, bVar));
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, bVar.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new E6.c(bVar.getId(), viewPager2.getCurrentItem()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<com.reactnativepagerview.b> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("topPageScroll", MapBuilder.of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.of("registrationName", "onPageSelected"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    public final void goTo(com.reactnativepagerview.b root, int selectedPage, boolean scrollWithAnimation) throws ClassNotFoundException {
        if (root == null) {
            return;
        }
        i iVar = i.f24897a;
        ViewPager2 viewPager2J = iVar.j(root);
        AbstractC3007a.c(viewPager2J);
        RecyclerView.h adapter = viewPager2J.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.d()) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0 || selectedPage < 0 || selectedPage >= numValueOf.intValue()) {
            return;
        }
        iVar.q(viewPager2J, selectedPage, scrollWithAnimation);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return i.f24897a.k();
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(com.reactnativepagerview.b view, String value) {
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overdrag")
    public void setOverdrag(com.reactnativepagerview.b view, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativepagerview.b createViewInstance(final ThemedReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
        final com.reactnativepagerview.b bVar = new com.reactnativepagerview.b(reactContext);
        bVar.setId(View.generateViewId());
        bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bVar.setSaveEnabled(false);
        final ViewPager2 viewPager2 = new ViewPager2(reactContext);
        viewPager2.setAdapter(new j());
        viewPager2.setSaveEnabled(false);
        viewPager2.post(new Runnable() { // from class: com.reactnativepagerview.d
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(viewPager2, reactContext, bVar);
            }
        });
        bVar.addView(viewPager2);
        return bVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.reactnativepagerview.b root, String commandId, ReadableArray args) {
        AbstractC2855l.g(root, "root");
        AbstractC2855l.g(commandId, "commandId");
        this.mDelegate.kotlinCompat$receiveCommandNullableArgs(root, commandId, args);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeAllViews(com.reactnativepagerview.b parent) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        i.f24897a.n(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(com.reactnativepagerview.b parent, View view) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(view, "view");
        i.f24897a.o(parent, view);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = "initialPage")
    public void setInitialPage(com.reactnativepagerview.b view, int value) throws ClassNotFoundException {
        if (view != null) {
            i.f24897a.r(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = ViewProps.LAYOUT_DIRECTION)
    public void setLayoutDirection(com.reactnativepagerview.b view, String value) throws ClassNotFoundException {
        if (view == null || value == null) {
            return;
        }
        i.f24897a.t(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = -1, name = "offscreenPageLimit")
    public void setOffscreenPageLimit(com.reactnativepagerview.b view, int value) {
        if (view != null) {
            i.f24897a.u(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "orientation")
    public void setOrientation(com.reactnativepagerview.b view, String value) {
        if (view == null || value == null) {
            return;
        }
        i.f24897a.v(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(com.reactnativepagerview.b view, String value) {
        if (view == null || value == null) {
            return;
        }
        i.f24897a.w(view, value);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPage(com.reactnativepagerview.b view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, true);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultInt = 0, name = "pageMargin")
    public void setPageMargin(com.reactnativepagerview.b view, int value) throws ClassNotFoundException {
        if (view != null) {
            i.f24897a.x(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setPageWithoutAnimation(com.reactnativepagerview.b view, int selectedPage) throws ClassNotFoundException {
        goTo(view, selectedPage, false);
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(com.reactnativepagerview.b view, boolean value) {
        if (view != null) {
            i.f24897a.z(view, value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNCViewPagerManagerInterface
    public void setScrollEnabledImperatively(com.reactnativepagerview.b view, boolean scrollEnabled) {
        if (view != null) {
            i.f24897a.z(view, scrollEnabled);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.reactnativepagerview.b host, View child, int index) throws ClassNotFoundException {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(child, "child");
        i.f24897a.e(host, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(com.reactnativepagerview.b parent, int index) {
        AbstractC2855l.g(parent, "parent");
        return i.f24897a.h(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(com.reactnativepagerview.b parent) {
        AbstractC2855l.g(parent, "parent");
        return i.f24897a.i(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(com.reactnativepagerview.b parent, int index) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        i.f24897a.p(parent, index);
    }
}
