package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C1728v;
import androidx.datastore.preferences.protobuf.k0;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1715h implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1714g f16866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16869d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16870a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f16870a = iArr;
            try {
                iArr[k0.b.f16919p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16870a[k0.b.f16923t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16870a[k0.b.f16912i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16870a[k0.b.f16925v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16870a[k0.b.f16918o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16870a[k0.b.f16917n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16870a[k0.b.f16913j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16870a[k0.b.f16916m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16870a[k0.b.f16914k.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16870a[k0.b.f16922s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16870a[k0.b.f16926w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16870a[k0.b.f16927x.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16870a[k0.b.f16928y.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16870a[k0.b.f16929z.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16870a[k0.b.f16920q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16870a[k0.b.f16924u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16870a[k0.b.f16915l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C1715h(AbstractC1714g abstractC1714g) {
        AbstractC1714g abstractC1714g2 = (AbstractC1714g) AbstractC1727u.b(abstractC1714g, "input");
        this.f16866a = abstractC1714g2;
        abstractC1714g2.f16841d = this;
    }

    public static C1715h O(AbstractC1714g abstractC1714g) {
        C1715h c1715h = abstractC1714g.f16841d;
        return c1715h != null ? c1715h : new C1715h(abstractC1714g);
    }

    private void P(Object obj, Y y10, C1720m c1720m) {
        int i10 = this.f16868c;
        this.f16868c = k0.c(k0.a(this.f16867b), 4);
        try {
            y10.b(obj, this, c1720m);
            if (this.f16867b == this.f16868c) {
            } else {
                throw C1728v.h();
            }
        } finally {
            this.f16868c = i10;
        }
    }

    private void Q(Object obj, Y y10, C1720m c1720m) throws C1728v {
        int iD = this.f16866a.D();
        AbstractC1714g abstractC1714g = this.f16866a;
        if (abstractC1714g.f16838a >= abstractC1714g.f16839b) {
            throw C1728v.i();
        }
        int iM = abstractC1714g.m(iD);
        this.f16866a.f16838a++;
        y10.b(obj, this, c1720m);
        this.f16866a.a(0);
        r5.f16838a--;
        this.f16866a.l(iM);
    }

    private Object R(k0.b bVar, Class cls, C1720m c1720m) {
        switch (a.f16870a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return C();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(s());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(E());
            case 9:
                return Long.valueOf(L());
            case 10:
                return U(cls, c1720m);
            case 11:
                return Integer.valueOf(H());
            case 12:
                return Long.valueOf(j());
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return Integer.valueOf(v());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return Long.valueOf(w());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return M();
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(c());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object S(Y y10, C1720m c1720m) {
        Object objNewInstance = y10.newInstance();
        P(objNewInstance, y10, c1720m);
        y10.c(objNewInstance);
        return objNewInstance;
    }

    private Object T(Y y10, C1720m c1720m) throws C1728v {
        Object objNewInstance = y10.newInstance();
        Q(objNewInstance, y10, c1720m);
        y10.c(objNewInstance);
        return objNewInstance;
    }

    private void W(int i10) throws C1728v {
        if (this.f16866a.e() != i10) {
            throw C1728v.m();
        }
    }

    private void X(int i10) throws C1728v.a {
        if (k0.b(this.f16867b) != i10) {
            throw C1728v.e();
        }
    }

    private void Y(int i10) throws C1728v {
        if ((i10 & 3) != 0) {
            throw C1728v.h();
        }
    }

    private void Z(int i10) throws C1728v {
        if ((i10 & 7) != 0) {
            throw C1728v.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void A(List list) throws C1728v.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void B(List list) throws C1728v.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public AbstractC1713f C() throws C1728v.a {
        X(2);
        return this.f16866a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void D(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 2) {
            int iD = this.f16866a.D();
            Y(iD);
            int iE = this.f16866a.e() + iD;
            do {
                list.add(Float.valueOf(this.f16866a.t()));
            } while (this.f16866a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1728v.e();
        }
        do {
            list.add(Float.valueOf(this.f16866a.t()));
            if (this.f16866a.f()) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == this.f16867b);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int E() throws C1728v.a {
        X(0);
        return this.f16866a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void F(List list, Y y10, C1720m c1720m) throws C1728v.a {
        int iC;
        if (k0.b(this.f16867b) != 3) {
            throw C1728v.e();
        }
        int i10 = this.f16867b;
        do {
            list.add(S(y10, c1720m));
            if (this.f16866a.f() || this.f16869d != 0) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == i10);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean G() {
        int i10;
        if (this.f16866a.f() || (i10 = this.f16867b) == this.f16868c) {
            return false;
        }
        return this.f16866a.F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int H() throws C1728v.a {
        X(5);
        return this.f16866a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void I(List list) throws C1728v.a {
        int iC;
        if (k0.b(this.f16867b) != 2) {
            throw C1728v.e();
        }
        do {
            list.add(C());
            if (this.f16866a.f()) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == this.f16867b);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void J(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f16866a.p()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iD = this.f16866a.D();
        Z(iD);
        int iE = this.f16866a.e() + iD;
        do {
            list.add(Double.valueOf(this.f16866a.p()));
        } while (this.f16866a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void K(List list, Y y10, C1720m c1720m) throws C1728v.a {
        int iC;
        if (k0.b(this.f16867b) != 2) {
            throw C1728v.e();
        }
        int i10 = this.f16867b;
        do {
            list.add(T(y10, c1720m));
            if (this.f16866a.f() || this.f16869d != 0) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == i10);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long L() throws C1728v.a {
        X(0);
        return this.f16866a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String M() throws C1728v.a {
        X(2);
        return this.f16866a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void N(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f16866a.s()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iD = this.f16866a.D();
        Z(iD);
        int iE = this.f16866a.e() + iD;
        do {
            list.add(Long.valueOf(this.f16866a.s()));
        } while (this.f16866a.e() < iE);
    }

    public Object U(Class cls, C1720m c1720m) throws C1728v.a {
        X(2);
        return T(U.a().c(cls), c1720m);
    }

    public void V(List list, boolean z10) throws C1728v.a {
        int iC;
        if (k0.b(this.f16867b) != 2) {
            throw C1728v.e();
        }
        do {
            list.add(z10 ? M() : y());
            if (this.f16866a.f()) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == this.f16867b);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int a() {
        return this.f16867b;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void b(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f16866a.y()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Integer.valueOf(this.f16866a.y()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long c() throws C1728v.a {
        X(0);
        return this.f16866a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long d() throws C1728v.a {
        X(1);
        return this.f16866a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void e(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 2) {
            int iD = this.f16866a.D();
            Y(iD);
            int iE = this.f16866a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f16866a.w()));
            } while (this.f16866a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1728v.e();
        }
        do {
            list.add(Integer.valueOf(this.f16866a.w()));
            if (this.f16866a.f()) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == this.f16867b);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void f(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f16866a.z()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Long.valueOf(this.f16866a.z()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void g(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f16866a.D()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Integer.valueOf(this.f16866a.D()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int h() throws C1728v.a {
        X(5);
        return this.f16866a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean i() throws C1728v.a {
        X(0);
        return this.f16866a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long j() throws C1728v.a {
        X(1);
        return this.f16866a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void k(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f16866a.E()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Long.valueOf(this.f16866a.E()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int l() throws C1728v.a {
        X(0);
        return this.f16866a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void m(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f16866a.v()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Long.valueOf(this.f16866a.v()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void n(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f16866a.x()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iD = this.f16866a.D();
        Z(iD);
        int iE = this.f16866a.e() + iD;
        do {
            list.add(Long.valueOf(this.f16866a.x()));
        } while (this.f16866a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void o(Object obj, Y y10, C1720m c1720m) throws C1728v {
        X(2);
        Q(obj, y10, c1720m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void p(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f16866a.u()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Integer.valueOf(this.f16866a.u()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void q(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f16866a.q()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Integer.valueOf(this.f16866a.q()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f16866a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(Map map, C.a aVar, C1720m c1720m) throws C1728v.a {
        X(2);
        int iM = this.f16866a.m(this.f16866a.D());
        Object objR = aVar.f16750b;
        Object objR2 = aVar.f16752d;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || this.f16866a.f()) {
                    break;
                }
                if (iZ == 1) {
                    objR = R(aVar.f16749a, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!G()) {
                            throw new C1728v("Unable to parse map entry.");
                        }
                    } catch (C1728v.a unused) {
                        if (!G()) {
                            throw new C1728v("Unable to parse map entry.");
                        }
                    }
                } else {
                    objR2 = R(aVar.f16751c, aVar.f16752d.getClass(), c1720m);
                }
            } catch (Throwable th) {
                this.f16866a.l(iM);
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public double readDouble() throws C1728v.a {
        X(1);
        return this.f16866a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public float readFloat() throws C1728v.a {
        X(5);
        return this.f16866a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int s() throws C1728v.a {
        X(0);
        return this.f16866a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void t(Object obj, Y y10, C1720m c1720m) throws C1728v.a {
        X(3);
        P(obj, y10, c1720m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void u(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 2) {
            int iD = this.f16866a.D();
            Y(iD);
            int iE = this.f16866a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f16866a.r()));
            } while (this.f16866a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C1728v.e();
        }
        do {
            list.add(Integer.valueOf(this.f16866a.r()));
            if (this.f16866a.f()) {
                return;
            } else {
                iC = this.f16866a.C();
            }
        } while (iC == this.f16867b);
        this.f16869d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int v() throws C1728v.a {
        X(0);
        return this.f16866a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long w() throws C1728v.a {
        X(0);
        return this.f16866a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void x(List list) throws C1728v {
        int iC;
        int iB = k0.b(this.f16867b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f16866a.n()));
                if (this.f16866a.f()) {
                    return;
                } else {
                    iC = this.f16866a.C();
                }
            } while (iC == this.f16867b);
            this.f16869d = iC;
            return;
        }
        if (iB != 2) {
            throw C1728v.e();
        }
        int iE = this.f16866a.e() + this.f16866a.D();
        do {
            list.add(Boolean.valueOf(this.f16866a.n()));
        } while (this.f16866a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String y() throws C1728v.a {
        X(2);
        return this.f16866a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int z() {
        int i10 = this.f16869d;
        if (i10 != 0) {
            this.f16867b = i10;
            this.f16869d = 0;
        } else {
            this.f16867b = this.f16866a.C();
        }
        int i11 = this.f16867b;
        return (i11 == 0 || i11 == this.f16868c) ? ViewDefaults.NUMBER_OF_LINES : k0.a(i11);
    }
}
