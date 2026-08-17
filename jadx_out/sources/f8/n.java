package f8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.text.TextAttributeProps;
import f8.q;
import f8.u;
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
public final class n extends AbstractC2950i.d implements m8.q {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final n f27610B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static m8.r f27611C = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f27612A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC2945d f27613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f27618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f27620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private q f27621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List f27623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f27624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f27625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f27626v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27627w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27628x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List f27629y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte f27630z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC2943b {
        a() {
        }

        @Override // m8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public n a(C2946e c2946e, C2948g c2948g) {
            return new n(c2946e, c2948g);
        }
    }

    static {
        n nVar = new n(true);
        f27610B = nVar;
        nVar.y0();
    }

    public static b A0(n nVar) {
        return z0().j(nVar);
    }

    public static n X() {
        return f27610B;
    }

    private void y0() {
        this.f27615k = 518;
        this.f27616l = 2054;
        this.f27617m = 0;
        this.f27618n = q.W();
        this.f27619o = 0;
        List list = Collections.EMPTY_LIST;
        this.f27620p = list;
        this.f27621q = q.W();
        this.f27622r = 0;
        this.f27623s = list;
        this.f27624t = list;
        this.f27626v = u.H();
        this.f27627w = 0;
        this.f27628x = 0;
        this.f27629y = list;
    }

    public static b z0() {
        return b.u();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b c() {
        return z0();
    }

    @Override // m8.p
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return A0(this);
    }

    public q T(int i10) {
        return (q) this.f27623s.get(i10);
    }

    public int U() {
        return this.f27623s.size();
    }

    public List V() {
        return this.f27624t;
    }

    public List W() {
        return this.f27623s;
    }

    @Override // m8.q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public n a() {
        return f27610B;
    }

    public int Z() {
        return this.f27615k;
    }

    public int a0() {
        return this.f27627w;
    }

    @Override // m8.p
    public int b() {
        int i10 = this.f27612A;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f27614j & 2) == 2 ? C2947f.o(1, this.f27616l) : 0;
        if ((this.f27614j & 4) == 4) {
            iO += C2947f.o(2, this.f27617m);
        }
        if ((this.f27614j & 8) == 8) {
            iO += C2947f.r(3, this.f27618n);
        }
        for (int i11 = 0; i11 < this.f27620p.size(); i11++) {
            iO += C2947f.r(4, (m8.p) this.f27620p.get(i11));
        }
        if ((this.f27614j & 32) == 32) {
            iO += C2947f.r(5, this.f27621q);
        }
        if ((this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iO += C2947f.r(6, this.f27626v);
        }
        if ((this.f27614j & 256) == 256) {
            iO += C2947f.o(7, this.f27627w);
        }
        if ((this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iO += C2947f.o(8, this.f27628x);
        }
        if ((this.f27614j & 16) == 16) {
            iO += C2947f.o(9, this.f27619o);
        }
        if ((this.f27614j & 64) == 64) {
            iO += C2947f.o(10, this.f27622r);
        }
        if ((this.f27614j & 1) == 1) {
            iO += C2947f.o(11, this.f27615k);
        }
        for (int i12 = 0; i12 < this.f27623s.size(); i12++) {
            iO += C2947f.r(12, (m8.p) this.f27623s.get(i12));
        }
        int iP = 0;
        for (int i13 = 0; i13 < this.f27624t.size(); i13++) {
            iP += C2947f.p(((Integer) this.f27624t.get(i13)).intValue());
        }
        int iP2 = iO + iP;
        if (!V().isEmpty()) {
            iP2 = iP2 + 1 + C2947f.p(iP);
        }
        this.f27625u = iP;
        int iP3 = 0;
        for (int i14 = 0; i14 < this.f27629y.size(); i14++) {
            iP3 += C2947f.p(((Integer) this.f27629y.get(i14)).intValue());
        }
        int size = iP2 + iP3 + (n0().size() * 2) + s() + this.f27613i.size();
        this.f27612A = size;
        return size;
    }

    public int b0() {
        return this.f27617m;
    }

    public int c0() {
        return this.f27616l;
    }

    public q d0() {
        return this.f27621q;
    }

    @Override // m8.q
    public final boolean e() {
        byte b10 = this.f27630z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!q0()) {
            this.f27630z = (byte) 0;
            return false;
        }
        if (u0() && !f0().e()) {
            this.f27630z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < k0(); i10++) {
            if (!j0(i10).e()) {
                this.f27630z = (byte) 0;
                return false;
            }
        }
        if (s0() && !d0().e()) {
            this.f27630z = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < U(); i11++) {
            if (!T(i11).e()) {
                this.f27630z = (byte) 0;
                return false;
            }
        }
        if (x0() && !i0().e()) {
            this.f27630z = (byte) 0;
            return false;
        }
        if (r()) {
            this.f27630z = (byte) 1;
            return true;
        }
        this.f27630z = (byte) 0;
        return false;
    }

    public int e0() {
        return this.f27622r;
    }

    public q f0() {
        return this.f27618n;
    }

    @Override // m8.p
    public void g(C2947f c2947f) throws IOException {
        b();
        AbstractC2950i.d.a aVarX = x();
        if ((this.f27614j & 2) == 2) {
            c2947f.Z(1, this.f27616l);
        }
        if ((this.f27614j & 4) == 4) {
            c2947f.Z(2, this.f27617m);
        }
        if ((this.f27614j & 8) == 8) {
            c2947f.c0(3, this.f27618n);
        }
        for (int i10 = 0; i10 < this.f27620p.size(); i10++) {
            c2947f.c0(4, (m8.p) this.f27620p.get(i10));
        }
        if ((this.f27614j & 32) == 32) {
            c2947f.c0(5, this.f27621q);
        }
        if ((this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            c2947f.c0(6, this.f27626v);
        }
        if ((this.f27614j & 256) == 256) {
            c2947f.Z(7, this.f27627w);
        }
        if ((this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            c2947f.Z(8, this.f27628x);
        }
        if ((this.f27614j & 16) == 16) {
            c2947f.Z(9, this.f27619o);
        }
        if ((this.f27614j & 64) == 64) {
            c2947f.Z(10, this.f27622r);
        }
        if ((this.f27614j & 1) == 1) {
            c2947f.Z(11, this.f27615k);
        }
        for (int i11 = 0; i11 < this.f27623s.size(); i11++) {
            c2947f.c0(12, (m8.p) this.f27623s.get(i11));
        }
        if (V().size() > 0) {
            c2947f.n0(106);
            c2947f.n0(this.f27625u);
        }
        for (int i12 = 0; i12 < this.f27624t.size(); i12++) {
            c2947f.a0(((Integer) this.f27624t.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f27629y.size(); i13++) {
            c2947f.Z(31, ((Integer) this.f27629y.get(i13)).intValue());
        }
        aVarX.a(19000, c2947f);
        c2947f.h0(this.f27613i);
    }

    public int g0() {
        return this.f27619o;
    }

    public int h0() {
        return this.f27628x;
    }

    public u i0() {
        return this.f27626v;
    }

    public s j0(int i10) {
        return (s) this.f27620p.get(i10);
    }

    public int k0() {
        return this.f27620p.size();
    }

    public List m0() {
        return this.f27620p;
    }

    public List n0() {
        return this.f27629y;
    }

    public boolean o0() {
        return (this.f27614j & 1) == 1;
    }

    public boolean p0() {
        return (this.f27614j & 256) == 256;
    }

    public boolean q0() {
        return (this.f27614j & 4) == 4;
    }

    public boolean r0() {
        return (this.f27614j & 2) == 2;
    }

    public boolean s0() {
        return (this.f27614j & 32) == 32;
    }

    public boolean t0() {
        return (this.f27614j & 64) == 64;
    }

    public boolean u0() {
        return (this.f27614j & 8) == 8;
    }

    public boolean v0() {
        return (this.f27614j & 16) == 16;
    }

    public boolean w0() {
        return (this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public boolean x0() {
        return (this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    private n(AbstractC2950i.c cVar) {
        super(cVar);
        this.f27625u = -1;
        this.f27630z = (byte) -1;
        this.f27612A = -1;
        this.f27613i = cVar.i();
    }

    private n(boolean z10) {
        this.f27625u = -1;
        this.f27630z = (byte) -1;
        this.f27612A = -1;
        this.f27613i = AbstractC2945d.f29639g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    private n(C2946e c2946e, C2948g c2948g) {
        this.f27625u = -1;
        this.f27630z = (byte) -1;
        this.f27612A = -1;
        y0();
        AbstractC2945d.b bVarY = AbstractC2945d.y();
        C2947f c2947fI = C2947f.I(bVarY, 1);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ?? O9 = 256;
            if (!z10) {
                try {
                    try {
                        try {
                            int iJ = c2946e.J();
                            switch (iJ) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 8:
                                    this.f27614j |= 2;
                                    this.f27616l = c2946e.r();
                                    break;
                                case 16:
                                    this.f27614j |= 4;
                                    this.f27617m = c2946e.r();
                                    break;
                                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                                    q.c cVarA0 = (this.f27614j & 8) == 8 ? this.f27618n.f() : null;
                                    q qVar = (q) c2946e.t(q.f27682B, c2948g);
                                    this.f27618n = qVar;
                                    if (cVarA0 != null) {
                                        cVarA0.j(qVar);
                                        this.f27618n = cVarA0.r();
                                    }
                                    this.f27614j |= 8;
                                    break;
                                case 34:
                                    int i11 = (i10 == true ? 1 : 0) & 32;
                                    i10 = i10;
                                    if (i11 != 32) {
                                        this.f27620p = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 32;
                                    }
                                    this.f27620p.add(c2946e.t(s.f27762u, c2948g));
                                    break;
                                case 42:
                                    q.c cVarA02 = (this.f27614j & 32) == 32 ? this.f27621q.f() : null;
                                    q qVar2 = (q) c2946e.t(q.f27682B, c2948g);
                                    this.f27621q = qVar2;
                                    if (cVarA02 != null) {
                                        cVarA02.j(qVar2);
                                        this.f27621q = cVarA02.r();
                                    }
                                    this.f27614j |= 32;
                                    break;
                                case 50:
                                    u.b bVarZ = (this.f27614j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128 ? this.f27626v.f() : null;
                                    u uVar = (u) c2946e.t(u.f27799t, c2948g);
                                    this.f27626v = uVar;
                                    if (bVarZ != null) {
                                        bVarZ.j(uVar);
                                        this.f27626v = bVarZ.r();
                                    }
                                    this.f27614j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                    break;
                                case 56:
                                    this.f27614j |= 256;
                                    this.f27627w = c2946e.r();
                                    break;
                                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                    this.f27614j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    this.f27628x = c2946e.r();
                                    break;
                                case 72:
                                    this.f27614j |= 16;
                                    this.f27619o = c2946e.r();
                                    break;
                                case 80:
                                    this.f27614j |= 64;
                                    this.f27622r = c2946e.r();
                                    break;
                                case 88:
                                    this.f27614j |= 1;
                                    this.f27615k = c2946e.r();
                                    break;
                                case 98:
                                    int i12 = (i10 == true ? 1 : 0) & 256;
                                    i10 = i10;
                                    if (i12 != 256) {
                                        this.f27623s = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 256;
                                    }
                                    this.f27623s.add(c2946e.t(q.f27682B, c2948g));
                                    break;
                                case 104:
                                    int i13 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    i10 = i10;
                                    if (i13 != 512) {
                                        this.f27624t = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    }
                                    this.f27624t.add(Integer.valueOf(c2946e.r()));
                                    break;
                                case 106:
                                    int i14 = c2946e.i(c2946e.z());
                                    int i15 = (i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    i10 = i10;
                                    if (i15 != 512) {
                                        i10 = i10;
                                        if (c2946e.e() > 0) {
                                            this.f27624t = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                        }
                                    }
                                    while (c2946e.e() > 0) {
                                        this.f27624t.add(Integer.valueOf(c2946e.r()));
                                    }
                                    c2946e.h(i14);
                                    break;
                                case 248:
                                    int i16 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i16 != 8192) {
                                        this.f27629y = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f27629y.add(Integer.valueOf(c2946e.r()));
                                    break;
                                case 250:
                                    int i17 = c2946e.i(c2946e.z());
                                    int i18 = (i10 == true ? 1 : 0) & 8192;
                                    i10 = i10;
                                    if (i18 != 8192) {
                                        i10 = i10;
                                        if (c2946e.e() > 0) {
                                            this.f27629y = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (c2946e.e() > 0) {
                                        this.f27629y.add(Integer.valueOf(c2946e.r()));
                                    }
                                    c2946e.h(i17);
                                    break;
                                default:
                                    O9 = o(c2946e, c2947fI, c2948g, iJ);
                                    if (O9 == 0) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (IOException e10) {
                            throw new C2952k(e10.getMessage()).i(this);
                        }
                    } catch (C2952k e11) {
                        throw e11.i(this);
                    }
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f27620p = Collections.unmodifiableList(this.f27620p);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == O9) {
                        this.f27623s = Collections.unmodifiableList(this.f27623s);
                    }
                    if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        this.f27624t = Collections.unmodifiableList(this.f27624t);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f27629y = Collections.unmodifiableList(this.f27629y);
                    }
                    try {
                        c2947fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27613i = bVarY.m();
                        throw th2;
                    }
                    this.f27613i = bVarY.m();
                    l();
                    throw th;
                }
            } else {
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f27620p = Collections.unmodifiableList(this.f27620p);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f27623s = Collections.unmodifiableList(this.f27623s);
                }
                if (((i10 == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.f27624t = Collections.unmodifiableList(this.f27624t);
                }
                if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f27629y = Collections.unmodifiableList(this.f27629y);
                }
                try {
                    c2947fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f27613i = bVarY.m();
                    throw th3;
                }
                this.f27613i = bVarY.m();
                l();
                return;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2950i.c implements m8.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27631j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f27634m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f27636o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List f27637p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private q f27638q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f27639r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List f27640s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f27641t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private u f27642u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f27643v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f27644w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List f27645x;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f27632k = 518;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f27633l = 2054;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private q f27635n = q.W();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f27637p = list;
            this.f27638q = q.W();
            this.f27640s = list;
            this.f27641t = list;
            this.f27642u = u.H();
            this.f27645x = list;
            z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f27631j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                this.f27641t = new ArrayList(this.f27641t);
                this.f27631j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
        }

        private void w() {
            if ((this.f27631j & 256) != 256) {
                this.f27640s = new ArrayList(this.f27640s);
                this.f27631j |= 256;
            }
        }

        private void x() {
            if ((this.f27631j & 32) != 32) {
                this.f27637p = new ArrayList(this.f27637p);
                this.f27631j |= 32;
            }
        }

        private void y() {
            if ((this.f27631j & 8192) != 8192) {
                this.f27645x = new ArrayList(this.f27645x);
                this.f27631j |= 8192;
            }
        }

        @Override // m8.AbstractC2950i.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b j(n nVar) {
            if (nVar == n.X()) {
                return this;
            }
            if (nVar.o0()) {
                F(nVar.Z());
            }
            if (nVar.r0()) {
                I(nVar.c0());
            }
            if (nVar.q0()) {
                H(nVar.b0());
            }
            if (nVar.u0()) {
                D(nVar.f0());
            }
            if (nVar.v0()) {
                K(nVar.g0());
            }
            if (!nVar.f27620p.isEmpty()) {
                if (this.f27637p.isEmpty()) {
                    this.f27637p = nVar.f27620p;
                    this.f27631j &= -33;
                } else {
                    x();
                    this.f27637p.addAll(nVar.f27620p);
                }
            }
            if (nVar.s0()) {
                C(nVar.d0());
            }
            if (nVar.t0()) {
                J(nVar.e0());
            }
            if (!nVar.f27623s.isEmpty()) {
                if (this.f27640s.isEmpty()) {
                    this.f27640s = nVar.f27623s;
                    this.f27631j &= -257;
                } else {
                    w();
                    this.f27640s.addAll(nVar.f27623s);
                }
            }
            if (!nVar.f27624t.isEmpty()) {
                if (this.f27641t.isEmpty()) {
                    this.f27641t = nVar.f27624t;
                    this.f27631j &= -513;
                } else {
                    v();
                    this.f27641t.addAll(nVar.f27624t);
                }
            }
            if (nVar.x0()) {
                E(nVar.i0());
            }
            if (nVar.p0()) {
                G(nVar.a0());
            }
            if (nVar.w0()) {
                L(nVar.h0());
            }
            if (!nVar.f27629y.isEmpty()) {
                if (this.f27645x.isEmpty()) {
                    this.f27645x = nVar.f27629y;
                    this.f27631j &= -8193;
                } else {
                    y();
                    this.f27645x.addAll(nVar.f27629y);
                }
            }
            o(nVar);
            k(i().o(nVar.f27613i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // m8.p.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b l0(C2946e c2946e, C2948g c2948g) throws Throwable {
            n nVar = null;
            try {
                try {
                    n nVar2 = (n) n.f27611C.a(c2946e, c2948g);
                    if (nVar2 != null) {
                        j(nVar2);
                    }
                    return this;
                } catch (C2952k e10) {
                    n nVar3 = (n) e10.a();
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        nVar = nVar3;
                        if (nVar != null) {
                            j(nVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (nVar != null) {
                }
                throw th;
            }
        }

        public b C(q qVar) {
            if ((this.f27631j & 64) != 64 || this.f27638q == q.W()) {
                this.f27638q = qVar;
            } else {
                this.f27638q = q.y0(this.f27638q).j(qVar).r();
            }
            this.f27631j |= 64;
            return this;
        }

        public b D(q qVar) {
            if ((this.f27631j & 8) != 8 || this.f27635n == q.W()) {
                this.f27635n = qVar;
            } else {
                this.f27635n = q.y0(this.f27635n).j(qVar).r();
            }
            this.f27631j |= 8;
            return this;
        }

        public b E(u uVar) {
            if ((this.f27631j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024 || this.f27642u == u.H()) {
                this.f27642u = uVar;
            } else {
                this.f27642u = u.X(this.f27642u).j(uVar).r();
            }
            this.f27631j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            return this;
        }

        public b F(int i10) {
            this.f27631j |= 1;
            this.f27632k = i10;
            return this;
        }

        public b G(int i10) {
            this.f27631j |= 2048;
            this.f27643v = i10;
            return this;
        }

        public b H(int i10) {
            this.f27631j |= 4;
            this.f27634m = i10;
            return this;
        }

        public b I(int i10) {
            this.f27631j |= 2;
            this.f27633l = i10;
            return this;
        }

        public b J(int i10) {
            this.f27631j |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            this.f27639r = i10;
            return this;
        }

        public b K(int i10) {
            this.f27631j |= 16;
            this.f27636o = i10;
            return this;
        }

        public b L(int i10) {
            this.f27631j |= 4096;
            this.f27644w = i10;
            return this;
        }

        @Override // m8.p.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public n build() {
            n nVarR = r();
            if (nVarR.e()) {
                return nVarR;
            }
            throw AbstractC2942a.AbstractC0318a.h(nVarR);
        }

        public n r() {
            n nVar = new n(this);
            int i10 = this.f27631j;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            nVar.f27615k = this.f27632k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            nVar.f27616l = this.f27633l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            nVar.f27617m = this.f27634m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            nVar.f27618n = this.f27635n;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            nVar.f27619o = this.f27636o;
            if ((this.f27631j & 32) == 32) {
                this.f27637p = Collections.unmodifiableList(this.f27637p);
                this.f27631j &= -33;
            }
            nVar.f27620p = this.f27637p;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            nVar.f27621q = this.f27638q;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i11 |= 64;
            }
            nVar.f27622r = this.f27639r;
            if ((this.f27631j & 256) == 256) {
                this.f27640s = Collections.unmodifiableList(this.f27640s);
                this.f27631j &= -257;
            }
            nVar.f27623s = this.f27640s;
            if ((this.f27631j & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.f27641t = Collections.unmodifiableList(this.f27641t);
                this.f27631j &= -513;
            }
            nVar.f27624t = this.f27641t;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            nVar.f27626v = this.f27642u;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            nVar.f27627w = this.f27643v;
            if ((i10 & 4096) == 4096) {
                i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            nVar.f27628x = this.f27644w;
            if ((this.f27631j & 8192) == 8192) {
                this.f27645x = Collections.unmodifiableList(this.f27645x);
                this.f27631j &= -8193;
            }
            nVar.f27629y = this.f27645x;
            nVar.f27614j = i11;
            return nVar;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        private void z() {
        }
    }
}
