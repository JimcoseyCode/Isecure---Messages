package f8;

import java.io.IOException;
import m8.AbstractC2942a;
import m8.AbstractC2943b;
import m8.AbstractC2945d;
import m8.AbstractC2950i;
import m8.C2946e;
import m8.C2947f;
import m8.C2948g;
import m8.C2952k;
import m8.C2954m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p f27673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m8.r f27674m = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m8.n f27676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f27677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27678k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p a(C2946e c2946e, C2948g c2948g) {
            return new p(c2946e, c2948g);
        }
    }

    static {
        p pVar = new p(true);
        f27673l = pVar;
        pVar.w();
    }

    public static p t() {
        return f27673l;
    }

    private void w() {
        this.f27676i = C2954m.f29698h;
    }

    public static b x() {
        return b.p();
    }

    public static b y(p pVar) {
        return x().j(pVar);
    }

    @Override // m8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b f() {
        return y(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27678k;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f27676i.size(); i11++) {
            iE += C2947f.e(this.f27676i.j(i11));
        }
        int size = iE + v().size() + this.f27675h.size();
        this.f27678k = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27677j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f27677j = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f27676i.size(); i10++) {
            c2947f.N(1, this.f27676i.j(i10));
        }
        c2947f.h0(this.f27675h);
    }

    public String u(int i10) {
        return (String) this.f27676i.get(i10);
    }

    public m8.s v() {
        return this.f27676i;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b c() {
        return x();
    }

    private p(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27677j = (byte) -1;
        this.f27678k = -1;
        this.f27675h = bVar.i();
    }

    private p(boolean z10) {
        this.f27677j = (byte) -1;
        this.f27678k = -1;
        this.f27675h = AbstractC2945d.f29639g;
    }

    private p(C2946e c2946e, C2948g c2948g) {
        this.f27677j = (byte) -1;
        this.f27678k = -1;
        w();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            AbstractC2945d abstractC2945dK = c2946e.k();
                            if (!z11) {
                                this.f27676i = new C2954m();
                                z11 = true;
                            }
                            this.f27676i.i(abstractC2945dK);
                        }
                    }
                    z10 = true;
                } catch (C2952k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C2952k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z11) {
                    this.f27676i = this.f27676i.k();
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27675h = bVarY.m();
                    throw th2;
                }
                this.f27675h = bVarY.m();
                l();
                throw th;
            }
        }
        if (z11) {
            this.f27676i = this.f27676i.k();
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27675h = bVarY.m();
            throw th3;
        }
        this.f27675h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27679h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private m8.n f27680i = C2954m.f29698h;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27679h & 1) != 1) {
                this.f27680i = new C2954m(this.f27680i);
                this.f27679h |= 1;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public p build() {
            p pVarN = n();
            if (pVarN.e()) {
                return pVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(pVarN);
        }

        public p n() {
            p pVar = new p(this);
            if ((this.f27679h & 1) == 1) {
                this.f27680i = this.f27680i.k();
                this.f27679h &= -2;
            }
            pVar.f27676i = this.f27680i;
            return pVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(p pVar) {
            if (pVar == p.t()) {
                return this;
            }
            if (!pVar.f27676i.isEmpty()) {
                if (this.f27680i.isEmpty()) {
                    this.f27680i = pVar.f27676i;
                    this.f27679h &= -2;
                } else {
                    q();
                    this.f27680i.addAll(pVar.f27676i);
                }
            }
            k(i().o(pVar.f27675h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            p pVar = null;
            try {
                try {
                    p pVar2 = (p) p.f27674m.a(c2946e, c2948g);
                    if (pVar2 != null) {
                        j(pVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    p pVar3 = (p) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        pVar = pVar3;
                        if (pVar != null) {
                            j(pVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (pVar != null) {
                }
                throw th;
            }
        }

        private void r() {
        }
    }
}
