package androidx.recyclerview.widget;

import I0.z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f17711I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f17712J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int[] f17713K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    View[] f17714L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final SparseIntArray f17715M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final SparseIntArray f17716N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    c f17717O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final Rect f17718P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f17719Q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f17722a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f17723b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f17724c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f17725d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f17725d) {
                return d(i10, i11);
            }
            int i12 = this.f17723b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f17723b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f17724c) {
                return e(i10, i11);
            }
            int i12 = this.f17722a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f17722a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f17725d || (iA = a(this.f17723b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f17723b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f17723b.clear();
        }

        public void h() {
            this.f17722a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f17711I = false;
        this.f17712J = -1;
        this.f17715M = new SparseIntArray();
        this.f17716N = new SparseIntArray();
        this.f17717O = new a();
        this.f17718P = new Rect();
        e3(RecyclerView.p.m0(context, attributeSet, i10, i11).f17946b);
    }

    private void N2(RecyclerView.w wVar, RecyclerView.A a10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f17714L[i11];
            b bVar = (b) view.getLayoutParams();
            int iA3 = a3(wVar, a10, l0(view));
            bVar.f17721f = iA3;
            bVar.f17720e = i14;
            i14 += iA3;
            i11 += i13;
        }
    }

    private void O2() {
        int iO = O();
        for (int i10 = 0; i10 < iO; i10++) {
            b bVar = (b) N(i10).getLayoutParams();
            int iA = bVar.a();
            this.f17715M.put(iA, bVar.f());
            this.f17716N.put(iA, bVar.e());
        }
    }

    private void P2(int i10) {
        this.f17713K = Q2(this.f17713K, this.f17712J, i10);
    }

    static int[] Q2(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void R2() {
        this.f17715M.clear();
        this.f17716N.clear();
    }

    private int S2(RecyclerView.A a10) {
        if (O() != 0 && a10.b() != 0) {
            X1();
            boolean zR2 = r2();
            View viewB2 = b2(!zR2, true);
            View viewA2 = a2(!zR2, true);
            if (viewB2 != null && viewA2 != null) {
                int iB = this.f17717O.b(l0(viewB2), this.f17712J);
                int iB2 = this.f17717O.b(l0(viewA2), this.f17712J);
                int iMax = this.f17739x ? Math.max(0, ((this.f17717O.b(a10.b() - 1, this.f17712J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f17736u.d(viewA2) - this.f17736u.g(viewB2)) / ((this.f17717O.b(l0(viewA2), this.f17712J) - this.f17717O.b(l0(viewB2), this.f17712J)) + 1))) + (this.f17736u.m() - this.f17736u.g(viewB2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.A a10) {
        if (O() != 0 && a10.b() != 0) {
            X1();
            View viewB2 = b2(!r2(), true);
            View viewA2 = a2(!r2(), true);
            if (viewB2 != null && viewA2 != null) {
                if (!r2()) {
                    return this.f17717O.b(a10.b() - 1, this.f17712J) + 1;
                }
                int iD = this.f17736u.d(viewA2) - this.f17736u.g(viewB2);
                int iB = this.f17717O.b(l0(viewB2), this.f17712J);
                return (int) ((iD / ((this.f17717O.b(l0(viewA2), this.f17712J) - iB) + 1)) * (this.f17717O.b(a10.b() - 1, this.f17712J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.w wVar, RecyclerView.A a10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iZ2 = Z2(wVar, a10, aVar.f17746b);
        if (z10) {
            while (iZ2 > 0) {
                int i11 = aVar.f17746b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f17746b = i12;
                iZ2 = Z2(wVar, a10, i12);
            }
            return;
        }
        int iB = a10.b() - 1;
        int i13 = aVar.f17746b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iZ22 = Z2(wVar, a10, i14);
            if (iZ22 <= iZ2) {
                break;
            }
            i13 = i14;
            iZ2 = iZ22;
        }
        aVar.f17746b = i13;
    }

    private void V2() {
        View[] viewArr = this.f17714L;
        if (viewArr == null || viewArr.length != this.f17712J) {
            this.f17714L = new View[this.f17712J];
        }
    }

    private int Y2(RecyclerView.w wVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f17717O.b(i10, this.f17712J);
        }
        int iF = wVar.f(i10);
        if (iF == -1) {
            return 0;
        }
        return this.f17717O.b(iF, this.f17712J);
    }

    private int Z2(RecyclerView.w wVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f17717O.c(i10, this.f17712J);
        }
        int i11 = this.f17716N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF == -1) {
            return 0;
        }
        return this.f17717O.c(iF, this.f17712J);
    }

    private int a3(RecyclerView.w wVar, RecyclerView.A a10, int i10) {
        if (!a10.e()) {
            return this.f17717O.f(i10);
        }
        int i11 = this.f17715M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iF = wVar.f(i10);
        if (iF == -1) {
            return 1;
        }
        return this.f17717O.f(iF);
    }

    private void b3(float f10, int i10) {
        P2(Math.max(Math.round(f10 * this.f17712J), i10));
    }

    private void c3(View view, int i10, boolean z10) {
        int iP;
        int iP2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f17950b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f17720e, bVar.f17721f);
        if (this.f17734s == 1) {
            iP2 = RecyclerView.p.P(iW2, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iP = RecyclerView.p.P(this.f17736u.n(), c0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iP3 = RecyclerView.p.P(iW2, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iP4 = RecyclerView.p.P(this.f17736u.n(), t0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iP = iP3;
            iP2 = iP4;
        }
        d3(view, iP2, iP, z10);
    }

    private void d3(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? L1(view, i10, i11, qVar) : J1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void f3() {
        int iB0;
        int iK0;
        if (p2() == 1) {
            iB0 = s0() - j0();
            iK0 = i0();
        } else {
            iB0 = b0() - h0();
            iK0 = k0();
        }
        P2(iB0 - iK0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.A a10) {
        return this.f17719Q ? T2(a10) : super.A(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        f3();
        V2();
        return super.A1(i10, wVar, a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        f3();
        V2();
        return super.C1(i10, wVar, a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        if (this.f17713K == null) {
            super.G1(rect, i10, i11);
        }
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f17734s == 1) {
            iS2 = RecyclerView.p.s(i11, rect.height() + iK0, f0());
            int[] iArr = this.f17713K;
            iS = RecyclerView.p.s(i10, iArr[iArr.length - 1] + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i10, rect.width() + iI0, g0());
            int[] iArr2 = this.f17713K;
            iS2 = RecyclerView.p.s(i11, iArr2[iArr2.length - 1] + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f17734s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View N0(View view, int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        int iO;
        int i11;
        int iO2;
        View view2;
        View view3;
        View view4;
        int i12;
        int i13;
        int i14;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.A a11 = a10;
        View viewG = G(view);
        View view5 = null;
        if (viewG == null) {
            return null;
        }
        b bVar = (b) viewG.getLayoutParams();
        int i15 = bVar.f17720e;
        int i16 = bVar.f17721f + i15;
        if (super.N0(view, i10, wVar, a10) == null) {
            return null;
        }
        if ((V1(i10) == 1) != this.f17739x) {
            iO2 = O() - 1;
            iO = -1;
            i11 = -1;
        } else {
            iO = O();
            i11 = 1;
            iO2 = 0;
        }
        boolean z10 = this.f17734s == 1 && q2();
        int iY2 = Y2(wVar2, a11, iO2);
        int i17 = -1;
        int i18 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i19 = iO2;
        View view6 = null;
        while (i19 != iO) {
            int iY22 = Y2(wVar2, a11, i19);
            View viewN = N(i19);
            if (viewN == viewG) {
                break;
            }
            if (!viewN.hasFocusable() || iY22 == iY2) {
                b bVar2 = (b) viewN.getLayoutParams();
                int i20 = bVar2.f17720e;
                view2 = viewG;
                int i21 = bVar2.f17721f + i20;
                if (viewN.hasFocusable() && i20 == i15 && i21 == i16) {
                    return viewN;
                }
                if (!(viewN.hasFocusable() && view5 == null) && (viewN.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i21, i16) - Math.max(i20, i15);
                    if (!viewN.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i12 = iMin;
                            if (C0(viewN, false, true)) {
                                i13 = iMin2;
                                if (iMin3 > i13) {
                                    i14 = i18;
                                } else if (iMin3 == i13) {
                                    i14 = i18;
                                    if (z10 == (i20 > i14)) {
                                    }
                                    iMin = i12;
                                    view5 = view3;
                                    i19 += i11;
                                    wVar2 = wVar;
                                    a11 = a10;
                                    viewG = view2;
                                } else {
                                    i14 = i18;
                                }
                                if (viewN.hasFocusable()) {
                                    int i22 = bVar2.f17720e;
                                    iMin2 = Math.min(i21, i16) - Math.max(i20, i15);
                                    view6 = viewN;
                                    i18 = i22;
                                    iMin = i12;
                                    view5 = view3;
                                    i19 += i11;
                                    wVar2 = wVar;
                                    a11 = a10;
                                    viewG = view2;
                                } else {
                                    i18 = i14;
                                    iMin2 = i13;
                                    i17 = bVar2.f17720e;
                                    view6 = view4;
                                    view5 = viewN;
                                    iMin = Math.min(i21, i16) - Math.max(i20, i15);
                                    i19 += i11;
                                    wVar2 = wVar;
                                    a11 = a10;
                                    viewG = view2;
                                }
                            }
                            i18 = i14;
                            iMin2 = i13;
                            view6 = view4;
                            iMin = i12;
                            view5 = view3;
                            i19 += i11;
                            wVar2 = wVar;
                            a11 = a10;
                            viewG = view2;
                        }
                        i14 = i18;
                        i13 = iMin2;
                        i18 = i14;
                        iMin2 = i13;
                        view6 = view4;
                        iMin = i12;
                        view5 = view3;
                        i19 += i11;
                        wVar2 = wVar;
                        a11 = a10;
                        viewG = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i12 = iMin;
                i14 = i18;
                i13 = iMin2;
                if (viewN.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewG;
                view3 = view5;
            }
            view4 = view6;
            i12 = iMin;
            i14 = i18;
            i13 = iMin2;
            i18 = i14;
            iMin2 = i13;
            view6 = view4;
            iMin = i12;
            view5 = view3;
            i19 += i11;
            wVar2 = wVar;
            a11 = a10;
            viewG = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f17729D == null && !this.f17711I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView.w wVar, RecyclerView.A a10, z zVar) {
        super.R0(wVar, a10, zVar);
        zVar.w0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void R1(RecyclerView.A a10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.f17712J;
        for (int i10 = 0; i10 < this.f17712J && cVar.c(a10) && iF > 0; i10++) {
            int i11 = cVar.f17757d;
            cVar2.a(i11, Math.max(0, cVar.f17760g));
            iF -= this.f17717O.f(i11);
            cVar.f17757d += cVar.f17758e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int S(RecyclerView.w wVar, RecyclerView.A a10) {
        if (this.f17734s == 1) {
            return this.f17712J;
        }
        if (a10.b() < 1) {
            return 0;
        }
        return Y2(wVar, a10, a10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView.w wVar, RecyclerView.A a10, View view, z zVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, zVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iY2 = Y2(wVar, a10, bVar.a());
        if (this.f17734s == 0) {
            zVar.z0(z.g.b(bVar.e(), bVar.f(), iY2, 1, false, false));
        } else {
            zVar.z0(z.g.b(iY2, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        this.f17717O.h();
        this.f17717O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.f17717O.h();
        this.f17717O.g();
    }

    int W2(int i10, int i11) {
        if (this.f17734s != 1 || !q2()) {
            int[] iArr = this.f17713K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f17713K;
        int i12 = this.f17712J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f17717O.h();
        this.f17717O.g();
    }

    public int X2() {
        return this.f17712J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        this.f17717O.h();
        this.f17717O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f17717O.h();
        this.f17717O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.A a10) {
        if (a10.e()) {
            O2();
        }
        super.b1(wVar, a10);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.A a10) {
        super.c1(a10);
        this.f17711I = false;
    }

    public void e3(int i10) {
        if (i10 == this.f17712J) {
            return;
        }
        this.f17711I = true;
        if (i10 >= 1) {
            this.f17712J = i10;
            this.f17717O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View j2(RecyclerView.w wVar, RecyclerView.A a10, boolean z10, boolean z11) {
        int i10;
        int iO;
        int iO2 = O();
        int i11 = 1;
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
        }
        int iB = a10.b();
        X1();
        int iM = this.f17736u.m();
        int i12 = this.f17736u.i();
        View view = null;
        View view2 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            if (iL0 >= 0 && iL0 < iB && Z2(wVar, a10, iL0) == 0) {
                if (((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewN;
                    }
                } else {
                    if (this.f17736u.g(viewN) < i12 && this.f17736u.d(viewN) >= iM) {
                        return viewN;
                    }
                    if (view == null) {
                        view = viewN;
                    }
                }
            }
            iO += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int o0(RecyclerView.w wVar, RecyclerView.A a10) {
        if (this.f17734s == 0) {
            return this.f17712J;
        }
        if (a10.b() < 1) {
            return 0;
        }
        return Y2(wVar, a10, a10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void s2(RecyclerView.w wVar, RecyclerView.A a10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iI0;
        int iK0;
        int iF;
        int iF2;
        int i12;
        int iP;
        int iP2;
        View viewD;
        int iL = this.f17736u.l();
        boolean z10 = iL != 1073741824;
        int i13 = O() > 0 ? this.f17713K[this.f17712J] : 0;
        if (z10) {
            f3();
        }
        boolean z11 = cVar.f17758e == 1;
        int iZ2 = this.f17712J;
        if (!z11) {
            iZ2 = Z2(wVar, a10, cVar.f17757d) + a3(wVar, a10, cVar.f17757d);
        }
        int i14 = 0;
        while (i14 < this.f17712J && cVar.c(a10) && iZ2 > 0) {
            int i15 = cVar.f17757d;
            int iA3 = a3(wVar, a10, i15);
            if (iA3 > this.f17712J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iA3 + " spans but GridLayoutManager has only " + this.f17712J + " spans.");
            }
            iZ2 -= iA3;
            if (iZ2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.f17714L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f17751b = true;
            return;
        }
        N2(wVar, a10, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f17714L[i17];
            if (cVar.f17765l == null) {
                if (z11) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.f17718P);
            c3(view, iL, false);
            int iE = this.f17736u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f17736u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f17721f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            b3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f17714L[i18];
                c3(view2, 1073741824, true);
                int iE2 = this.f17736u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f17714L[i19];
            if (this.f17736u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f17950b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f17720e, bVar2.f17721f);
                if (this.f17734s == 1) {
                    iP2 = RecyclerView.p.P(iW2, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iP = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iP = RecyclerView.p.P(iW2, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iP2 = iMakeMeasureSpec;
                }
                d3(view3, iP2, iP, true);
            }
        }
        bVar.f17750a = i16;
        if (this.f17734s == 1) {
            if (cVar.f17759f == -1) {
                iF2 = cVar.f17755b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f17755b;
                iF2 = i12 + i16;
            }
            iK0 = i12;
            iF = 0;
            iI0 = 0;
        } else {
            if (cVar.f17759f == -1) {
                i11 = cVar.f17755b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f17755b;
                i11 = i10 + i16;
            }
            iI0 = i10;
            iK0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f17714L[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f17734s != 1) {
                iK0 = this.f17713K[bVar3.f17720e] + k0();
                iF2 = this.f17736u.f(view4) + iK0;
            } else if (q2()) {
                iF = i0() + this.f17713K[this.f17712J - bVar3.f17720e];
                iI0 = iF - this.f17736u.f(view4);
            } else {
                iI0 = this.f17713K[bVar3.f17720e] + i0();
                iF = this.f17736u.f(view4) + iI0;
            }
            int i23 = iF2;
            int i24 = iK0;
            int i25 = iF;
            int i26 = iI0;
            D0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iI0 = i26;
            iF = i25;
            iK0 = i24;
            if (bVar3.c() || bVar3.b()) {
                bVar.f17752c = true;
            }
            bVar.f17753d = view4.hasFocusable() | bVar.f17753d;
        }
        Arrays.fill(this.f17714L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.w wVar, RecyclerView.A a10, LinearLayoutManager.a aVar, int i10) {
        super.u2(wVar, a10, aVar, i10);
        f3();
        if (a10.b() > 0 && !a10.e()) {
            U2(wVar, a10, aVar, i10);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.A a10) {
        return this.f17719Q ? S2(a10) : super.w(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.A a10) {
        return this.f17719Q ? T2(a10) : super.x(a10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.A a10) {
        return this.f17719Q ? S2(a10) : super.z(a10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17720e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17721f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17720e = -1;
            this.f17721f = 0;
        }

        public int e() {
            return this.f17720e;
        }

        public int f() {
            return this.f17721f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f17720e = -1;
            this.f17721f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f17720e = -1;
            this.f17721f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17720e = -1;
            this.f17721f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f17711I = false;
        this.f17712J = -1;
        this.f17715M = new SparseIntArray();
        this.f17716N = new SparseIntArray();
        this.f17717O = new a();
        this.f17718P = new Rect();
        e3(i10);
    }
}
