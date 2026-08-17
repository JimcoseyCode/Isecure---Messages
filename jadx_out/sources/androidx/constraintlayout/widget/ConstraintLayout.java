package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import com.ov.message.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import r0.C3241d;
import r0.C3242e;
import r0.C3243f;
import r0.C3245h;
import r0.l;
import s0.C3313b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static j f15476D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    c f15477A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f15478B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f15479C;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    SparseArray f15480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f15481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected C3243f f15482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f15485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f15487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f15489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected d f15490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private HashMap f15492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f15493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f15495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f15496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f15497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f15498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SparseArray f15499z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15500a;

        static {
            int[] iArr = new int[C3242e.b.values().length];
            f15500a = iArr;
            try {
                iArr[C3242e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15500a[C3242e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15500a[C3242e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15500a[C3242e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements C3313b.InterfaceC0354b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f15576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f15578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f15581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f15582g;

        public c(ConstraintLayout constraintLayout) {
            this.f15576a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // s0.C3313b.InterfaceC0354b
        public final void a(C3242e c3242e, C3313b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (c3242e == null) {
                return;
            }
            if (c3242e.S() == 8 && !c3242e.g0()) {
                aVar.f32097e = 0;
                aVar.f32098f = 0;
                aVar.f32099g = 0;
                return;
            }
            if (c3242e.K() == null) {
                return;
            }
            C3242e.b bVar = aVar.f32093a;
            C3242e.b bVar2 = aVar.f32094b;
            int i11 = aVar.f32095c;
            int i12 = aVar.f32096d;
            int i13 = this.f15577b + this.f15578c;
            int i14 = this.f15579d;
            View view = (View) c3242e.s();
            int[] iArr = a.f15500a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15581f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15581f, i14 + c3242e.B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f15581f, i14, -2);
                boolean z10 = c3242e.f31712v == 1;
                int i16 = aVar.f32102j;
                if (i16 == C3313b.a.f32091l || i16 == C3313b.a.f32092m) {
                    boolean z11 = view.getMeasuredHeight() == c3242e.x();
                    if (aVar.f32102j == C3313b.a.f32092m || !z10 || ((z10 && z11) || c3242e.k0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c3242e.T(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15582g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15582g, i13 + c3242e.R(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f15582g, i13, -2);
                boolean z12 = c3242e.f31714w == 1;
                int i18 = aVar.f32102j;
                if (i18 == C3313b.a.f32091l || i18 == C3313b.a.f32092m) {
                    boolean z13 = view.getMeasuredWidth() == c3242e.T();
                    if (aVar.f32102j == C3313b.a.f32092m || !z12 || ((z12 && z13) || c3242e.l0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c3242e.x(), 1073741824);
                    }
                }
            }
            C3243f c3243f = (C3243f) c3242e.K();
            if (c3243f != null && r0.k.b(ConstraintLayout.this.f15488o, 256) && view.getMeasuredWidth() == c3242e.T() && view.getMeasuredWidth() < c3243f.T() && view.getMeasuredHeight() == c3242e.x() && view.getMeasuredHeight() < c3243f.x() && view.getBaseline() == c3242e.p() && !c3242e.j0() && d(c3242e.C(), iMakeMeasureSpec, c3242e.T()) && d(c3242e.D(), iMakeMeasureSpec2, c3242e.x())) {
                aVar.f32097e = c3242e.T();
                aVar.f32098f = c3242e.x();
                aVar.f32099g = c3242e.p();
                return;
            }
            C3242e.b bVar3 = C3242e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            C3242e.b bVar4 = C3242e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == C3242e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == C3242e.b.FIXED;
            boolean z18 = z14 && c3242e.f31675c0 > 0.0f;
            boolean z19 = z15 && c3242e.f31675c0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f32102j;
            if (i19 != C3313b.a.f32091l && i19 != C3313b.a.f32092m && z14 && c3242e.f31712v == 0 && z15 && c3242e.f31714w == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (c3242e instanceof l)) {
                    ((k) view).p((l) c3242e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c3242e.P0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = c3242e.f31718y;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = c3242e.f31720z;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = c3242e.f31638B;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = c3242e.f31640C;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                if (!r0.k.b(ConstraintLayout.this.f15488o, 1)) {
                    if (z18 && z16) {
                        iMax = (int) ((iMax2 * c3242e.f31675c0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / c3242e.f31675c0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c3242e.P0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z21 = baseline != i10;
            aVar.f32101i = (iMax == aVar.f32095c && iMax2 == aVar.f32096d) ? false : true;
            if (bVar5.f15538f0) {
                z21 = true;
            }
            if (z21 && baseline != -1 && c3242e.p() != baseline) {
                aVar.f32101i = true;
            }
            aVar.f32097e = iMax;
            aVar.f32098f = iMax2;
            aVar.f32100h = z21;
            aVar.f32099g = baseline;
        }

        @Override // s0.C3313b.InterfaceC0354b
        public final void b() {
            int childCount = this.f15576a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f15576a.getChildAt(i10);
            }
            int size = this.f15576a.f15481h.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f15576a.f15481h.get(i11)).l(this.f15576a);
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f15577b = i12;
            this.f15578c = i13;
            this.f15579d = i14;
            this.f15580e = i15;
            this.f15581f = i10;
            this.f15582g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15480g = new SparseArray();
        this.f15481h = new ArrayList(4);
        this.f15482i = new C3243f();
        this.f15483j = 0;
        this.f15484k = 0;
        this.f15485l = ViewDefaults.NUMBER_OF_LINES;
        this.f15486m = ViewDefaults.NUMBER_OF_LINES;
        this.f15487n = true;
        this.f15488o = 257;
        this.f15489p = null;
        this.f15490q = null;
        this.f15491r = -1;
        this.f15492s = new HashMap();
        this.f15493t = -1;
        this.f15494u = -1;
        this.f15495v = -1;
        this.f15496w = -1;
        this.f15497x = 0;
        this.f15498y = 0;
        this.f15499z = new SparseArray();
        this.f15477A = new c(this);
        this.f15478B = 0;
        this.f15479C = 0;
        k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (f15476D == null) {
            f15476D = new j();
        }
        return f15476D;
    }

    private final C3242e h(int i10) {
        if (i10 == 0) {
            return this.f15482i;
        }
        View viewFindViewById = (View) this.f15480g.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f15482i;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f15568u0;
    }

    private void k(AttributeSet attributeSet, int i10, int i11) {
        this.f15482i.v0(this);
        this.f15482i.P1(this.f15477A);
        this.f15480g.put(getId(), this);
        this.f15489p = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f16090m1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f16180w1) {
                    this.f15483j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15483j);
                } else if (index == i.f16189x1) {
                    this.f15484k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15484k);
                } else if (index == i.f16162u1) {
                    this.f15485l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15485l);
                } else if (index == i.f16171v1) {
                    this.f15486m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15486m);
                } else if (index == i.f16020e3) {
                    this.f15488o = typedArrayObtainStyledAttributes.getInt(index, this.f15488o);
                } else if (index == i.f15974Z1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f15490q = null;
                        }
                    }
                } else if (index == i.f15799E1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f15489p = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f15489p = null;
                    }
                    this.f15491r = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15482i.Q1(this.f15488o);
    }

    private void m() {
        this.f15487n = true;
        this.f15493t = -1;
        this.f15494u = -1;
        this.f15495v = -1;
        this.f15496w = -1;
        this.f15497x = 0;
        this.f15498y = 0;
    }

    private void q() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C3242e c3242eJ = j(getChildAt(i10));
            if (c3242eJ != null) {
                c3242eJ.q0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    h(childAt.getId()).w0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f15491r != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f15489p;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f15482i.o1();
        int size = this.f15481h.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f15481h.get(i13)).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f15499z.clear();
        this.f15499z.put(0, this.f15482i);
        this.f15499z.put(getId(), this.f15482i);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f15499z.put(childAt2.getId(), j(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            C3242e c3242eJ2 = j(childAt3);
            if (c3242eJ2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f15482i.c(c3242eJ2);
                d(zIsInEditMode, childAt3, c3242eJ2, bVar, this.f15499z);
            }
        }
    }

    private void t(C3242e c3242e, b bVar, SparseArray sparseArray, int i10, C3241d.b bVar2) {
        View view = (View) this.f15480g.get(i10);
        C3242e c3242e2 = (C3242e) sparseArray.get(i10);
        if (c3242e2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f15538f0 = true;
        C3241d.b bVar3 = C3241d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f15538f0 = true;
            bVar4.f15568u0.E0(true);
        }
        c3242e.o(bVar3).b(c3242e2.o(bVar2), bVar.f15503C, bVar.f15502B, true);
        c3242e.E0(true);
        c3242e.o(C3241d.b.TOP).q();
        c3242e.o(C3241d.b.BOTTOM).q();
    }

    private boolean u() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            q();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void d(boolean z10, View view, C3242e c3242e, b bVar, SparseArray sparseArray) {
        C3242e c3242e2;
        C3242e c3242e3;
        C3242e c3242e4;
        C3242e c3242e5;
        b bVar2;
        C3242e c3242e6;
        float f10;
        int i10;
        bVar.a();
        bVar.f15570v0 = false;
        c3242e.d1(view.getVisibility());
        if (bVar.f15544i0) {
            c3242e.N0(true);
            c3242e.d1(8);
        }
        c3242e.v0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).j(c3242e, this.f15482i.J1());
        }
        if (bVar.f15540g0) {
            C3245h c3245h = (C3245h) c3242e;
            int i11 = bVar.f15562r0;
            int i12 = bVar.f15564s0;
            float f11 = bVar.f15566t0;
            if (f11 != -1.0f) {
                c3245h.t1(f11);
                return;
            } else if (i11 != -1) {
                c3245h.r1(i11);
                return;
            } else {
                if (i12 != -1) {
                    c3245h.s1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.f15548k0;
        int i14 = bVar.f15550l0;
        int i15 = bVar.f15552m0;
        int i16 = bVar.f15554n0;
        int i17 = bVar.f15556o0;
        int i18 = bVar.f15558p0;
        float f12 = bVar.f15560q0;
        int i19 = bVar.f15555o;
        if (i19 != -1) {
            C3242e c3242e7 = (C3242e) sparseArray.get(i19);
            if (c3242e7 != null) {
                c3242e.l(c3242e7, bVar.f15559q, bVar.f15557p);
            }
            c3242e6 = c3242e;
            bVar2 = bVar;
        } else {
            if (i13 != -1) {
                C3242e c3242e8 = (C3242e) sparseArray.get(i13);
                if (c3242e8 != null) {
                    C3241d.b bVar3 = C3241d.b.LEFT;
                    c3242e.b0(bVar3, c3242e8, bVar3, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            } else if (i14 != -1 && (c3242e2 = (C3242e) sparseArray.get(i14)) != null) {
                c3242e.b0(C3241d.b.LEFT, c3242e2, C3241d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
            }
            if (i15 != -1) {
                C3242e c3242e9 = (C3242e) sparseArray.get(i15);
                if (c3242e9 != null) {
                    c3242e.b0(C3241d.b.RIGHT, c3242e9, C3241d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (c3242e3 = (C3242e) sparseArray.get(i16)) != null) {
                C3241d.b bVar4 = C3241d.b.RIGHT;
                c3242e.b0(bVar4, c3242e3, bVar4, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f15541h;
            if (i20 != -1) {
                C3242e c3242e10 = (C3242e) sparseArray.get(i20);
                if (c3242e10 != null) {
                    C3241d.b bVar5 = C3241d.b.TOP;
                    c3242e.b0(bVar5, c3242e10, bVar5, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f15571w);
                }
            } else {
                int i21 = bVar.f15543i;
                if (i21 != -1 && (c3242e4 = (C3242e) sparseArray.get(i21)) != null) {
                    c3242e.b0(C3241d.b.TOP, c3242e4, C3241d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f15571w);
                }
            }
            int i22 = bVar.f15545j;
            if (i22 != -1) {
                C3242e c3242e11 = (C3242e) sparseArray.get(i22);
                if (c3242e11 != null) {
                    c3242e.b0(C3241d.b.BOTTOM, c3242e11, C3241d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f15573y);
                }
            } else {
                int i23 = bVar.f15547k;
                if (i23 != -1 && (c3242e5 = (C3242e) sparseArray.get(i23)) != null) {
                    C3241d.b bVar6 = C3241d.b.BOTTOM;
                    c3242e.b0(bVar6, c3242e5, bVar6, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f15573y);
                }
            }
            int i24 = bVar.f15549l;
            if (i24 != -1) {
                bVar2 = bVar;
                t(c3242e, bVar2, sparseArray, i24, C3241d.b.BASELINE);
            } else {
                bVar2 = bVar;
                int i25 = bVar2.f15551m;
                if (i25 != -1) {
                    t(c3242e, bVar2, sparseArray, i25, C3241d.b.TOP);
                } else {
                    int i26 = bVar2.f15553n;
                    if (i26 != -1) {
                        t(c3242e, bVar2, sparseArray, i26, C3241d.b.BOTTOM);
                        c3242e6 = c3242e;
                    }
                    if (f12 >= 0.0f) {
                        c3242e6.G0(f12);
                    }
                    f10 = bVar2.f15507G;
                    if (f10 >= 0.0f) {
                        c3242e6.X0(f10);
                    }
                }
            }
            c3242e6 = c3242e;
            if (f12 >= 0.0f) {
            }
            f10 = bVar2.f15507G;
            if (f10 >= 0.0f) {
            }
        }
        if (z10 && ((i10 = bVar2.f15523W) != -1 || bVar2.f15524X != -1)) {
            c3242e6.V0(i10, bVar2.f15524X);
        }
        if (bVar2.f15534d0) {
            c3242e6.J0(C3242e.b.FIXED);
            c3242e6.e1(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                c3242e6.J0(C3242e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f15526Z) {
                c3242e6.J0(C3242e.b.MATCH_CONSTRAINT);
            } else {
                c3242e6.J0(C3242e.b.MATCH_PARENT);
            }
            c3242e6.o(C3241d.b.LEFT).f31621g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            c3242e6.o(C3241d.b.RIGHT).f31621g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            c3242e6.J0(C3242e.b.MATCH_CONSTRAINT);
            c3242e6.e1(0);
        }
        if (bVar2.f15536e0) {
            c3242e6.a1(C3242e.b.FIXED);
            c3242e6.F0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                c3242e6.a1(C3242e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f15528a0) {
                c3242e6.a1(C3242e.b.MATCH_CONSTRAINT);
            } else {
                c3242e6.a1(C3242e.b.MATCH_PARENT);
            }
            c3242e6.o(C3241d.b.TOP).f31621g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            c3242e6.o(C3241d.b.BOTTOM).f31621g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            c3242e6.a1(C3242e.b.MATCH_CONSTRAINT);
            c3242e6.F0(0);
        }
        c3242e6.x0(bVar2.f15508H);
        c3242e6.L0(bVar2.f15511K);
        c3242e6.c1(bVar2.f15512L);
        c3242e6.H0(bVar2.f15513M);
        c3242e6.Y0(bVar2.f15514N);
        c3242e6.f1(bVar2.f15532c0);
        c3242e6.K0(bVar2.f15515O, bVar2.f15517Q, bVar2.f15519S, bVar2.f15521U);
        c3242e6.b1(bVar2.f15516P, bVar2.f15518R, bVar2.f15520T, bVar2.f15522V);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f15481h;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.c) this.f15481h.get(i10)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        m();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f15492s;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f15492s.get(str);
    }

    public int getMaxHeight() {
        return this.f15486m;
    }

    public int getMaxWidth() {
        return this.f15485l;
    }

    public int getMinHeight() {
        return this.f15484k;
    }

    public int getMinWidth() {
        return this.f15483j;
    }

    public int getOptimizationLevel() {
        return this.f15482i.D1();
    }

    public View i(int i10) {
        return (View) this.f15480g.get(i10);
    }

    public final C3242e j(View view) {
        if (view == this) {
            return this.f15482i;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15568u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f15568u0;
        }
        return null;
    }

    protected boolean l() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void n(int i10) {
        this.f15490q = new d(getContext(), this, i10);
    }

    protected void o(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f15477A;
        int i14 = cVar.f15580e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f15579d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f15485l, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f15486m, iResolveSizeAndState2);
        if (z10) {
            iMin |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        if (z11) {
            iMin2 |= PointerEventHelper.X_FLAG_SUPPORTS_HOVER;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f15493t = iMin;
        this.f15494u = iMin2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            C3242e c3242e = bVar.f15568u0;
            if ((childAt.getVisibility() != 8 || bVar.f15540g0 || bVar.f15542h0 || bVar.f15546j0 || zIsInEditMode) && !bVar.f15544i0) {
                int iU = c3242e.U();
                int iV = c3242e.V();
                childAt.layout(iU, iV, c3242e.T() + iU, c3242e.x() + iV);
            }
        }
        int size = this.f15481h.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.c) this.f15481h.get(i15)).k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f15478B == i10) {
            int i12 = this.f15479C;
        }
        if (!this.f15487n) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f15487n = true;
                    break;
                }
                i13++;
            }
        }
        this.f15478B = i10;
        this.f15479C = i11;
        this.f15482i.S1(l());
        if (this.f15487n) {
            this.f15487n = false;
            if (u()) {
                this.f15482i.U1();
            }
        }
        p(this.f15482i, this.f15488o, i10, i11);
        o(i10, i11, this.f15482i.T(), this.f15482i.x(), this.f15482i.K1(), this.f15482i.I1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C3242e c3242eJ = j(view);
        if ((view instanceof g) && !(c3242eJ instanceof C3245h)) {
            b bVar = (b) view.getLayoutParams();
            C3245h c3245h = new C3245h();
            bVar.f15568u0 = c3245h;
            bVar.f15540g0 = true;
            c3245h.u1(bVar.f15525Y);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.o();
            ((b) view.getLayoutParams()).f15542h0 = true;
            if (!this.f15481h.contains(cVar)) {
                this.f15481h.add(cVar);
            }
        }
        this.f15480g.put(view.getId(), view);
        this.f15487n = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f15480g.remove(view.getId());
        this.f15482i.n1(j(view));
        this.f15481h.remove(view);
        this.f15487n = true;
    }

    protected void p(C3243f c3243f, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f15477A.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (l()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            s(c3243f, mode, i15, mode2, i16);
            c3243f.L1(i10, mode, i15, mode2, i16, this.f15493t, this.f15494u, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        s(c3243f, mode, i152, mode2, i162);
        c3243f.L1(i10, mode, i152, mode2, i162, this.f15493t, this.f15494u, i13, iMax);
    }

    public void r(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f15492s == null) {
                this.f15492s = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f15492s.put(strSubstring, (Integer) obj2);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m();
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 r0.e$b) = (r2v3 r0.e$b), (r2v0 r0.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void s(C3243f c3243f, int i10, int i11, int i12, int i13) {
        C3242e.b bVar;
        c cVar = this.f15477A;
        int i14 = cVar.f15580e;
        int i15 = cVar.f15579d;
        C3242e.b bVar2 = C3242e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = C3242e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f15483j);
            }
        } else if (i10 == 0) {
            bVar = C3242e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f15483j) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f15485l - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = C3242e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f15484k);
            }
        } else if (i12 != 0) {
            i13 = i12 != 1073741824 ? 0 : Math.min(this.f15486m - i14, i13);
        } else {
            bVar2 = C3242e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f15484k);
            }
        }
        if (i11 != c3243f.T() || i13 != c3243f.x()) {
            c3243f.H1();
        }
        c3243f.g1(0);
        c3243f.h1(0);
        c3243f.R0(this.f15485l - i15);
        c3243f.Q0(this.f15486m - i14);
        c3243f.U0(0);
        c3243f.T0(0);
        c3243f.J0(bVar);
        c3243f.e1(i11);
        c3243f.a1(bVar2);
        c3243f.F0(i13);
        c3243f.U0(this.f15483j - i15);
        c3243f.T0(this.f15484k - i14);
    }

    public void setConstraintSet(e eVar) {
        this.f15489p = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f15480g.remove(getId());
        super.setId(i10);
        this.f15480g.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f15486m) {
            return;
        }
        this.f15486m = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f15485l) {
            return;
        }
        this.f15485l = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f15484k) {
            return;
        }
        this.f15484k = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f15483j) {
            return;
        }
        this.f15483j = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f15490q;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f15488o = i10;
        this.f15482i.Q1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15480g = new SparseArray();
        this.f15481h = new ArrayList(4);
        this.f15482i = new C3243f();
        this.f15483j = 0;
        this.f15484k = 0;
        this.f15485l = ViewDefaults.NUMBER_OF_LINES;
        this.f15486m = ViewDefaults.NUMBER_OF_LINES;
        this.f15487n = true;
        this.f15488o = 257;
        this.f15489p = null;
        this.f15490q = null;
        this.f15491r = -1;
        this.f15492s = new HashMap();
        this.f15493t = -1;
        this.f15494u = -1;
        this.f15495v = -1;
        this.f15496w = -1;
        this.f15497x = 0;
        this.f15498y = 0;
        this.f15499z = new SparseArray();
        this.f15477A = new c(this);
        this.f15478B = 0;
        this.f15479C = 0;
        k(attributeSet, i10, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f15501A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f15502B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f15503C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f15504D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f15505E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f15506F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f15507G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public String f15508H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        float f15509I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f15510J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f15511K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f15512L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f15513M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f15514N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f15515O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f15516P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f15517Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f15518R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f15519S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f15520T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public float f15521U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f15522V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f15523W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f15524X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f15525Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean f15526Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15527a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f15528a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15529b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public String f15530b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15531c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f15532c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15533d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        boolean f15534d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15535e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f15536e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15537f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f15538f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15539g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f15540g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15541h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f15542h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15543i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f15544i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15545j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f15546j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15547k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f15548k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15549l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f15550l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f15551m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f15552m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f15553n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f15554n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f15555o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f15556o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f15557p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f15558p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f15559q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        float f15560q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f15561r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f15562r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f15563s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f15564s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15565t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        float f15566t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f15567u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        C3242e f15568u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f15569v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public boolean f15570v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f15571w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f15572x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f15573y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f15574z;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f15575a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f15575a = sparseIntArray;
                sparseIntArray.append(i.f15895P2, 64);
                sparseIntArray.append(i.f16145s2, 65);
                sparseIntArray.append(i.f15773B2, 8);
                sparseIntArray.append(i.f15782C2, 9);
                sparseIntArray.append(i.f15800E2, 10);
                sparseIntArray.append(i.f15809F2, 11);
                sparseIntArray.append(i.f15863L2, 12);
                sparseIntArray.append(i.f15854K2, 13);
                sparseIntArray.append(i.f16055i2, 14);
                sparseIntArray.append(i.f16046h2, 15);
                sparseIntArray.append(i.f16010d2, 16);
                sparseIntArray.append(i.f16028f2, 52);
                sparseIntArray.append(i.f16019e2, 53);
                sparseIntArray.append(i.f16064j2, 2);
                sparseIntArray.append(i.f16082l2, 3);
                sparseIntArray.append(i.f16073k2, 4);
                sparseIntArray.append(i.f15935U2, 49);
                sparseIntArray.append(i.f15943V2, 50);
                sparseIntArray.append(i.f16118p2, 5);
                sparseIntArray.append(i.f16127q2, 6);
                sparseIntArray.append(i.f16136r2, 7);
                sparseIntArray.append(i.f16099n1, 1);
                sparseIntArray.append(i.f15818G2, 17);
                sparseIntArray.append(i.f15827H2, 18);
                sparseIntArray.append(i.f16109o2, 19);
                sparseIntArray.append(i.f16100n2, 20);
                sparseIntArray.append(i.f15975Z2, 21);
                sparseIntArray.append(i.f16002c3, 22);
                sparseIntArray.append(i.f15984a3, 23);
                sparseIntArray.append(i.f15959X2, 24);
                sparseIntArray.append(i.f15993b3, 25);
                sparseIntArray.append(i.f15967Y2, 26);
                sparseIntArray.append(i.f15951W2, 55);
                sparseIntArray.append(i.f16011d3, 54);
                sparseIntArray.append(i.f16190x2, 29);
                sparseIntArray.append(i.f15871M2, 30);
                sparseIntArray.append(i.f16091m2, 44);
                sparseIntArray.append(i.f16208z2, 45);
                sparseIntArray.append(i.f15887O2, 46);
                sparseIntArray.append(i.f16199y2, 47);
                sparseIntArray.append(i.f15879N2, 48);
                sparseIntArray.append(i.f15992b2, 27);
                sparseIntArray.append(i.f15983a2, 28);
                sparseIntArray.append(i.f15903Q2, 31);
                sparseIntArray.append(i.f16154t2, 32);
                sparseIntArray.append(i.f15919S2, 33);
                sparseIntArray.append(i.f15911R2, 34);
                sparseIntArray.append(i.f15927T2, 35);
                sparseIntArray.append(i.f16172v2, 36);
                sparseIntArray.append(i.f16163u2, 37);
                sparseIntArray.append(i.f16181w2, 38);
                sparseIntArray.append(i.f15764A2, 39);
                sparseIntArray.append(i.f15845J2, 40);
                sparseIntArray.append(i.f15791D2, 41);
                sparseIntArray.append(i.f16037g2, 42);
                sparseIntArray.append(i.f16001c2, 43);
                sparseIntArray.append(i.f15836I2, 51);
                sparseIntArray.append(i.f16029f3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15527a = -1;
            this.f15529b = -1;
            this.f15531c = -1.0f;
            this.f15533d = -1;
            this.f15535e = -1;
            this.f15537f = -1;
            this.f15539g = -1;
            this.f15541h = -1;
            this.f15543i = -1;
            this.f15545j = -1;
            this.f15547k = -1;
            this.f15549l = -1;
            this.f15551m = -1;
            this.f15553n = -1;
            this.f15555o = -1;
            this.f15557p = 0;
            this.f15559q = 0.0f;
            this.f15561r = -1;
            this.f15563s = -1;
            this.f15565t = -1;
            this.f15567u = -1;
            this.f15569v = androidx.customview.widget.a.INVALID_ID;
            this.f15571w = androidx.customview.widget.a.INVALID_ID;
            this.f15572x = androidx.customview.widget.a.INVALID_ID;
            this.f15573y = androidx.customview.widget.a.INVALID_ID;
            this.f15574z = androidx.customview.widget.a.INVALID_ID;
            this.f15501A = androidx.customview.widget.a.INVALID_ID;
            this.f15502B = androidx.customview.widget.a.INVALID_ID;
            this.f15503C = 0;
            this.f15504D = true;
            this.f15505E = true;
            this.f15506F = 0.5f;
            this.f15507G = 0.5f;
            this.f15508H = null;
            this.f15509I = 0.0f;
            this.f15510J = 1;
            this.f15511K = -1.0f;
            this.f15512L = -1.0f;
            this.f15513M = 0;
            this.f15514N = 0;
            this.f15515O = 0;
            this.f15516P = 0;
            this.f15517Q = 0;
            this.f15518R = 0;
            this.f15519S = 0;
            this.f15520T = 0;
            this.f15521U = 1.0f;
            this.f15522V = 1.0f;
            this.f15523W = -1;
            this.f15524X = -1;
            this.f15525Y = -1;
            this.f15526Z = false;
            this.f15528a0 = false;
            this.f15530b0 = null;
            this.f15532c0 = 0;
            this.f15534d0 = true;
            this.f15536e0 = true;
            this.f15538f0 = false;
            this.f15540g0 = false;
            this.f15542h0 = false;
            this.f15544i0 = false;
            this.f15546j0 = false;
            this.f15548k0 = -1;
            this.f15550l0 = -1;
            this.f15552m0 = -1;
            this.f15554n0 = -1;
            this.f15556o0 = androidx.customview.widget.a.INVALID_ID;
            this.f15558p0 = androidx.customview.widget.a.INVALID_ID;
            this.f15560q0 = 0.5f;
            this.f15568u0 = new C3242e();
            this.f15570v0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f16090m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f15575a.get(index);
                switch (i11) {
                    case 1:
                        this.f15525Y = typedArrayObtainStyledAttributes.getInt(index, this.f15525Y);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15555o);
                        this.f15555o = resourceId;
                        if (resourceId == -1) {
                            this.f15555o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f15557p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15557p);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f15559q) % 360.0f;
                        this.f15559q = f10;
                        if (f10 < 0.0f) {
                            this.f15559q = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f15527a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15527a);
                        break;
                    case 6:
                        this.f15529b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15529b);
                        break;
                    case 7:
                        this.f15531c = typedArrayObtainStyledAttributes.getFloat(index, this.f15531c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15533d);
                        this.f15533d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f15533d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15535e);
                        this.f15535e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f15535e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15537f);
                        this.f15537f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f15537f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15539g);
                        this.f15539g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f15539g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15541h);
                        this.f15541h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f15541h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15543i);
                        this.f15543i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f15543i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15545j);
                        this.f15545j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f15545j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15547k);
                        this.f15547k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f15547k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15549l);
                        this.f15549l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f15549l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15561r);
                        this.f15561r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f15561r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15563s);
                        this.f15563s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f15563s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15565t);
                        this.f15565t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f15565t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15567u);
                        this.f15567u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f15567u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        this.f15569v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15569v);
                        break;
                    case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                        this.f15571w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15571w);
                        break;
                    case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        this.f15572x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15572x);
                        break;
                    case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        this.f15573y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15573y);
                        break;
                    case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                        this.f15574z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15574z);
                        break;
                    case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                        this.f15501A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15501A);
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                        this.f15526Z = typedArrayObtainStyledAttributes.getBoolean(index, this.f15526Z);
                        break;
                    case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                        this.f15528a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15528a0);
                        break;
                    case 29:
                        this.f15506F = typedArrayObtainStyledAttributes.getFloat(index, this.f15506F);
                        break;
                    case 30:
                        this.f15507G = typedArrayObtainStyledAttributes.getFloat(index, this.f15507G);
                        break;
                    case 31:
                        this.f15515O = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        this.f15516P = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f15517Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15517Q);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15517Q) == -2) {
                                this.f15517Q = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f15519S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15519S);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15519S) == -2) {
                                this.f15519S = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f15521U = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15521U));
                        this.f15515O = 2;
                        break;
                    case 36:
                        try {
                            this.f15518R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15518R);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15518R) == -2) {
                                this.f15518R = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f15520T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15520T);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f15520T) == -2) {
                                this.f15520T = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f15522V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f15522V));
                        this.f15516P = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                e.p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case BuildConfig.VERSION_CODE /* 45 */:
                                this.f15511K = typedArrayObtainStyledAttributes.getFloat(index, this.f15511K);
                                break;
                            case 46:
                                this.f15512L = typedArrayObtainStyledAttributes.getFloat(index, this.f15512L);
                                break;
                            case 47:
                                this.f15513M = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f15514N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f15523W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15523W);
                                break;
                            case 50:
                                this.f15524X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f15524X);
                                break;
                            case 51:
                                this.f15530b0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15551m);
                                this.f15551m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f15551m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15553n);
                                this.f15553n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f15553n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f15503C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15503C);
                                break;
                            case 55:
                                this.f15502B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f15502B);
                                break;
                            default:
                                switch (i11) {
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                        e.n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f15504D = true;
                                        break;
                                    case 65:
                                        e.n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f15505E = true;
                                        break;
                                    case 66:
                                        this.f15532c0 = typedArrayObtainStyledAttributes.getInt(index, this.f15532c0);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f15540g0 = false;
            this.f15534d0 = true;
            this.f15536e0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f15526Z) {
                this.f15534d0 = false;
                if (this.f15515O == 0) {
                    this.f15515O = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f15528a0) {
                this.f15536e0 = false;
                if (this.f15516P == 0) {
                    this.f15516P = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f15534d0 = false;
                if (i10 == 0 && this.f15515O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f15526Z = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f15536e0 = false;
                if (i11 == 0 && this.f15516P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f15528a0 = true;
                }
            }
            if (this.f15531c == -1.0f && this.f15527a == -1 && this.f15529b == -1) {
                return;
            }
            this.f15540g0 = true;
            this.f15534d0 = true;
            this.f15536e0 = true;
            if (!(this.f15568u0 instanceof C3245h)) {
                this.f15568u0 = new C3245h();
            }
            ((C3245h) this.f15568u0).u1(this.f15525Y);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f15552m0 = -1;
            this.f15554n0 = -1;
            this.f15548k0 = -1;
            this.f15550l0 = -1;
            this.f15556o0 = this.f15569v;
            this.f15558p0 = this.f15572x;
            float f10 = this.f15506F;
            this.f15560q0 = f10;
            int i17 = this.f15527a;
            this.f15562r0 = i17;
            int i18 = this.f15529b;
            this.f15564s0 = i18;
            float f11 = this.f15531c;
            this.f15566t0 = f11;
            if (z11) {
                int i19 = this.f15561r;
                if (i19 != -1) {
                    this.f15552m0 = i19;
                } else {
                    int i20 = this.f15563s;
                    if (i20 != -1) {
                        this.f15554n0 = i20;
                    }
                    i11 = this.f15565t;
                    if (i11 != -1) {
                        this.f15550l0 = i11;
                        z10 = true;
                    }
                    i12 = this.f15567u;
                    if (i12 != -1) {
                        this.f15548k0 = i12;
                        z10 = true;
                    }
                    i13 = this.f15574z;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f15558p0 = i13;
                    }
                    i14 = this.f15501A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f15556o0 = i14;
                    }
                    if (z10) {
                        this.f15560q0 = 1.0f - f10;
                    }
                    if (this.f15540g0 && this.f15525Y == 1) {
                        if (f11 == -1.0f) {
                            this.f15566t0 = 1.0f - f11;
                            this.f15562r0 = -1;
                            this.f15564s0 = -1;
                        } else if (i17 != -1) {
                            this.f15564s0 = i17;
                            this.f15562r0 = -1;
                            this.f15566t0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f15562r0 = i18;
                            this.f15564s0 = -1;
                            this.f15566t0 = -1.0f;
                        }
                    }
                }
                z10 = true;
                i11 = this.f15565t;
                if (i11 != -1) {
                }
                i12 = this.f15567u;
                if (i12 != -1) {
                }
                i13 = this.f15574z;
                if (i13 != Integer.MIN_VALUE) {
                }
                i14 = this.f15501A;
                if (i14 != Integer.MIN_VALUE) {
                }
                if (z10) {
                }
                if (this.f15540g0) {
                    if (f11 == -1.0f) {
                    }
                }
            } else {
                int i21 = this.f15561r;
                if (i21 != -1) {
                    this.f15550l0 = i21;
                }
                int i22 = this.f15563s;
                if (i22 != -1) {
                    this.f15548k0 = i22;
                }
                int i23 = this.f15565t;
                if (i23 != -1) {
                    this.f15552m0 = i23;
                }
                int i24 = this.f15567u;
                if (i24 != -1) {
                    this.f15554n0 = i24;
                }
                int i25 = this.f15574z;
                if (i25 != Integer.MIN_VALUE) {
                    this.f15556o0 = i25;
                }
                int i26 = this.f15501A;
                if (i26 != Integer.MIN_VALUE) {
                    this.f15558p0 = i26;
                }
            }
            if (this.f15565t == -1 && this.f15567u == -1 && this.f15563s == -1 && this.f15561r == -1) {
                int i27 = this.f15537f;
                if (i27 != -1) {
                    this.f15552m0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f15539g;
                    if (i28 != -1) {
                        this.f15554n0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f15533d;
                if (i29 != -1) {
                    this.f15548k0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f15535e;
                if (i30 != -1) {
                    this.f15550l0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f15527a = -1;
            this.f15529b = -1;
            this.f15531c = -1.0f;
            this.f15533d = -1;
            this.f15535e = -1;
            this.f15537f = -1;
            this.f15539g = -1;
            this.f15541h = -1;
            this.f15543i = -1;
            this.f15545j = -1;
            this.f15547k = -1;
            this.f15549l = -1;
            this.f15551m = -1;
            this.f15553n = -1;
            this.f15555o = -1;
            this.f15557p = 0;
            this.f15559q = 0.0f;
            this.f15561r = -1;
            this.f15563s = -1;
            this.f15565t = -1;
            this.f15567u = -1;
            this.f15569v = androidx.customview.widget.a.INVALID_ID;
            this.f15571w = androidx.customview.widget.a.INVALID_ID;
            this.f15572x = androidx.customview.widget.a.INVALID_ID;
            this.f15573y = androidx.customview.widget.a.INVALID_ID;
            this.f15574z = androidx.customview.widget.a.INVALID_ID;
            this.f15501A = androidx.customview.widget.a.INVALID_ID;
            this.f15502B = androidx.customview.widget.a.INVALID_ID;
            this.f15503C = 0;
            this.f15504D = true;
            this.f15505E = true;
            this.f15506F = 0.5f;
            this.f15507G = 0.5f;
            this.f15508H = null;
            this.f15509I = 0.0f;
            this.f15510J = 1;
            this.f15511K = -1.0f;
            this.f15512L = -1.0f;
            this.f15513M = 0;
            this.f15514N = 0;
            this.f15515O = 0;
            this.f15516P = 0;
            this.f15517Q = 0;
            this.f15518R = 0;
            this.f15519S = 0;
            this.f15520T = 0;
            this.f15521U = 1.0f;
            this.f15522V = 1.0f;
            this.f15523W = -1;
            this.f15524X = -1;
            this.f15525Y = -1;
            this.f15526Z = false;
            this.f15528a0 = false;
            this.f15530b0 = null;
            this.f15532c0 = 0;
            this.f15534d0 = true;
            this.f15536e0 = true;
            this.f15538f0 = false;
            this.f15540g0 = false;
            this.f15542h0 = false;
            this.f15544i0 = false;
            this.f15546j0 = false;
            this.f15548k0 = -1;
            this.f15550l0 = -1;
            this.f15552m0 = -1;
            this.f15554n0 = -1;
            this.f15556o0 = androidx.customview.widget.a.INVALID_ID;
            this.f15558p0 = androidx.customview.widget.a.INVALID_ID;
            this.f15560q0 = 0.5f;
            this.f15568u0 = new C3242e();
            this.f15570v0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15527a = -1;
            this.f15529b = -1;
            this.f15531c = -1.0f;
            this.f15533d = -1;
            this.f15535e = -1;
            this.f15537f = -1;
            this.f15539g = -1;
            this.f15541h = -1;
            this.f15543i = -1;
            this.f15545j = -1;
            this.f15547k = -1;
            this.f15549l = -1;
            this.f15551m = -1;
            this.f15553n = -1;
            this.f15555o = -1;
            this.f15557p = 0;
            this.f15559q = 0.0f;
            this.f15561r = -1;
            this.f15563s = -1;
            this.f15565t = -1;
            this.f15567u = -1;
            this.f15569v = androidx.customview.widget.a.INVALID_ID;
            this.f15571w = androidx.customview.widget.a.INVALID_ID;
            this.f15572x = androidx.customview.widget.a.INVALID_ID;
            this.f15573y = androidx.customview.widget.a.INVALID_ID;
            this.f15574z = androidx.customview.widget.a.INVALID_ID;
            this.f15501A = androidx.customview.widget.a.INVALID_ID;
            this.f15502B = androidx.customview.widget.a.INVALID_ID;
            this.f15503C = 0;
            this.f15504D = true;
            this.f15505E = true;
            this.f15506F = 0.5f;
            this.f15507G = 0.5f;
            this.f15508H = null;
            this.f15509I = 0.0f;
            this.f15510J = 1;
            this.f15511K = -1.0f;
            this.f15512L = -1.0f;
            this.f15513M = 0;
            this.f15514N = 0;
            this.f15515O = 0;
            this.f15516P = 0;
            this.f15517Q = 0;
            this.f15518R = 0;
            this.f15519S = 0;
            this.f15520T = 0;
            this.f15521U = 1.0f;
            this.f15522V = 1.0f;
            this.f15523W = -1;
            this.f15524X = -1;
            this.f15525Y = -1;
            this.f15526Z = false;
            this.f15528a0 = false;
            this.f15530b0 = null;
            this.f15532c0 = 0;
            this.f15534d0 = true;
            this.f15536e0 = true;
            this.f15538f0 = false;
            this.f15540g0 = false;
            this.f15542h0 = false;
            this.f15544i0 = false;
            this.f15546j0 = false;
            this.f15548k0 = -1;
            this.f15550l0 = -1;
            this.f15552m0 = -1;
            this.f15554n0 = -1;
            this.f15556o0 = androidx.customview.widget.a.INVALID_ID;
            this.f15558p0 = androidx.customview.widget.a.INVALID_ID;
            this.f15560q0 = 0.5f;
            this.f15568u0 = new C3242e();
            this.f15570v0 = false;
        }
    }
}
