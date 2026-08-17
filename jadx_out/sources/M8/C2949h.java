package m8;

import com.facebook.react.views.text.TextAttributeProps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m8.AbstractC2951j;
import m8.p;
import m8.y;

/* JADX INFO: renamed from: m8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2949h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2949h f29668d = new C2949h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29671c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f29669a = u.n(16);

    /* JADX INFO: renamed from: m8.h$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f29673b;

        static {
            int[] iArr = new int[y.b.values().length];
            f29673b = iArr;
            try {
                iArr[y.b.f29746i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29673b[y.b.f29747j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29673b[y.b.f29748k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29673b[y.b.f29749l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29673b[y.b.f29750m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29673b[y.b.f29751n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29673b[y.b.f29752o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29673b[y.b.f29753p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29673b[y.b.f29754q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f29673b[y.b.f29757t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29673b[y.b.f29758u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29673b[y.b.f29760w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29673b[y.b.f29761x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29673b[y.b.f29762y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29673b[y.b.f29763z.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29673b[y.b.f29755r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29673b[y.b.f29756s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29673b[y.b.f29759v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[y.c.values().length];
            f29672a = iArr2;
            try {
                iArr2[y.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f29672a[y.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29672a[y.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f29672a[y.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f29672a[y.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f29672a[y.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f29672a[y.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f29672a[y.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f29672a[y.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: m8.h$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b extends Comparable {
        int a();

        boolean c();

        y.b d();

        boolean g();

        p.a i(p.a aVar, p pVar);

        y.c o();
    }

    private C2949h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(y.b bVar, int i10, Object obj) {
        int iC = C2947f.C(i10);
        if (bVar == y.b.f29755r) {
            iC *= 2;
        }
        return iC + e(bVar, obj);
    }

    private static int e(y.b bVar, Object obj) {
        switch (a.f29673b[bVar.ordinal()]) {
            case 1:
                return C2947f.g(((Double) obj).doubleValue());
            case 2:
                return C2947f.m(((Float) obj).floatValue());
            case 3:
                return C2947f.q(((Long) obj).longValue());
            case 4:
                return C2947f.E(((Long) obj).longValue());
            case 5:
                return C2947f.p(((Integer) obj).intValue());
            case 6:
                return C2947f.k(((Long) obj).longValue());
            case 7:
                return C2947f.j(((Integer) obj).intValue());
            case 8:
                return C2947f.b(((Boolean) obj).booleanValue());
            case 9:
                return C2947f.B((String) obj);
            case 10:
                return obj instanceof AbstractC2945d ? C2947f.e((AbstractC2945d) obj) : C2947f.c((byte[]) obj);
            case 11:
                return C2947f.D(((Integer) obj).intValue());
            case 12:
                return C2947f.w(((Integer) obj).intValue());
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return C2947f.x(((Long) obj).longValue());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return C2947f.y(((Integer) obj).intValue());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return C2947f.A(((Long) obj).longValue());
            case 16:
                return C2947f.n((p) obj);
            case 17:
                return C2947f.s((p) obj);
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return obj instanceof AbstractC2951j.a ? C2947f.i(((AbstractC2951j.a) obj).a()) : C2947f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        y.b bVarD = bVar.d();
        int iA = bVar.a();
        if (!bVar.c()) {
            return d(bVarD, iA, obj);
        }
        int iD = 0;
        if (bVar.g()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarD, it.next());
            }
            return C2947f.C(iA) + iD + C2947f.u(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(bVarD, iA, it2.next());
        }
        return iD;
    }

    public static C2949h g() {
        return f29668d;
    }

    static int l(y.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.j();
    }

    private boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.o() != y.c.MESSAGE) {
            return true;
        }
        if (!bVar.c()) {
            Object value = entry.getValue();
            if (value instanceof p) {
                return ((p) value).e();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((p) it.next()).e()) {
                return false;
            }
        }
        return true;
    }

    private void s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.c()) {
            Object objH = h(bVar);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f29669a.o(bVar, objH);
            return;
        }
        if (bVar.o() != y.c.MESSAGE) {
            this.f29669a.o(bVar, c(value));
            return;
        }
        Object objH2 = h(bVar);
        if (objH2 == null) {
            this.f29669a.o(bVar, c(value));
        } else {
            this.f29669a.o(bVar, bVar.i(((p) objH2).f(), (p) value).build());
        }
    }

    public static C2949h t() {
        return new C2949h();
    }

    public static Object u(C2946e c2946e, y.b bVar, boolean z10) {
        switch (a.f29673b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(c2946e.l());
            case 2:
                return Float.valueOf(c2946e.p());
            case 3:
                return Long.valueOf(c2946e.s());
            case 4:
                return Long.valueOf(c2946e.L());
            case 5:
                return Integer.valueOf(c2946e.r());
            case 6:
                return Long.valueOf(c2946e.o());
            case 7:
                return Integer.valueOf(c2946e.n());
            case 8:
                return Boolean.valueOf(c2946e.j());
            case 9:
                return z10 ? c2946e.I() : c2946e.H();
            case 10:
                return c2946e.k();
            case 11:
                return Integer.valueOf(c2946e.K());
            case 12:
                return Integer.valueOf(c2946e.D());
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return Long.valueOf(c2946e.E());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return Integer.valueOf(c2946e.F());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return Long.valueOf(c2946e.G());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void w(y.b bVar, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (a.f29672a[bVar.h().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof AbstractC2945d) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof AbstractC2951j.a)) {
                }
                z11 = z10;
                break;
            case 9:
                z11 = obj instanceof p;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void x(C2947f c2947f, y.b bVar, int i10, Object obj) throws IOException {
        if (bVar == y.b.f29755r) {
            c2947f.X(i10, (p) obj);
        } else {
            c2947f.v0(i10, l(bVar, false));
            y(c2947f, bVar, obj);
        }
    }

    private static void y(C2947f c2947f, y.b bVar, Object obj) throws IOException {
        switch (a.f29673b[bVar.ordinal()]) {
            case 1:
                c2947f.Q(((Double) obj).doubleValue());
                break;
            case 2:
                c2947f.W(((Float) obj).floatValue());
                break;
            case 3:
                c2947f.b0(((Long) obj).longValue());
                break;
            case 4:
                c2947f.y0(((Long) obj).longValue());
                break;
            case 5:
                c2947f.a0(((Integer) obj).intValue());
                break;
            case 6:
                c2947f.U(((Long) obj).longValue());
                break;
            case 7:
                c2947f.T(((Integer) obj).intValue());
                break;
            case 8:
                c2947f.L(((Boolean) obj).booleanValue());
                break;
            case 9:
                c2947f.u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC2945d)) {
                    c2947f.M((byte[]) obj);
                } else {
                    c2947f.O((AbstractC2945d) obj);
                }
                break;
            case 11:
                c2947f.x0(((Integer) obj).intValue());
                break;
            case 12:
                c2947f.p0(((Integer) obj).intValue());
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                c2947f.q0(((Long) obj).longValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                c2947f.r0(((Integer) obj).intValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                c2947f.t0(((Long) obj).longValue());
                break;
            case 16:
                c2947f.Y((p) obj);
                break;
            case 17:
                c2947f.d0((p) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                if (!(obj instanceof AbstractC2951j.a)) {
                    c2947f.S(((Integer) obj).intValue());
                } else {
                    c2947f.S(((AbstractC2951j.a) obj).a());
                }
                break;
        }
    }

    public static void z(b bVar, Object obj, C2947f c2947f) throws IOException {
        y.b bVarD = bVar.d();
        int iA = bVar.a();
        if (!bVar.c()) {
            x(c2947f, bVarD, iA, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.g()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(c2947f, bVarD, iA, it.next());
            }
            return;
        }
        c2947f.v0(iA, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(bVarD, it2.next());
        }
        c2947f.n0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(c2947f, bVarD, it3.next());
        }
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(bVar.d(), obj);
        Object objH = h(bVar);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f29669a.o(bVar, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2949h clone() {
        C2949h c2949hT = t();
        for (int i10 = 0; i10 < this.f29669a.i(); i10++) {
            Map.Entry entryH = this.f29669a.h(i10);
            c2949hT.v((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f29669a.j()) {
            c2949hT.v((b) entry.getKey(), entry.getValue());
        }
        c2949hT.f29671c = this.f29671c;
        return c2949hT;
    }

    public Object h(b bVar) {
        return this.f29669a.get(bVar);
    }

    public Object i(b bVar, int i10) {
        if (!bVar.c()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(b bVar) {
        if (!bVar.c()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(bVar);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f29669a.i(); i10++) {
            Map.Entry entryH = this.f29669a.h(i10);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        for (Map.Entry entry : this.f29669a.j()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(b bVar) {
        if (bVar.c()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f29669a.get(bVar) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f29669a.i(); i10++) {
            if (!o(this.f29669a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f29669a.j().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator p() {
        return this.f29671c ? new C2953l(this.f29669a.entrySet().iterator()) : this.f29669a.entrySet().iterator();
    }

    public void q() {
        if (this.f29670b) {
            return;
        }
        this.f29669a.m();
        this.f29670b = true;
    }

    public void r(C2949h c2949h) {
        for (int i10 = 0; i10 < c2949h.f29669a.i(); i10++) {
            s(c2949h.f29669a.h(i10));
        }
        Iterator it = c2949h.f29669a.j().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.c()) {
            w(bVar.d(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(bVar.d(), it.next());
            }
            obj = arrayList;
        }
        this.f29669a.o(bVar, obj);
    }

    private C2949h(boolean z10) {
        q();
    }
}
