package o0;

import java.util.Arrays;
import java.util.HashMap;
import o0.i;
import r0.C3241d;
import r0.C3242e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f30363r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f30364s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f30365t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f30366u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f30367v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f30368w = 1000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f30369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f30370y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f30374d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    C3000b[] f30377g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c f30384n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f30387q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30371a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f30372b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f30373c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30375e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30376f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30378h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30379i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean[] f30380j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f30381k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f30382l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30383m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i[] f30385o = new i[f30368w];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30386p = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends C3000b {
        public b(c cVar) {
            this.f30357e = new j(this, cVar);
        }
    }

    public d() {
        this.f30377g = null;
        this.f30377g = new C3000b[32];
        C();
        c cVar = new c();
        this.f30384n = cVar;
        this.f30374d = new h(cVar);
        if (f30367v) {
            this.f30387q = new b(cVar);
        } else {
            this.f30387q = new C3000b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f30381k; i10++) {
            this.f30380j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f30381k * 2) {
                if (aVar.getKey() != null) {
                    this.f30380j[aVar.getKey().f30404i] = true;
                }
                i iVarB = aVar.b(this, this.f30380j);
                if (iVarB != null) {
                    boolean[] zArr = this.f30380j;
                    int i12 = iVarB.f30404i;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f30382l; i14++) {
                        C3000b c3000b = this.f30377g[i14];
                        if (c3000b.f30353a.f30411p != i.a.UNRESTRICTED && !c3000b.f30358f && c3000b.t(iVarB)) {
                            float fJ = c3000b.f30357e.j(iVarB);
                            if (fJ < 0.0f) {
                                float f11 = (-c3000b.f30354b) / fJ;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        C3000b c3000b2 = this.f30377g[i13];
                        c3000b2.f30353a.f30405j = -1;
                        c3000b2.x(iVarB);
                        i iVar = c3000b2.f30353a;
                        iVar.f30405j = i13;
                        iVar.s(this, c3000b2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f30367v) {
            while (i10 < this.f30382l) {
                C3000b c3000b = this.f30377g[i10];
                if (c3000b != null) {
                    this.f30384n.f30359a.release(c3000b);
                }
                this.f30377g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f30382l) {
            C3000b c3000b2 = this.f30377g[i10];
            if (c3000b2 != null) {
                this.f30384n.f30360b.release(c3000b2);
            }
            this.f30377g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f30384n.f30361c.acquire();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.r(aVar, str);
        } else {
            iVar.p();
            iVar.r(aVar, str);
        }
        int i10 = this.f30386p;
        int i11 = f30368w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f30368w = i12;
            this.f30385o = (i[]) Arrays.copyOf(this.f30385o, i12);
        }
        i[] iVarArr = this.f30385o;
        int i13 = this.f30386p;
        this.f30386p = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(C3000b c3000b) {
        int i10;
        if (f30365t && c3000b.f30358f) {
            c3000b.f30353a.q(this, c3000b.f30354b);
        } else {
            C3000b[] c3000bArr = this.f30377g;
            int i11 = this.f30382l;
            c3000bArr[i11] = c3000b;
            i iVar = c3000b.f30353a;
            iVar.f30405j = i11;
            this.f30382l = i11 + 1;
            iVar.s(this, c3000b);
        }
        if (f30365t && this.f30371a) {
            int i12 = 0;
            while (i12 < this.f30382l) {
                if (this.f30377g[i12] == null) {
                    System.out.println("WTF");
                }
                C3000b c3000b2 = this.f30377g[i12];
                if (c3000b2 != null && c3000b2.f30358f) {
                    c3000b2.f30353a.q(this, c3000b2.f30354b);
                    if (f30367v) {
                        this.f30384n.f30359a.release(c3000b2);
                    } else {
                        this.f30384n.f30360b.release(c3000b2);
                    }
                    this.f30377g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f30382l;
                        if (i13 >= i10) {
                            break;
                        }
                        C3000b[] c3000bArr2 = this.f30377g;
                        int i15 = i13 - 1;
                        C3000b c3000b3 = c3000bArr2[i13];
                        c3000bArr2[i15] = c3000b3;
                        i iVar2 = c3000b3.f30353a;
                        if (iVar2.f30405j == i13) {
                            iVar2.f30405j = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f30377g[i14] = null;
                    }
                    this.f30382l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f30371a = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f30382l; i10++) {
            C3000b c3000b = this.f30377g[i10];
            c3000b.f30353a.f30407l = c3000b.f30354b;
        }
    }

    public static C3000b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f30382l; i10++) {
            C3000b c3000b = this.f30377g[i10];
            if (c3000b.f30353a.f30411p != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (c3000b.f30354b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f30382l) {
                                break;
                            }
                            C3000b c3000b2 = this.f30377g[i12];
                            if (c3000b2.f30353a.f30411p == i.a.UNRESTRICTED || c3000b2.f30358f || c3000b2.f30354b >= f12) {
                                f10 = f12;
                            } else if (f30366u) {
                                int iB = c3000b2.f30357e.b();
                                int i16 = 0;
                                while (i16 < iB) {
                                    i iVarD = c3000b2.f30357e.d(i16);
                                    float fJ = c3000b2.f30357e.j(iVarD);
                                    if (fJ <= f12) {
                                        f11 = f12;
                                    } else {
                                        f11 = f12;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = iVarD.f30409n[i17] / fJ;
                                            if ((f14 < f13 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarD.f30404i;
                                                i13 = i12;
                                                f13 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f12 = f11;
                                }
                                f10 = f12;
                            } else {
                                f10 = f12;
                                for (int i18 = 1; i18 < this.f30381k; i18++) {
                                    i iVar = this.f30384n.f30362d[i18];
                                    float fJ2 = c3000b2.f30357e.j(iVar);
                                    if (fJ2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = iVar.f30409n[i19] / fJ2;
                                            if ((f15 < f13 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f13 = f15;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f12 = f10;
                        }
                        float f16 = f12;
                        if (i13 != -1) {
                            C3000b c3000b3 = this.f30377g[i13];
                            c3000b3.f30353a.f30405j = -1;
                            c3000b3.x(this.f30384n.f30362d[i14]);
                            i iVar2 = c3000b3.f30353a;
                            iVar2.f30405j = i13;
                            iVar2.s(this, c3000b3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f30381k / 2) {
                            z10 = true;
                        }
                        f12 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f30375e * 2;
        this.f30375e = i10;
        this.f30377g = (C3000b[]) Arrays.copyOf(this.f30377g, i10);
        c cVar = this.f30384n;
        cVar.f30362d = (i[]) Arrays.copyOf(cVar.f30362d, this.f30375e);
        int i11 = this.f30375e;
        this.f30380j = new boolean[i11];
        this.f30376f = i11;
        this.f30383m = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f30384n;
            i[] iVarArr = cVar.f30362d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.p();
            }
            i10++;
        }
        cVar.f30361c.a(this.f30385o, this.f30386p);
        this.f30386p = 0;
        Arrays.fill(this.f30384n.f30362d, (Object) null);
        HashMap map = this.f30373c;
        if (map != null) {
            map.clear();
        }
        this.f30372b = 0;
        this.f30374d.clear();
        this.f30381k = 1;
        for (int i11 = 0; i11 < this.f30382l; i11++) {
            C3000b c3000b = this.f30377g[i11];
            if (c3000b != null) {
                c3000b.f30355c = false;
            }
        }
        C();
        this.f30382l = 0;
        if (f30367v) {
            this.f30387q = new b(this.f30384n);
        } else {
            this.f30387q = new C3000b(this.f30384n);
        }
    }

    public void b(C3242e c3242e, C3242e c3242e2, float f10, int i10) {
        C3241d.b bVar = C3241d.b.LEFT;
        i iVarQ = q(c3242e.o(bVar));
        C3241d.b bVar2 = C3241d.b.TOP;
        i iVarQ2 = q(c3242e.o(bVar2));
        C3241d.b bVar3 = C3241d.b.RIGHT;
        i iVarQ3 = q(c3242e.o(bVar3));
        C3241d.b bVar4 = C3241d.b.BOTTOM;
        i iVarQ4 = q(c3242e.o(bVar4));
        i iVarQ5 = q(c3242e2.o(bVar));
        i iVarQ6 = q(c3242e2.o(bVar2));
        i iVarQ7 = q(c3242e2.o(bVar3));
        i iVarQ8 = q(c3242e2.o(bVar4));
        C3000b c3000bR = r();
        double d10 = f10;
        double d11 = i10;
        c3000bR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(c3000bR);
        C3000b c3000bR2 = r();
        c3000bR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(c3000bR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        C3000b c3000bR = r();
        c3000bR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            c3000bR.d(this, i12);
        }
        d(c3000bR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(C3000b c3000b) {
        i iVarV;
        if (c3000b == null) {
            return;
        }
        boolean z10 = true;
        if (this.f30382l + 1 >= this.f30383m || this.f30381k + 1 >= this.f30376f) {
            y();
        }
        boolean z11 = false;
        if (!c3000b.f30358f) {
            c3000b.D(this);
            if (c3000b.isEmpty()) {
                return;
            }
            c3000b.r();
            if (c3000b.f(this)) {
                i iVarP = p();
                c3000b.f30353a = iVarP;
                int i10 = this.f30382l;
                l(c3000b);
                if (this.f30382l == i10 + 1) {
                    this.f30387q.c(c3000b);
                    B(this.f30387q, true);
                    if (iVarP.f30405j == -1) {
                        if (c3000b.f30353a == iVarP && (iVarV = c3000b.v(iVarP)) != null) {
                            c3000b.x(iVarV);
                        }
                        if (!c3000b.f30358f) {
                            c3000b.f30353a.s(this, c3000b);
                        }
                        if (f30367v) {
                            this.f30384n.f30359a.release(c3000b);
                        } else {
                            this.f30384n.f30360b.release(c3000b);
                        }
                        this.f30382l--;
                    }
                } else {
                    z10 = false;
                }
                if (!c3000b.s()) {
                    return;
                } else {
                    z11 = z10;
                }
            }
        }
        if (z11) {
            return;
        }
        l(c3000b);
    }

    public C3000b e(i iVar, i iVar2, int i10, int i11) {
        if (f30364s && i11 == 8 && iVar2.f30408m && iVar.f30405j == -1) {
            iVar.q(this, iVar2.f30407l + i10);
            return null;
        }
        C3000b c3000bR = r();
        c3000bR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            c3000bR.d(this, i11);
        }
        d(c3000bR);
        return c3000bR;
    }

    public void f(i iVar, int i10) {
        if (f30364s && iVar.f30405j == -1) {
            float f10 = i10;
            iVar.q(this, f10);
            for (int i11 = 0; i11 < this.f30372b + 1; i11++) {
                i iVar2 = this.f30384n.f30362d[i11];
                if (iVar2 != null && iVar2.f30415t && iVar2.f30416u == iVar.f30404i) {
                    iVar2.q(this, iVar2.f30417v + f10);
                }
            }
            return;
        }
        int i12 = iVar.f30405j;
        if (i12 == -1) {
            C3000b c3000bR = r();
            c3000bR.i(iVar, i10);
            d(c3000bR);
            return;
        }
        C3000b c3000b = this.f30377g[i12];
        if (c3000b.f30358f) {
            c3000b.f30354b = i10;
            return;
        }
        if (c3000b.f30357e.b() == 0) {
            c3000b.f30358f = true;
            c3000b.f30354b = i10;
        } else {
            C3000b c3000bR2 = r();
            c3000bR2.m(iVar, i10);
            d(c3000bR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        C3000b c3000bR = r();
        i iVarT = t();
        iVarT.f30406k = 0;
        c3000bR.o(iVar, iVar2, iVarT, i10);
        d(c3000bR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        C3000b c3000bR = r();
        i iVarT = t();
        iVarT.f30406k = 0;
        c3000bR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(c3000bR, (int) (c3000bR.f30357e.j(iVarT) * (-1.0f)), i11);
        }
        d(c3000bR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        C3000b c3000bR = r();
        i iVarT = t();
        iVarT.f30406k = 0;
        c3000bR.p(iVar, iVar2, iVarT, i10);
        d(c3000bR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        C3000b c3000bR = r();
        i iVarT = t();
        iVarT.f30406k = 0;
        c3000bR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(c3000bR, (int) (c3000bR.f30357e.j(iVarT) * (-1.0f)), i11);
        }
        d(c3000bR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        C3000b c3000bR = r();
        c3000bR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            c3000bR.d(this, i10);
        }
        d(c3000bR);
    }

    void m(C3000b c3000b, int i10, int i11) {
        c3000b.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f30381k + 1 >= this.f30376f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f30372b + 1;
        this.f30372b = i11;
        this.f30381k++;
        iVarA.f30404i = i11;
        iVarA.f30406k = i10;
        this.f30384n.f30362d[i11] = iVarA;
        this.f30374d.a(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f30381k + 1 >= this.f30376f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f30372b + 1;
        this.f30372b = i10;
        this.f30381k++;
        iVarA.f30404i = i10;
        this.f30384n.f30362d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f30381k + 1 >= this.f30376f) {
            y();
        }
        if (obj instanceof C3241d) {
            C3241d c3241d = (C3241d) obj;
            iVarI = c3241d.i();
            if (iVarI == null) {
                c3241d.s(this.f30384n);
                iVarI = c3241d.i();
            }
            int i10 = iVarI.f30404i;
            if (i10 != -1 && i10 <= this.f30372b && this.f30384n.f30362d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.p();
            }
            int i11 = this.f30372b + 1;
            this.f30372b = i11;
            this.f30381k++;
            iVarI.f30404i = i11;
            iVarI.f30411p = i.a.UNRESTRICTED;
            this.f30384n.f30362d[i11] = iVarI;
        }
        return iVarI;
    }

    public C3000b r() {
        C3000b c3000b;
        if (f30367v) {
            c3000b = (C3000b) this.f30384n.f30359a.acquire();
            if (c3000b == null) {
                c3000b = new b(this.f30384n);
                f30370y++;
            } else {
                c3000b.y();
            }
        } else {
            c3000b = (C3000b) this.f30384n.f30360b.acquire();
            if (c3000b == null) {
                c3000b = new C3000b(this.f30384n);
                f30369x++;
            } else {
                c3000b.y();
            }
        }
        i.k();
        return c3000b;
    }

    public i t() {
        if (this.f30381k + 1 >= this.f30376f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f30372b + 1;
        this.f30372b = i10;
        this.f30381k++;
        iVarA.f30404i = i10;
        this.f30384n.f30362d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f30384n;
    }

    public int x(Object obj) {
        i iVarI = ((C3241d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f30407l + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f30374d.isEmpty()) {
            n();
            return;
        }
        if (!this.f30378h && !this.f30379i) {
            A(this.f30374d);
            return;
        }
        for (int i10 = 0; i10 < this.f30382l; i10++) {
            if (!this.f30377g[i10].f30358f) {
                A(this.f30374d);
                return;
            }
        }
        n();
    }
}
