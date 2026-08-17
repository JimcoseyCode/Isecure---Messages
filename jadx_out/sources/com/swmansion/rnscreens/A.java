package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC1749q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C2311y;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class A extends ViewGroup {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final ArrayList f24976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected FragmentManager f24977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Choreographer.FrameCallback f24981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private G f24982m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Choreographer.FrameCallback {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            A.this.f24980k = false;
            A a10 = A.this;
            a10.measure(View.MeasureSpec.makeMeasureSpec(a10.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(A.this.getHeight(), 1073741824));
            A a11 = A.this;
            a11.layout(a11.getLeft(), A.this.getTop(), A.this.getRight(), A.this.getBottom());
        }
    }

    public A(Context context) {
        super(context);
        this.f24976g = new ArrayList();
        this.f24981l = new a();
    }

    private final void A() {
        boolean z10;
        C2735B c2735b;
        ViewParent parent = this;
        while (true) {
            z10 = parent instanceof ReactRootView;
            if (z10 || (parent instanceof O6.a) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            AbstractC2855l.f(parent, "getParent(...)");
        }
        if (parent instanceof C2311y) {
            G fragmentWrapper = ((C2311y) parent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f24982m = fragmentWrapper;
                fragmentWrapper.m(this);
                FragmentManager childFragmentManager = fragmentWrapper.f().getChildFragmentManager();
                AbstractC2855l.f(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                c2735b = C2735B.f28704a;
            } else {
                c2735b = null;
            }
            if (c2735b == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
            return;
        }
        if (!(parent instanceof O6.a)) {
            if (!z10) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
            }
            setFragmentManager(j((ReactRootView) parent));
            return;
        }
        Fragment associatedFragment = ((O6.a) parent).getAssociatedFragment();
        if (associatedFragment != null) {
            FragmentManager childFragmentManager2 = associatedFragment.getChildFragmentManager();
            AbstractC2855l.f(childFragmentManager2, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager2);
        } else {
            throw new IllegalStateException(("[RNScreens] Parent " + parent + " returned nullish fragment").toString());
        }
    }

    private final void f(androidx.fragment.app.I i10, Fragment fragment) {
        i10.b(getId(), fragment);
    }

    private final void i(androidx.fragment.app.I i10, Fragment fragment) {
        i10.n(fragment);
    }

    private final FragmentManager j(ReactRootView reactRootView) {
        boolean z10;
        Context context = reactRootView.getContext();
        while (true) {
            z10 = context instanceof AbstractActivityC1749q;
            if (z10 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z10) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity");
        }
        AbstractActivityC1749q abstractActivityC1749q = (AbstractActivityC1749q) context;
        if (abstractActivityC1749q.getSupportFragmentManager().v0().isEmpty()) {
            FragmentManager supportFragmentManager = abstractActivityC1749q.getSupportFragmentManager();
            AbstractC2855l.d(supportFragmentManager);
            return supportFragmentManager;
        }
        try {
            FragmentManager childFragmentManager = FragmentManager.h0(reactRootView).getChildFragmentManager();
            AbstractC2855l.d(childFragmentManager);
            return childFragmentManager;
        } catch (IllegalStateException unused) {
            FragmentManager supportFragmentManager2 = abstractActivityC1749q.getSupportFragmentManager();
            AbstractC2855l.d(supportFragmentManager2);
            return supportFragmentManager2;
        }
    }

    private final C2311y.a k(G g10) {
        return g10.j().getActivityState();
    }

    private final void s() {
        this.f24979j = true;
        Context context = getContext();
        AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.z
            @Override // java.lang.Runnable
            public final void run() {
                A.t(this.f25467g);
            }
        });
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.f24977h = fragmentManager;
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(A a10) {
        a10.v();
    }

    private final void y(FragmentManager fragmentManager) {
        androidx.fragment.app.I iO = fragmentManager.o();
        AbstractC2855l.f(iO, "beginTransaction(...)");
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.v0()) {
            if ((fragment instanceof F) && ((F) fragment).j().getContainer() == this) {
                iO.n(fragment);
                z10 = true;
            }
        }
        if (z10) {
            iO.k();
        }
    }

    protected G c(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        return new F(screen);
    }

    public final void d(C2311y screen, int i10) {
        AbstractC2855l.g(screen, "screen");
        G gC = c(screen);
        screen.setFragmentWrapper(gC);
        this.f24976g.add(i10, gC);
        screen.setContainer(this);
        s();
    }

    public final void e() {
        if (this.f24976g.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.I iG = g();
        C2311y topScreen = getTopScreen();
        AbstractC2855l.e(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        AbstractC2855l.e(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(iG, fragment);
        ArrayList arrayList = this.f24976g;
        f(iG, ((G) arrayList.get(arrayList.size() - 2)).f());
        Fragment fragment2 = topScreen.getFragment();
        AbstractC2855l.e(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(iG, fragment2);
        iG.k();
    }

    protected final androidx.fragment.app.I g() {
        FragmentManager fragmentManager = this.f24977h;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction");
        }
        androidx.fragment.app.I iU = fragmentManager.o().u(true);
        AbstractC2855l.f(iU, "setReorderingAllowed(...)");
        return iU;
    }

    public final int getScreenCount() {
        return this.f24976g.size();
    }

    public C2311y getTopScreen() {
        Object next;
        Iterator it = this.f24976g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (k((G) next) == C2311y.a.f25435i) {
                break;
            }
        }
        G g10 = (G) next;
        if (g10 != null) {
            return g10.j();
        }
        return null;
    }

    public final void h() {
        if (this.f24976g.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.I iG = g();
        ArrayList arrayList = this.f24976g;
        i(iG, ((G) arrayList.get(arrayList.size() - 2)).f());
        iG.k();
    }

    public final C2311y l(int i10) {
        return ((G) this.f24976g.get(i10)).j();
    }

    public final G m(int i10) {
        Object obj = this.f24976g.get(i10);
        AbstractC2855l.f(obj, "get(...)");
        return (G) obj;
    }

    public boolean n(G g10) {
        return AbstractC2800q.X(this.f24976g, g10);
    }

    protected void o() {
        G fragmentWrapper;
        C2311y topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24978i = true;
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.f24977h;
        if (fragmentManager != null && !fragmentManager.I0()) {
            y(fragmentManager);
            fragmentManager.e0();
        }
        G g10 = this.f24982m;
        if (g10 != null) {
            g10.c(this);
        }
        this.f24982m = null;
        super.onDetachedFromWindow();
        this.f24978i = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    public final void p(C2311y screen) {
        AbstractC2855l.g(screen, "screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, screen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new M6.h(surfaceId, screen.getId()));
            }
        }
    }

    public final void q() {
        C2311y topScreen = getTopScreen();
        AbstractC2855l.e(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int surfaceId = UIManagerHelper.getSurfaceId(getContext());
            Context context = getContext();
            AbstractC2855l.e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, topScreen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new M6.h(surfaceId, topScreen.getId()));
            }
        }
    }

    public final void r() {
        w();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        AbstractC2855l.g(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f24980k || this.f24981l == null) {
            return;
        }
        this.f24980k = true;
        ReactChoreographer.INSTANCE.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f24981l);
    }

    public void u() {
        androidx.fragment.app.I iG = g();
        FragmentManager fragmentManager = this.f24977h;
        if (fragmentManager == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
        }
        HashSet hashSet = new HashSet(fragmentManager.v0());
        Iterator it = this.f24976g.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2855l.f(next, "next(...)");
            G g10 = (G) next;
            if (k(g10) == C2311y.a.f25433g && g10.f().isAdded()) {
                i(iG, g10.f());
            }
            hashSet.remove(g10.f());
        }
        boolean z10 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof F) && ((F) fragment).j().getContainer() == null) {
                    i(iG, fragment);
                }
            }
        }
        boolean z11 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.f24976g.iterator();
        AbstractC2855l.f(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            AbstractC2855l.f(next2, "next(...)");
            G g11 = (G) next2;
            g11.j().setTransitioning(z11);
            if (k(g11) != C2311y.a.f25433g) {
                if (g11.f().isAdded()) {
                    if (z10) {
                        i(iG, g11.f());
                        arrayList.add(g11);
                    }
                } else if (z10) {
                    arrayList.add(g11);
                } else {
                    f(iG, g11.f());
                    z10 = true;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        AbstractC2855l.f(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next3 = it3.next();
            AbstractC2855l.f(next3, "next(...)");
            f(iG, ((G) next3).f());
        }
        iG.k();
    }

    public final void v() {
        FragmentManager fragmentManager;
        if (this.f24979j && this.f24978i && (fragmentManager = this.f24977h) != null) {
            if (fragmentManager == null || !fragmentManager.I0()) {
                this.f24979j = false;
                u();
                o();
            }
        }
    }

    protected final void w() {
        this.f24979j = true;
        v();
    }

    public void x() {
        Iterator it = this.f24976g.iterator();
        AbstractC2855l.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2855l.f(next, "next(...)");
            ((G) next).j().setContainer(null);
        }
        this.f24976g.clear();
        s();
    }

    public void z(int i10) {
        ((G) this.f24976g.get(i10)).j().setContainer(null);
        this.f24976g.remove(i10);
        s();
    }
}
