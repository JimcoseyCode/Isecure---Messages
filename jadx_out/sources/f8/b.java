package f8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
public final class b extends AbstractC2950i implements m8.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final b f27306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static m8.r f27307o = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC2945d f27308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f27311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f27312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27313m;

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

    /* JADX INFO: renamed from: f8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0273b extends AbstractC2950i implements m8.q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final C0273b f27314n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static m8.r f27315o = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f27316h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27317i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27318j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f27319k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f27320l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27321m;

        /* JADX INFO: renamed from: f8.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a extends AbstractC2943b {
            a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public C0273b a(C2946e c2946e, C2948g c2948g) {
                return new C0273b(c2946e, c2948g);
            }
        }

        static {
            C0273b c0273b = new C0273b(true);
            f27314n = c0273b;
            c0273b.z();
        }

        public static C0274b A() {
            return C0274b.p();
        }

        public static C0274b B(C0273b c0273b) {
            return A().j(c0273b);
        }

        public static C0273b u() {
            return f27314n;
        }

        private void z() {
            this.f27318j = 0;
            this.f27319k = c.K();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0274b c() {
            return A();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C0274b f() {
            return B(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f27321m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f27317i & 1) == 1 ? C2947f.o(1, this.f27318j) : 0;
            if ((this.f27317i & 2) == 2) {
                iO += C2947f.r(2, this.f27319k);
            }
            int size = iO + this.f27316h.size();
            this.f27321m = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f27320l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!x()) {
                this.f27320l = (byte) 0;
                return false;
            }
            if (!y()) {
                this.f27320l = (byte) 0;
                return false;
            }
            if (w().e()) {
                this.f27320l = (byte) 1;
                return true;
            }
            this.f27320l = (byte) 0;
            return false;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f27317i & 1) == 1) {
                c2947f.Z(1, this.f27318j);
            }
            if ((this.f27317i & 2) == 2) {
                c2947f.c0(2, this.f27319k);
            }
            c2947f.h0(this.f27316h);
        }

        public int v() {
            return this.f27318j;
        }

        public c w() {
            return this.f27319k;
        }

        public boolean x() {
            return (this.f27317i & 1) == 1;
        }

        public boolean y() {
            return (this.f27317i & 2) == 2;
        }

        /* JADX INFO: renamed from: f8.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends AbstractC2950i implements m8.q {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private static final c f27325w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static m8.r f27326x = new a();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final AbstractC2945d f27327h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f27328i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private EnumC0276c f27329j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private long f27330k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private float f27331l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private double f27332m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f27333n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f27334o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f27335p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private b f27336q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List f27337r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private int f27338s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f27339t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private byte f27340u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private int f27341v;

            /* JADX INFO: renamed from: f8.b$b$c$a */
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

            /* JADX INFO: renamed from: f8.b$b$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public enum EnumC0276c implements AbstractC2951j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: u, reason: collision with root package name */
                private static AbstractC2951j.b f27367u = new a();

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final int f27369g;

                /* JADX INFO: renamed from: f8.b$b$c$c$a */
                /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
                static class a implements AbstractC2951j.b {
                    a() {
                    }

                    @Override // m8.AbstractC2951j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0276c a(int i10) {
                        return EnumC0276c.h(i10);
                    }
                }

                EnumC0276c(int i10, int i11) {
                    this.f27369g = i11;
                }

                public static EnumC0276c h(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // m8.AbstractC2951j.a
                public final int a() {
                    return this.f27369g;
                }
            }

            static {
                c cVar = new c(true);
                f27325w = cVar;
                cVar.c0();
            }

            public static c K() {
                return f27325w;
            }

            private void c0() {
                this.f27329j = EnumC0276c.BYTE;
                this.f27330k = 0L;
                this.f27331l = 0.0f;
                this.f27332m = 0.0d;
                this.f27333n = 0;
                this.f27334o = 0;
                this.f27335p = 0;
                this.f27336q = b.y();
                this.f27337r = Collections.EMPTY_LIST;
                this.f27338s = 0;
                this.f27339t = 0;
            }

            public static C0275b d0() {
                return C0275b.p();
            }

            public static C0275b e0(c cVar) {
                return d0().j(cVar);
            }

            public b E() {
                return this.f27336q;
            }

            public int F() {
                return this.f27338s;
            }

            public c G(int i10) {
                return (c) this.f27337r.get(i10);
            }

            public int H() {
                return this.f27337r.size();
            }

            public List I() {
                return this.f27337r;
            }

            public int J() {
                return this.f27334o;
            }

            public double L() {
                return this.f27332m;
            }

            public int M() {
                return this.f27335p;
            }

            public int N() {
                return this.f27339t;
            }

            public float O() {
                return this.f27331l;
            }

            public long P() {
                return this.f27330k;
            }

            public int Q() {
                return this.f27333n;
            }

            public EnumC0276c R() {
                return this.f27329j;
            }

            public boolean S() {
                return (this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
            }

            public boolean T() {
                return (this.f27328i & 256) == 256;
            }

            public boolean U() {
                return (this.f27328i & 32) == 32;
            }

            public boolean V() {
                return (this.f27328i & 8) == 8;
            }

            public boolean W() {
                return (this.f27328i & 64) == 64;
            }

            public boolean X() {
                return (this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
            }

            public boolean Y() {
                return (this.f27328i & 4) == 4;
            }

            public boolean Z() {
                return (this.f27328i & 2) == 2;
            }

            public boolean a0() {
                return (this.f27328i & 16) == 16;
            }

            @Override // m8.p
            public int b() {
                int i10 = this.f27341v;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f27328i & 1) == 1 ? C2947f.h(1, this.f27329j.a()) : 0;
                if ((this.f27328i & 2) == 2) {
                    iH += C2947f.z(2, this.f27330k);
                }
                if ((this.f27328i & 4) == 4) {
                    iH += C2947f.l(3, this.f27331l);
                }
                if ((this.f27328i & 8) == 8) {
                    iH += C2947f.f(4, this.f27332m);
                }
                if ((this.f27328i & 16) == 16) {
                    iH += C2947f.o(5, this.f27333n);
                }
                if ((this.f27328i & 32) == 32) {
                    iH += C2947f.o(6, this.f27334o);
                }
                if ((this.f27328i & 64) == 64) {
                    iH += C2947f.o(7, this.f27335p);
                }
                if ((this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    iH += C2947f.r(8, this.f27336q);
                }
                for (int i11 = 0; i11 < this.f27337r.size(); i11++) {
                    iH += C2947f.r(9, (m8.p) this.f27337r.get(i11));
                }
                if ((this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    iH += C2947f.o(10, this.f27339t);
                }
                if ((this.f27328i & 256) == 256) {
                    iH += C2947f.o(11, this.f27338s);
                }
                int size = iH + this.f27327h.size();
                this.f27341v = size;
                return size;
            }

            public boolean b0() {
                return (this.f27328i & 1) == 1;
            }

            @Override // m8.q
            public final boolean e() {
                byte b10 = this.f27340u;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (S() && !E().e()) {
                    this.f27340u = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < H(); i10++) {
                    if (!G(i10).e()) {
                        this.f27340u = (byte) 0;
                        return false;
                    }
                }
                this.f27340u = (byte) 1;
                return true;
            }

            @Override // m8.p
            /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
            public C0275b c() {
                return d0();
            }

            @Override // m8.p
            public void g(C2947f c2947f) throws IOException {
                b();
                if ((this.f27328i & 1) == 1) {
                    c2947f.R(1, this.f27329j.a());
                }
                if ((this.f27328i & 2) == 2) {
                    c2947f.s0(2, this.f27330k);
                }
                if ((this.f27328i & 4) == 4) {
                    c2947f.V(3, this.f27331l);
                }
                if ((this.f27328i & 8) == 8) {
                    c2947f.P(4, this.f27332m);
                }
                if ((this.f27328i & 16) == 16) {
                    c2947f.Z(5, this.f27333n);
                }
                if ((this.f27328i & 32) == 32) {
                    c2947f.Z(6, this.f27334o);
                }
                if ((this.f27328i & 64) == 64) {
                    c2947f.Z(7, this.f27335p);
                }
                if ((this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    c2947f.c0(8, this.f27336q);
                }
                for (int i10 = 0; i10 < this.f27337r.size(); i10++) {
                    c2947f.c0(9, (m8.p) this.f27337r.get(i10));
                }
                if ((this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    c2947f.Z(10, this.f27339t);
                }
                if ((this.f27328i & 256) == 256) {
                    c2947f.Z(11, this.f27338s);
                }
                c2947f.h0(this.f27327h);
            }

            @Override // m8.p
            /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
            public C0275b f() {
                return e0(this);
            }

            private c(AbstractC2950i.b bVar) {
                super(bVar);
                this.f27340u = (byte) -1;
                this.f27341v = -1;
                this.f27327h = bVar.i();
            }

            private c(boolean z10) {
                this.f27340u = (byte) -1;
                this.f27341v = -1;
                this.f27327h = AbstractC2945d.f29639g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            private c(C2946e c2946e, C2948g c2948g) {
                this.f27340u = (byte) -1;
                this.f27341v = -1;
                c0();
                AbstractC2945d.b bVarY = AbstractC2945d.y();
                C2947f c2947fI = C2947f.I(bVarY, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? O9 = 256;
                    if (!z10) {
                        try {
                            try {
                                int iJ = c2946e.J();
                                switch (iJ) {
                                    case 0:
                                        z10 = true;
                                        break;
                                    case 8:
                                        int iM = c2946e.m();
                                        EnumC0276c enumC0276cH = EnumC0276c.h(iM);
                                        if (enumC0276cH == null) {
                                            c2947fI.n0(iJ);
                                            c2947fI.n0(iM);
                                        } else {
                                            this.f27328i |= 1;
                                            this.f27329j = enumC0276cH;
                                        }
                                        break;
                                    case 16:
                                        this.f27328i |= 2;
                                        this.f27330k = c2946e.G();
                                        break;
                                    case 29:
                                        this.f27328i |= 4;
                                        this.f27331l = c2946e.p();
                                        break;
                                    case 33:
                                        this.f27328i |= 8;
                                        this.f27332m = c2946e.l();
                                        break;
                                    case 40:
                                        this.f27328i |= 16;
                                        this.f27333n = c2946e.r();
                                        break;
                                    case 48:
                                        this.f27328i |= 32;
                                        this.f27334o = c2946e.r();
                                        break;
                                    case 56:
                                        this.f27328i |= 64;
                                        this.f27335p = c2946e.r();
                                        break;
                                    case 66:
                                        c cVarF = (this.f27328i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 ? this.f27336q.f() : null;
                                        b bVar = (b) c2946e.t(b.f27307o, c2948g);
                                        this.f27336q = bVar;
                                        if (cVarF != null) {
                                            cVarF.j(bVar);
                                            this.f27336q = cVarF.n();
                                        }
                                        this.f27328i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                        break;
                                    case 74:
                                        if ((c10 & 256) != 256) {
                                            this.f27337r = new ArrayList();
                                            c10 = 256;
                                        }
                                        this.f27337r.add(c2946e.t(f27326x, c2948g));
                                        break;
                                    case 80:
                                        this.f27328i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                        this.f27339t = c2946e.r();
                                        break;
                                    case 88:
                                        this.f27328i |= 256;
                                        this.f27338s = c2946e.r();
                                        break;
                                    default:
                                        O9 = o(c2946e, c2947fI, c2948g, iJ);
                                        if (O9 == 0) {
                                            z10 = true;
                                        }
                                        break;
                                }
                            } catch (C2952k e10) {
                                throw e10.i(this);
                            } catch (IOException e11) {
                                throw new C2952k(e11.getMessage()).i(this);
                            }
                        } catch (Throwable th) {
                            if ((c10 & 256) == O9) {
                                this.f27337r = Collections.unmodifiableList(this.f27337r);
                            }
                            try {
                                c2947fI.H();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f27327h = bVarY.m();
                                throw th2;
                            }
                            this.f27327h = bVarY.m();
                            l();
                            throw th;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f27337r = Collections.unmodifiableList(this.f27337r);
                        }
                        try {
                            c2947fI.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f27327h = bVarY.m();
                            throw th3;
                        }
                        this.f27327h = bVarY.m();
                        l();
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: f8.b$b$c$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class C0275b extends AbstractC2950i.b implements m8.q {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f27342h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private long f27344j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private float f27345k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private double f27346l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f27347m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f27348n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private int f27349o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                private int f27352r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                private int f27353s;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private EnumC0276c f27343i = EnumC0276c.BYTE;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                private b f27350p = b.y();

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                private List f27351q = Collections.EMPTY_LIST;

                private C0275b() {
                    r();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C0275b p() {
                    return new C0275b();
                }

                private void q() {
                    if ((this.f27342h & 256) != 256) {
                        this.f27351q = new ArrayList(this.f27351q);
                        this.f27342h |= 256;
                    }
                }

                public C0275b A(int i10) {
                    this.f27342h |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    this.f27353s = i10;
                    return this;
                }

                public C0275b B(float f10) {
                    this.f27342h |= 4;
                    this.f27345k = f10;
                    return this;
                }

                public C0275b C(long j10) {
                    this.f27342h |= 2;
                    this.f27344j = j10;
                    return this;
                }

                public C0275b D(int i10) {
                    this.f27342h |= 16;
                    this.f27347m = i10;
                    return this;
                }

                public C0275b E(EnumC0276c enumC0276c) {
                    enumC0276c.getClass();
                    this.f27342h |= 1;
                    this.f27343i = enumC0276c;
                    return this;
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
                    int i10 = this.f27342h;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f27329j = this.f27343i;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f27330k = this.f27344j;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f27331l = this.f27345k;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f27332m = this.f27346l;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f27333n = this.f27347m;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f27334o = this.f27348n;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f27335p = this.f27349o;
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    }
                    cVar.f27336q = this.f27350p;
                    if ((this.f27342h & 256) == 256) {
                        this.f27351q = Collections.unmodifiableList(this.f27351q);
                        this.f27342h &= -257;
                    }
                    cVar.f27337r = this.f27351q;
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        i11 |= 256;
                    }
                    cVar.f27338s = this.f27352r;
                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    cVar.f27339t = this.f27353s;
                    cVar.f27328i = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public C0275b clone() {
                    return p().j(n());
                }

                public C0275b t(b bVar) {
                    if ((this.f27342h & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128 || this.f27350p == b.y()) {
                        this.f27350p = bVar;
                    } else {
                        this.f27350p = b.D(this.f27350p).j(bVar).n();
                    }
                    this.f27342h |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    return this;
                }

                @Override // m8.AbstractC2950i.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public C0275b j(c cVar) {
                    if (cVar == c.K()) {
                        return this;
                    }
                    if (cVar.b0()) {
                        E(cVar.R());
                    }
                    if (cVar.Z()) {
                        C(cVar.P());
                    }
                    if (cVar.Y()) {
                        B(cVar.O());
                    }
                    if (cVar.V()) {
                        y(cVar.L());
                    }
                    if (cVar.a0()) {
                        D(cVar.Q());
                    }
                    if (cVar.U()) {
                        x(cVar.J());
                    }
                    if (cVar.W()) {
                        z(cVar.M());
                    }
                    if (cVar.S()) {
                        t(cVar.E());
                    }
                    if (!cVar.f27337r.isEmpty()) {
                        if (this.f27351q.isEmpty()) {
                            this.f27351q = cVar.f27337r;
                            this.f27342h &= -257;
                        } else {
                            q();
                            this.f27351q.addAll(cVar.f27337r);
                        }
                    }
                    if (cVar.T()) {
                        w(cVar.F());
                    }
                    if (cVar.X()) {
                        A(cVar.N());
                    }
                    k(i().o(cVar.f27327h));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // m8.p.a
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public C0275b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVar2 = (c) c.f27326x.a(c2946e, c2948g);
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

                public C0275b w(int i10) {
                    this.f27342h |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    this.f27352r = i10;
                    return this;
                }

                public C0275b x(int i10) {
                    this.f27342h |= 32;
                    this.f27348n = i10;
                    return this;
                }

                public C0275b y(double d10) {
                    this.f27342h |= 8;
                    this.f27346l = d10;
                    return this;
                }

                public C0275b z(int i10) {
                    this.f27342h |= 64;
                    this.f27349o = i10;
                    return this;
                }

                private void r() {
                }
            }
        }

        private C0273b(AbstractC2950i.b bVar) {
            super(bVar);
            this.f27320l = (byte) -1;
            this.f27321m = -1;
            this.f27316h = bVar.i();
        }

        private C0273b(boolean z10) {
            this.f27320l = (byte) -1;
            this.f27321m = -1;
            this.f27316h = AbstractC2945d.f29639g;
        }

        private C0273b(C2946e c2946e, C2948g c2948g) {
            this.f27320l = (byte) -1;
            this.f27321m = -1;
            z();
            AbstractC2945d.b bVarY = AbstractC2945d.y();
            C2947f c2947fI = C2947f.I(bVarY, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = c2946e.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f27317i |= 1;
                                this.f27318j = c2946e.r();
                            } else if (iJ != 18) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                c.C0275b c0275bF = (this.f27317i & 2) == 2 ? this.f27319k.f() : null;
                                c cVar = (c) c2946e.t(c.f27326x, c2948g);
                                this.f27319k = cVar;
                                if (c0275bF != null) {
                                    c0275bF.j(cVar);
                                    this.f27319k = c0275bF.n();
                                }
                                this.f27317i |= 2;
                            }
                        }
                        z10 = true;
                    } catch (C2952k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new C2952k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27316h = bVarY.m();
                        throw th2;
                    }
                    this.f27316h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27316h = bVarY.m();
                throw th3;
            }
            this.f27316h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: f8.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0274b extends AbstractC2950i.b implements m8.q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f27322h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f27323i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private c f27324j = c.K();

            private C0274b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0274b p() {
                return new C0274b();
            }

            @Override // m8.p.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0273b build() {
                C0273b c0273bN = n();
                if (c0273bN.e()) {
                    return c0273bN;
                }
                throw AbstractC2942a.AbstractC0318a.h(c0273bN);
            }

            public C0273b n() {
                C0273b c0273b = new C0273b(this);
                int i10 = this.f27322h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0273b.f27318j = this.f27323i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0273b.f27319k = this.f27324j;
                c0273b.f27317i = i11;
                return c0273b;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0274b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0274b j(C0273b c0273b) {
                if (c0273b == C0273b.u()) {
                    return this;
                }
                if (c0273b.x()) {
                    v(c0273b.v());
                }
                if (c0273b.y()) {
                    u(c0273b.w());
                }
                k(i().o(c0273b.f27316h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0274b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                C0273b c0273b = null;
                try {
                    try {
                        C0273b c0273b2 = (C0273b) C0273b.f27315o.a(c2946e, c2948g);
                        if (c0273b2 != null) {
                            j(c0273b2);
                        }
                        return this;
                    } catch (C2952k e10) {
                        C0273b c0273b3 = (C0273b) e10.a();
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            c0273b = c0273b3;
                            if (c0273b != null) {
                                j(c0273b);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (c0273b != null) {
                    }
                    throw th;
                }
            }

            public C0274b u(c cVar) {
                if ((this.f27322h & 2) != 2 || this.f27324j == c.K()) {
                    this.f27324j = cVar;
                } else {
                    this.f27324j = c.e0(this.f27324j).j(cVar).n();
                }
                this.f27322h |= 2;
                return this;
            }

            public C0274b v(int i10) {
                this.f27322h |= 1;
                this.f27323i = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    static {
        b bVar = new b(true);
        f27306n = bVar;
        bVar.B();
    }

    private void B() {
        this.f27310j = 0;
        this.f27311k = Collections.EMPTY_LIST;
    }

    public static c C() {
        return c.p();
    }

    public static c D(b bVar) {
        return C().j(bVar);
    }

    public static b y() {
        return f27306n;
    }

    public boolean A() {
        return (this.f27309i & 1) == 1;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c c() {
        return C();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public c f() {
        return D(this);
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27313m;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27309i & 1) == 1 ? C2947f.o(1, this.f27310j) : 0;
        for (int i11 = 0; i11 < this.f27311k.size(); i11++) {
            iO += C2947f.r(2, (m8.p) this.f27311k.get(i11));
        }
        int size = iO + this.f27308h.size();
        this.f27313m = size;
        return size;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27312l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!A()) {
            this.f27312l = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < w(); i10++) {
            if (!v(i10).e()) {
                this.f27312l = (byte) 0;
                return false;
            }
        }
        this.f27312l = (byte) 1;
        return true;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        if ((this.f27309i & 1) == 1) {
            c2947f.Z(1, this.f27310j);
        }
        for (int i10 = 0; i10 < this.f27311k.size(); i10++) {
            c2947f.c0(2, (m8.p) this.f27311k.get(i10));
        }
        c2947f.h0(this.f27308h);
    }

    public C0273b v(int i10) {
        return (C0273b) this.f27311k.get(i10);
    }

    public int w() {
        return this.f27311k.size();
    }

    public List x() {
        return this.f27311k;
    }

    public int z() {
        return this.f27310j;
    }

    private b(AbstractC2950i.b bVar) {
        super(bVar);
        this.f27312l = (byte) -1;
        this.f27313m = -1;
        this.f27308h = bVar.i();
    }

    private b(boolean z10) {
        this.f27312l = (byte) -1;
        this.f27313m = -1;
        this.f27308h = AbstractC2945d.f29639g;
    }

    private b(C2946e c2946e, C2948g c2948g) {
        this.f27312l = (byte) -1;
        this.f27313m = -1;
        B();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c2946e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f27309i |= 1;
                            this.f27310j = c2946e.r();
                        } else if (iJ != 18) {
                            if (!o(c2946e, c2947fI, c2948g, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f27311k = new ArrayList();
                                c10 = 2;
                            }
                            this.f27311k.add(c2946e.t(C0273b.f27315o, c2948g));
                        }
                    }
                    z10 = true;
                } catch (Throwable th) {
                    if ((c10 & 2) == 2) {
                        this.f27311k = Collections.unmodifiableList(this.f27311k);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27308h = bVarY.m();
                        throw th2;
                    }
                    this.f27308h = bVarY.m();
                    l();
                    throw th;
                }
            } catch (C2952k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C2952k(e11.getMessage()).i(this);
            }
        }
        if ((c10 & 2) == 2) {
            this.f27311k = Collections.unmodifiableList(this.f27311k);
        }
        try {
            c2947fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27308h = bVarY.m();
            throw th3;
        }
        this.f27308h = bVarY.m();
        l();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC2950i.b implements m8.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f27370h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27371i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f27372j = Collections.EMPTY_LIST;

        private c() {
            r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c p() {
            return new c();
        }

        private void q() {
            if ((this.f27370h & 2) != 2) {
                this.f27372j = new ArrayList(this.f27372j);
                this.f27370h |= 2;
            }
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
            int i10 = (this.f27370h & 1) != 1 ? 0 : 1;
            bVar.f27310j = this.f27371i;
            if ((this.f27370h & 2) == 2) {
                this.f27372j = Collections.unmodifiableList(this.f27372j);
                this.f27370h &= -3;
            }
            bVar.f27311k = this.f27372j;
            bVar.f27309i = i10;
            return bVar;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return p().j(n());
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c j(b bVar) {
            if (bVar == b.y()) {
                return this;
            }
            if (bVar.A()) {
                v(bVar.z());
            }
            if (!bVar.f27311k.isEmpty()) {
                if (this.f27372j.isEmpty()) {
                    this.f27372j = bVar.f27311k;
                    this.f27370h &= -3;
                } else {
                    q();
                    this.f27372j.addAll(bVar.f27311k);
                }
            }
            k(i().o(bVar.f27308h));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            b bVar = null;
            try {
                try {
                    b bVar2 = (b) b.f27307o.a(c2946e, c2948g);
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

        public c v(int i10) {
            this.f27370h |= 1;
            this.f27371i = i10;
            return this;
        }

        private void r() {
        }
    }
}
