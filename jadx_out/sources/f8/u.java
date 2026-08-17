package f8;

import f8.q;
import java.io.IOException;
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
public final class u extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final u f27798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static m8.r f27799t = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f27804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private q f27806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte f27808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27809r;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u a(C2946e c2946e, C2948g c2948g) {
            return new u(c2946e, c2948g);
        }
    }

    static {
        u uVar = new u(true);
        f27798s = uVar;
        uVar.V();
    }

    public static u H() {
        return f27798s;
    }

    private void V() {
        this.f27802k = 0;
        this.f27803l = 0;
        this.f27804m = q.W();
        this.f27805n = 0;
        this.f27806o = q.W();
        this.f27807p = 0;
    }

    public static b W() {
        return b.u();
    }

    public static b X(u uVar) {
        return W().j(uVar);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public u a() {
        return f27798s;
    }

    public int J() {
        return this.f27802k;
    }

    public int K() {
        return this.f27803l;
    }

    public q L() {
        return this.f27804m;
    }

    public int M() {
        return this.f27805n;
    }

    public q N() {
        return this.f27806o;
    }

    public int O() {
        return this.f27807p;
    }

    public boolean P() {
        return (this.f27801j & 1) == 1;
    }

    public boolean Q() {
        return (this.f27801j & 2) == 2;
    }

    public boolean R() {
        return (this.f27801j & 4) == 4;
    }

    public boolean S() {
        return (this.f27801j & 8) == 8;
    }

    public boolean T() {
        return (this.f27801j & 16) == 16;
    }

    public boolean U() {
        return (this.f27801j & 32) == 32;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b c() {
        return W();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b f() {
        return X(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27809r;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27801j & 1) == 1 ? C2947f.o(1, this.f27802k) : 0;
        if ((this.f27801j & 2) == 2) {
            iO += C2947f.o(2, this.f27803l);
        }
        if ((this.f27801j & 4) == 4) {
            iO += C2947f.r(3, this.f27804m);
        }
        if ((this.f27801j & 16) == 16) {
            iO += C2947f.r(4, this.f27806o);
        }
        if ((this.f27801j & 8) == 8) {
            iO += C2947f.o(5, this.f27805n);
        }
        if ((this.f27801j & 32) == 32) {
            iO += C2947f.o(6, this.f27807p);
        }
        int iS = iO + s() + this.f27800i.size();
        this.f27809r = iS;
        return iS;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27808q;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!Q()) {
            this.f27808q = (byte) 0;
            return false;
        }
        if (R() && !L().e()) {
            this.f27808q = (byte) 0;
            return false;
        }
        if (T() && !N().e()) {
            this.f27808q = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27808q = (byte) 1;
            return true;
        }
        this.f27808q = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27801j & 1) == 1) {
            c2947f.Z(1, this.f27802k);
        }
        if ((this.f27801j & 2) == 2) {
            c2947f.Z(2, this.f27803l);
        }
        if ((this.f27801j & 4) == 4) {
            c2947f.c0(3, this.f27804m);
        }
        if ((this.f27801j & 16) == 16) {
            c2947f.c0(4, this.f27806o);
        }
        if ((this.f27801j & 8) == 8) {
            c2947f.Z(5, this.f27805n);
        }
        if ((this.f27801j & 32) == 32) {
            c2947f.Z(6, this.f27807p);
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27800i);
    }

    private u(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27808q = (byte) -1;
        this.f27809r = -1;
        this.f27800i = cVar.i();
    }

    private u(boolean z10) {
        this.f27808q = (byte) -1;
        this.f27809r = -1;
        this.f27800i = AbstractC2945d.f29639g;
    }

    private u(C2946e c2946e, C2948g c2948g) {
        q.c cVarF;
        this.f27808q = (byte) -1;
        this.f27809r = -1;
        V();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f27801j |= 1;
                            this.f27802k = c2946e.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                cVarF = (this.f27801j & 4) == 4 ? this.f27804m.f() : null;
                                q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27804m = qVar;
                                if (cVarF != null) {
                                    cVarF.j(qVar);
                                    this.f27804m = cVarF.r();
                                }
                                this.f27801j |= 4;
                            } else if (iJ == 34) {
                                cVarF = (this.f27801j & 16) == 16 ? this.f27806o.f() : null;
                                q qVar2 = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27806o = qVar2;
                                if (cVarF != null) {
                                    cVarF.j(qVar2);
                                    this.f27806o = cVarF.r();
                                }
                                this.f27801j |= 16;
                            } else if (iJ == 40) {
                                this.f27801j |= 8;
                                this.f27805n = c2946e.r();
                            } else if (iJ != 48) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                this.f27801j |= 32;
                                this.f27807p = c2946e.r();
                            }
                        } else {
                            this.f27801j |= 2;
                            this.f27803l = c2946e.r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27800i = bVarY.m();
                        throw th2;
                    }
                    this.f27800i = bVarY.m();
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
            this.f27800i = bVarY.m();
            throw th3;
        }
        this.f27800i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27812l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f27814n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f27816p;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private q f27813m = q.W();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private q f27815o = q.W();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        public b A(int i10) {
            this.f27810j |= 1;
            this.f27811k = i10;
            return this;
        }

        public b B(int i10) {
            this.f27810j |= 2;
            this.f27812l = i10;
            return this;
        }

        public b C(int i10) {
            this.f27810j |= 8;
            this.f27814n = i10;
            return this;
        }

        public b D(int i10) {
            this.f27810j |= 32;
            this.f27816p = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarR = r();
            if (uVarR.e()) {
                return uVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(uVarR);
        }

        public u r() {
            u uVar = new u(this);
            int i10 = this.f27810j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            uVar.f27802k = this.f27811k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            uVar.f27803l = this.f27812l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            uVar.f27804m = this.f27813m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            uVar.f27805n = this.f27814n;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            uVar.f27806o = this.f27815o;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            uVar.f27807p = this.f27816p;
            uVar.f27801j = i11;
            return uVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b j(u uVar) {
            if (uVar == u.H()) {
                return this;
            }
            if (uVar.P()) {
                A(uVar.J());
            }
            if (uVar.Q()) {
                B(uVar.K());
            }
            if (uVar.R()) {
                y(uVar.L());
            }
            if (uVar.S()) {
                C(uVar.M());
            }
            if (uVar.T()) {
                z(uVar.N());
            }
            if (uVar.U()) {
                D(uVar.O());
            }
            o(uVar);
            k(i().o(uVar.f27800i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            u uVar = null;
            try {
                try {
                    u uVar2 = (u) u.f27799t.a(c2946e, c2948g);
                    if (uVar2 != null) {
                        j(uVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    u uVar3 = (u) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        uVar = uVar3;
                        if (uVar != null) {
                            j(uVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (uVar != null) {
                }
                throw th;
            }
        }

        public b y(q qVar) {
            if ((this.f27810j & 4) != 4 || this.f27813m == q.W()) {
                this.f27813m = qVar;
            } else {
                this.f27813m = q.y0(this.f27813m).j(qVar).r();
            }
            this.f27810j |= 4;
            return this;
        }

        public b z(q qVar) {
            if ((this.f27810j & 16) != 16 || this.f27815o == q.W()) {
                this.f27815o = qVar;
            } else {
                this.f27815o = q.y0(this.f27815o).j(qVar).r();
            }
            this.f27810j |= 16;
            return this;
        }

        private void v() {
        }
    }
}
