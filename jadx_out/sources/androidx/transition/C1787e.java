package androidx.transition;

import D0.d;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.AbstractC1793k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1787e extends androidx.fragment.app.L {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends AbstractC1793k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f18327a;

        a(Rect rect) {
            this.f18327a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f18332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f18333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f18334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f18335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f18336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f18337f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f18332a = obj;
            this.f18333b = arrayList;
            this.f18334c = obj2;
            this.f18335d = arrayList2;
            this.f18336e = obj3;
            this.f18337f = arrayList3;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
            Object obj = this.f18332a;
            if (obj != null) {
                C1787e.this.x(obj, this.f18333b, null);
            }
            Object obj2 = this.f18334c;
            if (obj2 != null) {
                C1787e.this.x(obj2, this.f18335d, null);
            }
            Object obj3 = this.f18336e;
            if (obj3 != null) {
                C1787e.this.x(obj3, this.f18337f, null);
            }
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            abstractC1793k.V(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0191e extends AbstractC1793k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f18341a;

        C0191e(Rect rect) {
            this.f18341a = rect;
        }
    }

    public static /* synthetic */ void v(Runnable runnable, AbstractC1793k abstractC1793k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC1793k.cancel();
            runnable2.run();
        }
    }

    private static boolean w(AbstractC1793k abstractC1793k) {
        return (androidx.fragment.app.L.i(abstractC1793k.D()) && androidx.fragment.app.L.i(abstractC1793k.E()) && androidx.fragment.app.L.i(abstractC1793k.F())) ? false : true;
    }

    @Override // androidx.fragment.app.L
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1793k) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.L
    public void b(Object obj, ArrayList arrayList) {
        AbstractC1793k abstractC1793k = (AbstractC1793k) obj;
        if (abstractC1793k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC1793k instanceof t) {
            t tVar = (t) abstractC1793k;
            int iQ0 = tVar.q0();
            while (i10 < iQ0) {
                b(tVar.p0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (w(abstractC1793k) || !androidx.fragment.app.L.i(abstractC1793k.G())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC1793k.b((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.L
    public void c(ViewGroup viewGroup, Object obj) {
        r.a(viewGroup, (AbstractC1793k) obj);
    }

    @Override // androidx.fragment.app.L
    public boolean e(Object obj) {
        return obj instanceof AbstractC1793k;
    }

    @Override // androidx.fragment.app.L
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC1793k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.L
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC1793k abstractC1793kX0 = (AbstractC1793k) obj;
        AbstractC1793k abstractC1793k = (AbstractC1793k) obj2;
        AbstractC1793k abstractC1793k2 = (AbstractC1793k) obj3;
        if (abstractC1793kX0 != null && abstractC1793k != null) {
            abstractC1793kX0 = new t().n0(abstractC1793kX0).n0(abstractC1793k).x0(1);
        } else if (abstractC1793kX0 == null) {
            abstractC1793kX0 = abstractC1793k != null ? abstractC1793k : null;
        }
        if (abstractC1793k2 == null) {
            return abstractC1793kX0;
        }
        t tVar = new t();
        if (abstractC1793kX0 != null) {
            tVar.n0(abstractC1793kX0);
        }
        tVar.n0(abstractC1793k2);
        return tVar;
    }

    @Override // androidx.fragment.app.L
    public Object k(Object obj, Object obj2, Object obj3) {
        t tVar = new t();
        if (obj != null) {
            tVar.n0((AbstractC1793k) obj);
        }
        if (obj2 != null) {
            tVar.n0((AbstractC1793k) obj2);
        }
        if (obj3 != null) {
            tVar.n0((AbstractC1793k) obj3);
        }
        return tVar;
    }

    @Override // androidx.fragment.app.L
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1793k) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.L
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC1793k) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.L
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1793k) obj).c0(new C0191e(rect));
        }
    }

    @Override // androidx.fragment.app.L
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC1793k) obj).c0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.L
    public void q(Fragment fragment, Object obj, D0.d dVar, Runnable runnable) {
        y(fragment, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.L
    public void s(Object obj, View view, ArrayList arrayList) {
        t tVar = (t) obj;
        List listG = tVar.G();
        listG.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.L.d(listG, (View) arrayList.get(i10));
        }
        listG.add(view);
        arrayList.add(view);
        b(tVar, arrayList);
    }

    @Override // androidx.fragment.app.L
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        if (tVar != null) {
            tVar.G().clear();
            tVar.G().addAll(arrayList2);
            x(tVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.L
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        t tVar = new t();
        tVar.n0((AbstractC1793k) obj);
        return tVar;
    }

    public void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1793k abstractC1793k = (AbstractC1793k) obj;
        int i10 = 0;
        if (abstractC1793k instanceof t) {
            t tVar = (t) abstractC1793k;
            int iQ0 = tVar.q0();
            while (i10 < iQ0) {
                x(tVar.p0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (w(abstractC1793k)) {
            return;
        }
        List listG = abstractC1793k.G();
        if (listG.size() == arrayList.size() && listG.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC1793k.b((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1793k.W((View) arrayList.get(size2));
            }
        }
    }

    public void y(Fragment fragment, Object obj, D0.d dVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC1793k abstractC1793k = (AbstractC1793k) obj;
        dVar.c(new d.a() { // from class: androidx.transition.d
            @Override // D0.d.a
            public final void onCancel() {
                C1787e.v(runnable, abstractC1793k, runnable2);
            }
        });
        abstractC1793k.a(new d(runnable2));
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f18329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f18330b;

        b(View view, ArrayList arrayList) {
            this.f18329a = view;
            this.f18330b = arrayList;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
            abstractC1793k.V(this);
            abstractC1793k.a(this);
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            abstractC1793k.V(this);
            this.f18329a.setVisibility(8);
            int size = this.f18330b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f18330b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements AbstractC1793k.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f18339a;

        d(Runnable runnable) {
            this.f18339a = runnable;
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void d(AbstractC1793k abstractC1793k) {
            this.f18339a.run();
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void a(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void b(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void e(AbstractC1793k abstractC1793k) {
        }

        @Override // androidx.transition.AbstractC1793k.g
        public void g(AbstractC1793k abstractC1793k) {
        }
    }
}
