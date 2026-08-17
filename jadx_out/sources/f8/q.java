package f8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
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
public final class q extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final q f27681A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static m8.r f27682B = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f27685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f27688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f27694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private q f27696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private byte f27699y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f27700z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public q a(C2946e c2946e, C2948g c2948g) {
            return new q(c2946e, c2948g);
        }
    }

    static {
        q qVar = new q(true);
        f27681A = qVar;
        qVar.w0();
    }

    public static q W() {
        return f27681A;
    }

    private void w0() {
        this.f27685k = Collections.EMPTY_LIST;
        this.f27686l = false;
        this.f27687m = 0;
        this.f27688n = W();
        this.f27689o = 0;
        this.f27690p = 0;
        this.f27691q = 0;
        this.f27692r = 0;
        this.f27693s = 0;
        this.f27694t = W();
        this.f27695u = 0;
        this.f27696v = W();
        this.f27697w = 0;
        this.f27698x = 0;
    }

    public static c x0() {
        return c.u();
    }

    public static c y0(q qVar) {
        return x0().j(qVar);
    }

    @Override // m8.p
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public c f() {
        return y0(this);
    }

    public q Q() {
        return this.f27696v;
    }

    public int R() {
        return this.f27697w;
    }

    public b S(int i10) {
        return (b) this.f27685k.get(i10);
    }

    public int T() {
        return this.f27685k.size();
    }

    public List U() {
        return this.f27685k;
    }

    public int V() {
        return this.f27690p;
    }

    @Override // m8.q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public q a() {
        return f27681A;
    }

    public int Y() {
        return this.f27698x;
    }

    public int Z() {
        return this.f27687m;
    }

    public q a0() {
        return this.f27688n;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27700z;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27684j & 4096) == 4096 ? C2947f.o(1, this.f27698x) : 0;
        for (int i11 = 0; i11 < this.f27685k.size(); i11++) {
            iO += C2947f.r(2, (m8.p) this.f27685k.get(i11));
        }
        if ((this.f27684j & 1) == 1) {
            iO += C2947f.a(3, this.f27686l);
        }
        if ((this.f27684j & 2) == 2) {
            iO += C2947f.o(4, this.f27687m);
        }
        if ((this.f27684j & 4) == 4) {
            iO += C2947f.r(5, this.f27688n);
        }
        if ((this.f27684j & 16) == 16) {
            iO += C2947f.o(6, this.f27690p);
        }
        if ((this.f27684j & 32) == 32) {
            iO += C2947f.o(7, this.f27691q);
        }
        if ((this.f27684j & 8) == 8) {
            iO += C2947f.o(8, this.f27689o);
        }
        if ((this.f27684j & 64) == 64) {
            iO += C2947f.o(9, this.f27692r);
        }
        if ((this.f27684j & 256) == 256) {
            iO += C2947f.r(10, this.f27694t);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iO += C2947f.o(11, this.f27695u);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iO += C2947f.o(12, this.f27693s);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            iO += C2947f.r(13, this.f27696v);
        }
        if ((this.f27684j & 2048) == 2048) {
            iO += C2947f.o(14, this.f27697w);
        }
        int iS = iO + s() + this.f27683i.size();
        this.f27700z = iS;
        return iS;
    }

    public int b0() {
        return this.f27689o;
    }

    public boolean c0() {
        return this.f27686l;
    }

    public q d0() {
        return this.f27694t;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27699y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < T(); i10++) {
            if (!S(i10).e()) {
                this.f27699y = (byte) 0;
                return false;
            }
        }
        if (o0() && !a0().e()) {
            this.f27699y = (byte) 0;
            return false;
        }
        if (r0() && !d0().e()) {
            this.f27699y = (byte) 0;
            return false;
        }
        if (i0() && !Q().e()) {
            this.f27699y = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27699y = (byte) 1;
            return true;
        }
        this.f27699y = (byte) 0;
        return false;
    }

    public int e0() {
        return this.f27695u;
    }

    public int f0() {
        return this.f27693s;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27684j & 4096) == 4096) {
            c2947f.Z(1, this.f27698x);
        }
        for (int i10 = 0; i10 < this.f27685k.size(); i10++) {
            c2947f.c0(2, (m8.p) this.f27685k.get(i10));
        }
        if ((this.f27684j & 1) == 1) {
            c2947f.K(3, this.f27686l);
        }
        if ((this.f27684j & 2) == 2) {
            c2947f.Z(4, this.f27687m);
        }
        if ((this.f27684j & 4) == 4) {
            c2947f.c0(5, this.f27688n);
        }
        if ((this.f27684j & 16) == 16) {
            c2947f.Z(6, this.f27690p);
        }
        if ((this.f27684j & 32) == 32) {
            c2947f.Z(7, this.f27691q);
        }
        if ((this.f27684j & 8) == 8) {
            c2947f.Z(8, this.f27689o);
        }
        if ((this.f27684j & 64) == 64) {
            c2947f.Z(9, this.f27692r);
        }
        if ((this.f27684j & 256) == 256) {
            c2947f.c0(10, this.f27694t);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            c2947f.Z(11, this.f27695u);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            c2947f.Z(12, this.f27693s);
        }
        if ((this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            c2947f.c0(13, this.f27696v);
        }
        if ((this.f27684j & 2048) == 2048) {
            c2947f.Z(14, this.f27697w);
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27683i);
    }

    public int g0() {
        return this.f27691q;
    }

    public int h0() {
        return this.f27692r;
    }

    public boolean i0() {
        return (this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024;
    }

    public boolean j0() {
        return (this.f27684j & 2048) == 2048;
    }

    public boolean k0() {
        return (this.f27684j & 16) == 16;
    }

    public boolean m0() {
        return (this.f27684j & 4096) == 4096;
    }

    public boolean n0() {
        return (this.f27684j & 2) == 2;
    }

    public boolean o0() {
        return (this.f27684j & 4) == 4;
    }

    public boolean p0() {
        return (this.f27684j & 8) == 8;
    }

    public boolean q0() {
        return (this.f27684j & 1) == 1;
    }

    public boolean r0() {
        return (this.f27684j & 256) == 256;
    }

    public boolean s0() {
        return (this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public boolean t0() {
        return (this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public boolean u0() {
        return (this.f27684j & 32) == 32;
    }

    public boolean v0() {
        return (this.f27684j & 64) == 64;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c c() {
        return x0();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i implements m8.q {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final b f27701o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static m8.r f27702p = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f27703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27704i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f27705j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private q f27706k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27707l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f27708m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f27709n;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a extends AbstractC2943b {
            a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b a(C2946e c2946e, C2948g c2948g) {
                return new b(c2946e, c2948g);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum c implements AbstractC2951j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static AbstractC2951j.b f27718l = new a();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f27720g;

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
                this.f27720g = i11;
            }

            public static c h(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // m8.AbstractC2951j.a
            public final int a() {
                return this.f27720g;
            }
        }

        static {
            b bVar = new b(true);
            f27701o = bVar;
            bVar.C();
        }

        private void C() {
            this.f27705j = c.INV;
            this.f27706k = q.W();
            this.f27707l = 0;
        }

        public static C0279b D() {
            return C0279b.p();
        }

        public static C0279b E(b bVar) {
            return D().j(bVar);
        }

        public static b v() {
            return f27701o;
        }

        public boolean A() {
            return (this.f27704i & 2) == 2;
        }

        public boolean B() {
            return (this.f27704i & 4) == 4;
        }

        @Override // m8.p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public C0279b c() {
            return D();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C0279b f() {
            return E(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f27709n;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f27704i & 1) == 1 ? C2947f.h(1, this.f27705j.a()) : 0;
            if ((this.f27704i & 2) == 2) {
                iH += C2947f.r(2, this.f27706k);
            }
            if ((this.f27704i & 4) == 4) {
                iH += C2947f.o(3, this.f27707l);
            }
            int size = iH + this.f27703h.size();
            this.f27709n = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f27708m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!A() || x().e()) {
                this.f27708m = (byte) 1;
                return true;
            }
            this.f27708m = (byte) 0;
            return false;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f27704i & 1) == 1) {
                c2947f.R(1, this.f27705j.a());
            }
            if ((this.f27704i & 2) == 2) {
                c2947f.c0(2, this.f27706k);
            }
            if ((this.f27704i & 4) == 4) {
                c2947f.Z(3, this.f27707l);
            }
            c2947f.h0(this.f27703h);
        }

        public c w() {
            return this.f27705j;
        }

        public q x() {
            return this.f27706k;
        }

        public int y() {
            return this.f27707l;
        }

        public boolean z() {
            return (this.f27704i & 1) == 1;
        }

        private b(AbstractC2950i.b bVar) {
            super(bVar);
            this.f27708m = (byte) -1;
            this.f27709n = -1;
            this.f27703h = bVar.i();
        }

        private b(boolean z10) {
            this.f27708m = (byte) -1;
            this.f27709n = -1;
            this.f27703h = AbstractC2945d.f29639g;
        }

        private b(C2946e c2946e, C2948g c2948g) {
            this.f27708m = (byte) -1;
            this.f27709n = -1;
            C();
            AbstractC2945d.b bVarY = AbstractC2945d.y();
            C2947f c2947fI = C2947f.I(bVarY, 1);
            boolean z10 = false;
            while (!z10) {
                try {
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
                                        this.f27704i |= 1;
                                        this.f27705j = cVarH;
                                    }
                                } else if (iJ == 18) {
                                    c cVarF = (this.f27704i & 2) == 2 ? this.f27706k.f() : null;
                                    q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                    this.f27706k = qVar;
                                    if (cVarF != null) {
                                        cVarF.j(qVar);
                                        this.f27706k = cVarF.r();
                                    }
                                    this.f27704i |= 2;
                                } else if (iJ != 24) {
                                    if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                    }
                                } else {
                                    this.f27704i |= 4;
                                    this.f27707l = c2946e.r();
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
                        this.f27703h = bVarY.m();
                        throw th2;
                    }
                    this.f27703h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27703h = bVarY.m();
                throw th3;
            }
            this.f27703h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: f8.q$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0279b extends AbstractC2950i.b implements m8.q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f27710h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private c f27711i = c.INV;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private q f27712j = q.W();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f27713k;

            private C0279b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0279b p() {
                return new C0279b();
            }

            @Override // m8.p.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarN = n();
                if (bVarN.e()) {
                    return bVarN;
                }
                throw AbstractC2942a.AbstractC0318a.h(bVarN);
            }

            public b n() {
                b bVar = new b(this);
                int i10 = this.f27710h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f27705j = this.f27711i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f27706k = this.f27712j;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                bVar.f27707l = this.f27713k;
                bVar.f27704i = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0279b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0279b j(b bVar) {
                if (bVar == b.v()) {
                    return this;
                }
                if (bVar.z()) {
                    v(bVar.w());
                }
                if (bVar.A()) {
                    u(bVar.x());
                }
                if (bVar.B()) {
                    w(bVar.y());
                }
                k(i().o(bVar.f27703h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0279b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f27702p.a(c2946e, c2948g);
                        if (bVar2 != null) {
                            j(bVar2);
                        }
                        return this;
                    } catch (C2952k e10) {
                        b bVar3 = (b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                j(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                    }
                    throw th;
                }
            }

            public C0279b u(q qVar) {
                if ((this.f27710h & 2) != 2 || this.f27712j == q.W()) {
                    this.f27712j = qVar;
                } else {
                    this.f27712j = q.y0(this.f27712j).j(qVar).r();
                }
                this.f27710h |= 2;
                return this;
            }

            public C0279b v(c cVar) {
                cVar.getClass();
                this.f27710h |= 1;
                this.f27711i = cVar;
                return this;
            }

            public C0279b w(int i10) {
                this.f27710h |= 4;
                this.f27713k = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    private q(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27699y = (byte) -1;
        this.f27700z = -1;
        this.f27683i = cVar.i();
    }

    private q(boolean z10) {
        this.f27699y = (byte) -1;
        this.f27700z = -1;
        this.f27683i = AbstractC2945d.f29639g;
    }

    private q(C2946e c2946e, C2948g c2948g) {
        c cVarF;
        this.f27699y = (byte) -1;
        this.f27700z = -1;
        w0();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    switch (iJ) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f27684j |= 4096;
                            this.f27698x = c2946e.r();
                            break;
                        case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                            if (!z11) {
                                this.f27685k = new ArrayList();
                                z11 = true;
                            }
                            this.f27685k.add(c2946e.t(b.f27702p, c2948g));
                            break;
                        case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                            this.f27684j |= 1;
                            this.f27686l = c2946e.j();
                            break;
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                            this.f27684j |= 2;
                            this.f27687m = c2946e.r();
                            break;
                        case 42:
                            cVarF = (this.f27684j & 4) == 4 ? this.f27688n.f() : null;
                            q qVar = (q) c2946e.t(f27682B, c2948g);
                            this.f27688n = qVar;
                            if (cVarF != null) {
                                cVarF.j(qVar);
                                this.f27688n = cVarF.r();
                            }
                            this.f27684j |= 4;
                            break;
                        case 48:
                            this.f27684j |= 16;
                            this.f27690p = c2946e.r();
                            break;
                        case 56:
                            this.f27684j |= 32;
                            this.f27691q = c2946e.r();
                            break;
                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                            this.f27684j |= 8;
                            this.f27689o = c2946e.r();
                            break;
                        case 72:
                            this.f27684j |= 64;
                            this.f27692r = c2946e.r();
                            break;
                        case 82:
                            cVarF = (this.f27684j & 256) == 256 ? this.f27694t.f() : null;
                            q qVar2 = (q) c2946e.t(f27682B, c2948g);
                            this.f27694t = qVar2;
                            if (cVarF != null) {
                                cVarF.j(qVar2);
                                this.f27694t = cVarF.r();
                            }
                            this.f27684j |= 256;
                            break;
                        case 88:
                            this.f27684j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.f27695u = c2946e.r();
                            break;
                        case 96:
                            this.f27684j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            this.f27693s = c2946e.r();
                            break;
                        case 106:
                            cVarF = (this.f27684j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024 ? this.f27696v.f() : null;
                            q qVar3 = (q) c2946e.t(f27682B, c2948g);
                            this.f27696v = qVar3;
                            if (cVarF != null) {
                                cVarF.j(qVar3);
                                this.f27696v = cVarF.r();
                            }
                            this.f27684j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            break;
                        case 112:
                            this.f27684j |= 2048;
                            this.f27697w = c2946e.r();
                            break;
                        default:
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                z10 = true;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.f27685k = Collections.unmodifiableList(this.f27685k);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27683i = bVarY.m();
                        throw th2;
                    }
                    this.f27683i = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        if (z11) {
            this.f27685k = Collections.unmodifiableList(this.f27685k);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27683i = bVarY.m();
            throw th3;
        }
        this.f27683i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27721j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f27723l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27724m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f27726o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f27727p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f27728q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f27729r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f27730s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f27732u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f27734w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f27735x;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f27722k = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private q f27725n = q.W();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private q f27731t = q.W();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private q f27733v = q.W();

        private c() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c u() {
            return new c();
        }

        private void v() {
            if ((this.f27721j & 1) != 1) {
                this.f27722k = new ArrayList(this.f27722k);
                this.f27721j |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            q qVar = null;
            try {
                try {
                    q qVar2 = (q) q.f27682B.a(c2946e, c2948g);
                    if (qVar2 != null) {
                        j(qVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    q qVar3 = (q) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        qVar = qVar3;
                        if (qVar != null) {
                            j(qVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (qVar != null) {
                }
                throw th;
            }
        }

        public c B(q qVar) {
            if ((this.f27721j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512 || this.f27731t == q.W()) {
                this.f27731t = qVar;
            } else {
                this.f27731t = q.y0(this.f27731t).j(qVar).r();
            }
            this.f27721j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            return this;
        }

        public c C(int i10) {
            this.f27721j |= 4096;
            this.f27734w = i10;
            return this;
        }

        public c D(int i10) {
            this.f27721j |= 32;
            this.f27727p = i10;
            return this;
        }

        public c E(int i10) {
            this.f27721j |= 8192;
            this.f27735x = i10;
            return this;
        }

        public c F(int i10) {
            this.f27721j |= 4;
            this.f27724m = i10;
            return this;
        }

        public c G(int i10) {
            this.f27721j |= 16;
            this.f27726o = i10;
            return this;
        }

        public c H(boolean z10) {
            this.f27721j |= 2;
            this.f27723l = z10;
            return this;
        }

        public c I(int i10) {
            this.f27721j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            this.f27732u = i10;
            return this;
        }

        public c J(int i10) {
            this.f27721j |= 256;
            this.f27730s = i10;
            return this;
        }

        public c K(int i10) {
            this.f27721j |= 64;
            this.f27728q = i10;
            return this;
        }

        public c L(int i10) {
            this.f27721j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.f27729r = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public q build() {
            q qVarR = r();
            if (qVarR.e()) {
                return qVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(qVarR);
        }

        public q r() {
            q qVar = new q(this);
            int i10 = this.f27721j;
            if ((i10 & 1) == 1) {
                this.f27722k = Collections.unmodifiableList(this.f27722k);
                this.f27721j &= -2;
            }
            qVar.f27685k = this.f27722k;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            qVar.f27686l = this.f27723l;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            qVar.f27687m = this.f27724m;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            qVar.f27688n = this.f27725n;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            qVar.f27689o = this.f27726o;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            qVar.f27690p = this.f27727p;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            qVar.f27691q = this.f27728q;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i11 |= 64;
            }
            qVar.f27692r = this.f27729r;
            if ((i10 & 256) == 256) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            qVar.f27693s = this.f27730s;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                i11 |= 256;
            }
            qVar.f27694t = this.f27731t;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            qVar.f27695u = this.f27732u;
            if ((i10 & 2048) == 2048) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            qVar.f27696v = this.f27733v;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            qVar.f27697w = this.f27734w;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            qVar.f27698x = this.f27735x;
            qVar.f27684j = i11;
            return qVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return u().j(r());
        }

        public c x(q qVar) {
            if ((this.f27721j & 2048) != 2048 || this.f27733v == q.W()) {
                this.f27733v = qVar;
            } else {
                this.f27733v = q.y0(this.f27733v).j(qVar).r();
            }
            this.f27721j |= 2048;
            return this;
        }

        public c y(q qVar) {
            if ((this.f27721j & 8) != 8 || this.f27725n == q.W()) {
                this.f27725n = qVar;
            } else {
                this.f27725n = q.y0(this.f27725n).j(qVar).r();
            }
            this.f27721j |= 8;
            return this;
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public c j(q qVar) {
            if (qVar == q.W()) {
                return this;
            }
            if (!qVar.f27685k.isEmpty()) {
                if (this.f27722k.isEmpty()) {
                    this.f27722k = qVar.f27685k;
                    this.f27721j &= -2;
                } else {
                    v();
                    this.f27722k.addAll(qVar.f27685k);
                }
            }
            if (qVar.q0()) {
                H(qVar.c0());
            }
            if (qVar.n0()) {
                F(qVar.Z());
            }
            if (qVar.o0()) {
                y(qVar.a0());
            }
            if (qVar.p0()) {
                G(qVar.b0());
            }
            if (qVar.k0()) {
                D(qVar.V());
            }
            if (qVar.u0()) {
                K(qVar.g0());
            }
            if (qVar.v0()) {
                L(qVar.h0());
            }
            if (qVar.t0()) {
                J(qVar.f0());
            }
            if (qVar.r0()) {
                B(qVar.d0());
            }
            if (qVar.s0()) {
                I(qVar.e0());
            }
            if (qVar.i0()) {
                x(qVar.Q());
            }
            if (qVar.j0()) {
                C(qVar.R());
            }
            if (qVar.m0()) {
                E(qVar.Y());
            }
            o(qVar);
            k(i().o(qVar.f27683i));
            return this;
        }

        private void w() {
        }
    }
}
