package f8;

import f8.t;
import f8.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m8.AbstractC2942a;
import m8.AbstractC2943b;
import m8.AbstractC2945d;
import m8.AbstractC2950i;
import m8.C2946e;
import m8.C2947f;
import m8.C2948g;
import m8.C2952k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final l f27578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static m8.r f27579s = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f27582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f27583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f27584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f27585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w f27586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f27587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27588q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public l a(C2946e c2946e, C2948g c2948g) {
            return new l(c2946e, c2948g);
        }
    }

    static {
        l lVar = new l(true);
        f27578r = lVar;
        lVar.Y();
    }

    public static l J() {
        return f27578r;
    }

    private void Y() {
        List list = Collections.EMPTY_LIST;
        this.f27582k = list;
        this.f27583l = list;
        this.f27584m = list;
        this.f27585n = t.v();
        this.f27586o = w.t();
    }

    public static b Z() {
        return b.u();
    }

    public static b a0(l lVar) {
        return Z().j(lVar);
    }

    public static l c0(InputStream inputStream, C2948g c2948g) {
        return (l) f27579s.c(inputStream, c2948g);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public l a() {
        return f27578r;
    }

    public i L(int i10) {
        return (i) this.f27582k.get(i10);
    }

    public int M() {
        return this.f27582k.size();
    }

    public List N() {
        return this.f27582k;
    }

    public n O(int i10) {
        return (n) this.f27583l.get(i10);
    }

    public int P() {
        return this.f27583l.size();
    }

    public List Q() {
        return this.f27583l;
    }

    public r R(int i10) {
        return (r) this.f27584m.get(i10);
    }

    public int S() {
        return this.f27584m.size();
    }

    public List T() {
        return this.f27584m;
    }

    public t U() {
        return this.f27585n;
    }

    public w V() {
        return this.f27586o;
    }

    public boolean W() {
        return (this.f27581j & 1) == 1;
    }

    public boolean X() {
        return (this.f27581j & 2) == 2;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27588q;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f27582k.size(); i11++) {
            iR += C2947f.r(3, (m8.p) this.f27582k.get(i11));
        }
        for (int i12 = 0; i12 < this.f27583l.size(); i12++) {
            iR += C2947f.r(4, (m8.p) this.f27583l.get(i12));
        }
        for (int i13 = 0; i13 < this.f27584m.size(); i13++) {
            iR += C2947f.r(5, (m8.p) this.f27584m.get(i13));
        }
        if ((this.f27581j & 1) == 1) {
            iR += C2947f.r(30, this.f27585n);
        }
        if ((this.f27581j & 2) == 2) {
            iR += C2947f.r(32, this.f27586o);
        }
        int iS = iR + s() + this.f27580i.size();
        this.f27588q = iS;
        return iS;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return Z();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return a0(this);
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27587p;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < M(); i10++) {
            if (!L(i10).e()) {
                this.f27587p = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < P(); i11++) {
            if (!O(i11).e()) {
                this.f27587p = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < S(); i12++) {
            if (!R(i12).e()) {
                this.f27587p = (byte) 0;
                return false;
            }
        }
        if (W() && !U().e()) {
            this.f27587p = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27587p = (byte) 1;
            return true;
        }
        this.f27587p = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        for (int i10 = 0; i10 < this.f27582k.size(); i10++) {
            c2947f.c0(3, (m8.p) this.f27582k.get(i10));
        }
        for (int i11 = 0; i11 < this.f27583l.size(); i11++) {
            c2947f.c0(4, (m8.p) this.f27583l.get(i11));
        }
        for (int i12 = 0; i12 < this.f27584m.size(); i12++) {
            c2947f.c0(5, (m8.p) this.f27584m.get(i12));
        }
        if ((this.f27581j & 1) == 1) {
            c2947f.c0(30, this.f27585n);
        }
        if ((this.f27581j & 2) == 2) {
            c2947f.c0(32, this.f27586o);
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27580i);
    }

    private l(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27587p = (byte) -1;
        this.f27588q = -1;
        this.f27580i = cVar.i();
    }

    private l(boolean z10) {
        this.f27587p = (byte) -1;
        this.f27588q = -1;
        this.f27580i = AbstractC2945d.f29639g;
    }

    private l(C2946e c2946e, C2948g c2948g) {
        this.f27587p = (byte) -1;
        this.f27588q = -1;
        Y();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 != 1) {
                                this.f27582k = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.f27582k.add(c2946e.t(i.f27529C, c2948g));
                        } else if (iJ == 34) {
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 != 2) {
                                this.f27583l = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.f27583l.add(c2946e.t(n.f27611C, c2948g));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                t.b bVarF = (this.f27581j & 1) == 1 ? this.f27585n.f() : null;
                                t tVar = (t) c2946e.t(t.f27788o, c2948g);
                                this.f27585n = tVar;
                                if (bVarF != null) {
                                    bVarF.j(tVar);
                                    this.f27585n = bVarF.n();
                                }
                                this.f27581j |= 1;
                            } else if (iJ != 258) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                w.b bVarA = (this.f27581j & 2) == 2 ? this.f27586o.f() : null;
                                w wVar = (w) c2946e.t(w.f27849m, c2948g);
                                this.f27586o = wVar;
                                if (bVarA != null) {
                                    bVarA.j(wVar);
                                    this.f27586o = bVarA.n();
                                }
                                this.f27581j |= 2;
                            }
                        } else {
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 != 4) {
                                this.f27584m = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.f27584m.add(c2946e.t(r.f27737w, c2948g));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f27582k = Collections.unmodifiableList(this.f27582k);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f27583l = Collections.unmodifiableList(this.f27583l);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f27584m = Collections.unmodifiableList(this.f27584m);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27580i = bVarY.m();
                        throw th2;
                    }
                    this.f27580i = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f27582k = Collections.unmodifiableList(this.f27582k);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f27583l = Collections.unmodifiableList(this.f27583l);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f27584m = Collections.unmodifiableList(this.f27584m);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27580i = bVarY.m();
            throw th3;
        }
        this.f27580i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f27590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List f27591l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List f27592m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private t f27593n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private w f27594o;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27590k = list;
            this.f27591l = list;
            this.f27592m = list;
            this.f27593n = t.v();
            this.f27594o = w.t();
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27589j & 1) != 1) {
                this.f27590k = new ArrayList(this.f27590k);
                this.f27589j |= 1;
            }
        }

        private void w() {
            if ((this.f27589j & 2) != 2) {
                this.f27591l = new ArrayList(this.f27591l);
                this.f27589j |= 2;
            }
        }

        private void x() {
            if ((this.f27589j & 4) != 4) {
                this.f27592m = new ArrayList(this.f27592m);
                this.f27589j |= 4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            l lVar = null;
            try {
                try {
                    l lVar2 = (l) l.f27579s.a(c2946e, c2948g);
                    if (lVar2 != null) {
                        j(lVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    l lVar3 = (l) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        lVar = lVar3;
                        if (lVar != null) {
                            j(lVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (lVar != null) {
                }
                throw th;
            }
        }

        public b B(t tVar) {
            if ((this.f27589j & 8) != 8 || this.f27593n == t.v()) {
                this.f27593n = tVar;
            } else {
                this.f27593n = t.D(this.f27593n).j(tVar).n();
            }
            this.f27589j |= 8;
            return this;
        }

        public b C(w wVar) {
            if ((this.f27589j & 16) != 16 || this.f27594o == w.t()) {
                this.f27594o = wVar;
            } else {
                this.f27594o = w.y(this.f27594o).j(wVar).n();
            }
            this.f27589j |= 16;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public l build() {
            l lVarR = r();
            if (lVarR.e()) {
                return lVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(lVarR);
        }

        public l r() {
            l lVar = new l(this);
            int i10 = this.f27589j;
            if ((i10 & 1) == 1) {
                this.f27590k = Collections.unmodifiableList(this.f27590k);
                this.f27589j &= -2;
            }
            lVar.f27582k = this.f27590k;
            if ((this.f27589j & 2) == 2) {
                this.f27591l = Collections.unmodifiableList(this.f27591l);
                this.f27589j &= -3;
            }
            lVar.f27583l = this.f27591l;
            if ((this.f27589j & 4) == 4) {
                this.f27592m = Collections.unmodifiableList(this.f27592m);
                this.f27589j &= -5;
            }
            lVar.f27584m = this.f27592m;
            int i11 = (i10 & 8) != 8 ? 0 : 1;
            lVar.f27585n = this.f27593n;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            lVar.f27586o = this.f27594o;
            lVar.f27581j = i11;
            return lVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b j(l lVar) {
            if (lVar == l.J()) {
                return this;
            }
            if (!lVar.f27582k.isEmpty()) {
                if (this.f27590k.isEmpty()) {
                    this.f27590k = lVar.f27582k;
                    this.f27589j &= -2;
                } else {
                    v();
                    this.f27590k.addAll(lVar.f27582k);
                }
            }
            if (!lVar.f27583l.isEmpty()) {
                if (this.f27591l.isEmpty()) {
                    this.f27591l = lVar.f27583l;
                    this.f27589j &= -3;
                } else {
                    w();
                    this.f27591l.addAll(lVar.f27583l);
                }
            }
            if (!lVar.f27584m.isEmpty()) {
                if (this.f27592m.isEmpty()) {
                    this.f27592m = lVar.f27584m;
                    this.f27589j &= -5;
                } else {
                    x();
                    this.f27592m.addAll(lVar.f27584m);
                }
            }
            if (lVar.W()) {
                B(lVar.U());
            }
            if (lVar.X()) {
                C(lVar.V());
            }
            o(lVar);
            k(i().o(lVar.f27580i));
            return this;
        }

        private void y() {
        }
    }
}
