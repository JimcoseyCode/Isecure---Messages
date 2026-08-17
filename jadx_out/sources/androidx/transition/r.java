package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC1793k f18400a = new C1783a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f18401b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f18402c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC1793k abstractC1793k) {
        if (f18402c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f18402c.add(viewGroup);
        if (abstractC1793k == null) {
            abstractC1793k = f18400a;
        }
        AbstractC1793k abstractC1793kClone = abstractC1793k.clone();
        d(viewGroup, abstractC1793kClone);
        AbstractC1792j.b(viewGroup, null);
        c(viewGroup, abstractC1793kClone);
    }

    static C2892a b() {
        C2892a c2892a;
        WeakReference weakReference = (WeakReference) f18401b.get();
        if (weakReference != null && (c2892a = (C2892a) weakReference.get()) != null) {
            return c2892a;
        }
        C2892a c2892a2 = new C2892a();
        f18401b.set(new WeakReference(c2892a2));
        return c2892a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC1793k abstractC1793k) {
        if (abstractC1793k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1793k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC1793k abstractC1793k) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1793k) it.next()).T(viewGroup);
            }
        }
        if (abstractC1793k != null) {
            abstractC1793k.k(viewGroup, true);
        }
        AbstractC1792j.a(viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        AbstractC1793k f18403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ViewGroup f18404h;

        /* JADX INFO: renamed from: androidx.transition.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0192a extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2892a f18405a;

            C0192a(C2892a c2892a) {
                this.f18405a = c2892a;
            }

            @Override // androidx.transition.AbstractC1793k.g
            public void d(AbstractC1793k abstractC1793k) {
                ((ArrayList) this.f18405a.get(a.this.f18404h)).remove(abstractC1793k);
                abstractC1793k.V(this);
            }
        }

        a(AbstractC1793k abstractC1793k, ViewGroup viewGroup) {
            this.f18403g = abstractC1793k;
            this.f18404h = viewGroup;
        }

        private void a() {
            this.f18404h.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f18404h.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!r.f18402c.remove(this.f18404h)) {
                return true;
            }
            C2892a c2892aB = r.b();
            ArrayList arrayList = (ArrayList) c2892aB.get(this.f18404h);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2892aB.put(this.f18404h, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f18403g);
            this.f18403g.a(new C0192a(c2892aB));
            this.f18403g.k(this.f18404h, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1793k) it.next()).Y(this.f18404h);
                }
            }
            this.f18403g.U(this.f18404h);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            r.f18402c.remove(this.f18404h);
            ArrayList arrayList = (ArrayList) r.b().get(this.f18404h);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC1793k) it.next()).Y(this.f18404h);
                }
            }
            this.f18403g.l(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
