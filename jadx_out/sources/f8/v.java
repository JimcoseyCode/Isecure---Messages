package f8;

import java.io.IOException;
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
public final class v extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final v f27817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static m8.r f27818s = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f27823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f27826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private byte f27827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27828q;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public v a(C2946e c2946e, C2948g c2948g) {
            return new v(c2946e, c2948g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c implements AbstractC2951j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27839k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27841g;

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
            this.f27841g = i11;
        }

        public static c h(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27841g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d implements AbstractC2951j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27845k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27847g;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements AbstractC2951j.b {
            a() {
            }

            @Override // m8.AbstractC2951j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.h(i10);
            }
        }

        d(int i10, int i11) {
            this.f27847g = i11;
        }

        public static d h(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27847g;
        }
    }

    static {
        v vVar = new v(true);
        f27817r = vVar;
        vVar.L();
    }

    private void L() {
        this.f27821j = 0;
        this.f27822k = 0;
        this.f27823l = c.ERROR;
        this.f27824m = 0;
        this.f27825n = 0;
        this.f27826o = d.LANGUAGE_VERSION;
    }

    public static b M() {
        return b.p();
    }

    public static b N(v vVar) {
        return M().j(vVar);
    }

    public static v y() {
        return f27817r;
    }

    public c A() {
        return this.f27823l;
    }

    public int B() {
        return this.f27825n;
    }

    public int C() {
        return this.f27821j;
    }

    public int D() {
        return this.f27822k;
    }

    public d E() {
        return this.f27826o;
    }

    public boolean F() {
        return (this.f27820i & 8) == 8;
    }

    public boolean G() {
        return (this.f27820i & 4) == 4;
    }

    public boolean H() {
        return (this.f27820i & 16) == 16;
    }

    public boolean I() {
        return (this.f27820i & 1) == 1;
    }

    public boolean J() {
        return (this.f27820i & 2) == 2;
    }

    public boolean K() {
        return (this.f27820i & 32) == 32;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b c() {
        return M();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public b f() {
        return N(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27828q;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27820i & 1) == 1 ? C2947f.o(1, this.f27821j) : 0;
        if ((this.f27820i & 2) == 2) {
            iO += C2947f.o(2, this.f27822k);
        }
        if ((this.f27820i & 4) == 4) {
            iO += C2947f.h(3, this.f27823l.a());
        }
        if ((this.f27820i & 8) == 8) {
            iO += C2947f.o(4, this.f27824m);
        }
        if ((this.f27820i & 16) == 16) {
            iO += C2947f.o(5, this.f27825n);
        }
        if ((this.f27820i & 32) == 32) {
            iO += C2947f.h(6, this.f27826o.a());
        }
        int size = iO + this.f27819h.size();
        this.f27828q = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27827p;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f27827p = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        if ((this.f27820i & 1) == 1) {
            c2947f.Z(1, this.f27821j);
        }
        if ((this.f27820i & 2) == 2) {
            c2947f.Z(2, this.f27822k);
        }
        if ((this.f27820i & 4) == 4) {
            c2947f.R(3, this.f27823l.a());
        }
        if ((this.f27820i & 8) == 8) {
            c2947f.Z(4, this.f27824m);
        }
        if ((this.f27820i & 16) == 16) {
            c2947f.Z(5, this.f27825n);
        }
        if ((this.f27820i & 32) == 32) {
            c2947f.R(6, this.f27826o.a());
        }
        c2947f.h0(this.f27819h);
    }

    public int z() {
        return this.f27824m;
    }

    private v(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27827p = (byte) -1;
        this.f27828q = -1;
        this.f27819h = bVar.i();
    }

    private v(boolean z10) {
        this.f27827p = (byte) -1;
        this.f27828q = -1;
        this.f27819h = AbstractC2945d.f29639g;
    }

    private v(C2946e c2946e, C2948g c2948g) {
        this.f27827p = (byte) -1;
        this.f27828q = -1;
        L();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f27820i |= 1;
                            this.f27821j = c2946e.r();
                        } else if (iJ == 16) {
                            this.f27820i |= 2;
                            this.f27822k = c2946e.r();
                        } else if (iJ == 24) {
                            int iM = c2946e.m();
                            c cVarH = c.h(iM);
                            if (cVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM);
                            } else {
                                this.f27820i |= 4;
                                this.f27823l = cVarH;
                            }
                        } else if (iJ == 32) {
                            this.f27820i |= 8;
                            this.f27824m = c2946e.r();
                        } else if (iJ == 40) {
                            this.f27820i |= 16;
                            this.f27825n = c2946e.r();
                        } else if (iJ != 48) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            int iM2 = c2946e.m();
                            d dVarH = d.h(iM2);
                            if (dVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM2);
                            } else {
                                this.f27820i |= 32;
                                this.f27826o = dVarH;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27819h = bVarY.m();
                        throw th2;
                    }
                    this.f27819h = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27819h = bVarY.m();
            throw th3;
        }
        this.f27819h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27829h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27830i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27831j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27833l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27834m;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f27832k = c.ERROR;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private d f27835n = d.LANGUAGE_VERSION;

        private b() {
            q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public v build() {
            v vVarN = n();
            if (vVarN.e()) {
                return vVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(vVarN);
        }

        public v n() {
            v vVar = new v(this);
            int i10 = this.f27829h;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            vVar.f27821j = this.f27830i;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            vVar.f27822k = this.f27831j;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            vVar.f27823l = this.f27832k;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            vVar.f27824m = this.f27833l;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            vVar.f27825n = this.f27834m;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            vVar.f27826o = this.f27835n;
            vVar.f27820i = i11;
            return vVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b j(v vVar) {
            if (vVar == v.y()) {
                return this;
            }
            if (vVar.I()) {
                x(vVar.C());
            }
            if (vVar.J()) {
                y(vVar.D());
            }
            if (vVar.G()) {
                v(vVar.A());
            }
            if (vVar.F()) {
                u(vVar.z());
            }
            if (vVar.H()) {
                w(vVar.B());
            }
            if (vVar.K()) {
                z(vVar.E());
            }
            k(i().o(vVar.f27819h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            v vVar = null;
            try {
                try {
                    v vVar2 = (v) v.f27818s.a(c2946e, c2948g);
                    if (vVar2 != null) {
                        j(vVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    v vVar3 = (v) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        vVar = vVar3;
                        if (vVar != null) {
                            j(vVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (vVar != null) {
                }
                throw th;
            }
        }

        public b u(int i10) {
            this.f27829h |= 8;
            this.f27833l = i10;
            return this;
        }

        public b v(c cVar) {
            cVar.getClass();
            this.f27829h |= 4;
            this.f27832k = cVar;
            return this;
        }

        public b w(int i10) {
            this.f27829h |= 16;
            this.f27834m = i10;
            return this;
        }

        public b x(int i10) {
            this.f27829h |= 1;
            this.f27830i = i10;
            return this;
        }

        public b y(int i10) {
            this.f27829h |= 2;
            this.f27831j = i10;
            return this;
        }

        public b z(d dVar) {
            dVar.getClass();
            this.f27829h |= 32;
            this.f27835n = dVar;
            return this;
        }

        private void q() {
        }
    }
}
