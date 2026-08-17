package f8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
import f8.e;
import f8.q;
import f8.t;
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
public final class i extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final i f27528B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static m8.r f27529C = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f27530A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f27536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f27538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private q f27539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f27541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f27542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f27544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t f27545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f27546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e f27547y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte f27548z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public i a(C2946e c2946e, C2948g c2948g) {
            return new i(c2946e, c2948g);
        }
    }

    static {
        i iVar = new i(true);
        f27528B = iVar;
        iVar.A0();
    }

    private void A0() {
        this.f27533k = 6;
        this.f27534l = 6;
        this.f27535m = 0;
        this.f27536n = q.W();
        this.f27537o = 0;
        List list = Collections.EMPTY_LIST;
        this.f27538p = list;
        this.f27539q = q.W();
        this.f27540r = 0;
        this.f27541s = list;
        this.f27542t = list;
        this.f27544v = list;
        this.f27545w = t.v();
        this.f27546x = list;
        this.f27547y = e.t();
    }

    public static b B0() {
        return b.u();
    }

    public static b C0(i iVar) {
        return B0().j(iVar);
    }

    public static i E0(InputStream inputStream, C2948g c2948g) {
        return (i) f27529C.c(inputStream, c2948g);
    }

    public static i Z() {
        return f27528B;
    }

    @Override // m8.p
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return B0();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return C0(this);
    }

    public q U(int i10) {
        return (q) this.f27541s.get(i10);
    }

    public int V() {
        return this.f27541s.size();
    }

    public List W() {
        return this.f27542t;
    }

    public List X() {
        return this.f27541s;
    }

    public e Y() {
        return this.f27547y;
    }

    @Override // m8.q
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public i a() {
        return f27528B;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27530A;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27532j & 2) == 2 ? C2947f.o(1, this.f27534l) : 0;
        if ((this.f27532j & 4) == 4) {
            iO += C2947f.o(2, this.f27535m);
        }
        if ((this.f27532j & 8) == 8) {
            iO += C2947f.r(3, this.f27536n);
        }
        for (int i11 = 0; i11 < this.f27538p.size(); i11++) {
            iO += C2947f.r(4, (m8.p) this.f27538p.get(i11));
        }
        if ((this.f27532j & 32) == 32) {
            iO += C2947f.r(5, this.f27539q);
        }
        for (int i12 = 0; i12 < this.f27544v.size(); i12++) {
            iO += C2947f.r(6, (m8.p) this.f27544v.get(i12));
        }
        if ((this.f27532j & 16) == 16) {
            iO += C2947f.o(7, this.f27537o);
        }
        if ((this.f27532j & 64) == 64) {
            iO += C2947f.o(8, this.f27540r);
        }
        if ((this.f27532j & 1) == 1) {
            iO += C2947f.o(9, this.f27533k);
        }
        for (int i13 = 0; i13 < this.f27541s.size(); i13++) {
            iO += C2947f.r(10, (m8.p) this.f27541s.get(i13));
        }
        int iP = 0;
        for (int i14 = 0; i14 < this.f27542t.size(); i14++) {
            iP += C2947f.p(((Integer) this.f27542t.get(i14)).intValue());
        }
        int iR = iO + iP;
        if (!W().isEmpty()) {
            iR = iR + 1 + C2947f.p(iP);
        }
        this.f27543u = iP;
        if ((this.f27532j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iR += C2947f.r(30, this.f27545w);
        }
        int iP2 = 0;
        for (int i15 = 0; i15 < this.f27546x.size(); i15++) {
            iP2 += C2947f.p(((Integer) this.f27546x.get(i15)).intValue());
        }
        int size = iR + iP2 + (q0().size() * 2);
        if ((this.f27532j & 256) == 256) {
            size += C2947f.r(32, this.f27547y);
        }
        int iS = size + s() + this.f27531i.size();
        this.f27530A = iS;
        return iS;
    }

    public int b0() {
        return this.f27533k;
    }

    public int c0() {
        return this.f27535m;
    }

    public int d0() {
        return this.f27534l;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27548z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!t0()) {
            this.f27548z = (byte) 0;
            return false;
        }
        if (x0() && !g0().e()) {
            this.f27548z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < j0(); i10++) {
            if (!i0(i10).e()) {
                this.f27548z = (byte) 0;
                return false;
            }
        }
        if (v0() && !e0().e()) {
            this.f27548z = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < V(); i11++) {
            if (!U(i11).e()) {
                this.f27548z = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < o0(); i12++) {
            if (!n0(i12).e()) {
                this.f27548z = (byte) 0;
                return false;
            }
        }
        if (z0() && !m0().e()) {
            this.f27548z = (byte) 0;
            return false;
        }
        if (r0() && !Y().e()) {
            this.f27548z = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27548z = (byte) 1;
            return true;
        }
        this.f27548z = (byte) 0;
        return false;
    }

    public q e0() {
        return this.f27539q;
    }

    public int f0() {
        return this.f27540r;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27532j & 2) == 2) {
            c2947f.Z(1, this.f27534l);
        }
        if ((this.f27532j & 4) == 4) {
            c2947f.Z(2, this.f27535m);
        }
        if ((this.f27532j & 8) == 8) {
            c2947f.c0(3, this.f27536n);
        }
        for (int i10 = 0; i10 < this.f27538p.size(); i10++) {
            c2947f.c0(4, (m8.p) this.f27538p.get(i10));
        }
        if ((this.f27532j & 32) == 32) {
            c2947f.c0(5, this.f27539q);
        }
        for (int i11 = 0; i11 < this.f27544v.size(); i11++) {
            c2947f.c0(6, (m8.p) this.f27544v.get(i11));
        }
        if ((this.f27532j & 16) == 16) {
            c2947f.Z(7, this.f27537o);
        }
        if ((this.f27532j & 64) == 64) {
            c2947f.Z(8, this.f27540r);
        }
        if ((this.f27532j & 1) == 1) {
            c2947f.Z(9, this.f27533k);
        }
        for (int i12 = 0; i12 < this.f27541s.size(); i12++) {
            c2947f.c0(10, (m8.p) this.f27541s.get(i12));
        }
        if (W().size() > 0) {
            c2947f.n0(90);
            c2947f.n0(this.f27543u);
        }
        for (int i13 = 0; i13 < this.f27542t.size(); i13++) {
            c2947f.a0(((Integer) this.f27542t.get(i13)).intValue());
        }
        if ((this.f27532j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            c2947f.c0(30, this.f27545w);
        }
        for (int i14 = 0; i14 < this.f27546x.size(); i14++) {
            c2947f.Z(31, ((Integer) this.f27546x.get(i14)).intValue());
        }
        if ((this.f27532j & 256) == 256) {
            c2947f.c0(32, this.f27547y);
        }
        aVarX.a(19000, c2947f);
        c2947f.h0(this.f27531i);
    }

    public q g0() {
        return this.f27536n;
    }

    public int h0() {
        return this.f27537o;
    }

    public s i0(int i10) {
        return (s) this.f27538p.get(i10);
    }

    public int j0() {
        return this.f27538p.size();
    }

    public List k0() {
        return this.f27538p;
    }

    public t m0() {
        return this.f27545w;
    }

    public u n0(int i10) {
        return (u) this.f27544v.get(i10);
    }

    public int o0() {
        return this.f27544v.size();
    }

    public List p0() {
        return this.f27544v;
    }

    public List q0() {
        return this.f27546x;
    }

    public boolean r0() {
        return (this.f27532j & 256) == 256;
    }

    public boolean s0() {
        return (this.f27532j & 1) == 1;
    }

    public boolean t0() {
        return (this.f27532j & 4) == 4;
    }

    public boolean u0() {
        return (this.f27532j & 2) == 2;
    }

    public boolean v0() {
        return (this.f27532j & 32) == 32;
    }

    public boolean w0() {
        return (this.f27532j & 64) == 64;
    }

    public boolean x0() {
        return (this.f27532j & 8) == 8;
    }

    public boolean y0() {
        return (this.f27532j & 16) == 16;
    }

    public boolean z0() {
        return (this.f27532j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    private i(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27543u = -1;
        this.f27548z = (byte) -1;
        this.f27530A = -1;
        this.f27531i = cVar.i();
    }

    private i(boolean z10) {
        this.f27543u = -1;
        this.f27548z = (byte) -1;
        this.f27530A = -1;
        this.f27531i = AbstractC2945d.f29639g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private i(C2946e c2946e, C2948g c2948g) {
        this.f27543u = -1;
        this.f27548z = (byte) -1;
        this.f27530A = -1;
        A0();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? O9 = 1024;
            if (!z10) {
                try {
                    try {
                        int iJ = c2946e.J();
                        switch (iJ) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                this.f27532j |= 2;
                                this.f27534l = c2946e.r();
                                break;
                            case 16:
                                this.f27532j |= 4;
                                this.f27535m = c2946e.r();
                                break;
                            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                                q.c cVarA0 = (this.f27532j & 8) == 8 ? this.f27536n.f() : null;
                                q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27536n = qVar;
                                if (cVarA0 != null) {
                                    cVarA0.j(qVar);
                                    this.f27536n = cVarA0.r();
                                }
                                this.f27532j |= 8;
                                break;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f27538p = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f27538p.add(c2946e.t(s.f27762u, c2948g));
                                break;
                            case 42:
                                q.c cVarA02 = (this.f27532j & 32) == 32 ? this.f27539q.f() : null;
                                q qVar2 = (q) c2946e.t(q.f27682B, c2948g);
                                this.f27539q = qVar2;
                                if (cVarA02 != null) {
                                    cVarA02.j(qVar2);
                                    this.f27539q = cVarA02.r();
                                }
                                this.f27532j |= 32;
                                break;
                            case 50:
                                int i12 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                i10 = i10;
                                if (i12 != 1024) {
                                    this.f27544v = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                }
                                this.f27544v.add(c2946e.t(u.f27799t, c2948g));
                                break;
                            case 56:
                                this.f27532j |= 16;
                                this.f27537o = c2946e.r();
                                break;
                            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                this.f27532j |= 64;
                                this.f27540r = c2946e.r();
                                break;
                            case 72:
                                this.f27532j |= 1;
                                this.f27533k = c2946e.r();
                                break;
                            case 82:
                                int i13 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i13 != 256) {
                                    this.f27541s = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f27541s.add(c2946e.t(q.f27682B, c2948g));
                                break;
                            case 88:
                                int i14 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i14 != 512) {
                                    this.f27542t = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.f27542t.add(Integer.valueOf(c2946e.r()));
                                break;
                            case 90:
                                int i15 = c2946e.i(c2946e.z());
                                int i16 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i10 = i10;
                                if (i16 != 512) {
                                    i10 = i10;
                                    if (c2946e.e() > 0) {
                                        this.f27542t = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    }
                                }
                                while (c2946e.e() > 0) {
                                    this.f27542t.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i15);
                                break;
                            case 242:
                                t.b bVarF = (this.f27532j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 ? this.f27545w.f() : null;
                                t tVar = (t) c2946e.t(t.f27788o, c2948g);
                                this.f27545w = tVar;
                                if (bVarF != null) {
                                    bVarF.j(tVar);
                                    this.f27545w = bVarF.n();
                                }
                                this.f27532j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                break;
                            case 248:
                                int i17 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i17 != 4096) {
                                    this.f27546x = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                this.f27546x.add(Integer.valueOf(c2946e.r()));
                                break;
                            case 250:
                                int i18 = c2946e.i(c2946e.z());
                                int i19 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i19 != 4096) {
                                    i10 = i10;
                                    if (c2946e.e() > 0) {
                                        this.f27546x = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (c2946e.e() > 0) {
                                    this.f27546x.add(Integer.valueOf(c2946e.r()));
                                }
                                c2946e.h(i18);
                                break;
                            case 258:
                                e.b bVarA = (this.f27532j & 256) == 256 ? this.f27547y.f() : null;
                                e eVar = (e) c2946e.t(e.f27458m, c2948g);
                                this.f27547y = eVar;
                                if (bVarA != null) {
                                    bVarA.j(eVar);
                                    this.f27547y = bVarA.n();
                                }
                                this.f27532j |= 256;
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
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f27538p = Collections.unmodifiableList(this.f27538p);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == O9) {
                        this.f27544v = Collections.unmodifiableList(this.f27544v);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f27541s = Collections.unmodifiableList(this.f27541s);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.f27542t = Collections.unmodifiableList(this.f27542t);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f27546x = Collections.unmodifiableList(this.f27546x);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27531i = bVarY.m();
                        throw th2;
                    }
                    this.f27531i = bVarY.m();
                    l();
                    throw th;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f27538p = Collections.unmodifiableList(this.f27538p);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                    this.f27544v = Collections.unmodifiableList(this.f27544v);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f27541s = Collections.unmodifiableList(this.f27541s);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f27542t = Collections.unmodifiableList(this.f27542t);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f27546x = Collections.unmodifiableList(this.f27546x);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f27531i = bVarY.m();
                    throw th3;
                }
                this.f27531i = bVarY.m();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27549j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27552m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f27554o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List f27555p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private q f27556q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f27557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f27558s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f27559t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List f27560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private t f27561v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List f27562w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private e f27563x;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27550k = 6;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27551l = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private q f27553n = q.W();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27555p = list;
            this.f27556q = q.W();
            this.f27558s = list;
            this.f27559t = list;
            this.f27560u = list;
            this.f27561v = t.v();
            this.f27562w = list;
            this.f27563x = e.t();
            A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27549j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f27559t = new ArrayList(this.f27559t);
                this.f27549j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        private void w() {
            if ((this.f27549j & 256) != 256) {
                this.f27558s = new ArrayList(this.f27558s);
                this.f27549j |= 256;
            }
        }

        private void x() {
            if ((this.f27549j & 32) != 32) {
                this.f27555p = new ArrayList(this.f27555p);
                this.f27549j |= 32;
            }
        }

        private void y() {
            if ((this.f27549j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                this.f27560u = new ArrayList(this.f27560u);
                this.f27549j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
        }

        private void z() {
            if ((this.f27549j & 4096) != 4096) {
                this.f27562w = new ArrayList(this.f27562w);
                this.f27549j |= 4096;
            }
        }

        public b B(e eVar) {
            if ((this.f27549j & 8192) != 8192 || this.f27563x == e.t()) {
                this.f27563x = eVar;
            } else {
                this.f27563x = e.y(this.f27563x).j(eVar).n();
            }
            this.f27549j |= 8192;
            return this;
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b j(i iVar) {
            if (iVar == i.Z()) {
                return this;
            }
            if (iVar.s0()) {
                H(iVar.b0());
            }
            if (iVar.u0()) {
                J(iVar.d0());
            }
            if (iVar.t0()) {
                I(iVar.c0());
            }
            if (iVar.x0()) {
                F(iVar.g0());
            }
            if (iVar.y0()) {
                L(iVar.h0());
            }
            if (!iVar.f27538p.isEmpty()) {
                if (this.f27555p.isEmpty()) {
                    this.f27555p = iVar.f27538p;
                    this.f27549j &= -33;
                } else {
                    x();
                    this.f27555p.addAll(iVar.f27538p);
                }
            }
            if (iVar.v0()) {
                E(iVar.e0());
            }
            if (iVar.w0()) {
                K(iVar.f0());
            }
            if (!iVar.f27541s.isEmpty()) {
                if (this.f27558s.isEmpty()) {
                    this.f27558s = iVar.f27541s;
                    this.f27549j &= -257;
                } else {
                    w();
                    this.f27558s.addAll(iVar.f27541s);
                }
            }
            if (!iVar.f27542t.isEmpty()) {
                if (this.f27559t.isEmpty()) {
                    this.f27559t = iVar.f27542t;
                    this.f27549j &= -513;
                } else {
                    v();
                    this.f27559t.addAll(iVar.f27542t);
                }
            }
            if (!iVar.f27544v.isEmpty()) {
                if (this.f27560u.isEmpty()) {
                    this.f27560u = iVar.f27544v;
                    this.f27549j &= -1025;
                } else {
                    y();
                    this.f27560u.addAll(iVar.f27544v);
                }
            }
            if (iVar.z0()) {
                G(iVar.m0());
            }
            if (!iVar.f27546x.isEmpty()) {
                if (this.f27562w.isEmpty()) {
                    this.f27562w = iVar.f27546x;
                    this.f27549j &= -4097;
                } else {
                    z();
                    this.f27562w.addAll(iVar.f27546x);
                }
            }
            if (iVar.r0()) {
                B(iVar.Y());
            }
            o(iVar);
            k(i().o(iVar.f27531i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            i iVar = null;
            try {
                try {
                    i iVar2 = (i) i.f27529C.a(c2946e, c2948g);
                    if (iVar2 != null) {
                        j(iVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    i iVar3 = (i) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        iVar = iVar3;
                        if (iVar != null) {
                            j(iVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (iVar != null) {
                }
                throw th;
            }
        }

        public b E(q qVar) {
            if ((this.f27549j & 64) != 64 || this.f27556q == q.W()) {
                this.f27556q = qVar;
            } else {
                this.f27556q = q.y0(this.f27556q).j(qVar).r();
            }
            this.f27549j |= 64;
            return this;
        }

        public b F(q qVar) {
            if ((this.f27549j & 8) != 8 || this.f27553n == q.W()) {
                this.f27553n = qVar;
            } else {
                this.f27553n = q.y0(this.f27553n).j(qVar).r();
            }
            this.f27549j |= 8;
            return this;
        }

        public b G(t tVar) {
            if ((this.f27549j & 2048) != 2048 || this.f27561v == t.v()) {
                this.f27561v = tVar;
            } else {
                this.f27561v = t.D(this.f27561v).j(tVar).n();
            }
            this.f27549j |= 2048;
            return this;
        }

        public b H(int i10) {
            this.f27549j |= 1;
            this.f27550k = i10;
            return this;
        }

        public b I(int i10) {
            this.f27549j |= 4;
            this.f27552m = i10;
            return this;
        }

        public b J(int i10) {
            this.f27549j |= 2;
            this.f27551l = i10;
            return this;
        }

        public b K(int i10) {
            this.f27549j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.f27557r = i10;
            return this;
        }

        public b L(int i10) {
            this.f27549j |= 16;
            this.f27554o = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public i build() {
            i iVarR = r();
            if (iVarR.e()) {
                return iVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(iVarR);
        }

        public i r() {
            i iVar = new i(this);
            int i10 = this.f27549j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            iVar.f27533k = this.f27550k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            iVar.f27534l = this.f27551l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            iVar.f27535m = this.f27552m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            iVar.f27536n = this.f27553n;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            iVar.f27537o = this.f27554o;
            if ((this.f27549j & 32) == 32) {
                this.f27555p = Collections.unmodifiableList(this.f27555p);
                this.f27549j &= -33;
            }
            iVar.f27538p = this.f27555p;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            iVar.f27539q = this.f27556q;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i11 |= 64;
            }
            iVar.f27540r = this.f27557r;
            if ((this.f27549j & 256) == 256) {
                this.f27558s = Collections.unmodifiableList(this.f27558s);
                this.f27549j &= -257;
            }
            iVar.f27541s = this.f27558s;
            if ((this.f27549j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f27559t = Collections.unmodifiableList(this.f27559t);
                this.f27549j &= -513;
            }
            iVar.f27542t = this.f27559t;
            if ((this.f27549j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.f27560u = Collections.unmodifiableList(this.f27560u);
                this.f27549j &= -1025;
            }
            iVar.f27544v = this.f27560u;
            if ((i10 & 2048) == 2048) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            iVar.f27545w = this.f27561v;
            if ((this.f27549j & 4096) == 4096) {
                this.f27562w = Collections.unmodifiableList(this.f27562w);
                this.f27549j &= -4097;
            }
            iVar.f27546x = this.f27562w;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            iVar.f27547y = this.f27563x;
            iVar.f27532j = i11;
            return iVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        private void A() {
        }
    }
}
