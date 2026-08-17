package com.reactnativepagerview;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f24897a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Choreographer.FrameCallback f24898b;

    private i() {
    }

    private final void f(final View view) {
        Choreographer.FrameCallback frameCallback = f24898b;
        if (frameCallback != null) {
            Choreographer.getInstance().removeFrameCallback(frameCallback);
        }
        ViewPager2 viewPager2 = view instanceof ViewPager2 ? (ViewPager2) view : null;
        RecyclerView.h adapter = viewPager2 != null ? viewPager2.getAdapter() : null;
        j jVar = adapter instanceof j ? (j) adapter : null;
        if (jVar == null || jVar.d() == 0) {
            return;
        }
        f24898b = new Choreographer.FrameCallback() { // from class: com.reactnativepagerview.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                i.g(view, j10);
            }
        };
        Choreographer.getInstance().postFrameCallback(f24898b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view, long j10) {
        f24897a.l(view);
        f24898b = null;
    }

    private final void l(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.f
            @Override // java.lang.Runnable
            public final void run() {
                i.m(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(b bVar) {
        bVar.setDidSetInitialIndex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(int i10, ViewPager2 viewPager2, View page, float f10) {
        AbstractC2855l.g(page, "page");
        float f11 = i10 * f10;
        if (viewPager2.getOrientation() != 0) {
            page.setTranslationY(f11);
            return;
        }
        if (viewPager2.getLayoutDirection() == 1) {
            f11 = -f11;
        }
        page.setTranslationX(f11);
    }

    public final void e(b host, View view, int i10) throws ClassNotFoundException {
        Integer initialIndex;
        AbstractC2855l.g(host, "host");
        if (view == null) {
            return;
        }
        ViewPager2 viewPager2J = j(host);
        j jVar = (j) viewPager2J.getAdapter();
        if (jVar != null) {
            jVar.y(view, i10);
        }
        if (viewPager2J.getCurrentItem() == i10) {
            l(viewPager2J);
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != i10) {
            return;
        }
        host.setDidSetInitialIndex(true);
        q(viewPager2J, i10, false);
    }

    public final View h(b parent, int i10) {
        AbstractC2855l.g(parent, "parent");
        j jVar = (j) j(parent).getAdapter();
        AbstractC2855l.d(jVar);
        return jVar.z(i10);
    }

    public final int i(b parent) {
        AbstractC2855l.g(parent, "parent");
        RecyclerView.h adapter = j(parent).getAdapter();
        if (adapter != null) {
            return adapter.d();
        }
        return 0;
    }

    public final ViewPager2 j(b view) throws ClassNotFoundException {
        AbstractC2855l.g(view, "view");
        if (!(view.getChildAt(0) instanceof ViewPager2)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        AbstractC2855l.e(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        return (ViewPager2) childAt;
    }

    public final boolean k() {
        return true;
    }

    public final void n(b parent) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        ViewPager2 viewPager2J = j(parent);
        viewPager2J.setUserInputEnabled(false);
        j jVar = (j) viewPager2J.getAdapter();
        if (jVar != null) {
            jVar.C();
        }
    }

    public final void o(b parent, View view) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(view, "view");
        ViewPager2 viewPager2J = j(parent);
        j jVar = (j) viewPager2J.getAdapter();
        if (jVar != null) {
            jVar.D(view);
        }
        l(viewPager2J);
    }

    public final void p(b parent, int i10) throws ClassNotFoundException {
        AbstractC2855l.g(parent, "parent");
        ViewPager2 viewPager2J = j(parent);
        j jVar = (j) viewPager2J.getAdapter();
        View viewZ = jVar != null ? jVar.z(i10) : null;
        if (viewZ != null && viewZ.getParent() != null) {
            ViewParent parent2 = viewZ.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewZ);
            }
        }
        if (jVar != null) {
            jVar.E(i10);
        }
        f(viewPager2J);
    }

    public final void q(ViewPager2 view, int i10, boolean z10) {
        AbstractC2855l.g(view, "view");
        l(view);
        view.j(i10, z10);
    }

    public final void r(final b host, int i10) throws ClassNotFoundException {
        AbstractC2855l.g(host, "host");
        ViewPager2 viewPager2J = j(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(i10));
            viewPager2J.post(new Runnable() { // from class: com.reactnativepagerview.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.s(host);
                }
            });
        }
    }

    public final void t(b host, String value) throws ClassNotFoundException {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(value, "value");
        ViewPager2 viewPager2J = j(host);
        if (AbstractC2855l.b(value, "rtl")) {
            viewPager2J.setLayoutDirection(1);
        } else {
            viewPager2J.setLayoutDirection(0);
        }
    }

    public final void u(b host, int i10) {
        AbstractC2855l.g(host, "host");
        j(host).setOffscreenPageLimit(i10);
    }

    public final void v(b host, String value) {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(value, "value");
        j(host).setOrientation(AbstractC2855l.b(value, "vertical") ? 1 : 0);
    }

    public final void w(b host, String value) {
        AbstractC2855l.g(host, "host");
        AbstractC2855l.g(value, "value");
        View childAt = j(host).getChildAt(0);
        if (AbstractC2855l.b(value, "never")) {
            childAt.setOverScrollMode(2);
        } else if (AbstractC2855l.b(value, "always")) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    public final void x(b host, int i10) throws ClassNotFoundException {
        AbstractC2855l.g(host, "host");
        final ViewPager2 viewPager2J = j(host);
        final int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(i10);
        viewPager2J.setPageTransformer(new ViewPager2.k() { // from class: com.reactnativepagerview.e
            @Override // androidx.viewpager2.widget.ViewPager2.k
            public final void a(View view, float f10) {
                i.y(pixelFromDIP, viewPager2J, view, f10);
            }
        });
    }

    public final void z(b host, boolean z10) {
        AbstractC2855l.g(host, "host");
        j(host).setUserInputEnabled(z10);
    }
}
