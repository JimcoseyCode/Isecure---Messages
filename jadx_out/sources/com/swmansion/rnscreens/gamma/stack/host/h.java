package com.swmansion.rnscreens.gamma.stack.host;

import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import j7.AbstractC2800q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends CoordinatorLayout implements FragmentManager.k {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f25146K = new a(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final WeakReference f25147E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private FragmentManager f25148F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final List f25149G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final List f25150H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final List f25151I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final c f25152J;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, WeakReference delegate) {
        super(context);
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(delegate, "delegate");
        this.f25147E = delegate;
        this.f25149G = new ArrayList();
        this.f25150H = new ArrayList();
        this.f25151I = new ArrayList();
        this.f25152J = new c();
        setId(Q6.g.f9857a.a());
    }

    private final List X() {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f25150H) {
            Iterator it = this.f25149G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((com.swmansion.rnscreens.gamma.stack.screen.d) next).w() == eVar.a()) {
                    break;
                }
            }
            if (next == null) {
                throw new IllegalStateException("[RNScreens] Unable to find a fragment to pop");
            }
            com.swmansion.rnscreens.gamma.stack.screen.d dVar = (com.swmansion.rnscreens.gamma.stack.screen.d) next;
            if (this.f25149G.size() <= 1) {
                throw new IllegalStateException("[RNScreens] Attempt to pop last screen from the stack");
            }
            arrayList.add(new d(dVar));
            List list = this.f25149G;
            if (list.remove(AbstractC2800q.l(list)) != dVar) {
                throw new IllegalStateException("[RNScreens] Attempt to pop non-top screen");
            }
        }
        Iterator it2 = this.f25151I.iterator();
        while (it2.hasNext()) {
            com.swmansion.rnscreens.gamma.stack.screen.d dVarY = Y(((f) it2.next()).a());
            arrayList.add(new com.swmansion.rnscreens.gamma.stack.host.a(dVarY, getId(), !this.f25149G.isEmpty(), false, 8, null));
            this.f25149G.add(dVarY);
        }
        if (this.f25149G.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack should never be empty after updates");
        }
        arrayList.add(new g((com.swmansion.rnscreens.gamma.stack.screen.d) AbstractC2800q.q0(this.f25149G)));
        this.f25150H.clear();
        this.f25151I.clear();
        return arrayList;
    }

    private final com.swmansion.rnscreens.gamma.stack.screen.d Y(com.swmansion.rnscreens.gamma.stack.screen.a aVar) {
        com.swmansion.rnscreens.gamma.stack.screen.d dVar = new com.swmansion.rnscreens.gamma.stack.screen.d(aVar);
        aVar.getScreenKey();
        dVar.toString();
        return dVar;
    }

    private final void Z() {
        getId();
        Iterator it = this.f25149G.iterator();
        while (it.hasNext()) {
            ((com.swmansion.rnscreens.gamma.stack.screen.d) it.next()).w().getScreenKey();
        }
    }

    private final void c0(com.swmansion.rnscreens.gamma.stack.screen.d dVar) {
        getId();
        dVar.w().getScreenKey();
        if (!this.f25149G.remove(dVar)) {
            throw new IllegalArgumentException("[RNScreens] onNativeFragmentPop must be called with the fragment present in stack model");
        }
        if (this.f25149G.isEmpty()) {
            throw new IllegalStateException("[RNScreens] Stack model should not be empty after a native pop");
        }
        FragmentManager fragmentManagerF0 = f0();
        if (fragmentManagerF0.A0() == dVar) {
            c.g(this.f25152J, fragmentManagerF0, AbstractC2800q.e(new g((com.swmansion.rnscreens.gamma.stack.screen.d) AbstractC2800q.q0(this.f25149G))), false, 4, null);
        }
    }

    private final void e0(FragmentManager fragmentManager) {
        this.f25152J.f(fragmentManager, X(), false);
        Z();
    }

    private final FragmentManager f0() {
        FragmentManager fragmentManager = this.f25148F;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("[RNScreens] Attempt to use nullish FragmentManager");
    }

    private final boolean getHasPendingOperations() {
        return (this.f25151I.isEmpty() && this.f25150H.isEmpty()) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void a(Fragment fragment, boolean z10) {
        AbstractC2855l.g(fragment, "fragment");
        if (!(fragment instanceof com.swmansion.rnscreens.gamma.stack.screen.d)) {
            fragment.getClass();
            return;
        }
        if (z10) {
            i iVar = (i) this.f25147E.get();
            if (iVar != null) {
                iVar.a(((com.swmansion.rnscreens.gamma.stack.screen.d) fragment).w());
            }
            if (this.f25149G.contains(fragment)) {
                c0((com.swmansion.rnscreens.gamma.stack.screen.d) fragment);
            }
        }
    }

    public final void a0(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25150H.add(new e(stackScreen));
    }

    public final void b0(com.swmansion.rnscreens.gamma.stack.screen.a stackScreen) {
        AbstractC2855l.g(stackScreen, "stackScreen");
        this.f25151I.add(new f(stackScreen));
    }

    public final void d0() {
        if (getHasPendingOperations() && isAttachedToWindow()) {
            e0(f0());
        }
    }

    public final void g0() {
        FragmentManager fragmentManagerA = Q6.b.f9854a.a(this);
        if (fragmentManagerA == null) {
            throw new IllegalStateException("[RNScreens] Nullish fragment manager - can't run container operations");
        }
        fragmentManagerA.j(this);
        this.f25148F = fragmentManagerA;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Y6.e.f12948a.a("StackContainer", "StackContainer [" + getId() + "] attached to window");
        super.onAttachedToWindow();
        g0();
        d0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f0().f1(this);
        this.f25148F = null;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void onBackStackChanged() {
    }
}
