package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final ThreadLocal f18144k = new ThreadLocal();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static Comparator f18145l = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f18147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f18148i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f18146g = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f18149j = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f18157d;
            if ((recyclerView == null) != (cVar2.f18157d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f18154a;
            if (z10 != cVar2.f18154a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f18155b - cVar.f18155b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f18156c - cVar2.f18156c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f18151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f18152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18153d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f18153d;
            int i13 = i12 * 2;
            int[] iArr = this.f18152c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f18152c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f18152c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f18152c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f18153d++;
        }

        void b() {
            int[] iArr = this.f18152c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f18153d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f18153d = 0;
            int[] iArr = this.f18152c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f17842t;
            if (recyclerView.f17840s == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f17824k.p()) {
                    pVar.u(recyclerView.f17840s.d(), this);
                }
            } else if (!recyclerView.s0()) {
                pVar.t(this.f18150a, this.f18151b, recyclerView.f17833o0, this);
            }
            int i10 = this.f18153d;
            if (i10 > pVar.f17937m) {
                pVar.f17937m = i10;
                pVar.f17938n = z10;
                recyclerView.f17820i.P();
            }
        }

        boolean d(int i10) {
            if (this.f18152c != null) {
                int i11 = this.f18153d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f18152c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f18150a = i10;
            this.f18151b = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f18157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18158e;

        c() {
        }

        public void a() {
            this.f18154a = false;
            this.f18155b = 0;
            this.f18156c = 0;
            this.f18157d = null;
            this.f18158e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f18146g.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = (RecyclerView) this.f18146g.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f17831n0.c(recyclerView, false);
                i10 += recyclerView.f17831n0.f18153d;
            }
        }
        this.f18149j.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f18146g.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f17831n0;
                int iAbs = Math.abs(bVar.f18150a) + Math.abs(bVar.f18151b);
                for (int i14 = 0; i14 < bVar.f18153d * 2; i14 += 2) {
                    if (i12 >= this.f18149j.size()) {
                        cVar = new c();
                        this.f18149j.add(cVar);
                    } else {
                        cVar = (c) this.f18149j.get(i12);
                    }
                    int[] iArr = bVar.f18152c;
                    int i15 = iArr[i14 + 1];
                    cVar.f18154a = i15 <= iAbs;
                    cVar.f18155b = iAbs;
                    cVar.f18156c = i15;
                    cVar.f18157d = recyclerView2;
                    cVar.f18158e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f18149j, f18145l);
    }

    private void c(c cVar, long j10) {
        RecyclerView.E eI = i(cVar.f18157d, cVar.f18158e, cVar.f18154a ? Long.MAX_VALUE : j10);
        if (eI == null || eI.f17882b == null || !eI.s() || eI.t()) {
            return;
        }
        h((RecyclerView) eI.f17882b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f18149j.size(); i10++) {
            c cVar = (c) this.f18149j.get(i10);
            if (cVar.f18157d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.f17826l.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.E eL0 = RecyclerView.l0(recyclerView.f17826l.i(i11));
            if (eL0.f17883c == i10 && !eL0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f17797K && recyclerView.f17826l.j() != 0) {
            recyclerView.d1();
        }
        b bVar = recyclerView.f17831n0;
        bVar.c(recyclerView, true);
        if (bVar.f18153d != 0) {
            try {
                D0.l.a("RV Nested Prefetch");
                recyclerView.f17833o0.f(recyclerView.f17840s);
                for (int i10 = 0; i10 < bVar.f18153d * 2; i10 += 2) {
                    i(recyclerView, bVar.f18152c[i10], j10);
                }
            } finally {
                D0.l.b();
            }
        }
    }

    private RecyclerView.E i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f17820i;
        try {
            recyclerView.N0();
            RecyclerView.E eN = wVar.N(i10, false, j10);
            if (eN != null) {
                if (!eN.s() || eN.t()) {
                    wVar.a(eN, false);
                } else {
                    wVar.G(eN.f17881a);
                }
            }
            recyclerView.P0(false);
            return eN;
        } catch (Throwable th) {
            recyclerView.P0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.f17767H0 && this.f18146g.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f18146g.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f17767H0 && !this.f18146g.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f18147h == 0) {
                this.f18147h = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f17831n0.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f18146g.remove(recyclerView);
        if (RecyclerView.f17767H0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            D0.l.a("RV Prefetch");
            if (!this.f18146g.isEmpty()) {
                int size = this.f18146g.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) this.f18146g.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f18148i);
                }
            }
        } finally {
            this.f18147h = 0L;
            D0.l.b();
        }
    }
}
