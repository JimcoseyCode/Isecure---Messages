package I4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class X extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f4628p = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Object f4629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    transient int[] f4630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient Object[] f4631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    transient Object[] f4632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f4633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int f4634l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient Set f4635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set f4636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Collection f4637o;

    X(int i10) {
        s(12);
    }

    private final int A(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = Y.d(i11);
        if (i13 != 0) {
            Y.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f4629g;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = Y.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = Y.c(objD, i19);
                Y.e(objD, i19, iC);
                iArrA[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f4629g = objD;
        C(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(Object obj) {
        if (!u()) {
            int iY = y();
            Object obj2 = this.f4629g;
            Objects.requireNonNull(obj2);
            int iB = Y.b(obj, null, iY, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                t(iB, iY);
                this.f4634l--;
                r();
                return obj3;
            }
        }
        return f4628p;
    }

    private final void C(int i10) {
        this.f4633k = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f4633k & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f4630h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f4631i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] c() {
        Object[] objArr = this.f4632j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object j(X x10, int i10) {
        return x10.b()[i10];
    }

    static /* synthetic */ Object l(X x10) {
        Object obj = x10.f4629g;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object m(X x10, int i10) {
        return x10.c()[i10];
    }

    static /* synthetic */ void q(X x10, int i10, Object obj) {
        x10.c()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int y() {
        return (1 << (this.f4633k & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(Object obj) {
        if (u()) {
            return -1;
        }
        int iA = Z.a(obj);
        int iY = y();
        Object obj2 = this.f4629g;
        Objects.requireNonNull(obj2);
        int iC = Y.c(obj2, iA & iY);
        if (iC != 0) {
            int i10 = ~iY;
            int i11 = iA & i10;
            do {
                int i12 = iC - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && AbstractC0972p.a(obj, b()[i12])) {
                    return i12;
                }
                iC = i13 & iY;
            } while (iC != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        r();
        Map mapO = o();
        if (mapO != null) {
            this.f4633k = G0.a(size(), 3, 1073741823);
            mapO.clear();
            this.f4629g = null;
            this.f4634l = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f4634l, (Object) null);
        Arrays.fill(c(), 0, this.f4634l, (Object) null);
        Object obj = this.f4629g;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f4634l, 0);
        this.f4634l = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapO = o();
        return mapO != null ? mapO.containsKey(obj) : z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f4634l; i10++) {
            if (AbstractC0972p.a(obj, c()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f4636n;
        if (set != null) {
            return set;
        }
        Q q10 = new Q(this);
        this.f4636n = q10;
        return q10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.get(obj);
        }
        int iZ = z(obj);
        if (iZ == -1) {
            return null;
        }
        return c()[iZ];
    }

    final int h() {
        return isEmpty() ? -1 : 0;
    }

    final int i(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f4634l) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f4635m;
        if (set != null) {
            return set;
        }
        U u10 = new U(this);
        this.f4635m = u10;
        return u10;
    }

    final Map o() {
        Object obj = this.f4629g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (u()) {
            r.e(u(), "Arrays already allocated");
            int i11 = this.f4633k;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f4629g = Y.d(iMax2);
            C(iMax2 - 1);
            this.f4630h = new int[i11];
            this.f4631i = new Object[i11];
            this.f4632j = new Object[i11];
        }
        Map mapO = o();
        if (mapO != null) {
            return mapO.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f4634l;
        int i13 = i12 + 1;
        int iA = Z.a(obj);
        int iY = y();
        int i14 = iA & iY;
        Object obj3 = this.f4629g;
        Objects.requireNonNull(obj3);
        int iC = Y.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iY) {
                iY = A(iY, Y.a(iY), iA, i12);
            } else {
                Object obj4 = this.f4629g;
                Objects.requireNonNull(obj4);
                Y.e(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iY;
            int i16 = iA & i15;
            int i17 = 0;
            while (true) {
                int i18 = iC - 1;
                int i19 = iArrA[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC0972p.a(obj, objArrB[i18])) {
                    Object obj5 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iY;
                i17++;
                if (i21 != 0) {
                    iC = i21;
                } else {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(y() + 1, 1.0f);
                        int iH = h();
                        while (iH >= 0) {
                            linkedHashMap.put(b()[iH], c()[iH]);
                            iH = i(iH);
                        }
                        this.f4629g = linkedHashMap;
                        this.f4630h = null;
                        this.f4631i = null;
                        this.f4632j = null;
                        r();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iY) {
                        iY = A(iY, Y.a(iY), iA, i12);
                    } else {
                        iArrA[i18] = (i13 & iY) | i20;
                    }
                }
            }
        }
        int length = a().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.f4630h = Arrays.copyOf(a(), iMin);
                this.f4631i = Arrays.copyOf(b(), iMin);
                this.f4632j = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iY) & iA;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f4634l = i13;
        r();
        return null;
    }

    final void r() {
        this.f4633k += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.remove(obj);
        }
        Object objB = B(obj);
        if (objB == f4628p) {
            return null;
        }
        return objB;
    }

    final void s(int i10) {
        this.f4633k = G0.a(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapO = o();
        return mapO != null ? mapO.size() : this.f4634l;
    }

    final void t(int i10, int i11) {
        Object obj = this.f4629g;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrB[i10] = null;
            objArrC[i10] = null;
            iArrA[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrB[i12];
        objArrB[i10] = obj2;
        objArrC[i10] = objArrC[i12];
        objArrB[i12] = null;
        objArrC[i12] = null;
        iArrA[i10] = iArrA[i12];
        iArrA[i12] = 0;
        int iA = Z.a(obj2) & i11;
        int iC = Y.c(obj, iA);
        if (iC == size) {
            Y.e(obj, iA, i13);
            return;
        }
        while (true) {
            int i14 = iC - 1;
            int i15 = iArrA[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrA[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iC = i16;
        }
    }

    final boolean u() {
        return this.f4629g == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f4637o;
        if (collection != null) {
            return collection;
        }
        W w10 = new W(this);
        this.f4637o = w10;
        return w10;
    }
}
