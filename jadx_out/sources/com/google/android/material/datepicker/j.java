package com.google.android.material.datepicker;

import I0.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j<S> extends s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Object f23220w = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Object f23221x = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Object f23222y = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Object f23223z = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DateSelector f23225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CalendarConstraints f23226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private DayViewDecorator f23227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Month f23228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f23229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.material.datepicker.b f23230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RecyclerView f23231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RecyclerView f23232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f23233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f23234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f23235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f23236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MaterialButton f23237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AccessibilityManager f23238v;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f23239g;

        a(q qVar) {
            this.f23239g = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.T(this.f23239g.z(j.this.P().e2() - 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f23241g;

        b(int i10) {
            this.f23241g = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f23232p.z1(this.f23241g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends C1657a {
        c() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.y0(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d extends t {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f23244I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f23244I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.A a10, int[] iArr) {
            if (this.f23244I == 0) {
                iArr[0] = j.this.f23232p.getWidth();
                iArr[1] = j.this.f23232p.getWidth();
            } else {
                iArr[0] = j.this.f23232p.getHeight();
                iArr[1] = j.this.f23232p.getHeight();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.j.m
        public void a(long j10) {
            if (j.this.f23226j.g().W(j10)) {
                j.this.f23225i.w0(j10);
                Iterator it = j.this.f23324g.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).b(j.this.f23225i.i0());
                }
                j.this.f23232p.getAdapter().i();
                if (j.this.f23231o != null) {
                    j.this.f23231o.getAdapter().i();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f extends C1657a {
        f() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.R0(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f23248a = v.m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f23249b = v.m();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                w wVar = (w) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (H0.d dVar : j.this.f23225i.m()) {
                    Object obj = dVar.f3634a;
                    if (obj != null && dVar.f3635b != null) {
                        this.f23248a.setTimeInMillis(((Long) obj).longValue());
                        this.f23249b.setTimeInMillis(((Long) dVar.f3635b).longValue());
                        int iA = wVar.A(this.f23248a.get(1));
                        int iA2 = wVar.A(this.f23249b.get(1));
                        View viewH = gridLayoutManager.H(iA);
                        View viewH2 = gridLayoutManager.H(iA2);
                        int iX2 = iA / gridLayoutManager.X2();
                        int iX22 = iA2 / gridLayoutManager.X2();
                        int i10 = iX2;
                        while (i10 <= iX22) {
                            if (gridLayoutManager.H(gridLayoutManager.X2() * i10) != null) {
                                canvas.drawRect((i10 != iX2 || viewH == null) ? 0 : viewH.getLeft() + (viewH.getWidth() / 2), r9.getTop() + j.this.f23230n.f23197d.c(), (i10 != iX22 || viewH2 == null) ? recyclerView.getWidth() : viewH2.getLeft() + (viewH2.getWidth() / 2), r9.getBottom() - j.this.f23230n.f23197d.b(), j.this.f23230n.f23201h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h extends C1657a {
        h() {
        }

        @Override // androidx.core.view.C1657a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            zVar.b(new z.a(16, j.this.f23236t.getVisibility() == 0 ? j.this.getString(Q4.i.f9368Q) : j.this.getString(Q4.i.f9366O)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f23252a;

        i(q qVar) {
            this.f23252a = qVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iC2 = i10 < 0 ? j.this.P().c2() : j.this.P().e2();
            Month monthZ = this.f23252a.z(iC2);
            j.this.f23228l = monthZ;
            j.this.f23237u.setText(this.f23252a.A(iC2));
            j.this.X(this.f23252a.B(monthZ));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class ViewOnClickListenerC0227j implements View.OnClickListener {
        ViewOnClickListenerC0227j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.W();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f23255g;

        k(q qVar) {
            this.f23255g = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.T(this.f23255g.z(j.this.P().c2() + 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface m {
        void a(long j10);
    }

    private void H(View view, q qVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(Q4.e.f9316r);
        this.f23237u = materialButton;
        materialButton.setTag(f23223z);
        AbstractC1658a0.k0(this.f23237u, new h());
        View viewFindViewById = view.findViewById(Q4.e.f9318t);
        this.f23233q = viewFindViewById;
        viewFindViewById.setTag(f23221x);
        View viewFindViewById2 = view.findViewById(Q4.e.f9317s);
        this.f23234r = viewFindViewById2;
        viewFindViewById2.setTag(f23222y);
        this.f23235s = view.findViewById(Q4.e.f9271A);
        this.f23236t = view.findViewById(Q4.e.f9320v);
        U(l.DAY);
        this.f23237u.setText(this.f23228l.v());
        this.f23232p.n(new i(qVar));
        this.f23237u.setOnClickListener(new ViewOnClickListenerC0227j());
        this.f23234r.setOnClickListener(new k(qVar));
        this.f23233q.setOnClickListener(new a(qVar));
        X(qVar.B(this.f23228l));
    }

    private RecyclerView.o I() {
        return new g();
    }

    static int N(Context context) {
        return context.getResources().getDimensionPixelSize(Q4.c.f9215a0);
    }

    private static int O(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(Q4.c.f9231i0) + resources.getDimensionPixelOffset(Q4.c.f9233j0) + resources.getDimensionPixelOffset(Q4.c.f9229h0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(Q4.c.f9219c0);
        int i10 = p.f23307m;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(Q4.c.f9215a0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(Q4.c.f9227g0)) + resources.getDimensionPixelOffset(Q4.c.f9212Y);
    }

    public static j Q(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.l());
        jVar.setArguments(bundle);
        return jVar;
    }

    private void R(int i10) {
        this.f23232p.post(new b(i10));
    }

    private void V() {
        AbstractC1658a0.k0(this.f23232p, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i10) {
        this.f23234r.setEnabled(i10 + 1 < this.f23232p.getAdapter().d());
        this.f23233q.setEnabled(i10 - 1 >= 0);
    }

    CalendarConstraints J() {
        return this.f23226j;
    }

    com.google.android.material.datepicker.b K() {
        return this.f23230n;
    }

    Month L() {
        return this.f23228l;
    }

    public DateSelector M() {
        return this.f23225i;
    }

    LinearLayoutManager P() {
        return (LinearLayoutManager) this.f23232p.getLayoutManager();
    }

    void S() {
        MaterialButton materialButton = this.f23237u;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    void T(Month month) {
        q qVar = (q) this.f23232p.getAdapter();
        int iB = qVar.B(month);
        AccessibilityManager accessibilityManager = this.f23238v;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iB2 = iB - qVar.B(this.f23228l);
            boolean z10 = Math.abs(iB2) > 3;
            boolean z11 = iB2 > 0;
            this.f23228l = month;
            if (z10 && z11) {
                this.f23232p.q1(iB - 3);
                R(iB);
            } else if (z10) {
                this.f23232p.q1(iB + 3);
                R(iB);
            } else {
                R(iB);
            }
        } else {
            this.f23228l = month;
            this.f23232p.q1(iB);
        }
        X(iB);
    }

    void U(l lVar) {
        this.f23229m = lVar;
        if (lVar == l.YEAR) {
            this.f23231o.getLayoutManager().B1(((w) this.f23231o.getAdapter()).A(this.f23228l.f23161i));
            this.f23235s.setVisibility(0);
            this.f23236t.setVisibility(8);
            this.f23233q.setVisibility(8);
            this.f23234r.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f23235s.setVisibility(8);
            this.f23236t.setVisibility(0);
            this.f23233q.setVisibility(0);
            this.f23234r.setVisibility(0);
            T(this.f23228l);
        }
    }

    void W() {
        l lVar = this.f23229m;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            U(l.DAY);
            this.f23232p.announceForAccessibility(getString(Q4.i.f9369R));
        } else if (lVar == l.DAY) {
            U(lVar2);
            this.f23231o.announceForAccessibility(getString(Q4.i.f9370S));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f23224h = bundle.getInt("THEME_RES_ID_KEY");
        this.f23225i = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f23226j = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f23227k = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f23228l = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f23224h);
        this.f23230n = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f23238v = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month monthN = this.f23226j.n();
        if (n.L(contextThemeWrapper)) {
            i10 = Q4.g.f9345r;
            i11 = 1;
        } else {
            i10 = Q4.g.f9343p;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(O(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(Q4.e.f9321w);
        AbstractC1658a0.k0(gridView, new c());
        int i12 = this.f23226j.i();
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new com.google.android.material.datepicker.i(i12) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(monthN.f23162j);
        gridView.setEnabled(false);
        this.f23232p = (RecyclerView) viewInflate.findViewById(Q4.e.f9324z);
        this.f23232p.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f23232p.setTag(f23220w);
        q qVar = new q(contextThemeWrapper, this.f23225i, this.f23226j, this.f23227k, new e());
        this.f23232p.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(Q4.f.f9327c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(Q4.e.f9271A);
        this.f23231o = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f23231o.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f23231o.setAdapter(new w(this));
            this.f23231o.j(I());
        }
        if (viewInflate.findViewById(Q4.e.f9316r) != null) {
            H(viewInflate, qVar);
        }
        if (!n.L(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f23232p);
        }
        this.f23232p.q1(qVar.B(this.f23228l));
        V();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f23224h);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f23225i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f23226j);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f23227k);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f23228l);
    }

    @Override // com.google.android.material.datepicker.s
    public boolean w(r rVar) {
        return super.w(rVar);
    }
}
