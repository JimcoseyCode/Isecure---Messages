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
public final class t extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final t f27787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static m8.r f27788o = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f27791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f27793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27794m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public t a(C2946e c2946e, C2948g c2948g) {
            return new t(c2946e, c2948g);
        }
    }

    static {
        t tVar = new t(true);
        f27787n = tVar;
        tVar.B();
    }

    private void B() {
        this.f27791j = Collections.EMPTY_LIST;
        this.f27792k = -1;
    }

    public static b C() {
        return b.p();
    }

    public static b D(t tVar) {
        return C().j(tVar);
    }

    public static t v() {
        return f27787n;
    }

    public boolean A() {
        return (this.f27790i & 1) == 1;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b c() {
        return C();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b f() {
        return D(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27794m;
        if (i10 != -1) {
            return i10;
        }
        int iO = 0;
        for (int i11 = 0; i11 < this.f27791j.size(); i11++) {
            iO += C2947f.r(1, (m8.p) this.f27791j.get(i11));
        }
        if ((this.f27790i & 1) == 1) {
            iO += C2947f.o(2, this.f27792k);
        }
        int size = iO + this.f27789h.size();
        this.f27794m = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27793l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < y(); i10++) {
            if (!x(i10).e()) {
                this.f27793l = (byte) 0;
                return false;
            }
        }
        this.f27793l = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f27791j.size(); i10++) {
            c2947f.c0(1, (m8.p) this.f27791j.get(i10));
        }
        if ((this.f27790i & 1) == 1) {
            c2947f.Z(2, this.f27792k);
        }
        c2947f.h0(this.f27789h);
    }

    public int w() {
        return this.f27792k;
    }

    public q x(int i10) {
        return (q) this.f27791j.get(i10);
    }

    public int y() {
        return this.f27791j.size();
    }

    public List z() {
        return this.f27791j;
    }

    private t(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27793l = (byte) -1;
        this.f27794m = -1;
        this.f27789h = bVar.i();
    }

    private t(boolean z10) {
        this.f27793l = (byte) -1;
        this.f27794m = -1;
        this.f27789h = AbstractC2945d.f29639g;
    }

    private t(C2946e c2946e, C2948g c2948g) {
        this.f27793l = (byte) -1;
        this.f27794m = -1;
        B();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            if (!z11) {
                                this.f27791j = new ArrayList();
                                z11 = true;
                            }
                            this.f27791j.add(c2946e.t(q.f27682B, c2948g));
                        } else if (iJ != 16) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            this.f27790i |= 1;
                            this.f27792k = c2946e.r();
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if (z11) {
                        this.f27791j = Collections.unmodifiableList(this.f27791j);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27789h = bVarY.m();
                        throw th2;
                    }
                    this.f27789h = bVarY.m();
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
            this.f27791j = Collections.unmodifiableList(this.f27791j);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27789h = bVarY.m();
            throw th3;
        }
        this.f27789h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f27796i = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27797j = -1;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27795h & 1) != 1) {
                this.f27796i = new ArrayList(this.f27796i);
                this.f27795h |= 1;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public t build() {
            t tVarN = n();
            if (tVarN.e()) {
                return tVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(tVarN);
        }

        public t n() {
            t tVar = new t(this);
            int i10 = this.f27795h;
            if ((i10 & 1) == 1) {
                this.f27796i = Collections.unmodifiableList(this.f27796i);
                this.f27795h &= -2;
            }
            tVar.f27791j = this.f27796i;
            int i11 = (i10 & 2) != 2 ? 0 : 1;
            tVar.f27792k = this.f27797j;
            tVar.f27790i = i11;
            return tVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(t tVar) {
            if (tVar == t.v()) {
                return this;
            }
            if (!tVar.f27791j.isEmpty()) {
                if (this.f27796i.isEmpty()) {
                    this.f27796i = tVar.f27791j;
                    this.f27795h &= -2;
                } else {
                    q();
                    this.f27796i.addAll(tVar.f27791j);
                }
            }
            if (tVar.A()) {
                v(tVar.w());
            }
            k(i().o(tVar.f27789h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            t tVar = null;
            try {
                try {
                    t tVar2 = (t) t.f27788o.a(c2946e, c2948g);
                    if (tVar2 != null) {
                        j(tVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    t tVar3 = (t) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        tVar = tVar3;
                        if (tVar != null) {
                            j(tVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (tVar != null) {
                }
                throw th;
            }
        }

        public b v(int i10) {
            this.f27795h |= 2;
            this.f27797j = i10;
            return this;
        }

        private void r() {
        }
    }
}
