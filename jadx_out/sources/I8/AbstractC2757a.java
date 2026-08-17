package i8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import f8.i;
import f8.l;
import f8.n;
import f8.s;
import java.io.IOException;
import java.io.InputStream;
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
import m8.p;
import m8.q;
import m8.r;
import m8.y;

/* JADX INFO: renamed from: i8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2950i.f f28744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2950i.f f28745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2950i.f f28746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2950i.f f28747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2950i.f f28748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2950i.f f28749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2950i.f f28750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC2950i.f f28751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC2950i.f f28752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC2950i.f f28753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC2950i.f f28754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC2950i.f f28755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AbstractC2950i.f f28756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC2950i.f f28757n;

    /* JADX INFO: renamed from: i8.a$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class e extends AbstractC2950i implements q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final e f28797n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static r f28798o = new C0297a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f28799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f28800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f28801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f28802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f28803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f28804m;

        /* JADX INFO: renamed from: i8.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0297a extends AbstractC2943b {
            C0297a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e a(C2946e c2946e, C2948g c2948g) {
                return new e(c2946e, c2948g);
            }
        }

        static {
            e eVar = new e(true);
            f28797n = eVar;
            eVar.y();
        }

        public static b A(e eVar) {
            return z().j(eVar);
        }

        public static e C(InputStream inputStream, C2948g c2948g) {
            return (e) f28798o.b(inputStream, c2948g);
        }

        public static e v() {
            return f28797n;
        }

        private void y() {
            List list = Collections.EMPTY_LIST;
            this.f28800i = list;
            this.f28801j = list;
        }

        public static b z() {
            return b.p();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b c() {
            return z();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b f() {
            return A(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f28804m;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f28800i.size(); i11++) {
                iR += C2947f.r(1, (p) this.f28800i.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f28801j.size(); i12++) {
                iP += C2947f.p(((Integer) this.f28801j.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!w().isEmpty()) {
                iP2 = iP2 + 1 + C2947f.p(iP);
            }
            this.f28802k = iP;
            int size = iP2 + this.f28799h.size();
            this.f28804m = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f28803l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f28803l = (byte) 1;
            return true;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            for (int i10 = 0; i10 < this.f28800i.size(); i10++) {
                c2947f.c0(1, (p) this.f28800i.get(i10));
            }
            if (w().size() > 0) {
                c2947f.n0(42);
                c2947f.n0(this.f28802k);
            }
            for (int i11 = 0; i11 < this.f28801j.size(); i11++) {
                c2947f.a0(((Integer) this.f28801j.get(i11)).intValue());
            }
            c2947f.h0(this.f28799h);
        }

        public List w() {
            return this.f28801j;
        }

        public List x() {
            return this.f28800i;
        }

        /* JADX INFO: renamed from: i8.a$e$c */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class c extends AbstractC2950i implements q {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private static final c f28808t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static r f28809u = new C0298a();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final AbstractC2945d f28810h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f28811i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f28812j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f28813k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private Object f28814l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private EnumC0299c f28815m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f28816n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f28817o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private List f28818p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f28819q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private byte f28820r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private int f28821s;

            /* JADX INFO: renamed from: i8.a$e$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            static class C0298a extends AbstractC2943b {
                C0298a() {
                }

                @Override // m8.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c a(C2946e c2946e, C2948g c2948g) {
                    return new c(c2946e, c2948g);
                }
            }

            /* JADX INFO: renamed from: i8.a$e$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public enum EnumC0299c implements AbstractC2951j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private static AbstractC2951j.b f28832k = new C0300a();

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final int f28834g;

                /* JADX INFO: renamed from: i8.a$e$c$c$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
                static class C0300a implements AbstractC2951j.b {
                    C0300a() {
                    }

                    @Override // m8.AbstractC2951j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0299c a(int i10) {
                        return EnumC0299c.h(i10);
                    }
                }

                EnumC0299c(int i10, int i11) {
                    this.f28834g = i11;
                }

                public static EnumC0299c h(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // m8.AbstractC2951j.a
                public final int a() {
                    return this.f28834g;
                }
            }

            static {
                c cVar = new c(true);
                f28808t = cVar;
                cVar.P();
            }

            public static c B() {
                return f28808t;
            }

            private void P() {
                this.f28812j = 1;
                this.f28813k = 0;
                this.f28814l = PointerEventHelper.POINTER_TYPE_UNKNOWN;
                this.f28815m = EnumC0299c.NONE;
                List list = Collections.EMPTY_LIST;
                this.f28816n = list;
                this.f28818p = list;
            }

            public static b Q() {
                return b.p();
            }

            public static b R(c cVar) {
                return Q().j(cVar);
            }

            public EnumC0299c C() {
                return this.f28815m;
            }

            public int D() {
                return this.f28813k;
            }

            public int E() {
                return this.f28812j;
            }

            public int F() {
                return this.f28818p.size();
            }

            public List G() {
                return this.f28818p;
            }

            public String H() {
                Object obj = this.f28814l;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC2945d abstractC2945d = (AbstractC2945d) obj;
                String strE = abstractC2945d.E();
                if (abstractC2945d.x()) {
                    this.f28814l = strE;
                }
                return strE;
            }

            public AbstractC2945d I() {
                Object obj = this.f28814l;
                if (!(obj instanceof String)) {
                    return (AbstractC2945d) obj;
                }
                AbstractC2945d abstractC2945dS = AbstractC2945d.s((String) obj);
                this.f28814l = abstractC2945dS;
                return abstractC2945dS;
            }

            public int J() {
                return this.f28816n.size();
            }

            public List K() {
                return this.f28816n;
            }

            public boolean L() {
                return (this.f28811i & 8) == 8;
            }

            public boolean M() {
                return (this.f28811i & 2) == 2;
            }

            public boolean N() {
                return (this.f28811i & 1) == 1;
            }

            public boolean O() {
                return (this.f28811i & 4) == 4;
            }

            @Override // m8.p
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public b c() {
                return Q();
            }

            @Override // m8.p
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public b f() {
                return R(this);
            }

            @Override // m8.p
            public int b() {
                int i10 = this.f28821s;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f28811i & 1) == 1 ? C2947f.o(1, this.f28812j) : 0;
                if ((this.f28811i & 2) == 2) {
                    iO += C2947f.o(2, this.f28813k);
                }
                if ((this.f28811i & 8) == 8) {
                    iO += C2947f.h(3, this.f28815m.a());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f28816n.size(); i11++) {
                    iP += C2947f.p(((Integer) this.f28816n.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!K().isEmpty()) {
                    iP2 = iP2 + 1 + C2947f.p(iP);
                }
                this.f28817o = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f28818p.size(); i12++) {
                    iP3 += C2947f.p(((Integer) this.f28818p.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!G().isEmpty()) {
                    iD = iD + 1 + C2947f.p(iP3);
                }
                this.f28819q = iP3;
                if ((this.f28811i & 4) == 4) {
                    iD += C2947f.d(6, I());
                }
                int size = iD + this.f28810h.size();
                this.f28821s = size;
                return size;
            }

            @Override // m8.q
            public final boolean e() {
                byte b10 = this.f28820r;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f28820r = (byte) 1;
                return true;
            }

            @Override // m8.p
            public void g(C2947f c2947f) throws IOException {
                b();
                if ((this.f28811i & 1) == 1) {
                    c2947f.Z(1, this.f28812j);
                }
                if ((this.f28811i & 2) == 2) {
                    c2947f.Z(2, this.f28813k);
                }
                if ((this.f28811i & 8) == 8) {
                    c2947f.R(3, this.f28815m.a());
                }
                if (K().size() > 0) {
                    c2947f.n0(34);
                    c2947f.n0(this.f28817o);
                }
                for (int i10 = 0; i10 < this.f28816n.size(); i10++) {
                    c2947f.a0(((Integer) this.f28816n.get(i10)).intValue());
                }
                if (G().size() > 0) {
                    c2947f.n0(42);
                    c2947f.n0(this.f28819q);
                }
                for (int i11 = 0; i11 < this.f28818p.size(); i11++) {
                    c2947f.a0(((Integer) this.f28818p.get(i11)).intValue());
                }
                if ((this.f28811i & 4) == 4) {
                    c2947f.N(6, I());
                }
                c2947f.h0(this.f28810h);
            }

            private c(AbstractC2950i.b bVar) {
                super(bVar);
                this.f28817o = -1;
                this.f28819q = -1;
                this.f28820r = (byte) -1;
                this.f28821s = -1;
                this.f28810h = bVar.i();
            }

            private c(boolean z10) {
                this.f28817o = -1;
                this.f28819q = -1;
                this.f28820r = (byte) -1;
                this.f28821s = -1;
                this.f28810h = AbstractC2945d.f29639g;
            }

            private c(C2946e c2946e, C2948g c2948g) {
                this.f28817o = -1;
                this.f28819q = -1;
                this.f28820r = (byte) -1;
                this.f28821s = -1;
                P();
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
                                    this.f28811i |= 1;
                                    this.f28812j = c2946e.r();
                                } else if (iJ == 16) {
                                    this.f28811i |= 2;
                                    this.f28813k = c2946e.r();
                                } else if (iJ == 24) {
                                    int iM = c2946e.m();
                                    EnumC0299c enumC0299cH = EnumC0299c.h(iM);
                                    if (enumC0299cH == null) {
                                        c2947fI.n0(iJ);
                                        c2947fI.n0(iM);
                                    } else {
                                        this.f28811i |= 8;
                                        this.f28815m = enumC0299cH;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f28816n = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f28816n.add(Integer.valueOf(c2946e.r()));
                                } else if (iJ == 34) {
                                    int i11 = c2946e.i(c2946e.z());
                                    if ((i10 & 16) != 16 && c2946e.e() > 0) {
                                        this.f28816n = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (c2946e.e() > 0) {
                                        this.f28816n.add(Integer.valueOf(c2946e.r()));
                                    }
                                    c2946e.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f28818p = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f28818p.add(Integer.valueOf(c2946e.r()));
                                } else if (iJ == 42) {
                                    int i12 = c2946e.i(c2946e.z());
                                    if ((i10 & 32) != 32 && c2946e.e() > 0) {
                                        this.f28818p = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (c2946e.e() > 0) {
                                        this.f28818p.add(Integer.valueOf(c2946e.r()));
                                    }
                                    c2946e.h(i12);
                                } else if (iJ != 50) {
                                    if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                    }
                                } else {
                                    AbstractC2945d abstractC2945dK = c2946e.k();
                                    this.f28811i |= 4;
                                    this.f28814l = abstractC2945dK;
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
                            this.f28816n = Collections.unmodifiableList(this.f28816n);
                        }
                        if ((i10 & 32) == 32) {
                            this.f28818p = Collections.unmodifiableList(this.f28818p);
                        }
                        try {
                            c2947fI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f28810h = bVarY.m();
                            throw th2;
                        }
                        this.f28810h = bVarY.m();
                        l();
                        throw th;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f28816n = Collections.unmodifiableList(this.f28816n);
                }
                if ((i10 & 32) == 32) {
                    this.f28818p = Collections.unmodifiableList(this.f28818p);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f28810h = bVarY.m();
                    throw th3;
                }
                this.f28810h = bVarY.m();
                l();
            }

            /* JADX INFO: renamed from: i8.a$e$c$b */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public static final class b extends AbstractC2950i.b implements q {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f28822h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f28824j;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private List f28827m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private List f28828n;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f28823i = 1;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private Object f28825k = PointerEventHelper.POINTER_TYPE_UNKNOWN;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private EnumC0299c f28826l = EnumC0299c.NONE;

                private b() {
                    List list = Collections.EMPTY_LIST;
                    this.f28827m = list;
                    this.f28828n = list;
                    t();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static b p() {
                    return new b();
                }

                private void q() {
                    if ((this.f28822h & 32) != 32) {
                        this.f28828n = new ArrayList(this.f28828n);
                        this.f28822h |= 32;
                    }
                }

                private void r() {
                    if ((this.f28822h & 16) != 16) {
                        this.f28827m = new ArrayList(this.f28827m);
                        this.f28822h |= 16;
                    }
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
                    int i10 = this.f28822h;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f28812j = this.f28823i;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f28813k = this.f28824j;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f28814l = this.f28825k;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f28815m = this.f28826l;
                    if ((this.f28822h & 16) == 16) {
                        this.f28827m = Collections.unmodifiableList(this.f28827m);
                        this.f28822h &= -17;
                    }
                    cVar.f28816n = this.f28827m;
                    if ((this.f28822h & 32) == 32) {
                        this.f28828n = Collections.unmodifiableList(this.f28828n);
                        this.f28822h &= -33;
                    }
                    cVar.f28818p = this.f28828n;
                    cVar.f28811i = i11;
                    return cVar;
                }

                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return p().j(n());
                }

                @Override // m8.AbstractC2950i.b
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public b j(c cVar) {
                    if (cVar == c.B()) {
                        return this;
                    }
                    if (cVar.N()) {
                        y(cVar.E());
                    }
                    if (cVar.M()) {
                        x(cVar.D());
                    }
                    if (cVar.O()) {
                        this.f28822h |= 4;
                        this.f28825k = cVar.f28814l;
                    }
                    if (cVar.L()) {
                        w(cVar.C());
                    }
                    if (!cVar.f28816n.isEmpty()) {
                        if (this.f28827m.isEmpty()) {
                            this.f28827m = cVar.f28816n;
                            this.f28822h &= -17;
                        } else {
                            r();
                            this.f28827m.addAll(cVar.f28816n);
                        }
                    }
                    if (!cVar.f28818p.isEmpty()) {
                        if (this.f28828n.isEmpty()) {
                            this.f28828n = cVar.f28818p;
                            this.f28822h &= -33;
                        } else {
                            q();
                            this.f28828n.addAll(cVar.f28818p);
                        }
                    }
                    k(i().o(cVar.f28810h));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // m8.p.a
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVar2 = (c) c.f28809u.a(c2946e, c2948g);
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

                public b w(EnumC0299c enumC0299c) {
                    enumC0299c.getClass();
                    this.f28822h |= 8;
                    this.f28826l = enumC0299c;
                    return this;
                }

                public b x(int i10) {
                    this.f28822h |= 2;
                    this.f28824j = i10;
                    return this;
                }

                public b y(int i10) {
                    this.f28822h |= 1;
                    this.f28823i = i10;
                    return this;
                }

                private void t() {
                }
            }
        }

        private e(AbstractC2950i.b bVar) {
            super(bVar);
            this.f28802k = -1;
            this.f28803l = (byte) -1;
            this.f28804m = -1;
            this.f28799h = bVar.i();
        }

        private e(boolean z10) {
            this.f28802k = -1;
            this.f28803l = (byte) -1;
            this.f28804m = -1;
            this.f28799h = AbstractC2945d.f29639g;
        }

        private e(C2946e c2946e, C2948g c2948g) {
            this.f28802k = -1;
            this.f28803l = (byte) -1;
            this.f28804m = -1;
            y();
            AbstractC2945d.b bVarY = AbstractC2945d.y();
            C2947f c2947fI = C2947f.I(bVarY, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = c2946e.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f28800i = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f28800i.add(c2946e.t(c.f28809u, c2948g));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f28801j = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f28801j.add(Integer.valueOf(c2946e.r()));
                            } else if (iJ != 42) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                int i11 = c2946e.i(c2946e.z());
                                if ((i10 & 2) != 2 && c2946e.e() > 0) {
                                    this.f28801j = new ArrayList();
                                    i10 |= 2;
                                }
                                while (c2946e.e() > 0) {
                                    this.f28801j.add(Integer.valueOf(c2946e.r()));
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
                    if ((i10 & 1) == 1) {
                        this.f28800i = Collections.unmodifiableList(this.f28800i);
                    }
                    if ((i10 & 2) == 2) {
                        this.f28801j = Collections.unmodifiableList(this.f28801j);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f28799h = bVarY.m();
                        throw th2;
                    }
                    this.f28799h = bVarY.m();
                    l();
                    throw th;
                }
            }
            if ((i10 & 1) == 1) {
                this.f28800i = Collections.unmodifiableList(this.f28800i);
            }
            if ((i10 & 2) == 2) {
                this.f28801j = Collections.unmodifiableList(this.f28801j);
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28799h = bVarY.m();
                throw th3;
            }
            this.f28799h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: i8.a$e$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends AbstractC2950i.b implements q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f28805h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List f28806i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List f28807j;

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f28806i = list;
                this.f28807j = list;
                t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b p() {
                return new b();
            }

            private void q() {
                if ((this.f28805h & 2) != 2) {
                    this.f28807j = new ArrayList(this.f28807j);
                    this.f28805h |= 2;
                }
            }

            private void r() {
                if ((this.f28805h & 1) != 1) {
                    this.f28806i = new ArrayList(this.f28806i);
                    this.f28805h |= 1;
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
                if ((this.f28805h & 1) == 1) {
                    this.f28806i = Collections.unmodifiableList(this.f28806i);
                    this.f28805h &= -2;
                }
                eVar.f28800i = this.f28806i;
                if ((this.f28805h & 2) == 2) {
                    this.f28807j = Collections.unmodifiableList(this.f28807j);
                    this.f28805h &= -3;
                }
                eVar.f28801j = this.f28807j;
                return eVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b j(e eVar) {
                if (eVar == e.v()) {
                    return this;
                }
                if (!eVar.f28800i.isEmpty()) {
                    if (this.f28806i.isEmpty()) {
                        this.f28806i = eVar.f28800i;
                        this.f28805h &= -2;
                    } else {
                        r();
                        this.f28806i.addAll(eVar.f28800i);
                    }
                }
                if (!eVar.f28801j.isEmpty()) {
                    if (this.f28807j.isEmpty()) {
                        this.f28807j = eVar.f28801j;
                        this.f28805h &= -3;
                    } else {
                        q();
                        this.f28807j.addAll(eVar.f28801j);
                    }
                }
                k(i().o(eVar.f28799h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                e eVar = null;
                try {
                    try {
                        e eVar2 = (e) e.f28798o.a(c2946e, c2948g);
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

            private void t() {
            }
        }
    }

    static {
        f8.d dVarG = f8.d.G();
        c cVarU = c.u();
        c cVarU2 = c.u();
        y.b bVar = y.b.f29756s;
        f28744a = AbstractC2950i.n(dVarG, cVarU, cVarU2, null, 100, bVar, c.class);
        f28745b = AbstractC2950i.n(i.Z(), c.u(), c.u(), null, 100, bVar, c.class);
        i iVarZ = i.Z();
        y.b bVar2 = y.b.f29750m;
        f28746c = AbstractC2950i.n(iVarZ, 0, null, null, 101, bVar2, Integer.class);
        f28747d = AbstractC2950i.n(n.X(), d.x(), d.x(), null, 100, bVar, d.class);
        f28748e = AbstractC2950i.n(n.X(), 0, null, null, 101, bVar2, Integer.class);
        f28749f = AbstractC2950i.m(f8.q.W(), f8.b.y(), null, 100, bVar, false, f8.b.class);
        f28750g = AbstractC2950i.n(f8.q.W(), Boolean.FALSE, null, null, 101, y.b.f29753p, Boolean.class);
        f28751h = AbstractC2950i.m(s.J(), f8.b.y(), null, 100, bVar, false, f8.b.class);
        f28752i = AbstractC2950i.n(f8.c.y0(), 0, null, null, 101, bVar2, Integer.class);
        f28753j = AbstractC2950i.m(f8.c.y0(), n.X(), null, 102, bVar, false, n.class);
        f28754k = AbstractC2950i.n(f8.c.y0(), 0, null, null, 103, bVar2, Integer.class);
        f28755l = AbstractC2950i.n(f8.c.y0(), 0, null, null, 104, bVar2, Integer.class);
        f28756m = AbstractC2950i.n(l.J(), 0, null, null, 101, bVar2, Integer.class);
        f28757n = AbstractC2950i.m(l.J(), n.X(), null, 102, bVar, false, n.class);
    }

    public static void a(C2948g c2948g) {
        c2948g.a(f28744a);
        c2948g.a(f28745b);
        c2948g.a(f28746c);
        c2948g.a(f28747d);
        c2948g.a(f28748e);
        c2948g.a(f28749f);
        c2948g.a(f28750g);
        c2948g.a(f28751h);
        c2948g.a(f28752i);
        c2948g.a(f28753j);
        c2948g.a(f28754k);
        c2948g.a(f28755l);
        c2948g.a(f28756m);
        c2948g.a(f28757n);
    }

    /* JADX INFO: renamed from: i8.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i implements q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f28758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static r f28759o = new C0293a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f28760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28761i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f28762j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f28763k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f28764l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f28765m;

        /* JADX INFO: renamed from: i8.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0293a extends AbstractC2943b {
            C0293a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b a(C2946e c2946e, C2948g c2948g) {
                return new b(c2946e, c2948g);
            }
        }

        static {
            b bVar = new b(true);
            f28758n = bVar;
            bVar.z();
        }

        public static C0294b A() {
            return C0294b.p();
        }

        public static C0294b B(b bVar) {
            return A().j(bVar);
        }

        public static b u() {
            return f28758n;
        }

        private void z() {
            this.f28762j = 0;
            this.f28763k = 0;
        }

        @Override // m8.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0294b c() {
            return A();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C0294b f() {
            return B(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f28765m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f28761i & 1) == 1 ? C2947f.o(1, this.f28762j) : 0;
            if ((this.f28761i & 2) == 2) {
                iO += C2947f.o(2, this.f28763k);
            }
            int size = iO + this.f28760h.size();
            this.f28765m = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f28764l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f28764l = (byte) 1;
            return true;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f28761i & 1) == 1) {
                c2947f.Z(1, this.f28762j);
            }
            if ((this.f28761i & 2) == 2) {
                c2947f.Z(2, this.f28763k);
            }
            c2947f.h0(this.f28760h);
        }

        public int v() {
            return this.f28763k;
        }

        public int w() {
            return this.f28762j;
        }

        public boolean x() {
            return (this.f28761i & 2) == 2;
        }

        public boolean y() {
            return (this.f28761i & 1) == 1;
        }

        private b(AbstractC2950i.b bVar) {
            super(bVar);
            this.f28764l = (byte) -1;
            this.f28765m = -1;
            this.f28760h = bVar.i();
        }

        private b(boolean z10) {
            this.f28764l = (byte) -1;
            this.f28765m = -1;
            this.f28760h = AbstractC2945d.f29639g;
        }

        private b(C2946e c2946e, C2948g c2948g) {
            this.f28764l = (byte) -1;
            this.f28765m = -1;
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
                                this.f28761i |= 1;
                                this.f28762j = c2946e.r();
                            } else if (iJ != 16) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                this.f28761i |= 2;
                                this.f28763k = c2946e.r();
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
                        this.f28760h = bVarY.m();
                        throw th2;
                    }
                    this.f28760h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28760h = bVarY.m();
                throw th3;
            }
            this.f28760h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: i8.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0294b extends AbstractC2950i.b implements q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f28766h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f28767i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f28768j;

            private C0294b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C0294b p() {
                return new C0294b();
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
                int i10 = this.f28766h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f28762j = this.f28767i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f28763k = this.f28768j;
                bVar.f28761i = i11;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0294b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0294b j(b bVar) {
                if (bVar == b.u()) {
                    return this;
                }
                if (bVar.y()) {
                    v(bVar.w());
                }
                if (bVar.x()) {
                    u(bVar.v());
                }
                k(i().o(bVar.f28760h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0294b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVar2 = (b) b.f28759o.a(c2946e, c2948g);
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

            public C0294b u(int i10) {
                this.f28766h |= 2;
                this.f28768j = i10;
                return this;
            }

            public C0294b v(int i10) {
                this.f28766h |= 1;
                this.f28767i = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: renamed from: i8.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC2950i implements q {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final c f28769n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static r f28770o = new C0295a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f28771h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28772i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f28773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f28774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f28775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f28776m;

        /* JADX INFO: renamed from: i8.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0295a extends AbstractC2943b {
            C0295a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c a(C2946e c2946e, C2948g c2948g) {
                return new c(c2946e, c2948g);
            }
        }

        static {
            c cVar = new c(true);
            f28769n = cVar;
            cVar.z();
        }

        public static b A() {
            return b.p();
        }

        public static b B(c cVar) {
            return A().j(cVar);
        }

        public static c u() {
            return f28769n;
        }

        private void z() {
            this.f28773j = 0;
            this.f28774k = 0;
        }

        @Override // m8.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b c() {
            return A();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b f() {
            return B(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f28776m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f28772i & 1) == 1 ? C2947f.o(1, this.f28773j) : 0;
            if ((this.f28772i & 2) == 2) {
                iO += C2947f.o(2, this.f28774k);
            }
            int size = iO + this.f28771h.size();
            this.f28776m = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f28775l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f28775l = (byte) 1;
            return true;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f28772i & 1) == 1) {
                c2947f.Z(1, this.f28773j);
            }
            if ((this.f28772i & 2) == 2) {
                c2947f.Z(2, this.f28774k);
            }
            c2947f.h0(this.f28771h);
        }

        public int v() {
            return this.f28774k;
        }

        public int w() {
            return this.f28773j;
        }

        public boolean x() {
            return (this.f28772i & 2) == 2;
        }

        public boolean y() {
            return (this.f28772i & 1) == 1;
        }

        private c(AbstractC2950i.b bVar) {
            super(bVar);
            this.f28775l = (byte) -1;
            this.f28776m = -1;
            this.f28771h = bVar.i();
        }

        private c(boolean z10) {
            this.f28775l = (byte) -1;
            this.f28776m = -1;
            this.f28771h = AbstractC2945d.f29639g;
        }

        private c(C2946e c2946e, C2948g c2948g) {
            this.f28775l = (byte) -1;
            this.f28776m = -1;
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
                                this.f28772i |= 1;
                                this.f28773j = c2946e.r();
                            } else if (iJ != 16) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                this.f28772i |= 2;
                                this.f28774k = c2946e.r();
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
                        this.f28771h = bVarY.m();
                        throw th2;
                    }
                    this.f28771h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28771h = bVarY.m();
                throw th3;
            }
            this.f28771h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: i8.a$c$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends AbstractC2950i.b implements q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f28777h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f28778i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f28779j;

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
                int i10 = this.f28777h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f28773j = this.f28778i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f28774k = this.f28779j;
                cVar.f28772i = i11;
                return cVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.u()) {
                    return this;
                }
                if (cVar.y()) {
                    v(cVar.w());
                }
                if (cVar.x()) {
                    u(cVar.v());
                }
                k(i().o(cVar.f28771h));
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
                        c cVar2 = (c) c.f28770o.a(c2946e, c2948g);
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

            public b u(int i10) {
                this.f28777h |= 2;
                this.f28779j = i10;
                return this;
            }

            public b v(int i10) {
                this.f28777h |= 1;
                this.f28778i = i10;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: renamed from: i8.a$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC2950i implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final d f28780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static r f28781r = new C0296a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AbstractC2945d f28782h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f28783i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private b f28784j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f28785k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private c f28786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private c f28787m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f28788n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private byte f28789o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f28790p;

        /* JADX INFO: renamed from: i8.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0296a extends AbstractC2943b {
            C0296a() {
            }

            @Override // m8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d a(C2946e c2946e, C2948g c2948g) {
                return new d(c2946e, c2948g);
            }
        }

        static {
            d dVar = new d(true);
            f28780q = dVar;
            dVar.I();
        }

        private void I() {
            this.f28784j = b.u();
            this.f28785k = c.u();
            this.f28786l = c.u();
            this.f28787m = c.u();
            this.f28788n = c.u();
        }

        public static b J() {
            return b.p();
        }

        public static b K(d dVar) {
            return J().j(dVar);
        }

        public static d x() {
            return f28780q;
        }

        public c A() {
            return this.f28786l;
        }

        public c B() {
            return this.f28787m;
        }

        public c C() {
            return this.f28785k;
        }

        public boolean D() {
            return (this.f28783i & 16) == 16;
        }

        public boolean E() {
            return (this.f28783i & 1) == 1;
        }

        public boolean F() {
            return (this.f28783i & 4) == 4;
        }

        public boolean G() {
            return (this.f28783i & 8) == 8;
        }

        public boolean H() {
            return (this.f28783i & 2) == 2;
        }

        @Override // m8.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b c() {
            return J();
        }

        @Override // m8.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b f() {
            return K(this);
        }

        @Override // m8.p
        public int b() {
            int i10 = this.f28790p;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f28783i & 1) == 1 ? C2947f.r(1, this.f28784j) : 0;
            if ((this.f28783i & 2) == 2) {
                iR += C2947f.r(2, this.f28785k);
            }
            if ((this.f28783i & 4) == 4) {
                iR += C2947f.r(3, this.f28786l);
            }
            if ((this.f28783i & 8) == 8) {
                iR += C2947f.r(4, this.f28787m);
            }
            if ((this.f28783i & 16) == 16) {
                iR += C2947f.r(5, this.f28788n);
            }
            int size = iR + this.f28782h.size();
            this.f28790p = size;
            return size;
        }

        @Override // m8.q
        public final boolean e() {
            byte b10 = this.f28789o;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f28789o = (byte) 1;
            return true;
        }

        @Override // m8.p
        public void g(C2947f c2947f) throws IOException {
            b();
            if ((this.f28783i & 1) == 1) {
                c2947f.c0(1, this.f28784j);
            }
            if ((this.f28783i & 2) == 2) {
                c2947f.c0(2, this.f28785k);
            }
            if ((this.f28783i & 4) == 4) {
                c2947f.c0(3, this.f28786l);
            }
            if ((this.f28783i & 8) == 8) {
                c2947f.c0(4, this.f28787m);
            }
            if ((this.f28783i & 16) == 16) {
                c2947f.c0(5, this.f28788n);
            }
            c2947f.h0(this.f28782h);
        }

        public c y() {
            return this.f28788n;
        }

        public b z() {
            return this.f28784j;
        }

        private d(AbstractC2950i.b bVar) {
            super(bVar);
            this.f28789o = (byte) -1;
            this.f28790p = -1;
            this.f28782h = bVar.i();
        }

        private d(boolean z10) {
            this.f28789o = (byte) -1;
            this.f28790p = -1;
            this.f28782h = AbstractC2945d.f29639g;
        }

        private d(C2946e c2946e, C2948g c2948g) {
            this.f28789o = (byte) -1;
            this.f28790p = -1;
            I();
            AbstractC2945d.b bVarY = AbstractC2945d.y();
            C2947f c2947fI = C2947f.I(bVarY, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = c2946e.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0294b c0294bF = (this.f28783i & 1) == 1 ? this.f28784j.f() : null;
                                b bVar = (b) c2946e.t(b.f28759o, c2948g);
                                this.f28784j = bVar;
                                if (c0294bF != null) {
                                    c0294bF.j(bVar);
                                    this.f28784j = c0294bF.n();
                                }
                                this.f28783i |= 1;
                            } else if (iJ == 18) {
                                c.b bVarF = (this.f28783i & 2) == 2 ? this.f28785k.f() : null;
                                c cVar = (c) c2946e.t(c.f28770o, c2948g);
                                this.f28785k = cVar;
                                if (bVarF != null) {
                                    bVarF.j(cVar);
                                    this.f28785k = bVarF.n();
                                }
                                this.f28783i |= 2;
                            } else if (iJ == 26) {
                                c.b bVarF2 = (this.f28783i & 4) == 4 ? this.f28786l.f() : null;
                                c cVar2 = (c) c2946e.t(c.f28770o, c2948g);
                                this.f28786l = cVar2;
                                if (bVarF2 != null) {
                                    bVarF2.j(cVar2);
                                    this.f28786l = bVarF2.n();
                                }
                                this.f28783i |= 4;
                            } else if (iJ == 34) {
                                c.b bVarF3 = (this.f28783i & 8) == 8 ? this.f28787m.f() : null;
                                c cVar3 = (c) c2946e.t(c.f28770o, c2948g);
                                this.f28787m = cVar3;
                                if (bVarF3 != null) {
                                    bVarF3.j(cVar3);
                                    this.f28787m = bVarF3.n();
                                }
                                this.f28783i |= 8;
                            } else if (iJ != 42) {
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                            } else {
                                c.b bVarF4 = (this.f28783i & 16) == 16 ? this.f28788n.f() : null;
                                c cVar4 = (c) c2946e.t(c.f28770o, c2948g);
                                this.f28788n = cVar4;
                                if (bVarF4 != null) {
                                    bVarF4.j(cVar4);
                                    this.f28788n = bVarF4.n();
                                }
                                this.f28783i |= 16;
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
                        this.f28782h = bVarY.m();
                        throw th2;
                    }
                    this.f28782h = bVarY.m();
                    l();
                    throw th;
                }
            }
            try {
                c2947fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f28782h = bVarY.m();
                throw th3;
            }
            this.f28782h = bVarY.m();
            l();
        }

        /* JADX INFO: renamed from: i8.a$d$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class b extends AbstractC2950i.b implements q {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f28791h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private b f28792i = b.u();

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private c f28793j = c.u();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private c f28794k = c.u();

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private c f28795l = c.u();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private c f28796m = c.u();

            private b() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b p() {
                return new b();
            }

            @Override // m8.p.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarN = n();
                if (dVarN.e()) {
                    return dVarN;
                }
                throw AbstractC2942a.AbstractC0318a.h(dVarN);
            }

            public d n() {
                d dVar = new d(this);
                int i10 = this.f28791h;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f28784j = this.f28792i;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f28785k = this.f28793j;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f28786l = this.f28794k;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f28787m = this.f28795l;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f28788n = this.f28796m;
                dVar.f28783i = i11;
                return dVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            public b r(c cVar) {
                if ((this.f28791h & 16) != 16 || this.f28796m == c.u()) {
                    this.f28796m = cVar;
                } else {
                    this.f28796m = c.B(this.f28796m).j(cVar).n();
                }
                this.f28791h |= 16;
                return this;
            }

            public b t(b bVar) {
                if ((this.f28791h & 1) != 1 || this.f28792i == b.u()) {
                    this.f28792i = bVar;
                } else {
                    this.f28792i = b.B(this.f28792i).j(bVar).n();
                }
                this.f28791h |= 1;
                return this;
            }

            @Override // m8.AbstractC2950i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b j(d dVar) {
                if (dVar == d.x()) {
                    return this;
                }
                if (dVar.E()) {
                    t(dVar.z());
                }
                if (dVar.H()) {
                    y(dVar.C());
                }
                if (dVar.F()) {
                    w(dVar.A());
                }
                if (dVar.G()) {
                    x(dVar.B());
                }
                if (dVar.D()) {
                    r(dVar.y());
                }
                k(i().o(dVar.f28782h));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // m8.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
                d dVar = null;
                try {
                    try {
                        d dVar2 = (d) d.f28781r.a(c2946e, c2948g);
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

            public b w(c cVar) {
                if ((this.f28791h & 4) != 4 || this.f28794k == c.u()) {
                    this.f28794k = cVar;
                } else {
                    this.f28794k = c.B(this.f28794k).j(cVar).n();
                }
                this.f28791h |= 4;
                return this;
            }

            public b x(c cVar) {
                if ((this.f28791h & 8) != 8 || this.f28795l == c.u()) {
                    this.f28795l = cVar;
                } else {
                    this.f28795l = c.B(this.f28795l).j(cVar).n();
                }
                this.f28791h |= 8;
                return this;
            }

            public b y(c cVar) {
                if ((this.f28791h & 2) != 2 || this.f28793j == c.u()) {
                    this.f28793j = cVar;
                } else {
                    this.f28793j = c.B(this.f28793j).j(cVar).n();
                }
                this.f28791h |= 2;
                return this;
            }

            private void q() {
            }
        }
    }
}
