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
public final class w extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final w f27848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m8.r f27849m = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f27851i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f27852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27853k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public w a(C2946e c2946e, C2948g c2948g) {
            return new w(c2946e, c2948g);
        }
    }

    static {
        w wVar = new w(true);
        f27848l = wVar;
        wVar.w();
    }

    public static w t() {
        return f27848l;
    }

    private void w() {
        this.f27851i = Collections.EMPTY_LIST;
    }

    public static b x() {
        return b.p();
    }

    public static b y(w wVar) {
        return x().j(wVar);
    }

    @Override // m8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b f() {
        return y(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27853k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f27851i.size(); i11++) {
            iR += C2947f.r(1, (m8.p) this.f27851i.get(i11));
        }
        int size = iR + this.f27850h.size();
        this.f27853k = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27852j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f27852j = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f27851i.size(); i10++) {
            c2947f.c0(1, (m8.p) this.f27851i.get(i10));
        }
        c2947f.h0(this.f27850h);
    }

    public int u() {
        return this.f27851i.size();
    }

    public List v() {
        return this.f27851i;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b c() {
        return x();
    }

    private w(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27852j = (byte) -1;
        this.f27853k = -1;
        this.f27850h = bVar.i();
    }

    private w(boolean z10) {
        this.f27852j = (byte) -1;
        this.f27853k = -1;
        this.f27850h = AbstractC2945d.f29639g;
    }

    private w(C2946e c2946e, C2948g c2948g) {
        this.f27852j = (byte) -1;
        this.f27853k = -1;
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
                                this.f27851i = new ArrayList();
                                z11 = true;
                            }
                            this.f27851i.add(c2946e.t(v.f27818s, c2948g));
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
                    this.f27851i = Collections.unmodifiableList(this.f27851i);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27850h = bVarY.m();
                    throw th2;
                }
                this.f27850h = bVarY.m();
                l();
                throw th;
            }
        }
        if (z11) {
            this.f27851i = Collections.unmodifiableList(this.f27851i);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27850h = bVarY.m();
            throw th3;
        }
        this.f27850h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27854h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f27855i = Collections.EMPTY_LIST;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27854h & 1) != 1) {
                this.f27855i = new ArrayList(this.f27855i);
                this.f27854h |= 1;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public w build() {
            w wVarN = n();
            if (wVarN.e()) {
                return wVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(wVarN);
        }

        public w n() {
            w wVar = new w(this);
            if ((this.f27854h & 1) == 1) {
                this.f27855i = Collections.unmodifiableList(this.f27855i);
                this.f27854h &= -2;
            }
            wVar.f27851i = this.f27855i;
            return wVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(w wVar) {
            if (wVar == w.t()) {
                return this;
            }
            if (!wVar.f27851i.isEmpty()) {
                if (this.f27855i.isEmpty()) {
                    this.f27855i = wVar.f27851i;
                    this.f27854h &= -2;
                } else {
                    q();
                    this.f27855i.addAll(wVar.f27851i);
                }
            }
            k(i().o(wVar.f27850h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            w wVar = null;
            try {
                try {
                    w wVar2 = (w) w.f27849m.a(c2946e, c2948g);
                    if (wVar2 != null) {
                        j(wVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    w wVar3 = (w) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        wVar = wVar3;
                        if (wVar != null) {
                            j(wVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (wVar != null) {
                }
                throw th;
            }
        }

        private void r() {
        }
    }
}
