package com.google.android.material.sidesheet;

import I0.C;
import I0.z;
import Q4.i;
import Q4.j;
import Q4.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1658a0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e5.AbstractC2425c;
import h5.h;
import h5.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f23646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f23648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f23649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f23650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f23651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.customview.widget.c f23656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f23658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f23663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f23664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f23666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c5.c f23667v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f23669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c.AbstractC0170c f23670y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f23645z = i.f9372U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f23644A = j.f9418q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends c.AbstractC0170c {
        a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int a(View view, int i10, int i11) {
            return B0.a.b(i10, SideSheetBehavior.this.f23646a.f(), SideSheetBehavior.this.f23646a.e());
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public int d(View view) {
            return SideSheetBehavior.this.f23659n + SideSheetBehavior.this.d0();
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f23653h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f23646a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // androidx.customview.widget.c.AbstractC0170c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f23654i == 1 || SideSheetBehavior.this.f23663r == null || SideSheetBehavior.this.f23663r.get() != view) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f23675c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.b.a(this.f23679g);
            }
        };

        b() {
        }

        public static /* synthetic */ void a(b bVar) {
            bVar.f23674b = false;
            if (SideSheetBehavior.this.f23656k != null && SideSheetBehavior.this.f23656k.m(true)) {
                bVar.b(bVar.f23673a);
            } else if (SideSheetBehavior.this.f23654i == 2) {
                SideSheetBehavior.this.z0(bVar.f23673a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f23663r == null || SideSheetBehavior.this.f23663r.get() == null) {
                return;
            }
            this.f23673a = i10;
            if (this.f23674b) {
                return;
            }
            ((View) SideSheetBehavior.this.f23663r.get()).postOnAnimation(this.f23675c);
            this.f23674b = true;
        }
    }

    public SideSheetBehavior() {
        this.f23651f = new b();
        this.f23653h = true;
        this.f23654i = 5;
        this.f23655j = 5;
        this.f23658m = 0.1f;
        this.f23665t = -1;
        this.f23669x = new LinkedHashSet();
        this.f23670y = new a();
    }

    private boolean A0() {
        if (this.f23656k != null) {
            return this.f23653h || this.f23654i == 1;
        }
        return false;
    }

    private boolean C0(View view) {
        return (view.isShown() || AbstractC1658a0.n(view) != null) && this.f23653h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i10, View view, C.a aVar) {
        sideSheetBehavior.y0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i10, boolean z10) {
        if (!p0(view, i10, z10)) {
            z0(i10);
        } else {
            z0(2);
            this.f23651f.b(i10);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f23663r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i10, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f23663r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1658a0.e0(view, 262144);
        AbstractC1658a0.e0(view, 1048576);
        if (this.f23654i != 5) {
            r0(view, z.a.f3898y, 5);
        }
        if (this.f23654i != 3) {
            r0(view, z.a.f3896w, 3);
        }
    }

    private void G0(l lVar) {
        h hVar = this.f23648c;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void H0(View view) {
        int i10 = this.f23654i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f23654i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f23646a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f23646a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f23654i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (B0(view, f10)) {
            return (this.f23646a.l(f10, f11) || this.f23646a.k(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f23646a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference weakReference = this.f23664s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23664s = null;
    }

    private C T(final int i10) {
        return new C() { // from class: i5.a
            @Override // I0.C
            public final boolean a(View view, C.a aVar) {
                return SideSheetBehavior.E(this.f28694a, i10, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f23650e == null) {
            return;
        }
        h hVar = new h(this.f23650e);
        this.f23648c = hVar;
        hVar.R(context);
        ColorStateList colorStateList = this.f23649d;
        if (colorStateList != null) {
            this.f23648c.d0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f23648c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f23669x.isEmpty()) {
            return;
        }
        this.f23646a.b(i10);
        Iterator it = this.f23669x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (AbstractC1658a0.n(view) == null) {
            AbstractC1658a0.n0(view, view.getResources().getString(f23645z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, androidx.customview.widget.a.INVALID_ID);
    }

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f23663r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f23668w, motionEvent.getX()) > ((float) this.f23656k.z());
    }

    private boolean n0(float f10) {
        return this.f23646a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean p0(View view, int i10, boolean z10) {
        int iE0 = e0(i10);
        androidx.customview.widget.c cVarI0 = i0();
        if (cVarI0 != null) {
            return z10 ? cVarI0.O(iE0, view.getTop()) : cVarI0.Q(view, iE0, view.getTop());
        }
        return false;
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f23664s != null || (i10 = this.f23665t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f23664s = new WeakReference(viewFindViewById);
    }

    private void r0(View view, z.a aVar, int i10) {
        AbstractC1658a0.g0(view, aVar, null, T(i10));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f23666u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23666u = null;
        }
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i10) {
        c cVar = this.f23646a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f23646a = new com.google.android.material.sidesheet.b(this);
                if (this.f23650e == null || l0()) {
                    return;
                }
                l.b bVarW = this.f23650e.w();
                bVarW.I(0.0f).y(0.0f);
                G0(bVarW.m());
                return;
            }
            if (i10 == 1) {
                this.f23646a = new com.google.android.material.sidesheet.a(this);
                if (this.f23650e == null || k0()) {
                    return;
                }
                l.b bVarW2 = this.f23650e.w();
                bVarW2.D(0.0f).u(0.0f);
                G0(bVarW2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void x0(View view, int i10) {
        w0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) view.getLayoutParams()).f16247c, i10) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f10) {
        return this.f23646a.m(view, f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f23654i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f23656k.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f23666u == null) {
            this.f23666u = VelocityTracker.obtain();
        }
        this.f23666u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f23657l && m0(motionEvent)) {
            this.f23656k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f23657l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f23659n;
    }

    public View Z() {
        WeakReference weakReference = this.f23664s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f23646a.c();
    }

    public float b0() {
        return this.f23658m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f23662q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f23646a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f23661p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f23663r = null;
        this.f23656k = null;
        this.f23667v = null;
    }

    int g0() {
        return this.f23660o;
    }

    int h0() {
        return 500;
    }

    androidx.customview.widget.c i0() {
        return this.f23656k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f23663r = null;
        this.f23656k = null;
        this.f23667v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        androidx.customview.widget.c cVar;
        if (!C0(view)) {
            this.f23657l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f23666u == null) {
            this.f23666u = VelocityTracker.obtain();
        }
        this.f23666u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f23668w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f23657l) {
            this.f23657l = false;
            return false;
        }
        return (this.f23657l || (cVar = this.f23656k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f23663r == null) {
            this.f23663r = new WeakReference(view);
            this.f23667v = new c5.c(view);
            h hVar = this.f23648c;
            if (hVar != null) {
                view.setBackground(hVar);
                h hVar2 = this.f23648c;
                float elevation = this.f23652g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.c0(elevation);
            } else {
                ColorStateList colorStateList = this.f23649d;
                if (colorStateList != null) {
                    AbstractC1658a0.p0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            W(view);
        }
        x0(view, i10);
        if (this.f23656k == null) {
            this.f23656k = androidx.customview.widget.c.o(coordinatorLayout, this.f23670y);
        }
        int iG = this.f23646a.g(view);
        coordinatorLayout.G(view, i10);
        this.f23660o = coordinatorLayout.getWidth();
        this.f23661p = this.f23646a.h(coordinatorLayout);
        this.f23659n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f23662q = marginLayoutParams != null ? this.f23646a.a(marginLayoutParams) : 0;
        AbstractC1658a0.U(view, P(iG, view));
        q0(coordinatorLayout);
        Iterator it = this.f23669x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i10) {
        this.f23665t = i10;
        S();
        WeakReference weakReference = this.f23663r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z10) {
        this.f23653h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.x(coordinatorLayout, view, savedState.a());
        }
        int i10 = savedState.f23671i;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f23654i = i10;
        this.f23655j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.y(coordinatorLayout, view), this);
    }

    public void y0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f23663r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i10);
        } else {
            t0((View) this.f23663r.get(), new Runnable() { // from class: i5.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.f28696g, i10);
                }
            });
        }
    }

    void z0(int i10) {
        View view;
        if (this.f23654i == i10) {
            return;
        }
        this.f23654i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f23655j = i10;
        }
        WeakReference weakReference = this.f23663r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f23669x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        F0();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final int f23671i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23671i = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f23671i);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f23671i = sideSheetBehavior.f23654i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23651f = new b();
        this.f23653h = true;
        this.f23654i = 5;
        this.f23655j = 5;
        this.f23658m = 0.1f;
        this.f23665t = -1;
        this.f23669x = new LinkedHashSet();
        this.f23670y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f9687f5);
        if (typedArrayObtainStyledAttributes.hasValue(k.f9704h5)) {
            this.f23649d = AbstractC2425c.a(context, typedArrayObtainStyledAttributes, k.f9704h5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f9728k5)) {
            this.f23650e = l.e(context, attributeSet, 0, f23644A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(k.f9720j5)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(k.f9720j5, -1));
        }
        U(context);
        this.f23652g = typedArrayObtainStyledAttributes.getDimension(k.f9696g5, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(k.f9712i5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f23647b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
