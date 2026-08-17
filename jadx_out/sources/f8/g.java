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

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final g f27492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static m8.r f27493o = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f27497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27498m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g a(C2946e c2946e, C2948g c2948g) {
            return new g(c2946e, c2948g);
        }
    }

    static {
        g gVar = new g(true);
        f27492n = gVar;
        gVar.G();
    }

    public static g C() {
        return f27492n;
    }

    private void G() {
        this.f27496k = 0;
    }

    public static b H() {
        return b.u();
    }

    public static b I(g gVar) {
        return H().j(gVar);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public g a() {
        return f27492n;
    }

    public int E() {
        return this.f27496k;
    }

    public boolean F() {
        return (this.f27495j & 1) == 1;
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
        int i10 = this.f27498m;
        if (i10 != -1) {
            return i10;
        }
        int iO = ((this.f27495j & 1) == 1 ? C2947f.o(1, this.f27496k) : 0) + s() + this.f27494i.size();
        this.f27498m = iO;
        return iO;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27497l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (r()) {
            this.f27497l = (byte) 1;
            return true;
        }
        this.f27497l = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27495j & 1) == 1) {
            c2947f.Z(1, this.f27496k);
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27494i);
    }

    private g(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27497l = (byte) -1;
        this.f27498m = -1;
        this.f27494i = cVar.i();
    }

    private g(boolean z10) {
        this.f27497l = (byte) -1;
        this.f27498m = -1;
        this.f27494i = AbstractC2945d.f29639g;
    }

    private g(C2946e c2946e, C2948g c2948g) {
        this.f27497l = (byte) -1;
        this.f27498m = -1;
        G();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iJ = c2946e.J();
                        if (iJ != 0) {
                            if (iJ != 8) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                this.f27495j |= 1;
                                this.f27496k = c2946e.r();
                            }
                        }
                        z10 = true;
                    } catch (C2952k e10) {
                        throw e10.i(this);
                    }
                } catch (IOException e11) {
                    throw new C2952k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27494i = bVarY.m();
                    throw th2;
                }
                this.f27494i = bVarY.m();
                l();
                throw th;
            }
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27494i = bVarY.m();
            throw th3;
        }
        this.f27494i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27500k;

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarR = r();
            if (gVarR.e()) {
                return gVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(gVarR);
        }

        public g r() {
            g gVar = new g(this);
            int i10 = (this.f27499j & 1) != 1 ? 0 : 1;
            gVar.f27496k = this.f27500k;
            gVar.f27495j = i10;
            return gVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b j(g gVar) {
            if (gVar == g.C()) {
                return this;
            }
            if (gVar.F()) {
                y(gVar.E());
            }
            o(gVar);
            k(i().o(gVar.f27494i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            g gVar = null;
            try {
                try {
                    g gVar2 = (g) g.f27493o.a(c2946e, c2948g);
                    if (gVar2 != null) {
                        j(gVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    g gVar3 = (g) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        gVar = gVar3;
                        if (gVar != null) {
                            j(gVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (gVar != null) {
                }
                throw th;
            }
        }

        public b y(int i10) {
            this.f27499j |= 1;
            this.f27500k = i10;
            return this;
        }

        private void v() {
        }
    }
}
