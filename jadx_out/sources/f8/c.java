package f8;

import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
import f8.q;
import f8.t;
import f8.w;
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

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final c f27373Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static m8.r f27374R = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private List f27375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f27376B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f27377C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f27378D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private q f27379E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f27380F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private List f27381G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f27382H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private List f27383I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private List f27384J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f27385K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private t f27386L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private List f27387M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private w f27388N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private byte f27389O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f27390P;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f27396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f27397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f27398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f27400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f27402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List f27403u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27404v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f27405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f27406x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f27407y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f27408z;

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

    /* JADX INFO: renamed from: f8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum EnumC0277c implements AbstractC2951j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static AbstractC2951j.b f27441o = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f27443g;

        /* JADX INFO: renamed from: f8.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements AbstractC2951j.b {
            a() {
            }

            @Override // m8.AbstractC2951j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC0277c a(int i10) {
                return EnumC0277c.h(i10);
            }
        }

        EnumC0277c(int i10, int i11) {
            this.f27443g = i11;
        }

        public static EnumC0277c h(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // m8.AbstractC2951j.a
        public final int a() {
            return this.f27443g;
        }
    }

    static {
        c cVar = new c(true);
        f27373Q = cVar;
        cVar.s1();
    }

    private void s1() {
        this.f27393k = 6;
        this.f27394l = 0;
        this.f27395m = 0;
        List list = Collections.EMPTY_LIST;
        this.f27396n = list;
        this.f27397o = list;
        this.f27398p = list;
        this.f27400r = list;
        this.f27402t = list;
        this.f27403u = list;
        this.f27405w = list;
        this.f27406x = list;
        this.f27407y = list;
        this.f27408z = list;
        this.f27375A = list;
        this.f27376B = list;
        this.f27378D = 0;
        this.f27379E = q.W();
        this.f27380F = 0;
        this.f27381G = list;
        this.f27383I = list;
        this.f27384J = list;
        this.f27386L = t.v();
        this.f27387M = list;
        this.f27388N = w.t();
    }

    public static b t1() {
        return b.u();
    }

    public static b u1(c cVar) {
        return t1().j(cVar);
    }

    public static c w1(InputStream inputStream, C2948g c2948g) {
        return (c) f27374R.c(inputStream, c2948g);
    }

    public static c y0() {
        return f27373Q;
    }

    public g A0(int i10) {
        return (g) this.f27375A.get(i10);
    }

    public int B0() {
        return this.f27375A.size();
    }

    public List C0() {
        return this.f27375A;
    }

    public int D0() {
        return this.f27393k;
    }

    public int E0() {
        return this.f27394l;
    }

    public i F0(int i10) {
        return (i) this.f27406x.get(i10);
    }

    public int G0() {
        return this.f27406x.size();
    }

    public List H0() {
        return this.f27406x;
    }

    public int I0() {
        return this.f27378D;
    }

    public q J0() {
        return this.f27379E;
    }

    public int K0() {
        return this.f27380F;
    }

    public int L0() {
        return this.f27381G.size();
    }

    public List M0() {
        return this.f27381G;
    }

    public q N0(int i10) {
        return (q) this.f27383I.get(i10);
    }

    public int O0() {
        return this.f27383I.size();
    }

    public int P0() {
        return this.f27384J.size();
    }

    public List Q0() {
        return this.f27384J;
    }

    public List R0() {
        return this.f27383I;
    }

    public List S0() {
        return this.f27400r;
    }

    public n T0(int i10) {
        return (n) this.f27407y.get(i10);
    }

    public int U0() {
        return this.f27407y.size();
    }

    public List V0() {
        return this.f27407y;
    }

    public List W0() {
        return this.f27376B;
    }

    public q X0(int i10) {
        return (q) this.f27397o.get(i10);
    }

    public int Y0() {
        return this.f27397o.size();
    }

    public List Z0() {
        return this.f27398p;
    }

    public List a1() {
        return this.f27397o;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27390P;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27392j & 1) == 1 ? C2947f.o(1, this.f27393k) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f27398p.size(); i11++) {
            iP += C2947f.p(((Integer) this.f27398p.get(i11)).intValue());
        }
        int iR = iO + iP;
        if (!Z0().isEmpty()) {
            iR = iR + 1 + C2947f.p(iP);
        }
        this.f27399q = iP;
        if ((this.f27392j & 2) == 2) {
            iR += C2947f.o(3, this.f27394l);
        }
        if ((this.f27392j & 4) == 4) {
            iR += C2947f.o(4, this.f27395m);
        }
        for (int i12 = 0; i12 < this.f27396n.size(); i12++) {
            iR += C2947f.r(5, (m8.p) this.f27396n.get(i12));
        }
        for (int i13 = 0; i13 < this.f27397o.size(); i13++) {
            iR += C2947f.r(6, (m8.p) this.f27397o.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f27400r.size(); i14++) {
            iP2 += C2947f.p(((Integer) this.f27400r.get(i14)).intValue());
        }
        int iR2 = iR + iP2;
        if (!S0().isEmpty()) {
            iR2 = iR2 + 1 + C2947f.p(iP2);
        }
        this.f27401s = iP2;
        for (int i15 = 0; i15 < this.f27405w.size(); i15++) {
            iR2 += C2947f.r(8, (m8.p) this.f27405w.get(i15));
        }
        for (int i16 = 0; i16 < this.f27406x.size(); i16++) {
            iR2 += C2947f.r(9, (m8.p) this.f27406x.get(i16));
        }
        for (int i17 = 0; i17 < this.f27407y.size(); i17++) {
            iR2 += C2947f.r(10, (m8.p) this.f27407y.get(i17));
        }
        for (int i18 = 0; i18 < this.f27408z.size(); i18++) {
            iR2 += C2947f.r(11, (m8.p) this.f27408z.get(i18));
        }
        for (int i19 = 0; i19 < this.f27375A.size(); i19++) {
            iR2 += C2947f.r(13, (m8.p) this.f27375A.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.f27376B.size(); i20++) {
            iP3 += C2947f.p(((Integer) this.f27376B.get(i20)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!W0().isEmpty()) {
            iR3 = iR3 + 2 + C2947f.p(iP3);
        }
        this.f27377C = iP3;
        if ((this.f27392j & 8) == 8) {
            iR3 += C2947f.o(17, this.f27378D);
        }
        if ((this.f27392j & 16) == 16) {
            iR3 += C2947f.r(18, this.f27379E);
        }
        if ((this.f27392j & 32) == 32) {
            iR3 += C2947f.o(19, this.f27380F);
        }
        for (int i21 = 0; i21 < this.f27402t.size(); i21++) {
            iR3 += C2947f.r(20, (m8.p) this.f27402t.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f27403u.size(); i22++) {
            iP4 += C2947f.p(((Integer) this.f27403u.get(i22)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!w0().isEmpty()) {
            iP5 = iP5 + 2 + C2947f.p(iP4);
        }
        this.f27404v = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.f27381G.size(); i23++) {
            iP6 += C2947f.p(((Integer) this.f27381G.get(i23)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!M0().isEmpty()) {
            iR4 = iR4 + 2 + C2947f.p(iP6);
        }
        this.f27382H = iP6;
        for (int i24 = 0; i24 < this.f27383I.size(); i24++) {
            iR4 += C2947f.r(23, (m8.p) this.f27383I.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.f27384J.size(); i25++) {
            iP7 += C2947f.p(((Integer) this.f27384J.get(i25)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!Q0().isEmpty()) {
            iR5 = iR5 + 2 + C2947f.p(iP7);
        }
        this.f27385K = iP7;
        if ((this.f27392j & 64) == 64) {
            iR5 += C2947f.r(30, this.f27386L);
        }
        int iP8 = 0;
        for (int i26 = 0; i26 < this.f27387M.size(); i26++) {
            iP8 += C2947f.p(((Integer) this.f27387M.get(i26)).intValue());
        }
        int size = iR5 + iP8 + (i1().size() * 2);
        if ((this.f27392j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            size += C2947f.r(32, this.f27388N);
        }
        int iS = size + s() + this.f27391i.size();
        this.f27390P = iS;
        return iS;
    }

    public r b1(int i10) {
        return (r) this.f27408z.get(i10);
    }

    public int c1() {
        return this.f27408z.size();
    }

    public List d1() {
        return this.f27408z;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27389O;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!m1()) {
            this.f27389O = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < f1(); i10++) {
            if (!e1(i10).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < Y0(); i11++) {
            if (!X0(i11).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < v0(); i12++) {
            if (!u0(i12).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < s0(); i13++) {
            if (!r0(i13).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < G0(); i14++) {
            if (!F0(i14).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < U0(); i15++) {
            if (!T0(i15).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < c1(); i16++) {
            if (!b1(i16).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < B0(); i17++) {
            if (!A0(i17).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        if (o1() && !J0().e()) {
            this.f27389O = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < O0(); i18++) {
            if (!N0(i18).e()) {
                this.f27389O = (byte) 0;
                return false;
            }
        }
        if (q1() && !h1().e()) {
            this.f27389O = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27389O = (byte) 1;
            return true;
        }
        this.f27389O = (byte) 0;
        return false;
    }

    public s e1(int i10) {
        return (s) this.f27396n.get(i10);
    }

    public int f1() {
        return this.f27396n.size();
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27392j & 1) == 1) {
            c2947f.Z(1, this.f27393k);
        }
        if (Z0().size() > 0) {
            c2947f.n0(18);
            c2947f.n0(this.f27399q);
        }
        for (int i10 = 0; i10 < this.f27398p.size(); i10++) {
            c2947f.a0(((Integer) this.f27398p.get(i10)).intValue());
        }
        if ((this.f27392j & 2) == 2) {
            c2947f.Z(3, this.f27394l);
        }
        if ((this.f27392j & 4) == 4) {
            c2947f.Z(4, this.f27395m);
        }
        for (int i11 = 0; i11 < this.f27396n.size(); i11++) {
            c2947f.c0(5, (m8.p) this.f27396n.get(i11));
        }
        for (int i12 = 0; i12 < this.f27397o.size(); i12++) {
            c2947f.c0(6, (m8.p) this.f27397o.get(i12));
        }
        if (S0().size() > 0) {
            c2947f.n0(58);
            c2947f.n0(this.f27401s);
        }
        for (int i13 = 0; i13 < this.f27400r.size(); i13++) {
            c2947f.a0(((Integer) this.f27400r.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f27405w.size(); i14++) {
            c2947f.c0(8, (m8.p) this.f27405w.get(i14));
        }
        for (int i15 = 0; i15 < this.f27406x.size(); i15++) {
            c2947f.c0(9, (m8.p) this.f27406x.get(i15));
        }
        for (int i16 = 0; i16 < this.f27407y.size(); i16++) {
            c2947f.c0(10, (m8.p) this.f27407y.get(i16));
        }
        for (int i17 = 0; i17 < this.f27408z.size(); i17++) {
            c2947f.c0(11, (m8.p) this.f27408z.get(i17));
        }
        for (int i18 = 0; i18 < this.f27375A.size(); i18++) {
            c2947f.c0(13, (m8.p) this.f27375A.get(i18));
        }
        if (W0().size() > 0) {
            c2947f.n0(130);
            c2947f.n0(this.f27377C);
        }
        for (int i19 = 0; i19 < this.f27376B.size(); i19++) {
            c2947f.a0(((Integer) this.f27376B.get(i19)).intValue());
        }
        if ((this.f27392j & 8) == 8) {
            c2947f.Z(17, this.f27378D);
        }
        if ((this.f27392j & 16) == 16) {
            c2947f.c0(18, this.f27379E);
        }
        if ((this.f27392j & 32) == 32) {
            c2947f.Z(19, this.f27380F);
        }
        for (int i20 = 0; i20 < this.f27402t.size(); i20++) {
            c2947f.c0(20, (m8.p) this.f27402t.get(i20));
        }
        if (w0().size() > 0) {
            c2947f.n0(170);
            c2947f.n0(this.f27404v);
        }
        for (int i21 = 0; i21 < this.f27403u.size(); i21++) {
            c2947f.a0(((Integer) this.f27403u.get(i21)).intValue());
        }
        if (M0().size() > 0) {
            c2947f.n0(178);
            c2947f.n0(this.f27382H);
        }
        for (int i22 = 0; i22 < this.f27381G.size(); i22++) {
            c2947f.a0(((Integer) this.f27381G.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f27383I.size(); i23++) {
            c2947f.c0(23, (m8.p) this.f27383I.get(i23));
        }
        if (Q0().size() > 0) {
            c2947f.n0(194);
            c2947f.n0(this.f27385K);
        }
        for (int i24 = 0; i24 < this.f27384J.size(); i24++) {
            c2947f.a0(((Integer) this.f27384J.get(i24)).intValue());
        }
        if ((this.f27392j & 64) == 64) {
            c2947f.c0(30, this.f27386L);
        }
        for (int i25 = 0; i25 < this.f27387M.size(); i25++) {
            c2947f.Z(31, ((Integer) this.f27387M.get(i25)).intValue());
        }
        if ((this.f27392j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            c2947f.c0(32, this.f27388N);
        }
        aVarX.a(19000, c2947f);
        c2947f.h0(this.f27391i);
    }

    public List g1() {
        return this.f27396n;
    }

    public t h1() {
        return this.f27386L;
    }

    public List i1() {
        return this.f27387M;
    }

    public w j1() {
        return this.f27388N;
    }

    public boolean k1() {
        return (this.f27392j & 4) == 4;
    }

    public boolean l1() {
        return (this.f27392j & 1) == 1;
    }

    public boolean m1() {
        return (this.f27392j & 2) == 2;
    }

    public boolean n1() {
        return (this.f27392j & 8) == 8;
    }

    public boolean o1() {
        return (this.f27392j & 16) == 16;
    }

    public boolean p1() {
        return (this.f27392j & 32) == 32;
    }

    public int q0() {
        return this.f27395m;
    }

    public boolean q1() {
        return (this.f27392j & 64) == 64;
    }

    public d r0(int i10) {
        return (d) this.f27405w.get(i10);
    }

    public boolean r1() {
        return (this.f27392j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public int s0() {
        return this.f27405w.size();
    }

    public List t0() {
        return this.f27405w;
    }

    public q u0(int i10) {
        return (q) this.f27402t.get(i10);
    }

    public int v0() {
        return this.f27402t.size();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b c() {
        return t1();
    }

    public List w0() {
        return this.f27403u;
    }

    public List x0() {
        return this.f27402t;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public b f() {
        return u1(this);
    }

    @Override // m8.q
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public c a() {
        return f27373Q;
    }

    private c(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27399q = -1;
        this.f27401s = -1;
        this.f27404v = -1;
        this.f27377C = -1;
        this.f27382H = -1;
        this.f27385K = -1;
        this.f27389O = (byte) -1;
        this.f27390P = -1;
        this.f27391i = cVar.i();
    }

    private c(boolean z10) {
        this.f27399q = -1;
        this.f27401s = -1;
        this.f27404v = -1;
        this.f27377C = -1;
        this.f27382H = -1;
        this.f27385K = -1;
        this.f27389O = (byte) -1;
        this.f27390P = -1;
        this.f27391i = AbstractC2945d.f29639g;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private q f27409A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f27410B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private List f27411C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private List f27412D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private List f27413E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private t f27414F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private List f27415G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private w f27416H;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27418k = 6;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27419l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27420m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List f27421n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List f27422o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List f27423p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List f27424q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f27425r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f27426s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f27427t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List f27428u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List f27429v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List f27430w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List f27431x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private List f27432y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f27433z;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27421n = list;
            this.f27422o = list;
            this.f27423p = list;
            this.f27424q = list;
            this.f27425r = list;
            this.f27426s = list;
            this.f27427t = list;
            this.f27428u = list;
            this.f27429v = list;
            this.f27430w = list;
            this.f27431x = list;
            this.f27432y = list;
            this.f27409A = q.W();
            this.f27411C = list;
            this.f27412D = list;
            this.f27413E = list;
            this.f27414F = t.v();
            this.f27415G = list;
            this.f27416H = w.t();
            L();
        }

        private void A() {
            if ((this.f27417j & 262144) != 262144) {
                this.f27411C = new ArrayList(this.f27411C);
                this.f27417j |= 262144;
            }
        }

        private void B() {
            if ((this.f27417j & 1048576) != 1048576) {
                this.f27413E = new ArrayList(this.f27413E);
                this.f27417j |= 1048576;
            }
        }

        private void C() {
            if ((this.f27417j & 524288) != 524288) {
                this.f27412D = new ArrayList(this.f27412D);
                this.f27417j |= 524288;
            }
        }

        private void D() {
            if ((this.f27417j & 64) != 64) {
                this.f27424q = new ArrayList(this.f27424q);
                this.f27417j |= 64;
            }
        }

        private void E() {
            if ((this.f27417j & 2048) != 2048) {
                this.f27429v = new ArrayList(this.f27429v);
                this.f27417j |= 2048;
            }
        }

        private void F() {
            if ((this.f27417j & 16384) != 16384) {
                this.f27432y = new ArrayList(this.f27432y);
                this.f27417j |= 16384;
            }
        }

        private void G() {
            if ((this.f27417j & 32) != 32) {
                this.f27423p = new ArrayList(this.f27423p);
                this.f27417j |= 32;
            }
        }

        private void H() {
            if ((this.f27417j & 16) != 16) {
                this.f27422o = new ArrayList(this.f27422o);
                this.f27417j |= 16;
            }
        }

        private void I() {
            if ((this.f27417j & 4096) != 4096) {
                this.f27430w = new ArrayList(this.f27430w);
                this.f27417j |= 4096;
            }
        }

        private void J() {
            if ((this.f27417j & 8) != 8) {
                this.f27421n = new ArrayList(this.f27421n);
                this.f27417j |= 8;
            }
        }

        private void K() {
            if ((this.f27417j & 4194304) != 4194304) {
                this.f27415G = new ArrayList(this.f27415G);
                this.f27417j |= 4194304;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f27427t = new ArrayList(this.f27427t);
                this.f27417j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        private void w() {
            if ((this.f27417j & 256) != 256) {
                this.f27426s = new ArrayList(this.f27426s);
                this.f27417j |= 256;
            }
        }

        private void x() {
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                this.f27425r = new ArrayList(this.f27425r);
                this.f27417j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
        }

        private void y() {
            if ((this.f27417j & 8192) != 8192) {
                this.f27431x = new ArrayList(this.f27431x);
                this.f27417j |= 8192;
            }
        }

        private void z() {
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                this.f27428u = new ArrayList(this.f27428u);
                this.f27417j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public b j(c cVar) {
            if (cVar == c.y0()) {
                return this;
            }
            if (cVar.l1()) {
                S(cVar.D0());
            }
            if (cVar.m1()) {
                T(cVar.E0());
            }
            if (cVar.k1()) {
                R(cVar.q0());
            }
            if (!cVar.f27396n.isEmpty()) {
                if (this.f27421n.isEmpty()) {
                    this.f27421n = cVar.f27396n;
                    this.f27417j &= -9;
                } else {
                    J();
                    this.f27421n.addAll(cVar.f27396n);
                }
            }
            if (!cVar.f27397o.isEmpty()) {
                if (this.f27422o.isEmpty()) {
                    this.f27422o = cVar.f27397o;
                    this.f27417j &= -17;
                } else {
                    H();
                    this.f27422o.addAll(cVar.f27397o);
                }
            }
            if (!cVar.f27398p.isEmpty()) {
                if (this.f27423p.isEmpty()) {
                    this.f27423p = cVar.f27398p;
                    this.f27417j &= -33;
                } else {
                    G();
                    this.f27423p.addAll(cVar.f27398p);
                }
            }
            if (!cVar.f27400r.isEmpty()) {
                if (this.f27424q.isEmpty()) {
                    this.f27424q = cVar.f27400r;
                    this.f27417j &= -65;
                } else {
                    D();
                    this.f27424q.addAll(cVar.f27400r);
                }
            }
            if (!cVar.f27402t.isEmpty()) {
                if (this.f27425r.isEmpty()) {
                    this.f27425r = cVar.f27402t;
                    this.f27417j &= -129;
                } else {
                    x();
                    this.f27425r.addAll(cVar.f27402t);
                }
            }
            if (!cVar.f27403u.isEmpty()) {
                if (this.f27426s.isEmpty()) {
                    this.f27426s = cVar.f27403u;
                    this.f27417j &= -257;
                } else {
                    w();
                    this.f27426s.addAll(cVar.f27403u);
                }
            }
            if (!cVar.f27405w.isEmpty()) {
                if (this.f27427t.isEmpty()) {
                    this.f27427t = cVar.f27405w;
                    this.f27417j &= -513;
                } else {
                    v();
                    this.f27427t.addAll(cVar.f27405w);
                }
            }
            if (!cVar.f27406x.isEmpty()) {
                if (this.f27428u.isEmpty()) {
                    this.f27428u = cVar.f27406x;
                    this.f27417j &= -1025;
                } else {
                    z();
                    this.f27428u.addAll(cVar.f27406x);
                }
            }
            if (!cVar.f27407y.isEmpty()) {
                if (this.f27429v.isEmpty()) {
                    this.f27429v = cVar.f27407y;
                    this.f27417j &= -2049;
                } else {
                    E();
                    this.f27429v.addAll(cVar.f27407y);
                }
            }
            if (!cVar.f27408z.isEmpty()) {
                if (this.f27430w.isEmpty()) {
                    this.f27430w = cVar.f27408z;
                    this.f27417j &= -4097;
                } else {
                    I();
                    this.f27430w.addAll(cVar.f27408z);
                }
            }
            if (!cVar.f27375A.isEmpty()) {
                if (this.f27431x.isEmpty()) {
                    this.f27431x = cVar.f27375A;
                    this.f27417j &= -8193;
                } else {
                    y();
                    this.f27431x.addAll(cVar.f27375A);
                }
            }
            if (!cVar.f27376B.isEmpty()) {
                if (this.f27432y.isEmpty()) {
                    this.f27432y = cVar.f27376B;
                    this.f27417j &= -16385;
                } else {
                    F();
                    this.f27432y.addAll(cVar.f27376B);
                }
            }
            if (cVar.n1()) {
                U(cVar.I0());
            }
            if (cVar.o1()) {
                O(cVar.J0());
            }
            if (cVar.p1()) {
                V(cVar.K0());
            }
            if (!cVar.f27381G.isEmpty()) {
                if (this.f27411C.isEmpty()) {
                    this.f27411C = cVar.f27381G;
                    this.f27417j &= -262145;
                } else {
                    A();
                    this.f27411C.addAll(cVar.f27381G);
                }
            }
            if (!cVar.f27383I.isEmpty()) {
                if (this.f27412D.isEmpty()) {
                    this.f27412D = cVar.f27383I;
                    this.f27417j &= -524289;
                } else {
                    C();
                    this.f27412D.addAll(cVar.f27383I);
                }
            }
            if (!cVar.f27384J.isEmpty()) {
                if (this.f27413E.isEmpty()) {
                    this.f27413E = cVar.f27384J;
                    this.f27417j &= -1048577;
                } else {
                    B();
                    this.f27413E.addAll(cVar.f27384J);
                }
            }
            if (cVar.q1()) {
                P(cVar.h1());
            }
            if (!cVar.f27387M.isEmpty()) {
                if (this.f27415G.isEmpty()) {
                    this.f27415G = cVar.f27387M;
                    this.f27417j &= -4194305;
                } else {
                    K();
                    this.f27415G.addAll(cVar.f27387M);
                }
            }
            if (cVar.r1()) {
                Q(cVar.j1());
            }
            o(cVar);
            k(i().o(cVar.f27391i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            c cVar = null;
            try {
                try {
                    c cVar2 = (c) c.f27374R.a(c2946e, c2948g);
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

        public b O(q qVar) {
            if ((this.f27417j & 65536) != 65536 || this.f27409A == q.W()) {
                this.f27409A = qVar;
            } else {
                this.f27409A = q.y0(this.f27409A).j(qVar).r();
            }
            this.f27417j |= 65536;
            return this;
        }

        public b P(t tVar) {
            if ((this.f27417j & 2097152) != 2097152 || this.f27414F == t.v()) {
                this.f27414F = tVar;
            } else {
                this.f27414F = t.D(this.f27414F).j(tVar).n();
            }
            this.f27417j |= 2097152;
            return this;
        }

        public b Q(w wVar) {
            if ((this.f27417j & 8388608) != 8388608 || this.f27416H == w.t()) {
                this.f27416H = wVar;
            } else {
                this.f27416H = w.y(this.f27416H).j(wVar).n();
            }
            this.f27417j |= 8388608;
            return this;
        }

        public b R(int i10) {
            this.f27417j |= 4;
            this.f27420m = i10;
            return this;
        }

        public b S(int i10) {
            this.f27417j |= 1;
            this.f27418k = i10;
            return this;
        }

        public b T(int i10) {
            this.f27417j |= 2;
            this.f27419l = i10;
            return this;
        }

        public b U(int i10) {
            this.f27417j |= 32768;
            this.f27433z = i10;
            return this;
        }

        public b V(int i10) {
            this.f27417j |= 131072;
            this.f27410B = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public c build() {
            c cVarR = r();
            if (cVarR.e()) {
                return cVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(cVarR);
        }

        public c r() {
            c cVar = new c(this);
            int i10 = this.f27417j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            cVar.f27393k = this.f27418k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            cVar.f27394l = this.f27419l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            cVar.f27395m = this.f27420m;
            if ((this.f27417j & 8) == 8) {
                this.f27421n = Collections.unmodifiableList(this.f27421n);
                this.f27417j &= -9;
            }
            cVar.f27396n = this.f27421n;
            if ((this.f27417j & 16) == 16) {
                this.f27422o = Collections.unmodifiableList(this.f27422o);
                this.f27417j &= -17;
            }
            cVar.f27397o = this.f27422o;
            if ((this.f27417j & 32) == 32) {
                this.f27423p = Collections.unmodifiableList(this.f27423p);
                this.f27417j &= -33;
            }
            cVar.f27398p = this.f27423p;
            if ((this.f27417j & 64) == 64) {
                this.f27424q = Collections.unmodifiableList(this.f27424q);
                this.f27417j &= -65;
            }
            cVar.f27400r = this.f27424q;
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                this.f27425r = Collections.unmodifiableList(this.f27425r);
                this.f27417j &= -129;
            }
            cVar.f27402t = this.f27425r;
            if ((this.f27417j & 256) == 256) {
                this.f27426s = Collections.unmodifiableList(this.f27426s);
                this.f27417j &= -257;
            }
            cVar.f27403u = this.f27426s;
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f27427t = Collections.unmodifiableList(this.f27427t);
                this.f27417j &= -513;
            }
            cVar.f27405w = this.f27427t;
            if ((this.f27417j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.f27428u = Collections.unmodifiableList(this.f27428u);
                this.f27417j &= -1025;
            }
            cVar.f27406x = this.f27428u;
            if ((this.f27417j & 2048) == 2048) {
                this.f27429v = Collections.unmodifiableList(this.f27429v);
                this.f27417j &= -2049;
            }
            cVar.f27407y = this.f27429v;
            if ((this.f27417j & 4096) == 4096) {
                this.f27430w = Collections.unmodifiableList(this.f27430w);
                this.f27417j &= -4097;
            }
            cVar.f27408z = this.f27430w;
            if ((this.f27417j & 8192) == 8192) {
                this.f27431x = Collections.unmodifiableList(this.f27431x);
                this.f27417j &= -8193;
            }
            cVar.f27375A = this.f27431x;
            if ((this.f27417j & 16384) == 16384) {
                this.f27432y = Collections.unmodifiableList(this.f27432y);
                this.f27417j &= -16385;
            }
            cVar.f27376B = this.f27432y;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            cVar.f27378D = this.f27433z;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            cVar.f27379E = this.f27409A;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            cVar.f27380F = this.f27410B;
            if ((this.f27417j & 262144) == 262144) {
                this.f27411C = Collections.unmodifiableList(this.f27411C);
                this.f27417j &= -262145;
            }
            cVar.f27381G = this.f27411C;
            if ((this.f27417j & 524288) == 524288) {
                this.f27412D = Collections.unmodifiableList(this.f27412D);
                this.f27417j &= -524289;
            }
            cVar.f27383I = this.f27412D;
            if ((this.f27417j & 1048576) == 1048576) {
                this.f27413E = Collections.unmodifiableList(this.f27413E);
                this.f27417j &= -1048577;
            }
            cVar.f27384J = this.f27413E;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            cVar.f27386L = this.f27414F;
            if ((this.f27417j & 4194304) == 4194304) {
                this.f27415G = Collections.unmodifiableList(this.f27415G);
                this.f27417j &= -4194305;
            }
            cVar.f27387M = this.f27415G;
            if ((i10 & 8388608) == 8388608) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            cVar.f27388N = this.f27416H;
            cVar.f27392j = i11;
            return cVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        private void L() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c(C2946e c2946e, C2948g c2948g) throws Throwable {
        this.f27399q = -1;
        this.f27401s = -1;
        this.f27404v = -1;
        this.f27377C = -1;
        this.f27382H = -1;
        this.f27385K = -1;
        this.f27389O = (byte) -1;
        this.f27390P = -1;
        s1();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        boolean z10 = true;
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            boolean z12 = z10;
            if (!z11) {
                try {
                    try {
                        int iJ = c2946e.J();
                        switch (iJ) {
                            case 0:
                                z11 = z12;
                                z10 = z12;
                                break;
                            case 8:
                                this.f27392j |= 1;
                                this.f27393k = c2946e.r();
                                z10 = z12;
                                break;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f27398p = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f27398p.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                                int i11 = c2946e.i(c2946e.z());
                                if ((i10 & 32) != 32 && c2946e.e() > 0) {
                                    this.f27398p = new ArrayList();
                                    i10 |= 32;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27398p.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i11);
                                z10 = z12;
                                break;
                            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                                this.f27392j |= 2;
                                this.f27394l = c2946e.r();
                                z10 = z12;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                                this.f27392j |= 4;
                                this.f27395m = c2946e.r();
                                z10 = z12;
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.f27396n = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f27396n.add(c2946e.t(s.f27762u, c2948g));
                                z10 = z12;
                                break;
                            case 50:
                                if ((i10 & 16) != 16) {
                                    this.f27397o = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f27397o.add(c2946e.t(q.f27682B, c2948g));
                                z10 = z12;
                                break;
                            case 56:
                                if ((i10 & 64) != 64) {
                                    this.f27400r = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f27400r.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 58:
                                int i12 = c2946e.i(c2946e.z());
                                if ((i10 & 64) != 64 && c2946e.e() > 0) {
                                    this.f27400r = new ArrayList();
                                    i10 |= 64;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27400r.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i12);
                                z10 = z12;
                                break;
                            case 66:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                                    this.f27405w = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.f27405w.add(c2946e.t(d.f27445q, c2948g));
                                z10 = z12;
                                break;
                            case 74:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                                    this.f27406x = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                }
                                this.f27406x.add(c2946e.t(i.f27529C, c2948g));
                                z10 = z12;
                                break;
                            case 82:
                                if ((i10 & 2048) != 2048) {
                                    this.f27407y = new ArrayList();
                                    i10 |= 2048;
                                }
                                this.f27407y.add(c2946e.t(n.f27611C, c2948g));
                                z10 = z12;
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.f27408z = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.f27408z.add(c2946e.t(r.f27737w, c2948g));
                                z10 = z12;
                                break;
                            case 106:
                                if ((i10 & 8192) != 8192) {
                                    this.f27375A = new ArrayList();
                                    i10 |= 8192;
                                }
                                this.f27375A.add(c2946e.t(g.f27493o, c2948g));
                                z10 = z12;
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                if ((i10 & 16384) != 16384) {
                                    this.f27376B = new ArrayList();
                                    i10 |= 16384;
                                }
                                this.f27376B.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 130:
                                int i13 = c2946e.i(c2946e.z());
                                if ((i10 & 16384) != 16384 && c2946e.e() > 0) {
                                    this.f27376B = new ArrayList();
                                    i10 |= 16384;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27376B.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i13);
                                z10 = z12;
                                break;
                            case 136:
                                this.f27392j |= 8;
                                this.f27378D = c2946e.r();
                                z10 = z12;
                                break;
                            case 146:
                                q.c cVarA0 = (this.f27392j & 16) == 16 ? this.f27379E.f() : null;
                                q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27379E = qVar;
                                if (cVarA0 != 0) {
                                    cVarA0.j(qVar);
                                    this.f27379E = cVarA0.r();
                                }
                                this.f27392j |= 16;
                                z10 = z12;
                                break;
                            case 152:
                                this.f27392j |= 32;
                                this.f27380F = c2946e.r();
                                z10 = z12;
                                break;
                            case 162:
                                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                                    this.f27402t = new ArrayList();
                                    i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                }
                                this.f27402t.add(c2946e.t(q.f27682B, c2948g));
                                z10 = z12;
                                break;
                            case 168:
                                if ((i10 & 256) != 256) {
                                    this.f27403u = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f27403u.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 170:
                                int i14 = c2946e.i(c2946e.z());
                                if ((i10 & 256) != 256 && c2946e.e() > 0) {
                                    this.f27403u = new ArrayList();
                                    i10 |= 256;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27403u.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i14);
                                z10 = z12;
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.f27381G = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.f27381G.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 178:
                                int i15 = c2946e.i(c2946e.z());
                                if ((i10 & 262144) != 262144 && c2946e.e() > 0) {
                                    this.f27381G = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27381G.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i15);
                                z10 = z12;
                                break;
                            case 186:
                                if ((i10 & 524288) != 524288) {
                                    this.f27383I = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.f27383I.add(c2946e.t(q.f27682B, c2948g));
                                z10 = z12;
                                break;
                            case JfifUtil.MARKER_SOFn /* 192 */:
                                if ((i10 & 1048576) != 1048576) {
                                    this.f27384J = new ArrayList();
                                    i10 |= 1048576;
                                }
                                this.f27384J.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 194:
                                int i16 = c2946e.i(c2946e.z());
                                if ((i10 & 1048576) != 1048576 && c2946e.e() > 0) {
                                    this.f27384J = new ArrayList();
                                    i10 |= 1048576;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27384J.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i16);
                                z10 = z12;
                                break;
                            case 242:
                                t.b bVarF = (this.f27392j & 64) == 64 ? this.f27386L.f() : null;
                                t tVar = (t) c2946e.t(t.f27788o, c2948g);
                                this.f27386L = tVar;
                                if (bVarF != 0) {
                                    bVarF.j(tVar);
                                    this.f27386L = bVarF.n();
                                }
                                this.f27392j |= 64;
                                z10 = z12;
                                break;
                            case 248:
                                if ((i10 & 4194304) != 4194304) {
                                    this.f27387M = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.f27387M.add(Integer.valueOf(c2946e.r()));
                                z10 = z12;
                                break;
                            case 250:
                                int i17 = c2946e.i(c2946e.z());
                                if ((i10 & 4194304) != 4194304 && c2946e.e() > 0) {
                                    this.f27387M = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (c2946e.e() > 0) {
                                    this.f27387M.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i17);
                                z10 = z12;
                                break;
                            case 258:
                                try {
                                    w.b bVarA = (this.f27392j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 ? this.f27388N.f() : null;
                                    w wVar = (w) c2946e.t(w.f27849m, c2948g);
                                    this.f27388N = wVar;
                                    if (bVarA != 0) {
                                        bVarA.j(wVar);
                                        this.f27388N = bVarA.n();
                                    }
                                    this.f27392j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                    z10 = z12;
                                } catch (C2952k e10) {
                                    e = e10;
                                    throw e.i(this);
                                } catch (IOException e11) {
                                    e = e11;
                                    throw new C2952k(e.getMessage()).i(this);
                                } catch (Throwable th) {
                                    th = th;
                                    if ((i10 & 32) == 32) {
                                        this.f27398p = Collections.unmodifiableList(this.f27398p);
                                    }
                                    if ((i10 & 8) == 8) {
                                        this.f27396n = Collections.unmodifiableList(this.f27396n);
                                    }
                                    if ((i10 & 16) == 16) {
                                        this.f27397o = Collections.unmodifiableList(this.f27397o);
                                    }
                                    if ((i10 & 64) == 64) {
                                        this.f27400r = Collections.unmodifiableList(this.f27400r);
                                    }
                                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                                        this.f27405w = Collections.unmodifiableList(this.f27405w);
                                    }
                                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                                        this.f27406x = Collections.unmodifiableList(this.f27406x);
                                    }
                                    if ((i10 & 2048) == 2048) {
                                        this.f27407y = Collections.unmodifiableList(this.f27407y);
                                    }
                                    if ((i10 & 4096) == 4096) {
                                        this.f27408z = Collections.unmodifiableList(this.f27408z);
                                    }
                                    if ((i10 & 8192) == 8192) {
                                        this.f27375A = Collections.unmodifiableList(this.f27375A);
                                    }
                                    if ((i10 & 16384) == 16384) {
                                        this.f27376B = Collections.unmodifiableList(this.f27376B);
                                    }
                                    if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                        this.f27402t = Collections.unmodifiableList(this.f27402t);
                                    }
                                    if ((i10 & 256) == 256) {
                                        this.f27403u = Collections.unmodifiableList(this.f27403u);
                                    }
                                    if ((i10 & 262144) == 262144) {
                                        this.f27381G = Collections.unmodifiableList(this.f27381G);
                                    }
                                    if ((i10 & 524288) == 524288) {
                                        this.f27383I = Collections.unmodifiableList(this.f27383I);
                                    }
                                    if ((i10 & 1048576) == 1048576) {
                                        this.f27384J = Collections.unmodifiableList(this.f27384J);
                                    }
                                    if ((i10 & 4194304) == 4194304) {
                                        this.f27387M = Collections.unmodifiableList(this.f27387M);
                                    }
                                    try {
                                        c2947fI.H();
                                        break;
                                    } catch (IOException unused) {
                                    } catch (Throwable th2) {
                                        this.f27391i = bVarY.m();
                                        throw th2;
                                    }
                                    this.f27391i = bVarY.m();
                                    l();
                                    throw th;
                                }
                                break;
                            default:
                                if (!o(c2946e, c2947fI, c2948g, iJ)) {
                                }
                                z10 = z12;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (C2952k e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                }
            } else {
                if ((i10 & 32) == 32) {
                    this.f27398p = Collections.unmodifiableList(this.f27398p);
                }
                if ((i10 & 8) == 8) {
                    this.f27396n = Collections.unmodifiableList(this.f27396n);
                }
                if ((i10 & 16) == 16) {
                    this.f27397o = Collections.unmodifiableList(this.f27397o);
                }
                if ((i10 & 64) == 64) {
                    this.f27400r = Collections.unmodifiableList(this.f27400r);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f27405w = Collections.unmodifiableList(this.f27405w);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                    this.f27406x = Collections.unmodifiableList(this.f27406x);
                }
                if ((i10 & 2048) == 2048) {
                    this.f27407y = Collections.unmodifiableList(this.f27407y);
                }
                if ((i10 & 4096) == 4096) {
                    this.f27408z = Collections.unmodifiableList(this.f27408z);
                }
                if ((i10 & 8192) == 8192) {
                    this.f27375A = Collections.unmodifiableList(this.f27375A);
                }
                if ((i10 & 16384) == 16384) {
                    this.f27376B = Collections.unmodifiableList(this.f27376B);
                }
                if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    this.f27402t = Collections.unmodifiableList(this.f27402t);
                }
                if ((i10 & 256) == 256) {
                    this.f27403u = Collections.unmodifiableList(this.f27403u);
                }
                if ((i10 & 262144) == 262144) {
                    this.f27381G = Collections.unmodifiableList(this.f27381G);
                }
                if ((i10 & 524288) == 524288) {
                    this.f27383I = Collections.unmodifiableList(this.f27383I);
                }
                if ((i10 & 1048576) == 1048576) {
                    this.f27384J = Collections.unmodifiableList(this.f27384J);
                }
                if ((i10 & 4194304) == 4194304) {
                    this.f27387M = Collections.unmodifiableList(this.f27387M);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f27391i = bVarY.m();
                    throw th4;
                }
                this.f27391i = bVarY.m();
                l();
                return;
            }
        }
    }
}
