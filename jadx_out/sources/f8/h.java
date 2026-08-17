package f8;

import f8.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m8.AbstractC2942a;
import m8.AbstractC2943b;
import m8.AbstractC2945d;
import m8.AbstractC2950i;
import m8.AbstractC2951j;
import m8.C2946e;
import m8.C2947f;
import m8.C2948g;
import m8.C2952k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h f27501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static m8.r f27502t = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f27507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f27508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f27510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f27511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte f27512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27513r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public h a(C2946e c2946e, C2948g c2948g) {
            return new h(c2946e, c2948g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c implements AbstractC2951j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27525k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27527g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements AbstractC2951j.b {
            a() {
            }

            @Override // m8.AbstractC2951j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.h(i10);
            }
        }

        c(int i10, int i11) {
            this.f27527g = i11;
        }

        public static c h(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27527g;
        }
    }

    static {
        h hVar = new h(true);
        f27501s = hVar;
        hVar.Q();
    }

    public static h E() {
        return f27501s;
    }

    private void Q() {
        this.f27505j = 0;
        this.f27506k = 0;
        this.f27507l = c.TRUE;
        this.f27508m = q.W();
        this.f27509n = 0;
        List list = Collections.EMPTY_LIST;
        this.f27510o = list;
        this.f27511p = list;
    }

    public static b R() {
        return b.p();
    }

    public static b S(h hVar) {
        return R().j(hVar);
    }

    public h B(int i10) {
        return (h) this.f27510o.get(i10);
    }

    public int C() {
        return this.f27510o.size();
    }

    public c D() {
        return this.f27507l;
    }

    public int F() {
        return this.f27505j;
    }

    public q G() {
        return this.f27508m;
    }

    public int H() {
        return this.f27509n;
    }

    public h I(int i10) {
        return (h) this.f27511p.get(i10);
    }

    public int J() {
        return this.f27511p.size();
    }

    public int K() {
        return this.f27506k;
    }

    public boolean L() {
        return (this.f27504i & 4) == 4;
    }

    public boolean M() {
        return (this.f27504i & 1) == 1;
    }

    public boolean N() {
        return (this.f27504i & 8) == 8;
    }

    public boolean O() {
        return (this.f27504i & 16) == 16;
    }

    public boolean P() {
        return (this.f27504i & 2) == 2;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public b c() {
        return R();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b f() {
        return S(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27513r;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27504i & 1) == 1 ? C2947f.o(1, this.f27505j) : 0;
        if ((this.f27504i & 2) == 2) {
            iO += C2947f.o(2, this.f27506k);
        }
        if ((this.f27504i & 4) == 4) {
            iO += C2947f.h(3, this.f27507l.a());
        }
        if ((this.f27504i & 8) == 8) {
            iO += C2947f.r(4, this.f27508m);
        }
        if ((this.f27504i & 16) == 16) {
            iO += C2947f.o(5, this.f27509n);
        }
        for (int i11 = 0; i11 < this.f27510o.size(); i11++) {
            iO += C2947f.r(6, (m8.p) this.f27510o.get(i11));
        }
        for (int i12 = 0; i12 < this.f27511p.size(); i12++) {
            iO += C2947f.r(7, (m8.p) this.f27511p.get(i12));
        }
        int size = iO + this.f27503h.size();
        this.f27513r = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27512q;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (N() && !G().e()) {
            this.f27512q = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < C(); i10++) {
            if (!B(i10).e()) {
                this.f27512q = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < J(); i11++) {
            if (!I(i11).e()) {
                this.f27512q = (byte) 0;
                return false;
            }
        }
        this.f27512q = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        if ((this.f27504i & 1) == 1) {
            c2947f.Z(1, this.f27505j);
        }
        if ((this.f27504i & 2) == 2) {
            c2947f.Z(2, this.f27506k);
        }
        if ((this.f27504i & 4) == 4) {
            c2947f.R(3, this.f27507l.a());
        }
        if ((this.f27504i & 8) == 8) {
            c2947f.c0(4, this.f27508m);
        }
        if ((this.f27504i & 16) == 16) {
            c2947f.Z(5, this.f27509n);
        }
        for (int i10 = 0; i10 < this.f27510o.size(); i10++) {
            c2947f.c0(6, (m8.p) this.f27510o.get(i10));
        }
        for (int i11 = 0; i11 < this.f27511p.size(); i11++) {
            c2947f.c0(7, (m8.p) this.f27511p.get(i11));
        }
        c2947f.h0(this.f27503h);
    }

    private h(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27512q = (byte) -1;
        this.f27513r = -1;
        this.f27503h = bVar.i();
    }

    private h(boolean z10) {
        this.f27512q = (byte) -1;
        this.f27513r = -1;
        this.f27503h = AbstractC2945d.f29639g;
    }

    private h(C2946e c2946e, C2948g c2948g) {
        this.f27512q = (byte) -1;
        this.f27513r = -1;
        Q();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f27504i |= 1;
                            this.f27505j = c2946e.r();
                        } else if (iJ == 16) {
                            this.f27504i |= 2;
                            this.f27506k = c2946e.r();
                        } else if (iJ == 24) {
                            int iM = c2946e.m();
                            c cVarH = c.h(iM);
                            if (cVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM);
                            } else {
                                this.f27504i |= 4;
                                this.f27507l = cVarH;
                            }
                        } else if (iJ == 34) {
                            q.c cVarF = (this.f27504i & 8) == 8 ? this.f27508m.f() : null;
                            q qVar = (q) c2946e.t(q.f27682B, c2948g);
                            this.f27508m = qVar;
                            if (cVarF != null) {
                                cVarF.j(qVar);
                                this.f27508m = cVarF.r();
                            }
                            this.f27504i |= 8;
                        } else if (iJ == 40) {
                            this.f27504i |= 16;
                            this.f27509n = c2946e.r();
                        } else if (iJ == 50) {
                            if ((i10 & 32) != 32) {
                                this.f27510o = new ArrayList();
                                i10 |= 32;
                            }
                            this.f27510o.add(c2946e.t(f27502t, c2948g));
                        } else if (iJ != 58) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            if ((i10 & 64) != 64) {
                                this.f27511p = new ArrayList();
                                i10 |= 64;
                            }
                            this.f27511p.add(c2946e.t(f27502t, c2948g));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((i10 & 32) == 32) {
                        this.f27510o = Collections.unmodifiableList(this.f27510o);
                    }
                    if ((i10 & 64) == 64) {
                        this.f27511p = Collections.unmodifiableList(this.f27511p);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27503h = bVarY.m();
                        throw th2;
                    }
                    this.f27503h = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        if ((i10 & 32) == 32) {
            this.f27510o = Collections.unmodifiableList(this.f27510o);
        }
        if ((i10 & 64) == 64) {
            this.f27511p = Collections.unmodifiableList(this.f27511p);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27503h = bVarY.m();
            throw th3;
        }
        this.f27503h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27514h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27515i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f27517k = c.TRUE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private q f27518l = q.W();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27519m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f27520n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List f27521o;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27520n = list;
            this.f27521o = list;
            t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27514h & 32) != 32) {
                this.f27520n = new ArrayList(this.f27520n);
                this.f27514h |= 32;
            }
        }

        private void r() {
            if ((this.f27514h & 64) != 64) {
                this.f27521o = new ArrayList(this.f27521o);
                this.f27514h |= 64;
            }
        }

        public b A(int i10) {
            this.f27514h |= 2;
            this.f27516j = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public h build() {
            h hVarN = n();
            if (hVarN.e()) {
                return hVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(hVarN);
        }

        public h n() {
            h hVar = new h(this);
            int i10 = this.f27514h;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            hVar.f27505j = this.f27515i;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            hVar.f27506k = this.f27516j;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            hVar.f27507l = this.f27517k;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            hVar.f27508m = this.f27518l;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            hVar.f27509n = this.f27519m;
            if ((this.f27514h & 32) == 32) {
                this.f27520n = Collections.unmodifiableList(this.f27520n);
                this.f27514h &= -33;
            }
            hVar.f27510o = this.f27520n;
            if ((this.f27514h & 64) == 64) {
                this.f27521o = Collections.unmodifiableList(this.f27521o);
                this.f27514h &= -65;
            }
            hVar.f27511p = this.f27521o;
            hVar.f27504i = i11;
            return hVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(h hVar) {
            if (hVar == h.E()) {
                return this;
            }
            if (hVar.M()) {
                y(hVar.F());
            }
            if (hVar.P()) {
                A(hVar.K());
            }
            if (hVar.L()) {
                x(hVar.D());
            }
            if (hVar.N()) {
                w(hVar.G());
            }
            if (hVar.O()) {
                z(hVar.H());
            }
            if (!hVar.f27510o.isEmpty()) {
                if (this.f27520n.isEmpty()) {
                    this.f27520n = hVar.f27510o;
                    this.f27514h &= -33;
                } else {
                    q();
                    this.f27520n.addAll(hVar.f27510o);
                }
            }
            if (!hVar.f27511p.isEmpty()) {
                if (this.f27521o.isEmpty()) {
                    this.f27521o = hVar.f27511p;
                    this.f27514h &= -65;
                } else {
                    r();
                    this.f27521o.addAll(hVar.f27511p);
                }
            }
            k(i().o(hVar.f27503h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            h hVar = null;
            try {
                try {
                    h hVar2 = (h) h.f27502t.a(c2946e, c2948g);
                    if (hVar2 != null) {
                        j(hVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    h hVar3 = (h) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        hVar = hVar3;
                        if (hVar != null) {
                            j(hVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (hVar != null) {
                }
                throw th;
            }
        }

        public b w(q qVar) {
            if ((this.f27514h & 8) != 8 || this.f27518l == q.W()) {
                this.f27518l = qVar;
            } else {
                this.f27518l = q.y0(this.f27518l).j(qVar).r();
            }
            this.f27514h |= 8;
            return this;
        }

        public b x(c cVar) {
            cVar.getClass();
            this.f27514h |= 4;
            this.f27517k = cVar;
            return this;
        }

        public b y(int i10) {
            this.f27514h |= 1;
            this.f27515i = i10;
            return this;
        }

        public b z(int i10) {
            this.f27514h |= 16;
            this.f27519m = i10;
            return this;
        }

        private void t() {
        }
    }
}
