package f8;

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
public final class o extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final o f27646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static m8.r f27647m = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f27649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f27650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27651k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public o a(C2946e c2946e, C2948g c2948g) {
            return new o(c2946e, c2948g);
        }
    }

    static {
        o oVar = new o(true);
        f27646l = oVar;
        oVar.w();
    }

    public static o t() {
        return f27646l;
    }

    private void w() {
        this.f27649i = Collections.EMPTY_LIST;
    }

    public static b x() {
        return b.p();
    }

    public static b y(o oVar) {
        return x().j(oVar);
    }

    @Override // m8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b f() {
        return y(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27651k;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < this.f27649i.size(); i11++) {
            iR += C2947f.r(1, (m8.p) this.f27649i.get(i11));
        }
        int size = iR + this.f27648h.size();
        this.f27651k = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27650j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < v(); i10++) {
            if (!u(i10).e()) {
                this.f27650j = (byte) 0;
                return false;
            }
        }
        this.f27650j = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        for (int i10 = 0; i10 < this.f27649i.size(); i10++) {
            c2947f.c0(1, (m8.p) this.f27649i.get(i10));
        }
        c2947f.h0(this.f27648h);
    }

    public c u(int i10) {
        return (c) this.f27649i.get(i10);
    }

    public int v() {
        return this.f27649i.size();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b c() {
        return x();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC2950i implements m8.q {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final c f27654o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static m8.r f27655p = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f27656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27657i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27658j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27659k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private EnumC0278c f27660l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f27661m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f27662n;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a extends AbstractC2943b {
            a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c a(C2946e c2946e, C2948g c2948g) {
                return new c(c2946e, c2948g);
            }
        }

        /* JADX INFO: renamed from: f8.o$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public enum EnumC0278c implements AbstractC2951j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static AbstractC2951j.b f27670k = new a();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f27672g;

            /* JADX INFO: renamed from: f8.o$c$c$a */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            static class a implements AbstractC2951j.b {
                a() {
                }

                @Override // m8.AbstractC2951j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC0278c a(int i10) {
                    return EnumC0278c.h(i10);
                }
            }

            EnumC0278c(int i10, int i11) {
                this.f27672g = i11;
            }

            public static EnumC0278c h(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // m8.AbstractC2951j.a
            public final int a() {
                return this.f27672g;
            }
        }

        static {
            c cVar = new c(true);
            f27654o = cVar;
            cVar.C();
        }

        private void C() {
            this.f27658j = -1;
            this.f27659k = 0;
            this.f27660l = EnumC0278c.PACKAGE;
        }

        public static b D() {
            return b.p();
        }

        public static b E(c cVar) {
            return D().j(cVar);
        }

        public static c v() {
            return f27654o;
        }

        public boolean A() {
            return (this.f27657i & 1) == 1;
        }

        public boolean B() {
            return (this.f27657i & 2) == 2;
        }

        @Override // m8.p
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b c() {
            return D();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b f() {
            return E(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f27662n;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f27657i & 1) == 1 ? C2947f.o(1, this.f27658j) : 0;
            if ((this.f27657i & 2) == 2) {
                iO += C2947f.o(2, this.f27659k);
            }
            if ((this.f27657i & 4) == 4) {
                iO += C2947f.h(3, this.f27660l.a());
            }
            int size = iO + this.f27656h.size();
            this.f27662n = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f27661m;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (B()) {
                this.f27661m = (byte) 1;
                return true;
            }
            this.f27661m = (byte) 0;
            return false;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f27657i & 1) == 1) {
                c2947f.Z(1, this.f27658j);
            }
            if ((this.f27657i & 2) == 2) {
                c2947f.Z(2, this.f27659k);
            }
            if ((this.f27657i & 4) == 4) {
                c2947f.R(3, this.f27660l.a());
            }
            c2947f.h0(this.f27656h);
        }

        public EnumC0278c w() {
            return this.f27660l;
        }

        public int x() {
            return this.f27658j;
        }

        public int y() {
            return this.f27659k;
        }

        public boolean z() {
            return (this.f27657i & 4) == 4;
        }

        private c(AbstractC2950i.b bVar) {
            super(bVar);
            this.f27661m = (byte) -1;
            this.f27662n = -1;
            this.f27656h = bVar.i();
        }

        private c(boolean z10) {
            this.f27661m = (byte) -1;
            this.f27662n = -1;
            this.f27656h = AbstractC2945d.f29639g;
        }

        private c(C2946e c2946e, C2948g c2948g) {
            this.f27661m = (byte) -1;
            this.f27662n = -1;
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
                                    this.f27657i |= 1;
                                    this.f27658j = c2946e.r();
                                } else if (iJ == 16) {
                                    this.f27657i |= 2;
                                    this.f27659k = c2946e.r();
                                } else if (iJ != 24) {
                                    if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                    }
                                } else {
                                    int iM = c2946e.m();
                                    EnumC0278c enumC0278cH = EnumC0278c.h(iM);
                                    if (enumC0278cH == null) {
                                        c2947fI.n0(iJ);
                                        c2947fI.n0(iM);
                                    } else {
                                        this.f27657i |= 4;
                                        this.f27660l = enumC0278cH;
                                    }
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
                        this.f27656h = bVarY.m();
                        throw th2;
                    }
                    this.f27656h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27656h = bVarY.m();
                throw th3;
            }
            this.f27656h = bVarY.m();
            l();
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends AbstractC2950i.b implements m8.q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f27663h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f27665j;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f27664i = -1;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private EnumC0278c f27666k = EnumC0278c.PACKAGE;

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b p() {
                return new b();
            }

            @Override // m8.p.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarN = n();
                if (cVarN.e()) {
                    return cVarN;
                }
                throw AbstractC2942a.AbstractC0318a.h(cVarN);
            }

            public c n() {
                c cVar = new c(this);
                int i10 = this.f27663h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f27658j = this.f27664i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f27659k = this.f27665j;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                cVar.f27660l = this.f27666k;
                cVar.f27657i = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.v()) {
                    return this;
                }
                if (cVar.A()) {
                    v(cVar.x());
                }
                if (cVar.B()) {
                    w(cVar.y());
                }
                if (cVar.z()) {
                    u(cVar.w());
                }
                k(i().o(cVar.f27656h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c cVar2 = (c) c.f27655p.a(c2946e, c2948g);
                        if (cVar2 != null) {
                            j(cVar2);
                        }
                        return this;
                    } catch (C2952k e10) {
                        c cVar3 = (c) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            cVar = cVar3;
                            if (cVar != null) {
                                j(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cVar != null) {
                    }
                    throw th;
                }
            }

            public b u(EnumC0278c enumC0278c) {
                enumC0278c.getClass();
                this.f27663h |= 4;
                this.f27666k = enumC0278c;
                return this;
            }

            public b v(int i10) {
                this.f27663h |= 1;
                this.f27664i = i10;
                return this;
            }

            public b w(int i10) {
                this.f27663h |= 2;
                this.f27665j = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    private o(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27650j = (byte) -1;
        this.f27651k = -1;
        this.f27648h = bVar.i();
    }

    private o(boolean z10) {
        this.f27650j = (byte) -1;
        this.f27651k = -1;
        this.f27648h = AbstractC2945d.f29639g;
    }

    private o(C2946e c2946e, C2948g c2948g) {
        this.f27650j = (byte) -1;
        this.f27651k = -1;
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
                                this.f27649i = new ArrayList();
                                z11 = true;
                            }
                            this.f27649i.add(c2946e.t(c.f27655p, c2948g));
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
                    this.f27649i = Collections.unmodifiableList(this.f27649i);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27648h = bVarY.m();
                    throw th2;
                }
                this.f27648h = bVarY.m();
                l();
                throw th;
            }
        }
        if (z11) {
            this.f27649i = Collections.unmodifiableList(this.f27649i);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27648h = bVarY.m();
            throw th3;
        }
        this.f27648h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27652h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f27653i = Collections.EMPTY_LIST;

        private b() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b p() {
            return new b();
        }

        private void q() {
            if ((this.f27652h & 1) != 1) {
                this.f27653i = new ArrayList(this.f27653i);
                this.f27652h |= 1;
            }
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public o build() {
            o oVarN = n();
            if (oVarN.e()) {
                return oVarN;
            }
            throw AbstractC2942a.AbstractC0318a.h(oVarN);
        }

        public o n() {
            o oVar = new o(this);
            if ((this.f27652h & 1) == 1) {
                this.f27653i = Collections.unmodifiableList(this.f27653i);
                this.f27652h &= -2;
            }
            oVar.f27649i = this.f27653i;
            return oVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(o oVar) {
            if (oVar == o.t()) {
                return this;
            }
            if (!oVar.f27649i.isEmpty()) {
                if (this.f27653i.isEmpty()) {
                    this.f27653i = oVar.f27649i;
                    this.f27652h &= -2;
                } else {
                    q();
                    this.f27653i.addAll(oVar.f27649i);
                }
            }
            k(i().o(oVar.f27648h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            o oVar = null;
            try {
                try {
                    o oVar2 = (o) o.f27647m.a(c2946e, c2948g);
                    if (oVar2 != null) {
                        j(oVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    o oVar3 = (o) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        oVar = oVar3;
                        if (oVar != null) {
                            j(oVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (oVar != null) {
                }
                throw th;
            }
        }

        private void r() {
        }
    }
}
