package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f17726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f17727B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f17728C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    SavedState f17729D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final a f17730E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final b f17731F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17732G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f17733H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f17734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f17735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f17736u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f17739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17741z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17743h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f17744i;

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

        public SavedState() {
        }

        boolean a() {
            return this.f17742g >= 0;
        }

        void b() {
            this.f17742g = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f17742g);
            parcel.writeInt(this.f17743h);
            parcel.writeInt(this.f17744i ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f17742g = parcel.readInt();
            this.f17743h = parcel.readInt();
            this.f17744i = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f17742g = savedState.f17742g;
            this.f17743h = savedState.f17743h;
            this.f17744i = savedState.f17744i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f17745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f17748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f17749e;

        a() {
            e();
        }

        void a() {
            this.f17747c = this.f17748d ? this.f17745a.i() : this.f17745a.m();
        }

        public void b(View view, int i10) {
            if (this.f17748d) {
                this.f17747c = this.f17745a.d(view) + this.f17745a.o();
            } else {
                this.f17747c = this.f17745a.g(view);
            }
            this.f17746b = i10;
        }

        public void c(View view, int i10) {
            int iO = this.f17745a.o();
            if (iO >= 0) {
                b(view, i10);
                return;
            }
            this.f17746b = i10;
            if (this.f17748d) {
                int i11 = (this.f17745a.i() - iO) - this.f17745a.d(view);
                this.f17747c = this.f17745a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f17747c - this.f17745a.e(view);
                    int iM = this.f17745a.m();
                    int iMin = iE - (iM + Math.min(this.f17745a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f17747c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f17745a.g(view);
            int iM2 = iG - this.f17745a.m();
            this.f17747c = iG;
            if (iM2 > 0) {
                int i12 = (this.f17745a.i() - Math.min(0, (this.f17745a.i() - iO) - this.f17745a.d(view))) - (iG + this.f17745a.e(view));
                if (i12 < 0) {
                    this.f17747c -= Math.min(iM2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.A a10) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a10.b();
        }

        void e() {
            this.f17746b = -1;
            this.f17747c = androidx.customview.widget.a.INVALID_ID;
            this.f17748d = false;
            this.f17749e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f17746b + ", mCoordinate=" + this.f17747c + ", mLayoutFromEnd=" + this.f17748d + ", mValid=" + this.f17749e + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17753d;

        protected b() {
        }

        void a() {
            this.f17750a = 0;
            this.f17751b = false;
            this.f17752c = false;
            this.f17753d = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17760g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f17764k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f17766m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f17754a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f17761h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f17762i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f17763j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f17765l = null;

        c() {
        }

        private View e() {
            int size = this.f17765l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.E) this.f17765l.get(i10)).f17881a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f17757d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f17757d = -1;
            } else {
                this.f17757d = ((RecyclerView.q) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.A a10) {
            int i10 = this.f17757d;
            return i10 >= 0 && i10 < a10.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.f17765l != null) {
                return e();
            }
            View viewO = wVar.o(this.f17757d);
            this.f17757d += this.f17758e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f17765l.size();
            View view2 = null;
            int i10 = ViewDefaults.NUMBER_OF_LINES;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.E) this.f17765l.get(i11)).f17881a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f17757d) * this.f17758e) >= 0 && iA < i10) {
                    if (iA == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iA;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2() {
        if (this.f17734s == 1 || !q2()) {
            this.f17739x = this.f17738w;
        } else {
            this.f17739x = !this.f17738w;
        }
    }

    private boolean F2(RecyclerView.w wVar, RecyclerView.A a10, a aVar) {
        View viewJ2;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View viewA0 = a0();
        if (viewA0 != null && aVar.d(viewA0, a10)) {
            aVar.c(viewA0, l0(viewA0));
            return true;
        }
        boolean z11 = this.f17737v;
        boolean z12 = this.f17740y;
        if (z11 != z12 || (viewJ2 = j2(wVar, a10, aVar.f17748d, z12)) == null) {
            return false;
        }
        aVar.b(viewJ2, l0(viewJ2));
        if (!a10.e() && P1()) {
            int iG = this.f17736u.g(viewJ2);
            int iD = this.f17736u.d(viewJ2);
            int iM = this.f17736u.m();
            int i10 = this.f17736u.i();
            boolean z13 = iD <= iM && iG < iM;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f17748d) {
                    iM = i10;
                }
                aVar.f17747c = iM;
            }
        }
        return true;
    }

    private boolean G2(RecyclerView.A a10, a aVar) {
        int i10;
        if (!a10.e() && (i10 = this.f17726A) != -1) {
            if (i10 >= 0 && i10 < a10.b()) {
                aVar.f17746b = this.f17726A;
                SavedState savedState = this.f17729D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.f17729D.f17744i;
                    aVar.f17748d = z10;
                    if (z10) {
                        aVar.f17747c = this.f17736u.i() - this.f17729D.f17743h;
                    } else {
                        aVar.f17747c = this.f17736u.m() + this.f17729D.f17743h;
                    }
                    return true;
                }
                if (this.f17727B != Integer.MIN_VALUE) {
                    boolean z11 = this.f17739x;
                    aVar.f17748d = z11;
                    if (z11) {
                        aVar.f17747c = this.f17736u.i() - this.f17727B;
                    } else {
                        aVar.f17747c = this.f17736u.m() + this.f17727B;
                    }
                    return true;
                }
                View viewH = H(this.f17726A);
                if (viewH == null) {
                    if (O() > 0) {
                        aVar.f17748d = (this.f17726A < l0(N(0))) == this.f17739x;
                    }
                    aVar.a();
                } else {
                    if (this.f17736u.e(viewH) > this.f17736u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f17736u.g(viewH) - this.f17736u.m() < 0) {
                        aVar.f17747c = this.f17736u.m();
                        aVar.f17748d = false;
                        return true;
                    }
                    if (this.f17736u.i() - this.f17736u.d(viewH) < 0) {
                        aVar.f17747c = this.f17736u.i();
                        aVar.f17748d = true;
                        return true;
                    }
                    aVar.f17747c = aVar.f17748d ? this.f17736u.d(viewH) + this.f17736u.o() : this.f17736u.g(viewH);
                }
                return true;
            }
            this.f17726A = -1;
            this.f17727B = androidx.customview.widget.a.INVALID_ID;
        }
        return false;
    }

    private void H2(RecyclerView.w wVar, RecyclerView.A a10, a aVar) {
        if (G2(a10, aVar) || F2(wVar, a10, aVar)) {
            return;
        }
        aVar.a();
        aVar.f17746b = this.f17740y ? a10.b() - 1 : 0;
    }

    private void I2(int i10, int i11, boolean z10, RecyclerView.A a10) {
        int iM;
        this.f17735t.f17766m = z2();
        this.f17735t.f17759f = i10;
        int[] iArr = this.f17733H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a10, iArr);
        int iMax = Math.max(0, this.f17733H[0]);
        int iMax2 = Math.max(0, this.f17733H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f17735t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f17761h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f17762i = iMax;
        if (z11) {
            cVar.f17761h = i12 + this.f17736u.j();
            View viewM2 = m2();
            c cVar2 = this.f17735t;
            cVar2.f17758e = this.f17739x ? -1 : 1;
            int iL0 = l0(viewM2);
            c cVar3 = this.f17735t;
            cVar2.f17757d = iL0 + cVar3.f17758e;
            cVar3.f17755b = this.f17736u.d(viewM2);
            iM = this.f17736u.d(viewM2) - this.f17736u.i();
        } else {
            View viewN2 = n2();
            this.f17735t.f17761h += this.f17736u.m();
            c cVar4 = this.f17735t;
            cVar4.f17758e = this.f17739x ? 1 : -1;
            int iL02 = l0(viewN2);
            c cVar5 = this.f17735t;
            cVar4.f17757d = iL02 + cVar5.f17758e;
            cVar5.f17755b = this.f17736u.g(viewN2);
            iM = (-this.f17736u.g(viewN2)) + this.f17736u.m();
        }
        c cVar6 = this.f17735t;
        cVar6.f17756c = i11;
        if (z10) {
            cVar6.f17756c = i11 - iM;
        }
        cVar6.f17760g = iM;
    }

    private void J2(int i10, int i11) {
        this.f17735t.f17756c = this.f17736u.i() - i11;
        c cVar = this.f17735t;
        cVar.f17758e = this.f17739x ? -1 : 1;
        cVar.f17757d = i10;
        cVar.f17759f = 1;
        cVar.f17755b = i11;
        cVar.f17760g = androidx.customview.widget.a.INVALID_ID;
    }

    private void K2(a aVar) {
        J2(aVar.f17746b, aVar.f17747c);
    }

    private void L2(int i10, int i11) {
        this.f17735t.f17756c = i11 - this.f17736u.m();
        c cVar = this.f17735t;
        cVar.f17757d = i10;
        cVar.f17758e = this.f17739x ? 1 : -1;
        cVar.f17759f = -1;
        cVar.f17755b = i11;
        cVar.f17760g = androidx.customview.widget.a.INVALID_ID;
    }

    private void M2(a aVar) {
        L2(aVar.f17746b, aVar.f17747c);
    }

    private int S1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.a(a10, this.f17736u, b2(!this.f17741z, true), a2(!this.f17741z, true), this, this.f17741z);
    }

    private int T1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.b(a10, this.f17736u, b2(!this.f17741z, true), a2(!this.f17741z, true), this, this.f17741z, this.f17739x);
    }

    private int U1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.c(a10, this.f17736u, b2(!this.f17741z, true), a2(!this.f17741z, true), this, this.f17741z);
    }

    private View Z1() {
        return f2(0, O());
    }

    private View d2() {
        return f2(O() - 1, -1);
    }

    private View h2() {
        return this.f17739x ? Z1() : d2();
    }

    private View i2() {
        return this.f17739x ? d2() : Z1();
    }

    private int k2(int i10, RecyclerView.w wVar, RecyclerView.A a10, boolean z10) {
        int i11;
        int i12 = this.f17736u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -B2(-i12, wVar, a10);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f17736u.i() - i14) <= 0) {
            return i13;
        }
        this.f17736u.r(i11);
        return i11 + i13;
    }

    private int l2(int i10, RecyclerView.w wVar, RecyclerView.A a10, boolean z10) {
        int iM;
        int iM2 = i10 - this.f17736u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -B2(iM2, wVar, a10);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f17736u.m()) <= 0) {
            return i11;
        }
        this.f17736u.r(-iM);
        return i11 - iM;
    }

    private View m2() {
        return N(this.f17739x ? 0 : O() - 1);
    }

    private View n2() {
        return N(this.f17739x ? O() - 1 : 0);
    }

    private void t2(RecyclerView.w wVar, RecyclerView.A a10, int i10, int i11) {
        if (!a10.g() || O() == 0 || a10.e() || !P1()) {
            return;
        }
        List listK = wVar.k();
        int size = listK.size();
        int iL0 = l0(N(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.E e10 = (RecyclerView.E) listK.get(i12);
            if (!e10.v()) {
                if ((e10.m() < iL0) != this.f17739x) {
                    iE += this.f17736u.e(e10.f17881a);
                } else {
                    iE2 += this.f17736u.e(e10.f17881a);
                }
            }
        }
        this.f17735t.f17765l = listK;
        if (iE > 0) {
            L2(l0(n2()), i10);
            c cVar = this.f17735t;
            cVar.f17761h = iE;
            cVar.f17756c = 0;
            cVar.a();
            Y1(wVar, this.f17735t, a10, false);
        }
        if (iE2 > 0) {
            J2(l0(m2()), i11);
            c cVar2 = this.f17735t;
            cVar2.f17761h = iE2;
            cVar2.f17756c = 0;
            cVar2.a();
            Y1(wVar, this.f17735t, a10, false);
        }
        this.f17735t.f17765l = null;
    }

    private void v2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f17754a || cVar.f17766m) {
            return;
        }
        int i10 = cVar.f17760g;
        int i11 = cVar.f17762i;
        if (cVar.f17759f == -1) {
            x2(wVar, i10, i11);
        } else {
            y2(wVar, i10, i11);
        }
    }

    private void w2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                r1(i10, wVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                r1(i12, wVar);
            }
        }
    }

    private void x2(RecyclerView.w wVar, int i10, int i11) {
        int iO = O();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f17736u.h() - i10) + i11;
        if (this.f17739x) {
            for (int i12 = 0; i12 < iO; i12++) {
                View viewN = N(i12);
                if (this.f17736u.g(viewN) < iH || this.f17736u.q(viewN) < iH) {
                    w2(wVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iO - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewN2 = N(i14);
            if (this.f17736u.g(viewN2) < iH || this.f17736u.q(viewN2) < iH) {
                w2(wVar, i13, i14);
                return;
            }
        }
    }

    private void y2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iO = O();
        if (!this.f17739x) {
            for (int i13 = 0; i13 < iO; i13++) {
                View viewN = N(i13);
                if (this.f17736u.d(viewN) > i12 || this.f17736u.p(viewN) > i12) {
                    w2(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iO - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewN2 = N(i15);
            if (this.f17736u.d(viewN2) > i12 || this.f17736u.p(viewN2) > i12) {
                w2(wVar, i14, i15);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.A a10) {
        return U1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        if (this.f17734s == 1) {
            return 0;
        }
        return B2(i10, wVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i10) {
        this.f17726A = i10;
        this.f17727B = androidx.customview.widget.a.INVALID_ID;
        SavedState savedState = this.f17729D;
        if (savedState != null) {
            savedState.b();
        }
        x1();
    }

    int B2(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        X1();
        this.f17735t.f17754a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        I2(i11, iAbs, true, a10);
        c cVar = this.f17735t;
        int iY1 = cVar.f17760g + Y1(wVar, cVar, a10, false);
        if (iY1 < 0) {
            return 0;
        }
        if (iAbs > iY1) {
            i10 = i11 * iY1;
        }
        this.f17736u.r(-i10);
        this.f17735t.f17764k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        if (this.f17734s == 0) {
            return 0;
        }
        return B2(i10, wVar, a10);
    }

    public void C2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        if (i10 != this.f17734s || this.f17736u == null) {
            i iVarB = i.b(this, i10);
            this.f17736u = iVarB;
            this.f17730E.f17745a = iVarB;
            this.f17734s = i10;
            x1();
        }
    }

    public void D2(boolean z10) {
        l(null);
        if (z10 == this.f17738w) {
            return;
        }
        this.f17738w = z10;
        x1();
    }

    public void E2(boolean z10) {
        l(null);
        if (this.f17740y == z10) {
            return;
        }
        this.f17740y = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View H(int i10) {
        int iO = O();
        if (iO == 0) {
            return null;
        }
        int iL0 = i10 - l0(N(0));
        if (iL0 >= 0 && iL0 < iO) {
            View viewN = N(iL0);
            if (l0(viewN) == i10) {
                return viewN;
            }
        }
        return super.H(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        if (this.f17728C) {
            o1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        int iV1;
        A2();
        if (O() == 0 || (iV1 = V1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        I2(iV1, (int) (this.f17736u.n() * 0.33333334f), false, a10);
        c cVar = this.f17735t;
        cVar.f17760g = androidx.customview.widget.a.INVALID_ID;
        cVar.f17754a = false;
        Y1(wVar, cVar, a10, true);
        View viewI2 = iV1 == -1 ? i2() : h2();
        View viewN2 = iV1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(c2());
            accessibilityEvent.setToIndex(e2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f17729D == null && this.f17737v == this.f17740y;
    }

    protected void Q1(RecyclerView.A a10, int[] iArr) {
        int i10;
        int iO2 = o2(a10);
        if (this.f17735t.f17759f == -1) {
            i10 = 0;
        } else {
            i10 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i10;
    }

    void R1(RecyclerView.A a10, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f17757d;
        if (i10 < 0 || i10 >= a10.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f17760g));
    }

    int V1(int i10) {
        if (i10 == 1) {
            return (this.f17734s != 1 && q2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f17734s != 1 && q2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f17734s == 0) {
                return -1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 33) {
            if (this.f17734s == 1) {
                return -1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 66) {
            if (this.f17734s == 0) {
                return 1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 130 && this.f17734s == 1) {
            return 1;
        }
        return androidx.customview.widget.a.INVALID_ID;
    }

    c W1() {
        return new c();
    }

    void X1() {
        if (this.f17735t == null) {
            this.f17735t = W1();
        }
    }

    int Y1(RecyclerView.w wVar, c cVar, RecyclerView.A a10, boolean z10) {
        int i10 = cVar.f17756c;
        int i11 = cVar.f17760g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f17760g = i11 + i10;
            }
            v2(wVar, cVar);
        }
        int i12 = cVar.f17756c + cVar.f17761h;
        b bVar = this.f17731F;
        while (true) {
            if ((!cVar.f17766m && i12 <= 0) || !cVar.c(a10)) {
                break;
            }
            bVar.a();
            s2(wVar, a10, cVar, bVar);
            if (!bVar.f17751b) {
                cVar.f17755b += bVar.f17750a * cVar.f17759f;
                if (!bVar.f17752c || cVar.f17765l != null || !a10.e()) {
                    int i13 = cVar.f17756c;
                    int i14 = bVar.f17750a;
                    cVar.f17756c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f17760g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f17750a;
                    cVar.f17760g = i16;
                    int i17 = cVar.f17756c;
                    if (i17 < 0) {
                        cVar.f17760g = i16 + i17;
                    }
                    v2(wVar, cVar);
                }
                if (z10 && bVar.f17753d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f17756c;
    }

    View a2(boolean z10, boolean z11) {
        return this.f17739x ? g2(0, O(), z10, z11) : g2(O() - 1, -1, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iK2;
        int i14;
        View viewH;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.f17729D == null && this.f17726A == -1) && a10.b() == 0) {
            o1(wVar);
            return;
        }
        SavedState savedState = this.f17729D;
        if (savedState != null && savedState.a()) {
            this.f17726A = this.f17729D.f17742g;
        }
        X1();
        this.f17735t.f17754a = false;
        A2();
        View viewA0 = a0();
        a aVar = this.f17730E;
        if (!aVar.f17749e || this.f17726A != -1 || this.f17729D != null) {
            aVar.e();
            a aVar2 = this.f17730E;
            aVar2.f17748d = this.f17739x ^ this.f17740y;
            H2(wVar, a10, aVar2);
            this.f17730E.f17749e = true;
        } else if (viewA0 != null && (this.f17736u.g(viewA0) >= this.f17736u.i() || this.f17736u.d(viewA0) <= this.f17736u.m())) {
            this.f17730E.c(viewA0, l0(viewA0));
        }
        c cVar = this.f17735t;
        cVar.f17759f = cVar.f17764k >= 0 ? 1 : -1;
        int[] iArr = this.f17733H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(a10, iArr);
        int iMax = Math.max(0, this.f17733H[0]) + this.f17736u.m();
        int iMax2 = Math.max(0, this.f17733H[1]) + this.f17736u.j();
        if (a10.e() && (i14 = this.f17726A) != -1 && this.f17727B != Integer.MIN_VALUE && (viewH = H(i14)) != null) {
            if (this.f17739x) {
                i15 = this.f17736u.i() - this.f17736u.d(viewH);
                iG = this.f17727B;
            } else {
                iG = this.f17736u.g(viewH) - this.f17736u.m();
                i15 = this.f17727B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.f17730E;
        if (!aVar3.f17748d ? !this.f17739x : this.f17739x) {
            i16 = 1;
        }
        u2(wVar, a10, aVar3, i16);
        B(wVar);
        this.f17735t.f17766m = z2();
        this.f17735t.f17763j = a10.e();
        this.f17735t.f17762i = 0;
        a aVar4 = this.f17730E;
        if (aVar4.f17748d) {
            M2(aVar4);
            c cVar2 = this.f17735t;
            cVar2.f17761h = iMax;
            Y1(wVar, cVar2, a10, false);
            c cVar3 = this.f17735t;
            i11 = cVar3.f17755b;
            int i18 = cVar3.f17757d;
            int i19 = cVar3.f17756c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            K2(this.f17730E);
            c cVar4 = this.f17735t;
            cVar4.f17761h = iMax2;
            cVar4.f17757d += cVar4.f17758e;
            Y1(wVar, cVar4, a10, false);
            c cVar5 = this.f17735t;
            i10 = cVar5.f17755b;
            int i20 = cVar5.f17756c;
            if (i20 > 0) {
                L2(i18, i11);
                c cVar6 = this.f17735t;
                cVar6.f17761h = i20;
                Y1(wVar, cVar6, a10, false);
                i11 = this.f17735t.f17755b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f17735t;
            cVar7.f17761h = iMax2;
            Y1(wVar, cVar7, a10, false);
            c cVar8 = this.f17735t;
            i10 = cVar8.f17755b;
            int i21 = cVar8.f17757d;
            int i22 = cVar8.f17756c;
            if (i22 > 0) {
                iMax += i22;
            }
            M2(this.f17730E);
            c cVar9 = this.f17735t;
            cVar9.f17761h = iMax;
            cVar9.f17757d += cVar9.f17758e;
            Y1(wVar, cVar9, a10, false);
            c cVar10 = this.f17735t;
            i11 = cVar10.f17755b;
            int i23 = cVar10.f17756c;
            if (i23 > 0) {
                J2(i21, i10);
                c cVar11 = this.f17735t;
                cVar11.f17761h = i23;
                Y1(wVar, cVar11, a10, false);
                i10 = this.f17735t.f17755b;
            }
        }
        if (O() > 0) {
            if (this.f17739x ^ this.f17740y) {
                int iK22 = k2(i10, wVar, a10, true);
                i12 = i11 + iK22;
                i13 = i10 + iK22;
                iK2 = l2(i12, wVar, a10, false);
            } else {
                int iL2 = l2(i11, wVar, a10, true);
                i12 = i11 + iL2;
                i13 = i10 + iL2;
                iK2 = k2(i13, wVar, a10, false);
            }
            i11 = i12 + iK2;
            i10 = i13 + iK2;
        }
        t2(wVar, a10, i11, i10);
        if (a10.e()) {
            this.f17730E.e();
        } else {
            this.f17736u.s();
        }
        this.f17737v = this.f17740y;
    }

    View b2(boolean z10, boolean z11) {
        return this.f17739x ? g2(O() - 1, -1, z10, z11) : g2(0, O(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF c(int i10) {
        if (O() == 0) {
            return null;
        }
        int i11 = (i10 < l0(N(0))) != this.f17739x ? -1 : 1;
        return this.f17734s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.A a10) {
        super.c1(a10);
        this.f17729D = null;
        this.f17726A = -1;
        this.f17727B = androidx.customview.widget.a.INVALID_ID;
        this.f17730E.e();
    }

    public int c2() {
        View viewG2 = g2(0, O(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    public int e2() {
        View viewG2 = g2(O() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return l0(viewG2);
    }

    View f2(int i10, int i11) {
        int i12;
        int i13;
        X1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f17736u.g(N(i10)) < this.f17736u.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f17734s == 0 ? this.f17929e.a(i10, i11, i12, i13) : this.f17930f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f17729D = savedState;
            if (this.f17726A != -1) {
                savedState.b();
            }
            x1();
        }
    }

    View g2(int i10, int i11, boolean z10, boolean z11) {
        X1();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f17734s == 0 ? this.f17929e.a(i10, i11, i12, i13) : this.f17930f.a(i10, i11, i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        if (this.f17729D != null) {
            return new SavedState(this.f17729D);
        }
        SavedState savedState = new SavedState();
        if (O() <= 0) {
            savedState.b();
            return savedState;
        }
        X1();
        boolean z10 = this.f17737v ^ this.f17739x;
        savedState.f17744i = z10;
        if (z10) {
            View viewM2 = m2();
            savedState.f17743h = this.f17736u.i() - this.f17736u.d(viewM2);
            savedState.f17742g = l0(viewM2);
            return savedState;
        }
        View viewN2 = n2();
        savedState.f17742g = l0(viewN2);
        savedState.f17743h = this.f17736u.g(viewN2) - this.f17736u.m();
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View j2(RecyclerView.w wVar, RecyclerView.A a10, boolean z10, boolean z11) {
        int i10;
        int iO;
        int i11;
        X1();
        int iO2 = O();
        if (z11) {
            iO = O() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iO2;
            iO = 0;
            i11 = 1;
        }
        int iB = a10.b();
        int iM = this.f17736u.m();
        int i12 = this.f17736u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iO != i10) {
            View viewN = N(iO);
            int iL0 = l0(viewN);
            int iG = this.f17736u.g(viewN);
            int iD = this.f17736u.d(viewN);
            if (iL0 >= 0 && iL0 < iB) {
                if (!((RecyclerView.q) viewN.getLayoutParams()).c()) {
                    boolean z12 = iD <= iM && iG < iM;
                    boolean z13 = iG >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return viewN;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewN;
                        } else if (view == null) {
                            view = viewN;
                        }
                    } else if (!z12) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewN;
                }
            }
            iO += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.f17729D == null) {
            super.l(str);
        }
    }

    protected int o2(RecyclerView.A a10) {
        if (a10.d()) {
            return this.f17736u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f17734s == 0;
    }

    public int p2() {
        return this.f17734s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f17734s == 1;
    }

    protected boolean q2() {
        return d0() == 1;
    }

    public boolean r2() {
        return this.f17741z;
    }

    void s2(RecyclerView.w wVar, RecyclerView.A a10, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iI0;
        int iF;
        int i14;
        int i15;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f17751b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.f17765l == null) {
            if (this.f17739x == (cVar.f17759f == -1)) {
                i(viewD);
            } else {
                j(viewD, 0);
            }
        } else {
            if (this.f17739x == (cVar.f17759f == -1)) {
                g(viewD);
            } else {
                h(viewD, 0);
            }
        }
        E0(viewD, 0, 0);
        bVar.f17750a = this.f17736u.e(viewD);
        if (this.f17734s == 1) {
            if (q2()) {
                iF = s0() - j0();
                iI0 = iF - this.f17736u.f(viewD);
            } else {
                iI0 = i0();
                iF = this.f17736u.f(viewD) + iI0;
            }
            if (cVar.f17759f == -1) {
                i15 = cVar.f17755b;
                i14 = i15 - bVar.f17750a;
            } else {
                i14 = cVar.f17755b;
                i15 = bVar.f17750a + i14;
            }
            int i16 = iI0;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = iF;
        } else {
            int iK0 = k0();
            int iF2 = this.f17736u.f(viewD) + iK0;
            if (cVar.f17759f == -1) {
                int i17 = cVar.f17755b;
                i12 = i17 - bVar.f17750a;
                i10 = i17;
                i11 = iF2;
            } else {
                int i18 = cVar.f17755b;
                i10 = bVar.f17750a + i18;
                i11 = iF2;
                i12 = i18;
            }
            i13 = iK0;
        }
        D0(viewD, i12, i13, i10, i11);
        if (qVar.c() || qVar.b()) {
            bVar.f17752c = true;
        }
        bVar.f17753d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i10, int i11, RecyclerView.A a10, RecyclerView.p.c cVar) {
        if (this.f17734s != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        X1();
        I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a10);
        R1(a10, this.f17735t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.f17729D;
        if (savedState == null || !savedState.a()) {
            A2();
            z10 = this.f17739x;
            i11 = this.f17726A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f17729D;
            z10 = savedState2.f17744i;
            i11 = savedState2.f17742g;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f17732G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a10) {
        return S1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.A a10) {
        return T1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.A a10) {
        return U1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.A a10) {
        return S1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.A a10) {
        return T1(a10);
    }

    boolean z2() {
        return this.f17736u.k() == 0 && this.f17736u.h() == 0;
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f17734s = 1;
        this.f17738w = false;
        this.f17739x = false;
        this.f17740y = false;
        this.f17741z = true;
        this.f17726A = -1;
        this.f17727B = androidx.customview.widget.a.INVALID_ID;
        this.f17729D = null;
        this.f17730E = new a();
        this.f17731F = new b();
        this.f17732G = 2;
        this.f17733H = new int[2];
        C2(i10);
        D2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f17734s = 1;
        this.f17738w = false;
        this.f17739x = false;
        this.f17740y = false;
        this.f17741z = true;
        this.f17726A = -1;
        this.f17727B = androidx.customview.widget.a.INVALID_ID;
        this.f17729D = null;
        this.f17730E = new a();
        this.f17731F = new b();
        this.f17732G = 2;
        this.f17733H = new int[2];
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i10, i11);
        C2(dVarM0.f17945a);
        D2(dVarM0.f17947c);
        E2(dVarM0.f17948d);
    }

    void u2(RecyclerView.w wVar, RecyclerView.A a10, a aVar, int i10) {
    }
}
