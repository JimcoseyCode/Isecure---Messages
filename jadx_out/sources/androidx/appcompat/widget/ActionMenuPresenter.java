package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC1659b;
import f.AbstractC2568a;
import f.AbstractC2574g;
import java.util.ArrayList;
import k.InterfaceC2820e;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC1659b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f14548A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f14549B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f14550C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final SparseBooleanArray f14551D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    e f14552E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    a f14553F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    c f14554G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private b f14555H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final f f14556I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f14557J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    d f14558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f14559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f14563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14567z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14568g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f14568g);
        }

        SavedState(Parcel parcel) {
            this.f14568g = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC2568a.f26737i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f14558q;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14306o : view2);
            }
            j(ActionMenuPresenter.this.f14556I);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f14553F = null;
            actionMenuPresenter.f14557J = 0;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC2820e a() {
            a aVar = ActionMenuPresenter.this.f14553F;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f14571g;

        public c(e eVar) {
            this.f14571g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14300i != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14300i.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14306o;
            if (view != null && view.getWindowToken() != null && this.f14571g.m()) {
                ActionMenuPresenter.this.f14552E = this.f14571g;
            }
            ActionMenuPresenter.this.f14554G = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d extends C1644q implements ActionMenuView.a {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends P {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f14574p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f14574p = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.P
            public InterfaceC2820e b() {
                e eVar = ActionMenuPresenter.this.f14552E;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.P
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.P
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f14554G != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC2568a.f26736h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC3606a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC2568a.f26737i);
            h(8388613);
            j(ActionMenuPresenter.this.f14556I);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14300i != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14300i.close();
            }
            ActionMenuPresenter.this.f14552E = null;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            j.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                aVarO.a(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f14300i) {
                return false;
            }
            ActionMenuPresenter.this.f14557J = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                return aVarO.b(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, AbstractC2574g.f26867c, AbstractC2574g.f26866b);
        this.f14551D = new SparseBooleanArray();
        this.f14556I = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f14306o;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        d dVar = this.f14558q;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f14560s) {
            return this.f14559r;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.f14554G;
        if (cVar != null && (obj = this.f14306o) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f14554G = null;
            return true;
        }
        e eVar = this.f14552E;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f14553F;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f14554G != null || G();
    }

    public boolean G() {
        e eVar = this.f14552E;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f14566y) {
            this.f14565x = androidx.appcompat.view.a.b(this.f14299h).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f14300i;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f14549B = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f14306o = actionMenuView;
        actionMenuView.b(this.f14300i);
    }

    public void K(Drawable drawable) {
        d dVar = this.f14558q;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f14560s = true;
            this.f14559r = drawable;
        }
    }

    public void L(boolean z10) {
        this.f14561t = z10;
        this.f14562u = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f14561t || G() || (eVar = this.f14300i) == null || this.f14306o == null || this.f14554G != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f14299h, this.f14300i, this.f14558q, true));
        this.f14554G = cVar;
        ((View) this.f14306o).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        A();
        super.a(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(boolean z10) {
        super.b(z10);
        ((View) this.f14306o).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f14300i;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1659b abstractC1659bB = ((androidx.appcompat.view.menu.g) arrayListU.get(i10)).b();
                if (abstractC1659bB != null) {
                    abstractC1659bB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f14300i;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f14561t && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f14558q == null) {
                this.f14558q = new d(this.f14298g);
            }
            ViewGroup viewGroup = (ViewGroup) this.f14558q.getParent();
            if (viewGroup != this.f14306o) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f14558q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f14306o;
                actionMenuView.addView(this.f14558q, actionMenuView.D());
            }
        } else {
            d dVar = this.f14558q;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f14306o;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f14558q);
                }
            }
        }
        ((ActionMenuView) this.f14306o).setOverflowReserved(this.f14561t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.ActionMenuPresenter] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iJ;
        ?? r02;
        int i11;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.f14300i;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = actionMenuPresenter.f14565x;
        int i13 = actionMenuPresenter.f14564w;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f14306o;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListG.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z10 = true;
            }
            if (actionMenuPresenter.f14549B && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (actionMenuPresenter.f14561t && (z10 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f14551D;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f14567z) {
            int i18 = actionMenuPresenter.f14550C;
            iJ = i13 / i18;
            i10 = i18 + ((i13 % i18) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i19 = 0;
        int i20 = 0;
        ?? r03 = actionMenuPresenter;
        while (i19 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListG.get(i19);
            if (r15.o()) {
                View viewP = r03.p(r15, view, viewGroup);
                if (r03.f14567z) {
                    iJ -= ActionMenuView.J(viewP, i10, iJ, iMakeMeasureSpec, r32);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r02 = r32;
                i11 = size;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i17 > 0 || z11) && i13 > 0 && (!r03.f14567z || iJ > 0);
                boolean z13 = z12;
                i11 = size;
                if (z12) {
                    View viewP2 = r03.p(r15, null, viewGroup);
                    if (r03.f14567z) {
                        int iJ2 = ActionMenuView.J(viewP2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z12 = z14 & (!r03.f14567z ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListG.get(i21);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i17++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                r15.u(z12);
                r02 = 0;
            } else {
                r02 = r32;
                i11 = size;
                r15.u(r02);
            }
            i19++;
            r32 = r02;
            size = i11;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void g(Context context, androidx.appcompat.view.menu.e eVar) {
        super.g(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f14562u) {
            this.f14561t = aVarB.f();
        }
        if (!this.f14548A) {
            this.f14563v = aVarB.c();
        }
        if (!this.f14566y) {
            this.f14565x = aVarB.d();
        }
        int measuredWidth = this.f14563v;
        if (this.f14561t) {
            if (this.f14558q == null) {
                d dVar = new d(this.f14298g);
                this.f14558q = dVar;
                if (this.f14560s) {
                    dVar.setImageDrawable(this.f14559r);
                    this.f14559r = null;
                    this.f14560s = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14558q.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f14558q.getMeasuredWidth();
        } else {
            this.f14558q = null;
        }
        this.f14564w = measuredWidth;
        this.f14550C = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f14568g) > 0 && (menuItemFindItem = this.f14300i.findItem(i10)) != null) {
            i((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean i(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.j0() != this.f14300i) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.j0();
        }
        View viewB = B(mVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.f14557J = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f14299h, mVar, viewB);
        this.f14553F = aVar;
        aVar.g(z10);
        this.f14553F.k();
        super.i(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable k() {
        SavedState savedState = new SavedState();
        savedState.f14568g = this.f14557J;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a
    public void l(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f14306o);
        if (this.f14555H == null) {
            this.f14555H = new b();
        }
        actionMenuItemView.setPopupCallback(this.f14555H);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f14558q) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f14306o;
        androidx.appcompat.view.menu.k kVarQ = super.q(viewGroup);
        if (kVar != kVarQ) {
            ((ActionMenuView) kVarQ).setPresenter(this);
        }
        return kVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
