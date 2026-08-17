package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.z.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private BitSet f17985B;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f17990G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f17991H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private SavedState f17992I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f17993J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f17998O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    d[] f18001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f18002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    i f18003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f18005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final f f18006y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18000s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f18007z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f17984A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f17986C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f17987D = androidx.customview.widget.a.INVALID_ID;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    LazySpanLookup f17988E = new LazySpanLookup();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f17989F = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Rect f17994K = new Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final b f17995L = new b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f17996M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f17997N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Runnable f17999P = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f18014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f18015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f18016i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int[] f18017j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f18018k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int[] f18019l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        List f18020m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f18021n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f18022o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f18023p;

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

        void a() {
            this.f18017j = null;
            this.f18016i = 0;
            this.f18014g = -1;
            this.f18015h = -1;
        }

        void b() {
            this.f18017j = null;
            this.f18016i = 0;
            this.f18018k = 0;
            this.f18019l = null;
            this.f18020m = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f18014g);
            parcel.writeInt(this.f18015h);
            parcel.writeInt(this.f18016i);
            if (this.f18016i > 0) {
                parcel.writeIntArray(this.f18017j);
            }
            parcel.writeInt(this.f18018k);
            if (this.f18018k > 0) {
                parcel.writeIntArray(this.f18019l);
            }
            parcel.writeInt(this.f18021n ? 1 : 0);
            parcel.writeInt(this.f18022o ? 1 : 0);
            parcel.writeInt(this.f18023p ? 1 : 0);
            parcel.writeList(this.f18020m);
        }

        SavedState(Parcel parcel) {
            this.f18014g = parcel.readInt();
            this.f18015h = parcel.readInt();
            int i10 = parcel.readInt();
            this.f18016i = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f18017j = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f18018k = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f18019l = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f18021n = parcel.readInt() == 1;
            this.f18022o = parcel.readInt() == 1;
            this.f18023p = parcel.readInt() == 1;
            this.f18020m = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f18016i = savedState.f18016i;
            this.f18014g = savedState.f18014g;
            this.f18015h = savedState.f18015h;
            this.f18017j = savedState.f18017j;
            this.f18018k = savedState.f18018k;
            this.f18019l = savedState.f18019l;
            this.f18021n = savedState.f18021n;
            this.f18022o = savedState.f18022o;
            this.f18023p = savedState.f18023p;
            this.f18020m = savedState.f18020m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f18027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f18028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f18029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f18030f;

        b() {
            c();
        }

        void a() {
            this.f18026b = this.f18027c ? StaggeredGridLayoutManager.this.f18002u.i() : StaggeredGridLayoutManager.this.f18002u.m();
        }

        void b(int i10) {
            if (this.f18027c) {
                this.f18026b = StaggeredGridLayoutManager.this.f18002u.i() - i10;
            } else {
                this.f18026b = StaggeredGridLayoutManager.this.f18002u.m() + i10;
            }
        }

        void c() {
            this.f18025a = -1;
            this.f18026b = androidx.customview.widget.a.INVALID_ID;
            this.f18027c = false;
            this.f18028d = false;
            this.f18029e = false;
            int[] iArr = this.f18030f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f18030f;
            if (iArr == null || iArr.length < length) {
                this.f18030f = new int[StaggeredGridLayoutManager.this.f18001t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f18030f[i10] = dVarArr[i10].p(androidx.customview.widget.a.INVALID_ID);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d f18032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f18033f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f18033f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList f18034a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18035b = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18036c = androidx.customview.widget.a.INVALID_ID;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18037d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f18038e;

        d(int i10) {
            this.f18038e = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f18032e = this;
            this.f18034a.add(view);
            this.f18036c = androidx.customview.widget.a.INVALID_ID;
            if (this.f18034a.size() == 1) {
                this.f18035b = androidx.customview.widget.a.INVALID_ID;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f18037d += StaggeredGridLayoutManager.this.f18002u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(androidx.customview.widget.a.INVALID_ID) : p(androidx.customview.widget.a.INVALID_ID);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f18002u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f18002u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f18036c = iL;
                    this.f18035b = iL;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList arrayList = this.f18034a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f18036c = StaggeredGridLayoutManager.this.f18002u.d(view);
            if (cVarN.f18033f && (fullSpanItemF = StaggeredGridLayoutManager.this.f17988E.f(cVarN.a())) != null && fullSpanItemF.f18011h == 1) {
                this.f18036c += fullSpanItemF.a(this.f18038e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = (View) this.f18034a.get(0);
            c cVarN = n(view);
            this.f18035b = StaggeredGridLayoutManager.this.f18002u.g(view);
            if (cVarN.f18033f && (fullSpanItemF = StaggeredGridLayoutManager.this.f17988E.f(cVarN.a())) != null && fullSpanItemF.f18011h == -1) {
                this.f18035b -= fullSpanItemF.a(this.f18038e);
            }
        }

        void e() {
            this.f18034a.clear();
            q();
            this.f18037d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f18007z ? i(this.f18034a.size() - 1, -1, true) : i(0, this.f18034a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f18007z ? i(0, this.f18034a.size(), true) : i(this.f18034a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f18002u.m();
            int i12 = StaggeredGridLayoutManager.this.f18002u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = (View) this.f18034a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f18002u.g(view);
                int iD = StaggeredGridLayoutManager.this.f18002u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f18037d;
        }

        int k() {
            int i10 = this.f18036c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f18036c;
        }

        int l(int i10) {
            int i11 = this.f18036c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f18034a.size() == 0) {
                return i10;
            }
            c();
            return this.f18036c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f18034a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f18034a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f18007z && staggeredGridLayoutManager.l0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f18007z && staggeredGridLayoutManager2.l0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f18034a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = (View) this.f18034a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f18007z && staggeredGridLayoutManager3.l0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f18007z && staggeredGridLayoutManager4.l0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f18035b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f18035b;
        }

        int p(int i10) {
            int i11 = this.f18035b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f18034a.size() == 0) {
                return i10;
            }
            d();
            return this.f18035b;
        }

        void q() {
            this.f18035b = androidx.customview.widget.a.INVALID_ID;
            this.f18036c = androidx.customview.widget.a.INVALID_ID;
        }

        void r(int i10) {
            int i11 = this.f18035b;
            if (i11 != Integer.MIN_VALUE) {
                this.f18035b = i11 + i10;
            }
            int i12 = this.f18036c;
            if (i12 != Integer.MIN_VALUE) {
                this.f18036c = i12 + i10;
            }
        }

        void s() {
            int size = this.f18034a.size();
            View view = (View) this.f18034a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f18032e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f18037d -= StaggeredGridLayoutManager.this.f18002u.e(view);
            }
            if (size == 1) {
                this.f18035b = androidx.customview.widget.a.INVALID_ID;
            }
            this.f18036c = androidx.customview.widget.a.INVALID_ID;
        }

        void t() {
            View view = (View) this.f18034a.remove(0);
            c cVarN = n(view);
            cVarN.f18032e = null;
            if (this.f18034a.size() == 0) {
                this.f18036c = androidx.customview.widget.a.INVALID_ID;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f18037d -= StaggeredGridLayoutManager.this.f18002u.e(view);
            }
            this.f18035b = androidx.customview.widget.a.INVALID_ID;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f18032e = this;
            this.f18034a.add(0, view);
            this.f18035b = androidx.customview.widget.a.INVALID_ID;
            if (this.f18034a.size() == 1) {
                this.f18036c = androidx.customview.widget.a.INVALID_ID;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f18037d += StaggeredGridLayoutManager.this.f18002u.e(view);
            }
        }

        void v(int i10) {
            this.f18035b = i10;
            this.f18036c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d dVarM0 = RecyclerView.p.m0(context, attributeSet, i10, i11);
        L2(dVarM0.f17945a);
        N2(dVarM0.f17946b);
        M2(dVarM0.f17947c);
        this.f18006y = new f();
        e2();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A2(RecyclerView.w wVar, RecyclerView.A a10, boolean z10) {
        SavedState savedState;
        b bVar = this.f17995L;
        if (!(this.f17992I == null && this.f17986C == -1) && a10.b() == 0) {
            o1(wVar);
            bVar.c();
            return;
        }
        boolean z11 = true;
        boolean z12 = (bVar.f18029e && this.f17986C == -1 && this.f17992I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.f17992I != null) {
                R1(bVar);
            } else {
                I2();
                bVar.f18027c = this.f17984A;
            }
            R2(a10, bVar);
            bVar.f18029e = true;
        }
        if (this.f17992I == null && this.f17986C == -1 && (bVar.f18027c != this.f17990G || x2() != this.f17991H)) {
            this.f17988E.b();
            bVar.f18028d = true;
        }
        if (O() > 0 && ((savedState = this.f17992I) == null || savedState.f18016i < 1)) {
            if (bVar.f18028d) {
                for (int i10 = 0; i10 < this.f18000s; i10++) {
                    this.f18001t[i10].e();
                    int i11 = bVar.f18026b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f18001t[i10].v(i11);
                    }
                }
            } else if (z12 || this.f17995L.f18030f == null) {
                for (int i12 = 0; i12 < this.f18000s; i12++) {
                    this.f18001t[i12].b(this.f17984A, bVar.f18026b);
                }
                this.f17995L.d(this.f18001t);
            } else {
                for (int i13 = 0; i13 < this.f18000s; i13++) {
                    d dVar = this.f18001t[i13];
                    dVar.e();
                    dVar.v(this.f17995L.f18030f[i13]);
                }
            }
        }
        B(wVar);
        this.f18006y.f18159a = false;
        this.f17996M = false;
        T2(this.f18003v.n());
        S2(bVar.f18025a, a10);
        if (bVar.f18027c) {
            K2(-1);
            f2(wVar, this.f18006y, a10);
            K2(1);
            f fVar = this.f18006y;
            fVar.f18161c = bVar.f18025a + fVar.f18162d;
            f2(wVar, fVar, a10);
        } else {
            K2(1);
            f2(wVar, this.f18006y, a10);
            K2(-1);
            f fVar2 = this.f18006y;
            fVar2.f18161c = bVar.f18025a + fVar2.f18162d;
            f2(wVar, fVar2, a10);
        }
        H2();
        if (O() > 0) {
            if (this.f17984A) {
                l2(wVar, a10, true);
                m2(wVar, a10, false);
            } else {
                m2(wVar, a10, true);
                l2(wVar, a10, false);
            }
        }
        if (!z10 || a10.e() || this.f17989F == 0 || O() <= 0 || (!this.f17996M && v2() == null)) {
            z11 = false;
        } else {
            s1(this.f17999P);
            if (!W1()) {
            }
        }
        if (a10.e()) {
            this.f17995L.c();
        }
        this.f17990G = bVar.f18027c;
        this.f17991H = x2();
        if (z11) {
            this.f17995L.c();
            A2(wVar, a10, false);
        }
    }

    private boolean B2(int i10) {
        if (this.f18004w == 0) {
            return (i10 == -1) != this.f17984A;
        }
        return ((i10 == -1) == this.f17984A) == x2();
    }

    private void D2(View view) {
        for (int i10 = this.f18000s - 1; i10 >= 0; i10--) {
            this.f18001t[i10].u(view);
        }
    }

    private void E2(RecyclerView.w wVar, f fVar) {
        if (!fVar.f18159a || fVar.f18167i) {
            return;
        }
        if (fVar.f18160b == 0) {
            if (fVar.f18163e == -1) {
                F2(wVar, fVar.f18165g);
                return;
            } else {
                G2(wVar, fVar.f18164f);
                return;
            }
        }
        if (fVar.f18163e != -1) {
            int iR2 = r2(fVar.f18165g) - fVar.f18165g;
            G2(wVar, iR2 < 0 ? fVar.f18164f : Math.min(iR2, fVar.f18160b) + fVar.f18164f);
        } else {
            int i10 = fVar.f18164f;
            int iQ2 = i10 - q2(i10);
            F2(wVar, iQ2 < 0 ? fVar.f18165g : fVar.f18165g - Math.min(iQ2, fVar.f18160b));
        }
    }

    private void F2(RecyclerView.w wVar, int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            if (this.f18002u.g(viewN) < i10 || this.f18002u.q(viewN) < i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f18033f) {
                for (int i11 = 0; i11 < this.f18000s; i11++) {
                    if (this.f18001t[i11].f18034a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f18000s; i12++) {
                    this.f18001t[i12].s();
                }
            } else if (cVar.f18032e.f18034a.size() == 1) {
                return;
            } else {
                cVar.f18032e.s();
            }
            q1(viewN, wVar);
        }
    }

    private void G2(RecyclerView.w wVar, int i10) {
        while (O() > 0) {
            View viewN = N(0);
            if (this.f18002u.d(viewN) > i10 || this.f18002u.p(viewN) > i10) {
                return;
            }
            c cVar = (c) viewN.getLayoutParams();
            if (cVar.f18033f) {
                for (int i11 = 0; i11 < this.f18000s; i11++) {
                    if (this.f18001t[i11].f18034a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f18000s; i12++) {
                    this.f18001t[i12].t();
                }
            } else if (cVar.f18032e.f18034a.size() == 1) {
                return;
            } else {
                cVar.f18032e.t();
            }
            q1(viewN, wVar);
        }
    }

    private void H2() {
        if (this.f18003v.k() == 1073741824) {
            return;
        }
        int iO = O();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iO; i10++) {
            View viewN = N(i10);
            float fE = this.f18003v.e(viewN);
            if (fE >= fMax) {
                if (((c) viewN.getLayoutParams()).e()) {
                    fE = (fE * 1.0f) / this.f18000s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f18005x;
        int iRound = Math.round(fMax * this.f18000s);
        if (this.f18003v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f18003v.n());
        }
        T2(iRound);
        if (this.f18005x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iO; i12++) {
            View viewN2 = N(i12);
            c cVar = (c) viewN2.getLayoutParams();
            if (!cVar.f18033f) {
                if (x2() && this.f18004w == 1) {
                    int i13 = this.f18000s;
                    int i14 = cVar.f18032e.f18038e;
                    viewN2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f18005x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f18032e.f18038e;
                    int i16 = this.f18005x * i15;
                    int i17 = i15 * i11;
                    if (this.f18004w == 1) {
                        viewN2.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewN2.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void I2() {
        if (this.f18004w == 1 || !x2()) {
            this.f17984A = this.f18007z;
        } else {
            this.f17984A = !this.f18007z;
        }
    }

    private void K2(int i10) {
        f fVar = this.f18006y;
        fVar.f18163e = i10;
        fVar.f18162d = this.f17984A != (i10 == -1) ? -1 : 1;
    }

    private void O2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f18000s; i12++) {
            if (!this.f18001t[i12].f18034a.isEmpty()) {
                U2(this.f18001t[i12], i10, i11);
            }
        }
    }

    private boolean P2(RecyclerView.A a10, b bVar) {
        bVar.f18025a = this.f17990G ? k2(a10.b()) : g2(a10.b());
        bVar.f18026b = androidx.customview.widget.a.INVALID_ID;
        return true;
    }

    private void Q1(View view) {
        for (int i10 = this.f18000s - 1; i10 >= 0; i10--) {
            this.f18001t[i10].a(view);
        }
    }

    private void R1(b bVar) {
        SavedState savedState = this.f17992I;
        int i10 = savedState.f18016i;
        if (i10 > 0) {
            if (i10 == this.f18000s) {
                for (int i11 = 0; i11 < this.f18000s; i11++) {
                    this.f18001t[i11].e();
                    SavedState savedState2 = this.f17992I;
                    int i12 = savedState2.f18017j[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f18022o ? this.f18002u.i() : this.f18002u.m();
                    }
                    this.f18001t[i11].v(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.f17992I;
                savedState3.f18014g = savedState3.f18015h;
            }
        }
        SavedState savedState4 = this.f17992I;
        this.f17991H = savedState4.f18023p;
        M2(savedState4.f18021n);
        I2();
        SavedState savedState5 = this.f17992I;
        int i13 = savedState5.f18014g;
        if (i13 != -1) {
            this.f17986C = i13;
            bVar.f18027c = savedState5.f18022o;
        } else {
            bVar.f18027c = this.f17984A;
        }
        if (savedState5.f18018k > 1) {
            LazySpanLookup lazySpanLookup = this.f17988E;
            lazySpanLookup.f18008a = savedState5.f18019l;
            lazySpanLookup.f18009b = savedState5.f18020m;
        }
    }

    private void S2(int i10, RecyclerView.A a10) {
        int iN;
        int iN2;
        int iC;
        f fVar = this.f18006y;
        boolean z10 = false;
        fVar.f18160b = 0;
        fVar.f18161c = i10;
        if (!B0() || (iC = a10.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f17984A == (iC < i10)) {
                iN = this.f18002u.n();
                iN2 = 0;
            } else {
                iN2 = this.f18002u.n();
                iN = 0;
            }
        }
        if (R()) {
            this.f18006y.f18164f = this.f18002u.m() - iN2;
            this.f18006y.f18165g = this.f18002u.i() + iN;
        } else {
            this.f18006y.f18165g = this.f18002u.h() + iN;
            this.f18006y.f18164f = -iN2;
        }
        f fVar2 = this.f18006y;
        fVar2.f18166h = false;
        fVar2.f18159a = true;
        if (this.f18002u.k() == 0 && this.f18002u.h() == 0) {
            z10 = true;
        }
        fVar2.f18167i = z10;
    }

    private void U1(View view, c cVar, f fVar) {
        if (fVar.f18163e == 1) {
            if (cVar.f18033f) {
                Q1(view);
                return;
            } else {
                cVar.f18032e.a(view);
                return;
            }
        }
        if (cVar.f18033f) {
            D2(view);
        } else {
            cVar.f18032e.u(view);
        }
    }

    private void U2(d dVar, int i10, int i11) {
        int iJ = dVar.j();
        if (i10 == -1) {
            if (dVar.o() + iJ <= i11) {
                this.f17985B.set(dVar.f18038e, false);
            }
        } else if (dVar.k() - iJ >= i11) {
            this.f17985B.set(dVar.f18038e, false);
        }
    }

    private int V1(int i10) {
        if (O() == 0) {
            return this.f17984A ? 1 : -1;
        }
        return (i10 < n2()) != this.f17984A ? -1 : 1;
    }

    private int V2(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean X1(d dVar) {
        boolean z10;
        if (!this.f17984A) {
            if (dVar.o() > this.f18002u.m()) {
                z10 = dVar.n((View) dVar.f18034a.get(0)).f18033f;
                return !z10;
            }
            return false;
        }
        if (dVar.k() < this.f18002u.i()) {
            z10 = dVar.n((View) dVar.f18034a.get(r0.size() - 1)).f18033f;
            return !z10;
        }
        return false;
    }

    private int Y1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        return l.a(a10, this.f18002u, i2(!this.f17997N), h2(!this.f17997N), this, this.f17997N);
    }

    private int Z1(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        return l.b(a10, this.f18002u, i2(!this.f17997N), h2(!this.f17997N), this, this.f17997N, this.f17984A);
    }

    private int a2(RecyclerView.A a10) {
        if (O() == 0) {
            return 0;
        }
        return l.c(a10, this.f18002u, i2(!this.f17997N), h2(!this.f17997N), this, this.f17997N);
    }

    private int b2(int i10) {
        if (i10 == 1) {
            return (this.f18004w != 1 && x2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f18004w != 1 && x2()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.f18004w == 0) {
                return -1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 33) {
            if (this.f18004w == 1) {
                return -1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 66) {
            if (this.f18004w == 0) {
                return 1;
            }
            return androidx.customview.widget.a.INVALID_ID;
        }
        if (i10 == 130 && this.f18004w == 1) {
            return 1;
        }
        return androidx.customview.widget.a.INVALID_ID;
    }

    private LazySpanLookup.FullSpanItem c2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f18012i = new int[this.f18000s];
        for (int i11 = 0; i11 < this.f18000s; i11++) {
            fullSpanItem.f18012i[i11] = i10 - this.f18001t[i11].l(i10);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem d2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f18012i = new int[this.f18000s];
        for (int i11 = 0; i11 < this.f18000s; i11++) {
            fullSpanItem.f18012i[i11] = this.f18001t[i11].p(i10) - i10;
        }
        return fullSpanItem;
    }

    private void e2() {
        this.f18002u = i.b(this, this.f18004w);
        this.f18003v = i.b(this, 1 - this.f18004w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int f2(RecyclerView.w wVar, f fVar, RecyclerView.A a10) {
        d dVarT2;
        int iS2;
        int iE;
        int iM;
        int iE2;
        ?? r02;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r82 = 0;
        staggeredGridLayoutManager.f17985B.set(0, staggeredGridLayoutManager.f18000s, true);
        int i10 = staggeredGridLayoutManager.f18006y.f18167i ? fVar.f18163e == 1 ? ViewDefaults.NUMBER_OF_LINES : androidx.customview.widget.a.INVALID_ID : fVar.f18163e == 1 ? fVar.f18165g + fVar.f18160b : fVar.f18164f - fVar.f18160b;
        staggeredGridLayoutManager.O2(fVar.f18163e, i10);
        int i11 = staggeredGridLayoutManager.f17984A ? staggeredGridLayoutManager.f18002u.i() : staggeredGridLayoutManager.f18002u.m();
        boolean z10 = false;
        ?? r03 = staggeredGridLayoutManager;
        while (fVar.a(a10) && (r03.f18006y.f18167i || !r03.f17985B.isEmpty())) {
            View viewB = fVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = r03.f17988E.g(iA);
            ?? r52 = iG == -1 ? 1 : r82;
            if (r52 != 0) {
                dVarT2 = cVar.f18033f ? r03.f18001t[r82] : r03.t2(fVar);
                r03.f17988E.n(iA, dVarT2);
            } else {
                dVarT2 = r03.f18001t[iG];
            }
            d dVar = dVarT2;
            cVar.f18032e = dVar;
            if (fVar.f18163e == 1) {
                r03.i(viewB);
            } else {
                r03.j(viewB, r82);
            }
            r03.z2(viewB, cVar, r82);
            if (fVar.f18163e == 1) {
                iE = cVar.f18033f ? r03.p2(i11) : dVar.l(i11);
                iS2 = r03.f18002u.e(viewB) + iE;
                if (r52 != 0 && cVar.f18033f) {
                    LazySpanLookup.FullSpanItem fullSpanItemC2 = r03.c2(iE);
                    fullSpanItemC2.f18011h = -1;
                    fullSpanItemC2.f18010g = iA;
                    r03.f17988E.a(fullSpanItemC2);
                }
            } else {
                iS2 = cVar.f18033f ? r03.s2(i11) : dVar.p(i11);
                iE = iS2 - r03.f18002u.e(viewB);
                if (r52 != 0 && cVar.f18033f) {
                    LazySpanLookup.FullSpanItem fullSpanItemD2 = r03.d2(iS2);
                    fullSpanItemD2.f18011h = 1;
                    fullSpanItemD2.f18010g = iA;
                    r03.f17988E.a(fullSpanItemD2);
                }
            }
            if (cVar.f18033f && fVar.f18162d == -1) {
                if (r52 != 0) {
                    r03.f17996M = true;
                } else {
                    if (!(fVar.f18163e == 1 ? r03.S1() : r03.T1())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = r03.f17988E.f(iA);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f18013j = true;
                        }
                        r03.f17996M = true;
                    }
                }
            }
            r03.U1(viewB, cVar, fVar);
            if (r03.x2() && r03.f18004w == 1) {
                iE2 = cVar.f18033f ? r03.f18003v.i() : r03.f18003v.i() - (((r03.f18000s - 1) - dVar.f18038e) * r03.f18005x);
                iM = iE2 - r03.f18003v.e(viewB);
            } else {
                iM = cVar.f18033f ? r03.f18003v.m() : (dVar.f18038e * r03.f18005x) + r03.f18003v.m();
                iE2 = r03.f18003v.e(viewB) + iM;
            }
            int i12 = iE2;
            int i13 = iM;
            if (r03.f18004w == 1) {
                r03.D0(viewB, i13, iE, i12, iS2);
                r02 = this;
            } else {
                r03.D0(viewB, iE, i13, iS2, i12);
                r02 = r03;
            }
            if (cVar.f18033f) {
                r02.O2(r02.f18006y.f18163e, i10);
            } else {
                r02.U2(dVar, r02.f18006y.f18163e, i10);
            }
            r02.E2(wVar, r02.f18006y);
            if (r02.f18006y.f18166h && viewB.hasFocusable()) {
                if (cVar.f18033f) {
                    r02.f17985B.clear();
                } else {
                    r02.f17985B.set(dVar.f18038e, false);
                }
            }
            z10 = true;
            r82 = 0;
            r03 = r02;
        }
        if (!z10) {
            r03.E2(wVar, r03.f18006y);
        }
        int iM2 = r03.f18006y.f18163e == -1 ? r03.f18002u.m() - r03.s2(r03.f18002u.m()) : r03.p2(r03.f18002u.i()) - r03.f18002u.i();
        if (iM2 > 0) {
            return Math.min(fVar.f18160b, iM2);
        }
        return 0;
    }

    private int g2(int i10) {
        int iO = O();
        for (int i11 = 0; i11 < iO; i11++) {
            int iL0 = l0(N(i11));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private int k2(int i10) {
        for (int iO = O() - 1; iO >= 0; iO--) {
            int iL0 = l0(N(iO));
            if (iL0 >= 0 && iL0 < i10) {
                return iL0;
            }
        }
        return 0;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.A a10, boolean z10) {
        int i10;
        int iP2 = p2(androidx.customview.widget.a.INVALID_ID);
        if (iP2 != Integer.MIN_VALUE && (i10 = this.f18002u.i() - iP2) > 0) {
            int i11 = i10 - (-J2(-i10, wVar, a10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f18002u.r(i11);
        }
    }

    private void m2(RecyclerView.w wVar, RecyclerView.A a10, boolean z10) {
        int iM;
        int iS2 = s2(ViewDefaults.NUMBER_OF_LINES);
        if (iS2 != Integer.MAX_VALUE && (iM = iS2 - this.f18002u.m()) > 0) {
            int iJ2 = iM - J2(iM, wVar, a10);
            if (!z10 || iJ2 <= 0) {
                return;
            }
            this.f18002u.r(-iJ2);
        }
    }

    private int p2(int i10) {
        int iL = this.f18001t[0].l(i10);
        for (int i11 = 1; i11 < this.f18000s; i11++) {
            int iL2 = this.f18001t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int q2(int i10) {
        int iP = this.f18001t[0].p(i10);
        for (int i11 = 1; i11 < this.f18000s; i11++) {
            int iP2 = this.f18001t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int r2(int i10) {
        int iL = this.f18001t[0].l(i10);
        for (int i11 = 1; i11 < this.f18000s; i11++) {
            int iL2 = this.f18001t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int s2(int i10) {
        int iP = this.f18001t[0].p(i10);
        for (int i11 = 1; i11 < this.f18000s; i11++) {
            int iP2 = this.f18001t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private d t2(f fVar) {
        int i10;
        int i11;
        int i12;
        if (B2(fVar.f18163e)) {
            i11 = this.f18000s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f18000s;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (fVar.f18163e == 1) {
            int iM = this.f18002u.m();
            int i13 = ViewDefaults.NUMBER_OF_LINES;
            while (i11 != i10) {
                d dVar2 = this.f18001t[i11];
                int iL = dVar2.l(iM);
                if (iL < i13) {
                    dVar = dVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f18002u.i();
        int i15 = androidx.customview.widget.a.INVALID_ID;
        while (i11 != i10) {
            d dVar3 = this.f18001t[i11];
            int iP = dVar3.p(i14);
            if (iP > i15) {
                dVar = dVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void u2(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iO2 = this.f17984A ? o2() : n2();
        if (i12 != 8) {
            i13 = i10 + i11;
        } else {
            if (i10 >= i11) {
                i13 = i10 + 1;
                i14 = i11;
                this.f17988E.h(i14);
                if (i12 != 1) {
                    this.f17988E.j(i10, i11);
                } else if (i12 == 2) {
                    this.f17988E.k(i10, i11);
                } else if (i12 == 8) {
                    this.f17988E.k(i10, 1);
                    this.f17988E.j(i11, 1);
                }
                if (i13 > iO2) {
                    return;
                }
                if (i14 <= (this.f17984A ? n2() : o2())) {
                    x1();
                    return;
                }
                return;
            }
            i13 = i11 + 1;
        }
        i14 = i10;
        this.f17988E.h(i14);
        if (i12 != 1) {
        }
        if (i13 > iO2) {
        }
    }

    private void y2(View view, int i10, int i11, boolean z10) {
        o(view, this.f17994K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f17994K;
        int iV2 = V2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f17994K;
        int iV22 = V2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? L1(view, iV2, iV22, cVar) : J1(view, iV2, iV22, cVar)) {
            view.measure(iV2, iV22);
        }
    }

    private void z2(View view, c cVar, boolean z10) {
        if (cVar.f18033f) {
            if (this.f18004w == 1) {
                y2(view, this.f17993J, RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f17993J, z10);
                return;
            }
        }
        if (this.f18004w == 1) {
            y2(view, RecyclerView.p.P(this.f18005x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            y2(view, RecyclerView.p.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.P(this.f18005x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.A a10) {
        return a2(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        return J2(i10, wVar, a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void B1(int i10) {
        SavedState savedState = this.f17992I;
        if (savedState != null && savedState.f18014g != i10) {
            savedState.a();
        }
        this.f17986C = i10;
        this.f17987D = androidx.customview.widget.a.INVALID_ID;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C1(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        return J2(i10, wVar, a10);
    }

    void C2(int i10, RecyclerView.A a10) {
        int iN2;
        int i11;
        if (i10 > 0) {
            iN2 = o2();
            i11 = 1;
        } else {
            iN2 = n2();
            i11 = -1;
        }
        this.f18006y.f18159a = true;
        S2(iN2, a10);
        K2(i11);
        f fVar = this.f18006y;
        fVar.f18161c = iN2 + fVar.f18162d;
        fVar.f18160b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G0(int i10) {
        super.G0(i10);
        for (int i11 = 0; i11 < this.f18000s; i11++) {
            this.f18001t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void G1(Rect rect, int i10, int i11) {
        int iS;
        int iS2;
        int iI0 = i0() + j0();
        int iK0 = k0() + h0();
        if (this.f18004w == 1) {
            iS2 = RecyclerView.p.s(i11, rect.height() + iK0, f0());
            iS = RecyclerView.p.s(i10, (this.f18005x * this.f18000s) + iI0, g0());
        } else {
            iS = RecyclerView.p.s(i10, rect.width() + iI0, g0());
            iS2 = RecyclerView.p.s(i11, (this.f18005x * this.f18000s) + iK0, f0());
        }
        F1(iS, iS2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(int i10) {
        super.H0(i10);
        for (int i11 = 0; i11 < this.f18000s; i11++) {
            this.f18001t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q I() {
        return this.f18004w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f17988E.b();
        for (int i10 = 0; i10 < this.f18000s; i10++) {
            this.f18001t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int J2(int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        C2(i10, a10);
        int iF2 = f2(wVar, this.f18006y, a10);
        if (this.f18006y.f18160b >= iF2) {
            i10 = i10 < 0 ? -iF2 : iF2;
        }
        this.f18002u.r(-i10);
        this.f17990G = this.f17984A;
        f fVar = this.f18006y;
        fVar.f18160b = 0;
        E2(wVar, fVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void L2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i10 == this.f18004w) {
            return;
        }
        this.f18004w = i10;
        i iVar = this.f18002u;
        this.f18002u = this.f18003v;
        this.f18003v = iVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.M0(recyclerView, wVar);
        s1(this.f17999P);
        for (int i10 = 0; i10 < this.f18000s; i10++) {
            this.f18001t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.A a10, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        N1(gVar);
    }

    public void M2(boolean z10) {
        l(null);
        SavedState savedState = this.f17992I;
        if (savedState != null && savedState.f18021n != z10) {
            savedState.f18021n = z10;
        }
        this.f18007z = z10;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View N0(View view, int i10, RecyclerView.w wVar, RecyclerView.A a10) {
        View viewG;
        View viewM;
        if (O() == 0 || (viewG = G(view)) == null) {
            return null;
        }
        I2();
        int iB2 = b2(i10);
        if (iB2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewG.getLayoutParams();
        boolean z10 = cVar.f18033f;
        d dVar = cVar.f18032e;
        int iO2 = iB2 == 1 ? o2() : n2();
        S2(iO2, a10);
        K2(iB2);
        f fVar = this.f18006y;
        fVar.f18161c = fVar.f18162d + iO2;
        fVar.f18160b = (int) (this.f18002u.n() * 0.33333334f);
        f fVar2 = this.f18006y;
        fVar2.f18166h = true;
        fVar2.f18159a = false;
        f2(wVar, fVar2, a10);
        this.f17990G = this.f17984A;
        if (!z10 && (viewM = dVar.m(iO2, iB2)) != null && viewM != viewG) {
            return viewM;
        }
        if (B2(iB2)) {
            for (int i11 = this.f18000s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f18001t[i11].m(iO2, iB2);
                if (viewM2 != null && viewM2 != viewG) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f18000s; i12++) {
                View viewM3 = this.f18001t[i12].m(iO2, iB2);
                if (viewM3 != null && viewM3 != viewG) {
                    return viewM3;
                }
            }
        }
        boolean z11 = (this.f18007z ^ true) == (iB2 == -1);
        if (!z10) {
            View viewH = H(z11 ? dVar.f() : dVar.g());
            if (viewH != null && viewH != viewG) {
                return viewH;
            }
        }
        if (B2(iB2)) {
            for (int i13 = this.f18000s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f18038e) {
                    View viewH2 = H(z11 ? this.f18001t[i13].f() : this.f18001t[i13].g());
                    if (viewH2 != null && viewH2 != viewG) {
                        return viewH2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f18000s; i14++) {
                View viewH3 = H(z11 ? this.f18001t[i14].f() : this.f18001t[i14].g());
                if (viewH3 != null && viewH3 != viewG) {
                    return viewH3;
                }
            }
        }
        return null;
    }

    public void N2(int i10) {
        l(null);
        if (i10 != this.f18000s) {
            w2();
            this.f18000s = i10;
            this.f17985B = new BitSet(this.f18000s);
            this.f18001t = new d[this.f18000s];
            for (int i11 = 0; i11 < this.f18000s; i11++) {
                this.f18001t[i11] = new d(i11);
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View viewI2 = i2(false);
            View viewH2 = h2(false);
            if (viewI2 == null || viewH2 == null) {
                return;
            }
            int iL0 = l0(viewI2);
            int iL02 = l0(viewH2);
            if (iL0 < iL02) {
                accessibilityEvent.setFromIndex(iL0);
                accessibilityEvent.setToIndex(iL02);
            } else {
                accessibilityEvent.setFromIndex(iL02);
                accessibilityEvent.setToIndex(iL0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean P1() {
        return this.f17992I == null;
    }

    boolean Q2(RecyclerView.A a10, b bVar) {
        int i10;
        if (!a10.e() && (i10 = this.f17986C) != -1) {
            if (i10 >= 0 && i10 < a10.b()) {
                SavedState savedState = this.f17992I;
                if (savedState == null || savedState.f18014g == -1 || savedState.f18016i < 1) {
                    View viewH = H(this.f17986C);
                    if (viewH != null) {
                        bVar.f18025a = this.f17984A ? o2() : n2();
                        if (this.f17987D != Integer.MIN_VALUE) {
                            if (bVar.f18027c) {
                                bVar.f18026b = (this.f18002u.i() - this.f17987D) - this.f18002u.d(viewH);
                            } else {
                                bVar.f18026b = (this.f18002u.m() + this.f17987D) - this.f18002u.g(viewH);
                            }
                            return true;
                        }
                        if (this.f18002u.e(viewH) > this.f18002u.n()) {
                            bVar.f18026b = bVar.f18027c ? this.f18002u.i() : this.f18002u.m();
                            return true;
                        }
                        int iG = this.f18002u.g(viewH) - this.f18002u.m();
                        if (iG < 0) {
                            bVar.f18026b = -iG;
                            return true;
                        }
                        int i11 = this.f18002u.i() - this.f18002u.d(viewH);
                        if (i11 < 0) {
                            bVar.f18026b = i11;
                            return true;
                        }
                        bVar.f18026b = androidx.customview.widget.a.INVALID_ID;
                    } else {
                        int i12 = this.f17986C;
                        bVar.f18025a = i12;
                        int i13 = this.f17987D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f18027c = V1(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f18028d = true;
                    }
                } else {
                    bVar.f18026b = androidx.customview.widget.a.INVALID_ID;
                    bVar.f18025a = this.f17986C;
                }
                return true;
            }
            this.f17986C = -1;
            this.f17987D = androidx.customview.widget.a.INVALID_ID;
        }
        return false;
    }

    void R2(RecyclerView.A a10, b bVar) {
        if (Q2(a10, bVar) || P2(a10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f18025a = 0;
    }

    boolean S1() {
        int iL = this.f18001t[0].l(androidx.customview.widget.a.INVALID_ID);
        for (int i10 = 1; i10 < this.f18000s; i10++) {
            if (this.f18001t[i10].l(androidx.customview.widget.a.INVALID_ID) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean T1() {
        int iP = this.f18001t[0].p(androidx.customview.widget.a.INVALID_ID);
        for (int i10 = 1; i10 < this.f18000s; i10++) {
            if (this.f18001t[i10].p(androidx.customview.widget.a.INVALID_ID) != iP) {
                return false;
            }
        }
        return true;
    }

    void T2(int i10) {
        this.f18005x = i10 / this.f18000s;
        this.f17993J = View.MeasureSpec.makeMeasureSpec(i10, this.f18003v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V0(RecyclerView recyclerView, int i10, int i11) {
        u2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView) {
        this.f17988E.b();
        x1();
    }

    boolean W1() {
        int iN2;
        int iO2;
        if (O() == 0 || this.f17989F == 0 || !v0()) {
            return false;
        }
        if (this.f17984A) {
            iN2 = o2();
            iO2 = n2();
        } else {
            iN2 = n2();
            iO2 = o2();
        }
        if (iN2 == 0 && v2() != null) {
            this.f17988E.b();
            y1();
            x1();
            return true;
        }
        if (!this.f17996M) {
            return false;
        }
        int i10 = this.f17984A ? -1 : 1;
        int i11 = iO2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.f17988E.e(iN2, i11, i10, true);
        if (fullSpanItemE == null) {
            this.f17996M = false;
            this.f17988E.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.f17988E.e(iN2, fullSpanItemE.f18010g, i10 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.f17988E.d(fullSpanItemE.f18010g);
        } else {
            this.f17988E.d(fullSpanItemE2.f18010g + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView, int i10, int i11, int i12) {
        u2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i10, int i11) {
        u2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        u2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.w wVar, RecyclerView.A a10) {
        A2(wVar, a10, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF c(int i10) {
        int iV1 = V1(i10);
        PointF pointF = new PointF();
        if (iV1 == 0) {
            return null;
        }
        if (this.f18004w == 0) {
            pointF.x = iV1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iV1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.A a10) {
        super.c1(a10);
        this.f17986C = -1;
        this.f17987D = androidx.customview.widget.a.INVALID_ID;
        this.f17992I = null;
        this.f17995L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f17992I = savedState;
            if (this.f17986C != -1) {
                savedState.a();
                this.f17992I.b();
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable h1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f17992I != null) {
            return new SavedState(this.f17992I);
        }
        SavedState savedState = new SavedState();
        savedState.f18021n = this.f18007z;
        savedState.f18022o = this.f17990G;
        savedState.f18023p = this.f17991H;
        LazySpanLookup lazySpanLookup = this.f17988E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f18008a) == null) {
            savedState.f18018k = 0;
        } else {
            savedState.f18019l = iArr;
            savedState.f18018k = iArr.length;
            savedState.f18020m = lazySpanLookup.f18009b;
        }
        if (O() <= 0) {
            savedState.f18014g = -1;
            savedState.f18015h = -1;
            savedState.f18016i = 0;
            return savedState;
        }
        savedState.f18014g = this.f17990G ? o2() : n2();
        savedState.f18015h = j2();
        int i10 = this.f18000s;
        savedState.f18016i = i10;
        savedState.f18017j = new int[i10];
        for (int i11 = 0; i11 < this.f18000s; i11++) {
            if (this.f17990G) {
                iP = this.f18001t[i11].l(androidx.customview.widget.a.INVALID_ID);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f18002u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f18001t[i11].p(androidx.customview.widget.a.INVALID_ID);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f18002u.m();
                    iP -= iM;
                }
            }
            savedState.f18017j[i11] = iP;
        }
        return savedState;
    }

    View h2(boolean z10) {
        int iM = this.f18002u.m();
        int i10 = this.f18002u.i();
        View view = null;
        for (int iO = O() - 1; iO >= 0; iO--) {
            View viewN = N(iO);
            int iG = this.f18002u.g(viewN);
            int iD = this.f18002u.d(viewN);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(int i10) {
        if (i10 == 0) {
            W1();
        }
    }

    View i2(boolean z10) {
        int iM = this.f18002u.m();
        int i10 = this.f18002u.i();
        int iO = O();
        View view = null;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = N(i11);
            int iG = this.f18002u.g(viewN);
            if (this.f18002u.d(viewN) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewN;
                }
                if (view == null) {
                    view = viewN;
                }
            }
        }
        return view;
    }

    int j2() {
        View viewH2 = this.f17984A ? h2(true) : i2(true);
        if (viewH2 == null) {
            return -1;
        }
        return l0(viewH2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void l(String str) {
        if (this.f17992I == null) {
            super.l(str);
        }
    }

    int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    int o2() {
        int iO = O();
        if (iO == 0) {
            return 0;
        }
        return l0(N(iO - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean p() {
        return this.f18004w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.f18004w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t(int i10, int i11, RecyclerView.A a10, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f18004w != 0) {
            i10 = i11;
        }
        if (O() == 0 || i10 == 0) {
            return;
        }
        C2(i10, a10);
        int[] iArr = this.f17998O;
        if (iArr == null || iArr.length < this.f18000s) {
            this.f17998O = new int[this.f18000s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f18000s; i13++) {
            f fVar = this.f18006y;
            if (fVar.f18162d == -1) {
                iL = fVar.f18164f;
                iP = this.f18001t[i13].p(iL);
            } else {
                iL = this.f18001t[i13].l(fVar.f18165g);
                iP = this.f18006y.f18165g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f17998O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f17998O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f18006y.a(a10); i15++) {
            cVar.a(this.f18006y.f18161c, this.f17998O[i15]);
            f fVar2 = this.f18006y;
            fVar2.f18161c += fVar2.f18162d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.A a10) {
        return Y1(a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View v2() {
        int i10;
        int iO = O();
        int i11 = iO - 1;
        BitSet bitSet = new BitSet(this.f18000s);
        bitSet.set(0, this.f18000s, true);
        byte b10 = (this.f18004w == 1 && x2()) ? (byte) 1 : (byte) -1;
        if (this.f17984A) {
            iO = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < iO ? 1 : -1;
        while (i11 != iO) {
            View viewN = N(i11);
            c cVar = (c) viewN.getLayoutParams();
            if (!bitSet.get(cVar.f18032e.f18038e)) {
                if (!cVar.f18033f && (i10 = i11 + i12) != iO) {
                    View viewN2 = N(i10);
                    if (this.f17984A) {
                        int iG = this.f18002u.g(viewN);
                        int iG2 = this.f18002u.g(viewN2);
                        if (iG <= iG2) {
                            if (iG != iG2) {
                                continue;
                            }
                        }
                    } else {
                        int iD = this.f18002u.d(viewN);
                        int iD2 = this.f18002u.d(viewN2);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if ((cVar.f18032e.f18038e - ((c) viewN2.getLayoutParams()).f18032e.f18038e < 0) != (b10 < 0)) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            } else if (!X1(cVar.f18032e)) {
                bitSet.clear(cVar.f18032e.f18038e);
                if (!cVar.f18033f) {
                    View viewN22 = N(i10);
                    if (this.f17984A) {
                    }
                }
                i11 += i12;
            }
            return viewN;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.A a10) {
        return Z1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean w0() {
        return this.f17989F != 0;
    }

    public void w2() {
        this.f17988E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.A a10) {
        return a2(a10);
    }

    boolean x2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.A a10) {
        return Y1(a10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.A a10) {
        return Z1(a10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class LazySpanLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f18008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f18009b;

        LazySpanLookup() {
        }

        private int i(int i10) {
            if (this.f18009b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i10);
            if (fullSpanItemF != null) {
                this.f18009b.remove(fullSpanItemF);
            }
            int size = this.f18009b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (((FullSpanItem) this.f18009b.get(i11)).f18010g >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f18009b.get(i11);
            this.f18009b.remove(i11);
            return fullSpanItem.f18010g;
        }

        private void l(int i10, int i11) {
            List list = this.f18009b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f18009b.get(size);
                int i12 = fullSpanItem.f18010g;
                if (i12 >= i10) {
                    fullSpanItem.f18010g = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List list = this.f18009b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f18009b.get(size);
                int i13 = fullSpanItem.f18010g;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f18009b.remove(size);
                    } else {
                        fullSpanItem.f18010g = i13 - i11;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f18009b == null) {
                this.f18009b = new ArrayList();
            }
            int size = this.f18009b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f18009b.get(i10);
                if (fullSpanItem2.f18010g == fullSpanItem.f18010g) {
                    this.f18009b.remove(i10);
                }
                if (fullSpanItem2.f18010g >= fullSpanItem.f18010g) {
                    this.f18009b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f18009b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f18008a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f18009b = null;
        }

        void c(int i10) {
            int[] iArr = this.f18008a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f18008a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f18008a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f18008a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List list = this.f18009b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f18009b.get(size)).f18010g >= i10) {
                        this.f18009b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List list = this.f18009b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f18009b.get(i13);
                int i14 = fullSpanItem.f18010g;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f18011h == i12 || (z10 && fullSpanItem.f18013j))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List list = this.f18009b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f18009b.get(size);
                if (fullSpanItem.f18010g == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f18008a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f18008a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f18008a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f18008a.length;
            }
            int iMin = Math.min(i11 + 1, this.f18008a.length);
            Arrays.fill(this.f18008a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f18008a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f18008a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f18008a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f18008a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f18008a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f18008a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, d dVar) {
            c(i10);
            this.f18008a[i10] = dVar.f18038e;
        }

        int o(int i10) {
            int length = this.f18008a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f18010g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f18011h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int[] f18012i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f18013j;

            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            class a implements Parcelable.Creator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f18010g = parcel.readInt();
                this.f18011h = parcel.readInt();
                this.f18013j = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f18012i = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f18012i;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f18010g + ", mGapDir=" + this.f18011h + ", mHasUnwantedGapAfter=" + this.f18013j + ", mGapPerSpan=" + Arrays.toString(this.f18012i) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f18010g);
                parcel.writeInt(this.f18011h);
                parcel.writeInt(this.f18013j ? 1 : 0);
                int[] iArr = this.f18012i;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f18012i);
                }
            }

            FullSpanItem() {
            }
        }
    }
}
