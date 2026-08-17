package f8;

import f8.h;
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
public final class f extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final f f27465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static m8.r f27466q = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f27469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f27470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h f27471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f27472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f27473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27474o;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f a(C2946e c2946e, C2948g c2948g) {
            return new f(c2946e, c2948g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c implements AbstractC2951j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27483k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27485g;

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
            this.f27485g = i11;
        }

        public static c h(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27485g;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum d implements AbstractC2951j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27489k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27491g;

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
            this.f27491g = i11;
        }

        public static d h(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27491g;
        }
    }

    static {
        f fVar = new f(true);
        f27465p = fVar;
        fVar.G();
    }

    private void G() {
        this.f27469j = c.RETURNS_CONSTANT;
        this.f27470k = Collections.EMPTY_LIST;
        this.f27471l = h.E();
        this.f27472m = d.AT_MOST_ONCE;
    }

    public static b H() {
        return b.p();
    }

    public static b I(f fVar) {
        return H().j(fVar);
    }

    public static f y() {
        return f27465p;
    }

    public int A() {
        return this.f27470k.size();
    }

    public c B() {
        return this.f27469j;
    }

    public d C() {
        return this.f27472m;
    }

    public boolean D() {
        return (this.f27468i & 2) == 2;
    }

    public boolean E() {
        return (this.f27468i & 1) == 1;
    }

    public boolean F() {
        return (this.f27468i & 4) == 4;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b c() {
        return H();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b f() {
        return I(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27474o;
        if (i10 != -1) {
            return i10;
        }
        int iH = (this.f27468i & 1) == 1 ? C2947f.h(1, this.f27469j.a()) : 0;
        for (int i11 = 0; i11 < this.f27470k.size(); i11++) {
            iH += C2947f.r(2, (m8.p) this.f27470k.get(i11));
        }
        if ((this.f27468i & 2) == 2) {
            iH += C2947f.r(3, this.f27471l);
        }
        if ((this.f27468i & 4) == 4) {
            iH += C2947f.h(4, this.f27472m.a());
        }
        int size = iH + this.f27467h.size();
        this.f27474o = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27473n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < A(); i10++) {
            if (!z(i10).e()) {
                this.f27473n = (byte) 0;
                return false;
            }
        }
        if (!D() || x().e()) {
            this.f27473n = (byte) 1;
            return true;
        }
        this.f27473n = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        if ((this.f27468i & 1) == 1) {
            c2947f.R(1, this.f27469j.a());
        }
        for (int i10 = 0; i10 < this.f27470k.size(); i10++) {
            c2947f.c0(2, (m8.p) this.f27470k.get(i10));
        }
        if ((this.f27468i & 2) == 2) {
            c2947f.c0(3, this.f27471l);
        }
        if ((this.f27468i & 4) == 4) {
            c2947f.R(4, this.f27472m.a());
        }
        c2947f.h0(this.f27467h);
    }

    public h x() {
        return this.f27471l;
    }

    public h z(int i10) {
        return (h) this.f27470k.get(i10);
    }

    private f(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27473n = (byte) -1;
        this.f27474o = -1;
        this.f27467h = bVar.i();
    }

    private f(boolean z10) {
        this.f27473n = (byte) -1;
        this.f27474o = -1;
        this.f27467h = AbstractC2945d.f29639g;
    }

    private f(C2946e c2946e, C2948g c2948g) {
        this.f27473n = (byte) -1;
        this.f27474o = -1;
        G();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            int iM = c2946e.m();
                            c cVarH = c.h(iM);
                            if (cVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM);
                            } else {
                                this.f27468i |= 1;
                                this.f27469j = cVarH;
                            }
                        } else if (iJ == 18) {
                            if ((c10 & 2) != 2) {
                                this.f27470k = new ArrayList();
                                c10 = 2;
                            }
                            this.f27470k.add(c2946e.t(h.f27502t, c2948g));
                        } else if (iJ == 26) {
                            h.b bVarF = (this.f27468i & 2) == 2 ? this.f27471l.f() : null;
                            h hVar = (h) c2946e.t(h.f27502t, c2948g);
                            this.f27471l = hVar;
                            if (bVarF != null) {
                                bVarF.j(hVar);
                                this.f27471l = bVarF.n();
                            }
                            this.f27468i |= 2;
                        } else if (iJ != 32) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            int iM2 = c2946e.m();
                            d dVarH = d.h(iM2);
                            if (dVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM2);
                            } else {
                                this.f27468i |= 4;
                                this.f27472m = dVarH;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f27470k = Collections.unmodifiableList(this.f27470k);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27467h = bVarY.m();
                        throw th2;
                    }
                    this.f27467h = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        if ((c10 & 2) == 2) {
            this.f27470k = Collections.unmodifiableList(this.f27470k);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27467h = bVarY.m();
            throw th3;
        }
        this.f27467h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27475h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f27476i = c.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f27477j = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private h f27478k = h.E();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private d f27479l = d.AT_MOST_ONCE;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27475h & 2) != 2) {
                this.f27477j = new ArrayList(this.f27477j);
                this.f27475h |= 2;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarN = n();
            if (fVarN.e()) {
                return fVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(fVarN);
        }

        public f n() {
            f fVar = new f(this);
            int i10 = this.f27475h;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            fVar.f27469j = this.f27476i;
            if ((this.f27475h & 2) == 2) {
                this.f27477j = Collections.unmodifiableList(this.f27477j);
                this.f27475h &= -3;
            }
            fVar.f27470k = this.f27477j;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            fVar.f27471l = this.f27478k;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            fVar.f27472m = this.f27479l;
            fVar.f27468i = i11;
            return fVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        public b t(h hVar) {
            if ((this.f27475h & 4) != 4 || this.f27478k == h.E()) {
                this.f27478k = hVar;
            } else {
                this.f27478k = h.S(this.f27478k).j(hVar).n();
            }
            this.f27475h |= 4;
            return this;
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b j(f fVar) {
            if (fVar == f.y()) {
                return this;
            }
            if (fVar.E()) {
                w(fVar.B());
            }
            if (!fVar.f27470k.isEmpty()) {
                if (this.f27477j.isEmpty()) {
                    this.f27477j = fVar.f27470k;
                    this.f27475h &= -3;
                } else {
                    q();
                    this.f27477j.addAll(fVar.f27470k);
                }
            }
            if (fVar.D()) {
                t(fVar.x());
            }
            if (fVar.F()) {
                x(fVar.C());
            }
            k(i().o(fVar.f27467h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            f fVar = null;
            try {
                try {
                    f fVar2 = (f) f.f27466q.a(c2946e, c2948g);
                    if (fVar2 != null) {
                        j(fVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    f fVar3 = (f) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        fVar = fVar3;
                        if (fVar != null) {
                            j(fVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fVar != null) {
                }
                throw th;
            }
        }

        public b w(c cVar) {
            cVar.getClass();
            this.f27475h |= 1;
            this.f27476i = cVar;
            return this;
        }

        public b x(d dVar) {
            dVar.getClass();
            this.f27475h |= 8;
            this.f27479l = dVar;
            return this;
        }

        private void r() {
        }
    }
}
