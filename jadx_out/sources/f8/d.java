package f8;

import java.io.IOException;
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
public final class d extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final d f27444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static m8.r f27445q = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f27449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f27450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f27451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27452o;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public d a(C2946e c2946e, C2948g c2948g) {
            return new d(c2946e, c2948g);
        }
    }

    static {
        d dVar = new d(true);
        f27444p = dVar;
        dVar.O();
    }

    public static d G() {
        return f27444p;
    }

    private void O() {
        this.f27448k = 6;
        List list = Collections.EMPTY_LIST;
        this.f27449l = list;
        this.f27450m = list;
    }

    public static b P() {
        return b.u();
    }

    public static b Q(d dVar) {
        return P().j(dVar);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public d a() {
        return f27444p;
    }

    public int I() {
        return this.f27448k;
    }

    public u J(int i10) {
        return (u) this.f27449l.get(i10);
    }

    public int K() {
        return this.f27449l.size();
    }

    public List L() {
        return this.f27449l;
    }

    public List M() {
        return this.f27450m;
    }

    public boolean N() {
        return (this.f27447j & 1) == 1;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public b c() {
        return P();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public b f() {
        return Q(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27452o;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27447j & 1) == 1 ? C2947f.o(1, this.f27448k) : 0;
        for (int i11 = 0; i11 < this.f27449l.size(); i11++) {
            iO += C2947f.r(2, (m8.p) this.f27449l.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f27450m.size(); i12++) {
            iP += C2947f.p(((Integer) this.f27450m.get(i12)).intValue());
        }
        int size = iO + iP + (M().size() * 2) + s() + this.f27446i.size();
        this.f27452o = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27451n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < K(); i10++) {
            if (!J(i10).e()) {
                this.f27451n = (byte) 0;
                return false;
            }
        }
        if (r()) {
            this.f27451n = (byte) 1;
            return true;
        }
        this.f27451n = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27447j & 1) == 1) {
            c2947f.Z(1, this.f27448k);
        }
        for (int i10 = 0; i10 < this.f27449l.size(); i10++) {
            c2947f.c0(2, (m8.p) this.f27449l.get(i10));
        }
        for (int i11 = 0; i11 < this.f27450m.size(); i11++) {
            c2947f.Z(31, ((Integer) this.f27450m.get(i11)).intValue());
        }
        aVarX.a(19000, c2947f);
        c2947f.h0(this.f27446i);
    }

    private d(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27451n = (byte) -1;
        this.f27452o = -1;
        this.f27446i = cVar.i();
    }

    private d(boolean z10) {
        this.f27451n = (byte) -1;
        this.f27452o = -1;
        this.f27446i = AbstractC2945d.f29639g;
    }

    private d(C2946e c2946e, C2948g c2948g) {
        this.f27451n = (byte) -1;
        this.f27452o = -1;
        O();
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
                            this.f27447j |= 1;
                            this.f27448k = c2946e.r();
                        } else if (iJ == 18) {
                            if ((i10 & 2) != 2) {
                                this.f27449l = new ArrayList();
                                i10 |= 2;
                            }
                            this.f27449l.add(c2946e.t(u.f27799t, c2948g));
                        } else if (iJ == 248) {
                            if ((i10 & 4) != 4) {
                                this.f27450m = new ArrayList();
                                i10 |= 4;
                            }
                            this.f27450m.add(Integer.valueOf(c2946e.r()));
                        } else if (iJ != 250) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            int i11 = c2946e.i(c2946e.z());
                            if ((i10 & 4) != 4 && c2946e.e() > 0) {
                                this.f27450m = new ArrayList();
                                i10 |= 4;
                            }
                            while (c2946e.e() > 0) {
                                this.f27450m.add(Integer.valueOf(c2946e.r()));
                            }
                            c2946e.h(i11);
                        }
                    }
                    z10 = true;
                } catch (C2952k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C2952k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i10 & 2) == 2) {
                    this.f27449l = Collections.unmodifiableList(this.f27449l);
                }
                if ((i10 & 4) == 4) {
                    this.f27450m = Collections.unmodifiableList(this.f27450m);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27446i = bVarY.m();
                    throw th2;
                }
                this.f27446i = bVarY.m();
                l();
                throw th;
            }
        }
        if ((i10 & 2) == 2) {
            this.f27449l = Collections.unmodifiableList(this.f27449l);
        }
        if ((i10 & 4) == 4) {
            this.f27450m = Collections.unmodifiableList(this.f27450m);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27446i = bVarY.m();
            throw th3;
        }
        this.f27446i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27453j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27454k = 6;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List f27455l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List f27456m;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27455l = list;
            this.f27456m = list;
            x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27453j & 2) != 2) {
                this.f27455l = new ArrayList(this.f27455l);
                this.f27453j |= 2;
            }
        }

        private void w() {
            if ((this.f27453j & 4) != 4) {
                this.f27456m = new ArrayList(this.f27456m);
                this.f27453j |= 4;
            }
        }

        public b A(int i10) {
            this.f27453j |= 1;
            this.f27454k = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public d build() {
            d dVarR = r();
            if (dVarR.e()) {
                return dVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(dVarR);
        }

        public d r() {
            d dVar = new d(this);
            int i10 = (this.f27453j & 1) != 1 ? 0 : 1;
            dVar.f27448k = this.f27454k;
            if ((this.f27453j & 2) == 2) {
                this.f27455l = Collections.unmodifiableList(this.f27455l);
                this.f27453j &= -3;
            }
            dVar.f27449l = this.f27455l;
            if ((this.f27453j & 4) == 4) {
                this.f27456m = Collections.unmodifiableList(this.f27456m);
                this.f27453j &= -5;
            }
            dVar.f27450m = this.f27456m;
            dVar.f27447j = i10;
            return dVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b j(d dVar) {
            if (dVar == d.G()) {
                return this;
            }
            if (dVar.N()) {
                A(dVar.I());
            }
            if (!dVar.f27449l.isEmpty()) {
                if (this.f27455l.isEmpty()) {
                    this.f27455l = dVar.f27449l;
                    this.f27453j &= -3;
                } else {
                    v();
                    this.f27455l.addAll(dVar.f27449l);
                }
            }
            if (!dVar.f27450m.isEmpty()) {
                if (this.f27456m.isEmpty()) {
                    this.f27456m = dVar.f27450m;
                    this.f27453j &= -5;
                } else {
                    w();
                    this.f27456m.addAll(dVar.f27450m);
                }
            }
            o(dVar);
            k(i().o(dVar.f27446i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            d dVar = null;
            try {
                try {
                    d dVar2 = (d) d.f27445q.a(c2946e, c2948g);
                    if (dVar2 != null) {
                        j(dVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    d dVar3 = (d) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        dVar = dVar3;
                        if (dVar != null) {
                            j(dVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (dVar != null) {
                }
                throw th;
            }
        }

        private void x() {
        }
    }
}
