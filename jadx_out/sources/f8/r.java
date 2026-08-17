package f8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
import f8.q;
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
public final class r extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final r f27736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static m8.r f27737w = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f27742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f27743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private q f27745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f27747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f27748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private byte f27749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27750u;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public r a(C2946e c2946e, C2948g c2948g) {
            return new r(c2946e, c2948g);
        }
    }

    static {
        r rVar = new r(true);
        f27736v = rVar;
        rVar.i0();
    }

    public static r Q() {
        return f27736v;
    }

    private void i0() {
        this.f27740k = 6;
        this.f27741l = 0;
        List list = Collections.EMPTY_LIST;
        this.f27742m = list;
        this.f27743n = q.W();
        this.f27744o = 0;
        this.f27745p = q.W();
        this.f27746q = 0;
        this.f27747r = list;
        this.f27748s = list;
    }

    public static b j0() {
        return b.u();
    }

    public static b k0(r rVar) {
        return j0().j(rVar);
    }

    public static r n0(InputStream inputStream, C2948g c2948g) {
        return (r) f27737w.b(inputStream, c2948g);
    }

    public f8.b N(int i10) {
        return (f8.b) this.f27747r.get(i10);
    }

    public int O() {
        return this.f27747r.size();
    }

    public List P() {
        return this.f27747r;
    }

    @Override // m8.q
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public r a() {
        return f27736v;
    }

    public q S() {
        return this.f27745p;
    }

    public int T() {
        return this.f27746q;
    }

    public int U() {
        return this.f27740k;
    }

    public int V() {
        return this.f27741l;
    }

    public s W(int i10) {
        return (s) this.f27742m.get(i10);
    }

    public int X() {
        return this.f27742m.size();
    }

    public List Y() {
        return this.f27742m;
    }

    public q Z() {
        return this.f27743n;
    }

    public int a0() {
        return this.f27744o;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27750u;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27739j & 1) == 1 ? C2947f.o(1, this.f27740k) : 0;
        if ((this.f27739j & 2) == 2) {
            iO += C2947f.o(2, this.f27741l);
        }
        for (int i11 = 0; i11 < this.f27742m.size(); i11++) {
            iO += C2947f.r(3, (m8.p) this.f27742m.get(i11));
        }
        if ((this.f27739j & 4) == 4) {
            iO += C2947f.r(4, this.f27743n);
        }
        if ((this.f27739j & 8) == 8) {
            iO += C2947f.o(5, this.f27744o);
        }
        if ((this.f27739j & 16) == 16) {
            iO += C2947f.r(6, this.f27745p);
        }
        if ((this.f27739j & 32) == 32) {
            iO += C2947f.o(7, this.f27746q);
        }
        for (int i12 = 0; i12 < this.f27747r.size(); i12++) {
            iO += C2947f.r(8, (m8.p) this.f27747r.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f27748s.size(); i13++) {
            iP += C2947f.p(((Integer) this.f27748s.get(i13)).intValue());
        }
        int size = iO + iP + (b0().size() * 2) + s() + this.f27738i.size();
        this.f27750u = size;
        return size;
    }

    public List b0() {
        return this.f27748s;
    }

    public boolean c0() {
        return (this.f27739j & 16) == 16;
    }

    public boolean d0() {
        return (this.f27739j & 32) == 32;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27749t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!f0()) {
            this.f27749t = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < X(); i10++) {
            if (!W(i10).e()) {
                this.f27749t = (byte) 0;
                return false;
            }
        }
        if (g0() && !Z().e()) {
            this.f27749t = (byte) 0;
            return false;
        }
        if (c0() && !S().e()) {
            this.f27749t = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < O(); i11++) {
            if (!N(i11).e()) {
                this.f27749t = (byte) 0;
                return false;
            }
        }
        if (r()) {
            this.f27749t = (byte) 1;
            return true;
        }
        this.f27749t = (byte) 0;
        return false;
    }

    public boolean e0() {
        return (this.f27739j & 1) == 1;
    }

    public boolean f0() {
        return (this.f27739j & 2) == 2;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27739j & 1) == 1) {
            c2947f.Z(1, this.f27740k);
        }
        if ((this.f27739j & 2) == 2) {
            c2947f.Z(2, this.f27741l);
        }
        for (int i10 = 0; i10 < this.f27742m.size(); i10++) {
            c2947f.c0(3, (m8.p) this.f27742m.get(i10));
        }
        if ((this.f27739j & 4) == 4) {
            c2947f.c0(4, this.f27743n);
        }
        if ((this.f27739j & 8) == 8) {
            c2947f.Z(5, this.f27744o);
        }
        if ((this.f27739j & 16) == 16) {
            c2947f.c0(6, this.f27745p);
        }
        if ((this.f27739j & 32) == 32) {
            c2947f.Z(7, this.f27746q);
        }
        for (int i11 = 0; i11 < this.f27747r.size(); i11++) {
            c2947f.c0(8, (m8.p) this.f27747r.get(i11));
        }
        for (int i12 = 0; i12 < this.f27748s.size(); i12++) {
            c2947f.Z(31, ((Integer) this.f27748s.get(i12)).intValue());
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27738i);
    }

    public boolean g0() {
        return (this.f27739j & 4) == 4;
    }

    public boolean h0() {
        return (this.f27739j & 8) == 8;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return j0();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return k0(this);
    }

    private r(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27749t = (byte) -1;
        this.f27750u = -1;
        this.f27738i = cVar.i();
    }

    private r(boolean z10) {
        this.f27749t = (byte) -1;
        this.f27750u = -1;
        this.f27738i = AbstractC2945d.f29639g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private r(C2946e c2946e, C2948g c2948g) {
        q.c cVarF;
        this.f27749t = (byte) -1;
        this.f27750u = -1;
        i0();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? O9 = 128;
            if (!z10) {
                try {
                    try {
                        int iJ = c2946e.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f27739j |= 1;
                                this.f27740k = c2946e.r();
                                break;
                            case 16:
                                this.f27739j |= 2;
                                this.f27741l = c2946e.r();
                                break;
                            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                                if ((i10 & 4) != 4) {
                                    this.f27742m = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f27742m.add(c2946e.t(s.f27762u, c2948g));
                                break;
                            case 34:
                                cVarF = (this.f27739j & 4) == 4 ? this.f27743n.f() : null;
                                q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27743n = qVar;
                                if (cVarF != null) {
                                    cVarF.j(qVar);
                                    this.f27743n = cVarF.r();
                                }
                                this.f27739j |= 4;
                                break;
                            case 40:
                                this.f27739j |= 8;
                                this.f27744o = c2946e.r();
                                break;
                            case 50:
                                cVarF = (this.f27739j & 16) == 16 ? this.f27745p.f() : null;
                                q qVar2 = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27745p = qVar2;
                                if (cVarF != null) {
                                    cVarF.j(qVar2);
                                    this.f27745p = cVarF.r();
                                }
                                this.f27739j |= 16;
                                break;
                            case 56:
                                this.f27739j |= 32;
                                this.f27746q = c2946e.r();
                                break;
                            case 66:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                                    this.f27747r = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                }
                                this.f27747r.add(c2946e.t(f8.b.f27307o, c2948g));
                                break;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f27748s = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f27748s.add(Integer.valueOf(c2946e.r()));
                                break;
                            case 250:
                                int i11 = c2946e.i(c2946e.z());
                                if ((i10 & 256) != 256 && c2946e.e() > 0) {
                                    this.f27748s = new ArrayList();
                                    i10 |= 256;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27748s.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i11);
                                break;
                            default:
                                O9 = o(c2946e, c2947fI, c2948g, iJ);
                                if (O9 == 0) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (Throwable th) {
                        if ((i10 & 4) == 4) {
                            this.f27742m = Collections.unmodifiableList(this.f27742m);
                        }
                        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == O9) {
                            this.f27747r = Collections.unmodifiableList(this.f27747r);
                        }
                        if ((i10 & 256) == 256) {
                            this.f27748s = Collections.unmodifiableList(this.f27748s);
                        }
                        try {
                            c2947fI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f27738i = bVarY.m();
                            throw th2;
                        }
                        this.f27738i = bVarY.m();
                        l();
                        throw th;
                    }
                } catch (C2952k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C2952k(e11.getMessage()).i(this);
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f27742m = Collections.unmodifiableList(this.f27742m);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    this.f27747r = Collections.unmodifiableList(this.f27747r);
                }
                if ((i10 & 256) == 256) {
                    this.f27748s = Collections.unmodifiableList(this.f27748s);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f27738i = bVarY.m();
                    throw th3;
                }
                this.f27738i = bVarY.m();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27751j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27752k = 6;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27753l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List f27754m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private q f27755n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f27756o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private q f27757p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f27758q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f27759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f27760s;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27754m = list;
            this.f27755n = q.W();
            this.f27757p = q.W();
            this.f27759r = list;
            this.f27760s = list;
            y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27751j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                this.f27759r = new ArrayList(this.f27759r);
                this.f27751j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
        }

        private void w() {
            if ((this.f27751j & 4) != 4) {
                this.f27754m = new ArrayList(this.f27754m);
                this.f27751j |= 4;
            }
        }

        private void x() {
            if ((this.f27751j & 256) != 256) {
                this.f27760s = new ArrayList(this.f27760s);
                this.f27751j |= 256;
            }
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b j(r rVar) {
            if (rVar == r.Q()) {
                return this;
            }
            if (rVar.e0()) {
                E(rVar.U());
            }
            if (rVar.f0()) {
                F(rVar.V());
            }
            if (!rVar.f27742m.isEmpty()) {
                if (this.f27754m.isEmpty()) {
                    this.f27754m = rVar.f27742m;
                    this.f27751j &= -5;
                } else {
                    w();
                    this.f27754m.addAll(rVar.f27742m);
                }
            }
            if (rVar.g0()) {
                C(rVar.Z());
            }
            if (rVar.h0()) {
                G(rVar.a0());
            }
            if (rVar.c0()) {
                z(rVar.S());
            }
            if (rVar.d0()) {
                D(rVar.T());
            }
            if (!rVar.f27747r.isEmpty()) {
                if (this.f27759r.isEmpty()) {
                    this.f27759r = rVar.f27747r;
                    this.f27751j &= -129;
                } else {
                    v();
                    this.f27759r.addAll(rVar.f27747r);
                }
            }
            if (!rVar.f27748s.isEmpty()) {
                if (this.f27760s.isEmpty()) {
                    this.f27760s = rVar.f27748s;
                    this.f27751j &= -257;
                } else {
                    x();
                    this.f27760s.addAll(rVar.f27748s);
                }
            }
            o(rVar);
            k(i().o(rVar.f27738i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            r rVar = null;
            try {
                try {
                    r rVar2 = (r) r.f27737w.a(c2946e, c2948g);
                    if (rVar2 != null) {
                        j(rVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    r rVar3 = (r) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        rVar = rVar3;
                        if (rVar != null) {
                            j(rVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (rVar != null) {
                }
                throw th;
            }
        }

        public b C(q qVar) {
            if ((this.f27751j & 8) != 8 || this.f27755n == q.W()) {
                this.f27755n = qVar;
            } else {
                this.f27755n = q.y0(this.f27755n).j(qVar).r();
            }
            this.f27751j |= 8;
            return this;
        }

        public b D(int i10) {
            this.f27751j |= 64;
            this.f27758q = i10;
            return this;
        }

        public b E(int i10) {
            this.f27751j |= 1;
            this.f27752k = i10;
            return this;
        }

        public b F(int i10) {
            this.f27751j |= 2;
            this.f27753l = i10;
            return this;
        }

        public b G(int i10) {
            this.f27751j |= 16;
            this.f27756o = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public r build() {
            r rVarR = r();
            if (rVarR.e()) {
                return rVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(rVarR);
        }

        public r r() {
            r rVar = new r(this);
            int i10 = this.f27751j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            rVar.f27740k = this.f27752k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            rVar.f27741l = this.f27753l;
            if ((this.f27751j & 4) == 4) {
                this.f27754m = Collections.unmodifiableList(this.f27754m);
                this.f27751j &= -5;
            }
            rVar.f27742m = this.f27754m;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            rVar.f27743n = this.f27755n;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            rVar.f27744o = this.f27756o;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            rVar.f27745p = this.f27757p;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            rVar.f27746q = this.f27758q;
            if ((this.f27751j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                this.f27759r = Collections.unmodifiableList(this.f27759r);
                this.f27751j &= -129;
            }
            rVar.f27747r = this.f27759r;
            if ((this.f27751j & 256) == 256) {
                this.f27760s = Collections.unmodifiableList(this.f27760s);
                this.f27751j &= -257;
            }
            rVar.f27748s = this.f27760s;
            rVar.f27739j = i11;
            return rVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public b z(q qVar) {
            if ((this.f27751j & 32) != 32 || this.f27757p == q.W()) {
                this.f27757p = qVar;
            } else {
                this.f27757p = q.y0(this.f27757p).j(qVar).r();
            }
            this.f27751j |= 32;
            return this;
        }

        private void y() {
        }
    }
}
