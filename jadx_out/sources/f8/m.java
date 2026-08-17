package f8;

import f8.l;
import f8.o;
import f8.p;
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
public final class m extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final m f27595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static m8.r f27596r = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p f27599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o f27600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f27601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f27602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f27603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27604p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public m a(C2946e c2946e, C2948g c2948g) {
            return new m(c2946e, c2948g);
        }
    }

    static {
        m mVar = new m(true);
        f27595q = mVar;
        mVar.R();
    }

    public static m J() {
        return f27595q;
    }

    private void R() {
        this.f27599k = p.t();
        this.f27600l = o.t();
        this.f27601m = l.J();
        this.f27602n = Collections.EMPTY_LIST;
    }

    public static b S() {
        return b.u();
    }

    public static b T(m mVar) {
        return S().j(mVar);
    }

    public static m V(InputStream inputStream, C2948g c2948g) {
        return (m) f27596r.c(inputStream, c2948g);
    }

    public c G(int i10) {
        return (c) this.f27602n.get(i10);
    }

    public int H() {
        return this.f27602n.size();
    }

    public List I() {
        return this.f27602n;
    }

    @Override // m8.q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public m a() {
        return f27595q;
    }

    public l L() {
        return this.f27601m;
    }

    public o M() {
        return this.f27600l;
    }

    public p N() {
        return this.f27599k;
    }

    public boolean O() {
        return (this.f27598j & 4) == 4;
    }

    public boolean P() {
        return (this.f27598j & 2) == 2;
    }

    public boolean Q() {
        return (this.f27598j & 1) == 1;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b c() {
        return S();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b f() {
        return T(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27604p;
        if (i10 != -1) {
            return i10;
        }
        int iR = (this.f27598j & 1) == 1 ? C2947f.r(1, this.f27599k) : 0;
        if ((this.f27598j & 2) == 2) {
            iR += C2947f.r(2, this.f27600l);
        }
        if ((this.f27598j & 4) == 4) {
            iR += C2947f.r(3, this.f27601m);
        }
        for (int i11 = 0; i11 < this.f27602n.size(); i11++) {
            iR += C2947f.r(4, (m8.p) this.f27602n.get(i11));
        }
        int iS = iR + s() + this.f27597i.size();
        this.f27604p = iS;
        return iS;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27603o;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (P() && !M().e()) {
            this.f27603o = (byte) 0;
            return false;
        }
        if (O() && !L().e()) {
            this.f27603o = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < H(); i10++) {
            if (!G(i10).e()) {
                this.f27603o = (byte) 0;
                return false;
            }
        }
        if (r()) {
            this.f27603o = (byte) 1;
            return true;
        }
        this.f27603o = (byte) 0;
        return false;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27598j & 1) == 1) {
            c2947f.c0(1, this.f27599k);
        }
        if ((this.f27598j & 2) == 2) {
            c2947f.c0(2, this.f27600l);
        }
        if ((this.f27598j & 4) == 4) {
            c2947f.c0(3, this.f27601m);
        }
        for (int i10 = 0; i10 < this.f27602n.size(); i10++) {
            c2947f.c0(4, (m8.p) this.f27602n.get(i10));
        }
        aVarX.a(200, c2947f);
        c2947f.h0(this.f27597i);
    }

    private m(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27603o = (byte) -1;
        this.f27604p = -1;
        this.f27597i = cVar.i();
    }

    private m(boolean z10) {
        this.f27603o = (byte) -1;
        this.f27604p = -1;
        this.f27597i = AbstractC2945d.f29639g;
    }

    private m(C2946e c2946e, C2948g c2948g) {
        this.f27603o = (byte) -1;
        this.f27604p = -1;
        R();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            p.b bVarA = (this.f27598j & 1) == 1 ? this.f27599k.f() : null;
                            p pVar = (p) c2946e.t(p.f27674m, c2948g);
                            this.f27599k = pVar;
                            if (bVarA != null) {
                                bVarA.j(pVar);
                                this.f27599k = bVarA.n();
                            }
                            this.f27598j |= 1;
                        } else if (iJ == 18) {
                            o.b bVarA2 = (this.f27598j & 2) == 2 ? this.f27600l.f() : null;
                            o oVar = (o) c2946e.t(o.f27647m, c2948g);
                            this.f27600l = oVar;
                            if (bVarA2 != null) {
                                bVarA2.j(oVar);
                                this.f27600l = bVarA2.n();
                            }
                            this.f27598j |= 2;
                        } else if (iJ == 26) {
                            l.b bVarF = (this.f27598j & 4) == 4 ? this.f27601m.f() : null;
                            l lVar = (l) c2946e.t(l.f27579s, c2948g);
                            this.f27601m = lVar;
                            if (bVarF != null) {
                                bVarF.j(lVar);
                                this.f27601m = bVarF.r();
                            }
                            this.f27598j |= 4;
                        } else if (iJ != 34) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            int i10 = (c10 == true ? 1 : 0) & '\b';
                            c10 = c10;
                            if (i10 != 8) {
                                this.f27602n = new ArrayList();
                                c10 = '\b';
                            }
                            this.f27602n.add(c2946e.t(c.f27374R, c2948g));
                        }
                    }
                    z10 = true;
                } catch (C2952k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C2952k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & '\b') == 8) {
                    this.f27602n = Collections.unmodifiableList(this.f27602n);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27597i = bVarY.m();
                    throw th2;
                }
                this.f27597i = bVarY.m();
                l();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & '\b') == 8) {
            this.f27602n = Collections.unmodifiableList(this.f27602n);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27597i = bVarY.m();
            throw th3;
        }
        this.f27597i = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27605j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private p f27606k = p.t();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private o f27607l = o.t();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private l f27608m = l.J();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f27609n = Collections.EMPTY_LIST;

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27605j & 8) != 8) {
                this.f27609n = new ArrayList(this.f27609n);
                this.f27605j |= 8;
            }
        }

        public b A(o oVar) {
            if ((this.f27605j & 2) != 2 || this.f27607l == o.t()) {
                this.f27607l = oVar;
            } else {
                this.f27607l = o.y(this.f27607l).j(oVar).n();
            }
            this.f27605j |= 2;
            return this;
        }

        public b B(p pVar) {
            if ((this.f27605j & 1) != 1 || this.f27606k == p.t()) {
                this.f27606k = pVar;
            } else {
                this.f27606k = p.y(this.f27606k).j(pVar).n();
            }
            this.f27605j |= 1;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public m build() {
            m mVarR = r();
            if (mVarR.e()) {
                return mVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(mVarR);
        }

        public m r() {
            m mVar = new m(this);
            int i10 = this.f27605j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            mVar.f27599k = this.f27606k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            mVar.f27600l = this.f27607l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            mVar.f27601m = this.f27608m;
            if ((this.f27605j & 8) == 8) {
                this.f27609n = Collections.unmodifiableList(this.f27609n);
                this.f27605j &= -9;
            }
            mVar.f27602n = this.f27609n;
            mVar.f27598j = i11;
            return mVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b j(m mVar) {
            if (mVar == m.J()) {
                return this;
            }
            if (mVar.Q()) {
                B(mVar.N());
            }
            if (mVar.P()) {
                A(mVar.M());
            }
            if (mVar.O()) {
                z(mVar.L());
            }
            if (!mVar.f27602n.isEmpty()) {
                if (this.f27609n.isEmpty()) {
                    this.f27609n = mVar.f27602n;
                    this.f27605j &= -9;
                } else {
                    v();
                    this.f27609n.addAll(mVar.f27602n);
                }
            }
            o(mVar);
            k(i().o(mVar.f27597i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            m mVar = null;
            try {
                try {
                    m mVar2 = (m) m.f27596r.a(c2946e, c2948g);
                    if (mVar2 != null) {
                        j(mVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    m mVar3 = (m) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        mVar = mVar3;
                        if (mVar != null) {
                            j(mVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (mVar != null) {
                }
                throw th;
            }
        }

        public b z(l lVar) {
            if ((this.f27605j & 4) != 4 || this.f27608m == l.J()) {
                this.f27608m = lVar;
            } else {
                this.f27608m = l.a0(this.f27608m).j(lVar).r();
            }
            this.f27605j |= 4;
            return this;
        }

        private void w() {
        }
    }
}
