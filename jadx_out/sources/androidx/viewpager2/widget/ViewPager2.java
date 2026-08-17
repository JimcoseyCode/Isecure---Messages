package androidx.viewpager2.widget;

import I0.C;
import I0.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1658a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n1.AbstractC2959a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static boolean f18541A = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f18542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f18543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.viewpager2.widget.b f18544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f18545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f18546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RecyclerView.j f18547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    LinearLayoutManager f18548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Parcelable f18550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    RecyclerView f18551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private androidx.recyclerview.widget.j f18552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    androidx.viewpager2.widget.e f18553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private androidx.viewpager2.widget.b f18554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.viewpager2.widget.c f18555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.viewpager2.widget.d f18556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RecyclerView.m f18557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f18560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    e f18561z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f18546k = true;
            viewPager2.f18553r.l();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.n();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f18545j != i10) {
                viewPager2.f18545j = i10;
                viewPager2.f18561z.r();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f18551p.requestFocus(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        void n() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        void e(RecyclerView.h hVar) {
        }

        void f(RecyclerView.h hVar) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(z zVar) {
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void k(View view, z zVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(z zVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            zVar.o0(z.a.f3891r);
            zVar.o0(z.a.f3890q);
            zVar.R0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.A a10, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.Q1(a10, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void R0(RecyclerView.w wVar, RecyclerView.A a10, z zVar) {
            super.R0(wVar, a10, zVar);
            ViewPager2.this.f18561z.j(zVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void T0(RecyclerView.w wVar, RecyclerView.A a10, View view, z zVar) {
            ViewPager2.this.f18561z.k(view, zVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean l1(RecyclerView.w wVar, RecyclerView.A a10, int i10, Bundle bundle) {
            return ViewPager2.this.f18561z.b(i10) ? ViewPager2.this.f18561z.l(i10) : super.l1(wVar, a10, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C f18572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C f18573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.j f18574d;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements C {
            a() {
            }

            @Override // I0.C
            public boolean a(View view, C.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements C {
            b() {
            }

            @Override // I0.C
            public boolean a(View view, C.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f18572b = new a();
            this.f18573c = new b();
        }

        private void u(z zVar) {
            int iD;
            int iD2;
            if (ViewPager2.this.getAdapter() != null) {
                iD2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    iD2 = ViewPager2.this.getAdapter().d();
                    iD = 1;
                } else {
                    iD = ViewPager2.this.getAdapter().d();
                }
            } else {
                iD = 0;
                iD2 = 0;
            }
            zVar.y0(z.f.b(iD2, iD, false, 0));
        }

        private void v(View view, z zVar) {
            zVar.z0(z.g.b(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f18548m.l0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f18548m.l0(view) : 0, 1, false, false));
        }

        private void w(z zVar) {
            int iD;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (iD = adapter.d()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f18545j > 0) {
                zVar.a(8192);
            }
            if (ViewPager2.this.f18545j < iD - 1) {
                zVar.a(4096);
            }
            zVar.R0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h hVar) {
            y();
            if (hVar != null) {
                hVar.v(this.f18574d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h hVar) {
            if (hVar != null) {
                hVar.x(this.f18574d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f18574d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            z zVarD1 = z.d1(accessibilityNodeInfo);
            u(zVarD1);
            w(zVarD1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, z zVar) {
            v(view, zVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void y() {
            int iD;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            AbstractC1658a0.e0(viewPager2, R.id.accessibilityActionPageLeft);
            AbstractC1658a0.e0(viewPager2, R.id.accessibilityActionPageRight);
            AbstractC1658a0.e0(viewPager2, R.id.accessibilityActionPageUp);
            AbstractC1658a0.e0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (iD = ViewPager2.this.getAdapter().d()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f18545j < iD - 1) {
                    AbstractC1658a0.g0(viewPager2, new z.a(R.id.accessibilityActionPageDown, null), null, this.f18572b);
                }
                if (ViewPager2.this.f18545j > 0) {
                    AbstractC1658a0.g0(viewPager2, new z.a(R.id.accessibilityActionPageUp, null), null, this.f18573c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f18545j < iD - 1) {
                AbstractC1658a0.g0(viewPager2, new z.a(i11, null), null, this.f18572b);
            }
            if (ViewPager2.this.f18545j > 0) {
                AbstractC1658a0.g0(viewPager2, new z.a(i10, null), null, this.f18573c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface k {
        void a(View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class l extends androidx.recyclerview.widget.j {
        l() {
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.n
        public View f(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f18561z.d() ? ViewPager2.this.f18561z.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f18545j);
            accessibilityEvent.setToIndex(ViewPager2.this.f18545j);
            ViewPager2.this.f18561z.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class n implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f18581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final RecyclerView f18582h;

        n(int i10, RecyclerView recyclerView) {
            this.f18581g = i10;
            this.f18582h = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18582h.z1(this.f18581g);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f18542g = new Rect();
        this.f18543h = new Rect();
        this.f18544i = new androidx.viewpager2.widget.b(3);
        this.f18546k = false;
        this.f18547l = new a();
        this.f18549n = -1;
        this.f18557v = null;
        this.f18558w = false;
        this.f18559x = true;
        this.f18560y = -1;
        b(context, null);
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f18561z = f18541A ? new j() : new f();
        m mVar = new m(context);
        this.f18551p = mVar;
        mVar.setId(View.generateViewId());
        this.f18551p.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f18548m = hVar;
        this.f18551p.setLayoutManager(hVar);
        this.f18551p.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f18551p.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f18551p.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f18553r = eVar;
        this.f18555t = new androidx.viewpager2.widget.c(this, eVar, this.f18551p);
        l lVar = new l();
        this.f18552q = lVar;
        lVar.b(this.f18551p);
        this.f18551p.n(this.f18553r);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f18554s = bVar;
        this.f18553r.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f18554s.d(bVar2);
        this.f18554s.d(cVar);
        this.f18561z.h(this.f18554s, this.f18551p);
        this.f18554s.d(this.f18544i);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f18548m);
        this.f18556u = dVar;
        this.f18554s.d(dVar);
        RecyclerView recyclerView = this.f18551p;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.v(this.f18547l);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f18549n == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        if (this.f18550o != null) {
            this.f18550o = null;
        }
        int iMax = Math.max(0, Math.min(this.f18549n, adapter.d() - 1));
        this.f18545j = iMax;
        this.f18549n = -1;
        this.f18551p.q1(iMax);
        this.f18561z.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2959a.f30016a);
        AbstractC1658a0.i0(this, context, AbstractC2959a.f30016a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(AbstractC2959a.f30017b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h hVar) {
        if (hVar != null) {
            hVar.x(this.f18547l);
        }
    }

    public boolean c() {
        return this.f18555t.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f18551p.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f18551p.canScrollVertically(i10);
    }

    boolean d() {
        return this.f18548m.d0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f18562g;
            sparseArray.put(this.f18551p.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f18559x;
    }

    public void g(i iVar) {
        this.f18544i.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f18561z.a() ? this.f18561z.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f18551p.getAdapter();
    }

    public int getCurrentItem() {
        return this.f18545j;
    }

    public int getItemDecorationCount() {
        return this.f18551p.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f18560y;
    }

    public int getOrientation() {
        return this.f18548m.p2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f18551p;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f18553r.h();
    }

    public void h() {
        if (this.f18556u.d() == null) {
            return;
        }
        double dG = this.f18553r.g();
        int i10 = (int) dG;
        float f10 = (float) (dG - ((double) i10));
        this.f18556u.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void j(int i10, boolean z10) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        k(i10, z10);
    }

    void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f18549n != -1) {
                this.f18549n = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.d() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.d() - 1);
        if (iMin == this.f18545j && this.f18553r.j()) {
            return;
        }
        int i11 = this.f18545j;
        if (iMin == i11 && z10) {
            return;
        }
        double dG = i11;
        this.f18545j = iMin;
        this.f18561z.r();
        if (!this.f18553r.j()) {
            dG = this.f18553r.g();
        }
        this.f18553r.m(iMin, z10);
        if (!z10) {
            this.f18551p.q1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dG) <= 3.0d) {
            this.f18551p.z1(iMin);
            return;
        }
        this.f18551p.q1(d10 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f18551p;
        recyclerView.post(new n(iMin, recyclerView));
    }

    void n() {
        androidx.recyclerview.widget.j jVar = this.f18552q;
        if (jVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = jVar.f(this.f18548m);
        if (viewF == null) {
            return;
        }
        int iL0 = this.f18548m.l0(viewF);
        if (iL0 != this.f18545j && getScrollState() == 0) {
            this.f18554s.c(iL0);
        }
        this.f18546k = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f18561z.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f18551p.getMeasuredWidth();
        int measuredHeight = this.f18551p.getMeasuredHeight();
        this.f18542g.left = getPaddingLeft();
        this.f18542g.right = (i12 - i10) - getPaddingRight();
        this.f18542g.top = getPaddingTop();
        this.f18542g.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f18542g, this.f18543h);
        RecyclerView recyclerView = this.f18551p;
        Rect rect = this.f18543h;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f18546k) {
            n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f18551p, i10, i11);
        int measuredWidth = this.f18551p.getMeasuredWidth();
        int measuredHeight = this.f18551p.getMeasuredHeight();
        int measuredState = this.f18551p.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f18549n = savedState.f18563h;
        this.f18550o = savedState.f18564i;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f18562g = this.f18551p.getId();
        int i10 = this.f18549n;
        if (i10 == -1) {
            i10 = this.f18545j;
        }
        savedState.f18563h = i10;
        Parcelable parcelable = this.f18550o;
        if (parcelable != null) {
            savedState.f18564i = parcelable;
            return savedState;
        }
        this.f18551p.getAdapter();
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f18561z.c(i10, bundle) ? this.f18561z.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f18551p.getAdapter();
        this.f18561z.f(adapter);
        m(adapter);
        this.f18551p.setAdapter(hVar);
        this.f18545j = 0;
        i();
        this.f18561z.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f18561z.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f18560y = i10;
        this.f18551p.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f18548m.C2(i10);
        this.f18561z.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f18558w) {
                this.f18557v = this.f18551p.getItemAnimator();
                this.f18558w = true;
            }
            this.f18551p.setItemAnimator(null);
        } else if (this.f18558w) {
            this.f18551p.setItemAnimator(this.f18557v);
            this.f18557v = null;
            this.f18558w = false;
        }
        if (kVar == this.f18556u.d()) {
            return;
        }
        this.f18556u.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f18559x = z10;
        this.f18561z.t();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Parcelable f18564i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f18562g = parcel.readInt();
            this.f18563h = parcel.readInt();
            this.f18564i = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f18562g);
            parcel.writeInt(this.f18563h);
            parcel.writeParcelable(this.f18564i, i10);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class i {
        public void a(int i10) {
        }

        public void c(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }
    }
}
