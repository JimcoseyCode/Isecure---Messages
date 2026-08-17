package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1724q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1724q f16954d = new C1724q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f16955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16957c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f16959b;

        static {
            int[] iArr = new int[k0.b.values().length];
            f16959b = iArr;
            try {
                iArr[k0.b.f16912i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16959b[k0.b.f16913j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16959b[k0.b.f16914k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16959b[k0.b.f16915l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16959b[k0.b.f16916m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16959b[k0.b.f16917n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16959b[k0.b.f16918o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16959b[k0.b.f16919p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16959b[k0.b.f16921r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16959b[k0.b.f16922s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16959b[k0.b.f16920q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16959b[k0.b.f16923t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16959b[k0.b.f16924u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16959b[k0.b.f16926w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16959b[k0.b.f16927x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16959b[k0.b.f16928y.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16959b[k0.b.f16929z.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16959b[k0.b.f16925v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[k0.c.values().length];
            f16958a = iArr2;
            try {
                iArr2[k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16958a[k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16958a[k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16958a[k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16958a[k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16958a[k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16958a[k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16958a[k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16958a[k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b extends Comparable {
        int a();

        boolean c();

        k0.b d();

        boolean g();
    }

    private C1724q() {
        this.f16955a = b0.q();
    }

    static int b(k0.b bVar, int i10, Object obj) {
        int iO = AbstractC1716i.O(i10);
        if (bVar == k0.b.f16921r) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    static int c(k0.b bVar, Object obj) {
        switch (a.f16959b[bVar.ordinal()]) {
            case 1:
                return AbstractC1716i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1716i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1716i.x(((Long) obj).longValue());
            case 4:
                return AbstractC1716i.S(((Long) obj).longValue());
            case 5:
                return AbstractC1716i.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1716i.o(((Long) obj).longValue());
            case 7:
                return AbstractC1716i.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1716i.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1716i.s((J) obj);
            case 10:
                return AbstractC1716i.A((J) obj);
            case 11:
                return obj instanceof AbstractC1713f ? AbstractC1716i.g((AbstractC1713f) obj) : AbstractC1716i.N((String) obj);
            case 12:
                return obj instanceof AbstractC1713f ? AbstractC1716i.g((AbstractC1713f) obj) : AbstractC1716i.e((byte[]) obj);
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return AbstractC1716i.Q(((Integer) obj).intValue());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return AbstractC1716i.F(((Integer) obj).intValue());
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return AbstractC1716i.H(((Long) obj).longValue());
            case 16:
                return AbstractC1716i.J(((Integer) obj).intValue());
            case 17:
                return AbstractC1716i.L(((Long) obj).longValue());
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                return AbstractC1716i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        k0.b bVarD = bVar.d();
        int iA = bVar.a();
        if (!bVar.c()) {
            return b(bVarD, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.g()) {
            int iB = 0;
            while (i10 < size) {
                iB += b(bVarD, iA, list.get(i10));
                i10++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i10 < size) {
            iC += c(bVarD, list.get(i10));
            i10++;
        }
        return AbstractC1716i.O(iA) + iC + AbstractC1716i.Q(iC);
    }

    private int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(k0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.j();
    }

    private static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    private static boolean m(k0.b bVar, Object obj) {
        AbstractC1727u.a(obj);
        switch (a.f16958a[bVar.h().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC1713f) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof J)) {
                }
                break;
        }
        return false;
    }

    private void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static C1724q r() {
        return new C1724q();
    }

    private void t(b bVar, Object obj) {
        if (!m(bVar.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.a()), bVar.d().h(), obj.getClass().getName()));
        }
    }

    static void u(AbstractC1716i abstractC1716i, k0.b bVar, int i10, Object obj) {
        if (bVar == k0.b.f16921r) {
            abstractC1716i.q0(i10, (J) obj);
        } else {
            abstractC1716i.M0(i10, i(bVar, false));
            v(abstractC1716i, bVar, obj);
        }
    }

    static void v(AbstractC1716i abstractC1716i, k0.b bVar, Object obj) {
        switch (a.f16959b[bVar.ordinal()]) {
            case 1:
                abstractC1716i.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC1716i.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC1716i.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC1716i.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC1716i.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC1716i.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC1716i.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC1716i.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC1716i.s0((J) obj);
                break;
            case 10:
                abstractC1716i.z0((J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1713f)) {
                    abstractC1716i.L0((String) obj);
                } else {
                    abstractC1716i.f0((AbstractC1713f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC1713f)) {
                    abstractC1716i.c0((byte[]) obj);
                } else {
                    abstractC1716i.f0((AbstractC1713f) obj);
                }
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                abstractC1716i.O0(((Integer) obj).intValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                abstractC1716i.D0(((Integer) obj).intValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                abstractC1716i.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC1716i.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC1716i.J0(((Long) obj).longValue());
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                abstractC1716i.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1724q clone() {
        C1724q c1724qR = r();
        int iK = this.f16955a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f16955a.j(i10);
            android.support.v4.media.session.b.a(entryJ.getKey());
            c1724qR.s(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f16955a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            c1724qR.s(null, entry.getValue());
        }
        c1724qR.f16957c = this.f16957c;
        return c1724qR;
    }

    Iterator e() {
        return j() ? Collections.emptyIterator() : this.f16957c ? new C1730x(this.f16955a.h().iterator()) : this.f16955a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1724q) {
            return this.f16955a.equals(((C1724q) obj).f16955a);
        }
        return false;
    }

    public int f() {
        int iK = this.f16955a.k();
        int iG = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iG += g(this.f16955a.j(i10));
        }
        Iterator it = this.f16955a.m().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iK = this.f16955a.k();
        int iD = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f16955a.j(i10);
            android.support.v4.media.session.b.a(entryJ.getKey());
            iD += d(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f16955a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f16955a.hashCode();
    }

    boolean j() {
        return this.f16955a.isEmpty();
    }

    public boolean k() {
        int iK = this.f16955a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            if (!l(this.f16955a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f16955a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f16957c ? new C1730x(this.f16955a.entrySet().iterator()) : this.f16955a.entrySet().iterator();
    }

    public void o() {
        if (this.f16956b) {
            return;
        }
        int iK = this.f16955a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            Map.Entry entryJ = this.f16955a.j(i10);
            if (entryJ.getValue() instanceof AbstractC1726t) {
                ((AbstractC1726t) entryJ.getValue()).C();
            }
        }
        this.f16955a.p();
        this.f16956b = true;
    }

    public void p(C1724q c1724q) {
        int iK = c1724q.f16955a.k();
        for (int i10 = 0; i10 < iK; i10++) {
            q(c1724q.f16955a.j(i10));
        }
        Iterator it = c1724q.f16955a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.c()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f16955a.r(bVar, obj);
    }

    private C1724q(boolean z10) {
        this(b0.q());
        o();
    }

    private C1724q(b0 b0Var) {
        this.f16955a = b0Var;
        o();
    }
}
