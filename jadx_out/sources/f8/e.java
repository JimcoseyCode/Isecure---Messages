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
public final class e extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final e f27457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m8.r f27458m = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f27460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f27461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27462k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public e a(C2946e c2946e, C2948g c2948g) {
            return new e(c2946e, c2948g);
        }
    }

    static {
        e eVar = new e(true);
        f27457l = eVar;
        eVar.w();
    }

    public static e t() {
        return f27457l;
    }

    private void w() {
        this.f27460i = Collections.EMPTY_LIST;
    }

    public static b x() {
        return b.p();
    }

    public static b y(e eVar) {
        return x().j(eVar);
    }

    @Override // m8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b f() {
        return y(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27462k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f27460i.size(); i11++) {
            iR += C2947f.r(1, (m8.p) this.f27460i.get(i11));
        }
        int size = iR + this.f27459h.size();
        this.f27462k = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27461j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < v(); i10++) {
            if (!u(i10).e()) {
                this.f27461j = (byte) 0;
                return false;
            }
        }
        this.f27461j = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f27460i.size(); i10++) {
            c2947f.c0(1, (m8.p) this.f27460i.get(i10));
        }
        c2947f.h0(this.f27459h);
    }

    public f u(int i10) {
        return (f) this.f27460i.get(i10);
    }

    public int v() {
        return this.f27460i.size();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b c() {
        return x();
    }

    private e(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27461j = (byte) -1;
        this.f27462k = -1;
        this.f27459h = bVar.i();
    }

    private e(boolean z10) {
        this.f27461j = (byte) -1;
        this.f27462k = -1;
        this.f27459h = AbstractC2945d.f29639g;
    }

    private e(C2946e c2946e, C2948g c2948g) {
        this.f27461j = (byte) -1;
        this.f27462k = -1;
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
                            if (!z11) {
                                this.f27460i = new ArrayList();
                                z11 = true;
                            }
                            this.f27460i.add(c2946e.t(f.f27466q, c2948g));
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
                    this.f27460i = Collections.unmodifiableList(this.f27460i);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27459h = bVarY.m();
                    throw th2;
                }
                this.f27459h = bVarY.m();
                l();
                throw th;
            }
        }
        if (z11) {
            this.f27460i = Collections.unmodifiableList(this.f27460i);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27459h = bVarY.m();
            throw th3;
        }
        this.f27459h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27463h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f27464i = Collections.EMPTY_LIST;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27463h & 1) != 1) {
                this.f27464i = new ArrayList(this.f27464i);
                this.f27463h |= 1;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVarN = n();
            if (eVarN.e()) {
                return eVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(eVarN);
        }

        public e n() {
            e eVar = new e(this);
            if ((this.f27463h & 1) == 1) {
                this.f27464i = Collections.unmodifiableList(this.f27464i);
                this.f27463h &= -2;
            }
            eVar.f27460i = this.f27464i;
            return eVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(e eVar) {
            if (eVar == e.t()) {
                return this;
            }
            if (!eVar.f27460i.isEmpty()) {
                if (this.f27464i.isEmpty()) {
                    this.f27464i = eVar.f27460i;
                    this.f27463h &= -2;
                } else {
                    q();
                    this.f27464i.addAll(eVar.f27460i);
                }
            }
            k(i().o(eVar.f27459h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            e eVar = null;
            try {
                try {
                    e eVar2 = (e) e.f27458m.a(c2946e, c2948g);
                    if (eVar2 != null) {
                        j(eVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    e eVar3 = (e) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        eVar = eVar3;
                        if (eVar != null) {
                            j(eVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (eVar != null) {
                }
                throw th;
            }
        }

        private void r() {
        }
    }
}
