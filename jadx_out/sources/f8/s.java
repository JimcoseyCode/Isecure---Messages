package f8;

import com.facebook.react.views.progressbar.ProgressBarContainerView;
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
public final class s extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final s f27761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static m8.r f27762u = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f27768n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f27769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f27770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private byte f27772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27773s;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public s a(C2946e c2946e, C2948g c2948g) {
            return new s(c2946e, c2948g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum c implements AbstractC2951j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static AbstractC2951j.b f27784k = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27786g;

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
            this.f27786g = i11;
        }

        public static c h(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27786g;
        }
    }

    static {
        s sVar = new s(true);
        f27761t = sVar;
        sVar.X();
    }

    public static s J() {
        return f27761t;
    }

    private void X() {
        this.f27765k = 0;
        this.f27766l = 0;
        this.f27767m = false;
        this.f27768n = c.INV;
        List list = Collections.EMPTY_LIST;
        this.f27769o = list;
        this.f27770p = list;
    }

    public static b Y() {
        return b.u();
    }

    public static b Z(s sVar) {
        return Y().j(sVar);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public s a() {
        return f27761t;
    }

    public int L() {
        return this.f27765k;
    }

    public int M() {
        return this.f27766l;
    }

    public boolean N() {
        return this.f27767m;
    }

    public q O(int i10) {
        return (q) this.f27769o.get(i10);
    }

    public int P() {
        return this.f27769o.size();
    }

    public List Q() {
        return this.f27770p;
    }

    public List R() {
        return this.f27769o;
    }

    public c S() {
        return this.f27768n;
    }

    public boolean T() {
        return (this.f27764j & 1) == 1;
    }

    public boolean U() {
        return (this.f27764j & 2) == 2;
    }

    public boolean V() {
        return (this.f27764j & 4) == 4;
    }

    public boolean W() {
        return (this.f27764j & 8) == 8;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return Y();
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27773s;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27764j & 1) == 1 ? C2947f.o(1, this.f27765k) : 0;
        if ((this.f27764j & 2) == 2) {
            iO += C2947f.o(2, this.f27766l);
        }
        if ((this.f27764j & 4) == 4) {
            iO += C2947f.a(3, this.f27767m);
        }
        if ((this.f27764j & 8) == 8) {
            iO += C2947f.h(4, this.f27768n.a());
        }
        for (int i11 = 0; i11 < this.f27769o.size(); i11++) {
            iO += C2947f.r(5, (m8.p) this.f27769o.get(i11));
        }
        int iP = 0;
        for (int i12 = 0; i12 < this.f27770p.size(); i12++) {
            iP += C2947f.p(((Integer) this.f27770p.get(i12)).intValue());
        }
        int iP2 = iO + iP;
        if (!Q().isEmpty()) {
            iP2 = iP2 + 1 + C2947f.p(iP);
        }
        this.f27771q = iP;
        int iS = iP2 + s() + this.f27763i.size();
        this.f27773s = iS;
        return iS;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return Z(this);
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27772r;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!T()) {
            this.f27772r = (byte) 0;
            return false;
        }
        if (!U()) {
            this.f27772r = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!O(i10).e()) {
                this.f27772r = (byte) 0;
                return false;
            }
        }
        if (r()) {
            this.f27772r = (byte) 1;
            return true;
        }
        this.f27772r = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27764j & 1) == 1) {
            c2947f.Z(1, this.f27765k);
        }
        if ((this.f27764j & 2) == 2) {
            c2947f.Z(2, this.f27766l);
        }
        if ((this.f27764j & 4) == 4) {
            c2947f.K(3, this.f27767m);
        }
        if ((this.f27764j & 8) == 8) {
            c2947f.R(4, this.f27768n.a());
        }
        for (int i10 = 0; i10 < this.f27769o.size(); i10++) {
            c2947f.c0(5, (m8.p) this.f27769o.get(i10));
        }
        if (Q().size() > 0) {
            c2947f.n0(50);
            c2947f.n0(this.f27771q);
        }
        for (int i11 = 0; i11 < this.f27770p.size(); i11++) {
            c2947f.a0(((Integer) this.f27770p.get(i11)).intValue());
        }
        aVarX.a(ProgressBarContainerView.MAX_PROGRESS, c2947f);
        c2947f.h0(this.f27763i);
    }

    private s(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27771q = -1;
        this.f27772r = (byte) -1;
        this.f27773s = -1;
        this.f27763i = cVar.i();
    }

    private s(boolean z10) {
        this.f27771q = -1;
        this.f27772r = (byte) -1;
        this.f27773s = -1;
        this.f27763i = AbstractC2945d.f29639g;
    }

    private s(C2946e c2946e, C2948g c2948g) {
        this.f27771q = -1;
        this.f27772r = (byte) -1;
        this.f27773s = -1;
        X();
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
                            this.f27764j |= 1;
                            this.f27765k = c2946e.r();
                        } else if (iJ == 16) {
                            this.f27764j |= 2;
                            this.f27766l = c2946e.r();
                        } else if (iJ == 24) {
                            this.f27764j |= 4;
                            this.f27767m = c2946e.j();
                        } else if (iJ == 32) {
                            int iM = c2946e.m();
                            c cVarH = c.h(iM);
                            if (cVarH == null) {
                                c2947fI.n0(iJ);
                                c2947fI.n0(iM);
                            } else {
                                this.f27764j |= 8;
                                this.f27768n = cVarH;
                            }
                        } else if (iJ == 42) {
                            if ((i10 & 16) != 16) {
                                this.f27769o = new ArrayList();
                                i10 |= 16;
                            }
                            this.f27769o.add(c2946e.t(q.f27682B, c2948g));
                        } else if (iJ == 48) {
                            if ((i10 & 32) != 32) {
                                this.f27770p = new ArrayList();
                                i10 |= 32;
                            }
                            this.f27770p.add(Integer.valueOf(c2946e.r()));
                        } else if (iJ != 50) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            int i11 = c2946e.i(c2946e.z());
                            if ((i10 & 32) != 32 && c2946e.e() > 0) {
                                this.f27770p = new ArrayList();
                                i10 |= 32;
                            }
                            while (c2946e.e() > 0) {
                                this.f27770p.add(Integer.valueOf(c2946e.r()));
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
                if ((i10 & 16) == 16) {
                    this.f27769o = Collections.unmodifiableList(this.f27769o);
                }
                if ((i10 & 32) == 32) {
                    this.f27770p = Collections.unmodifiableList(this.f27770p);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27763i = bVarY.m();
                    throw th2;
                }
                this.f27763i = bVarY.m();
                l();
                throw th;
            }
        }
        if ((i10 & 16) == 16) {
            this.f27769o = Collections.unmodifiableList(this.f27769o);
        }
        if ((i10 & 32) == 32) {
            this.f27770p = Collections.unmodifiableList(this.f27770p);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27763i = bVarY.m();
            throw th3;
        }
        this.f27763i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27776l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f27777m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f27778n = c.INV;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List f27779o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List f27780p;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27779o = list;
            this.f27780p = list;
            x();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27774j & 32) != 32) {
                this.f27780p = new ArrayList(this.f27780p);
                this.f27774j |= 32;
            }
        }

        private void w() {
            if ((this.f27774j & 16) != 16) {
                this.f27779o = new ArrayList(this.f27779o);
                this.f27774j |= 16;
            }
        }

        public b A(int i10) {
            this.f27774j |= 1;
            this.f27775k = i10;
            return this;
        }

        public b B(int i10) {
            this.f27774j |= 2;
            this.f27776l = i10;
            return this;
        }

        public b C(boolean z10) {
            this.f27774j |= 4;
            this.f27777m = z10;
            return this;
        }

        public b D(c cVar) {
            cVar.getClass();
            this.f27774j |= 8;
            this.f27778n = cVar;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public s build() {
            s sVarR = r();
            if (sVarR.e()) {
                return sVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(sVarR);
        }

        public s r() {
            s sVar = new s(this);
            int i10 = this.f27774j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            sVar.f27765k = this.f27775k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            sVar.f27766l = this.f27776l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            sVar.f27767m = this.f27777m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            sVar.f27768n = this.f27778n;
            if ((this.f27774j & 16) == 16) {
                this.f27779o = Collections.unmodifiableList(this.f27779o);
                this.f27774j &= -17;
            }
            sVar.f27769o = this.f27779o;
            if ((this.f27774j & 32) == 32) {
                this.f27780p = Collections.unmodifiableList(this.f27780p);
                this.f27774j &= -33;
            }
            sVar.f27770p = this.f27780p;
            sVar.f27764j = i11;
            return sVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b j(s sVar) {
            if (sVar == s.J()) {
                return this;
            }
            if (sVar.T()) {
                A(sVar.L());
            }
            if (sVar.U()) {
                B(sVar.M());
            }
            if (sVar.V()) {
                C(sVar.N());
            }
            if (sVar.W()) {
                D(sVar.S());
            }
            if (!sVar.f27769o.isEmpty()) {
                if (this.f27779o.isEmpty()) {
                    this.f27779o = sVar.f27769o;
                    this.f27774j &= -17;
                } else {
                    w();
                    this.f27779o.addAll(sVar.f27769o);
                }
            }
            if (!sVar.f27770p.isEmpty()) {
                if (this.f27780p.isEmpty()) {
                    this.f27780p = sVar.f27770p;
                    this.f27774j &= -33;
                } else {
                    v();
                    this.f27780p.addAll(sVar.f27770p);
                }
            }
            o(sVar);
            k(i().o(sVar.f27763i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            s sVar = null;
            try {
                try {
                    s sVar2 = (s) s.f27762u.a(c2946e, c2948g);
                    if (sVar2 != null) {
                        j(sVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    s sVar3 = (s) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        sVar = sVar3;
                        if (sVar != null) {
                            j(sVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sVar != null) {
                }
                throw th;
            }
        }

        private void x() {
        }
    }
}
