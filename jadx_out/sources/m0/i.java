package m0;

import j7.AbstractC2793j;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC2956a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f29538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f29539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29540i;

    public i() {
        this(0, 1, null);
    }

    private final int c(Object obj, int i10) {
        int i11 = this.f29540i;
        if (i11 == 0) {
            return -1;
        }
        int iA = AbstractC2956a.a(this.f29538g, i11, i10);
        if (iA < 0 || AbstractC2855l.b(obj, this.f29539h[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f29538g[i12] == i10) {
            if (AbstractC2855l.b(obj, this.f29539h[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f29538g[i13] == i10; i13--) {
            if (AbstractC2855l.b(obj, this.f29539h[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int e() {
        int i10 = this.f29540i;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC2956a.a(this.f29538g, i10, 0);
        if (iA < 0 || this.f29539h[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f29538g[i11] == 0) {
            if (this.f29539h[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f29538g[i12] == 0; i12--) {
            if (this.f29539h[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f29540i * 2;
        Object[] objArr = this.f29539h;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC2855l.b(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f29540i;
        int[] iArr = this.f29538g;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC2855l.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f29538g = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29539h, i10 * 2);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29539h = objArrCopyOf;
        }
        if (this.f29540i != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f29540i > 0) {
            this.f29538g = AbstractC2956a.f30012a;
            this.f29539h = AbstractC2956a.f30014c;
            this.f29540i = 0;
        }
        if (this.f29540i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                if (size() != ((i) obj).size()) {
                    return false;
                }
                i iVar = (i) obj;
                int i10 = this.f29540i;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objJ = j(i11);
                    Object obj2 = iVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !iVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!AbstractC2855l.b(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f29540i;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!AbstractC2855l.b(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i10) {
        if (i10 >= 0 && i10 < this.f29540i) {
            return this.f29539h[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public void g(i map) {
        AbstractC2855l.g(map, "map");
        int i10 = map.f29540i;
        b(this.f29540i + i10);
        if (this.f29540i != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.f(i11), map.j(i11));
            }
        } else if (i10 > 0) {
            AbstractC2793j.g(map.f29538g, this.f29538g, 0, 0, i10);
            AbstractC2793j.i(map.f29539h, this.f29539h, 0, 0, i10 << 1);
            this.f29540i = i10;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f29539h[(iD << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f29539h[(iD << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f29540i)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f29539h;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f29538g;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC2793j.g(iArr, iArr, i10, i14, i11);
                Object[] objArr2 = this.f29539h;
                AbstractC2793j.i(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f29539h;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC2855l.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f29538g = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29539h, i16 << 1);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29539h = objArrCopyOf;
            if (i11 != this.f29540i) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                AbstractC2793j.g(iArr, this.f29538g, 0, 0, i10);
                AbstractC2793j.i(objArr, this.f29539h, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC2793j.g(iArr, this.f29538g, i10, i17, i11);
                AbstractC2793j.i(objArr, this.f29539h, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f29540i) {
            throw new ConcurrentModificationException();
        }
        this.f29540i = i13;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f29538g;
        Object[] objArr = this.f29539h;
        int i10 = this.f29540i;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f29540i) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f29539h;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f29540i <= 0;
    }

    public Object j(int i10) {
        if (i10 >= 0 && i10 < this.f29540i) {
            return this.f29539h[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f29540i;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f29539h;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f29538g;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC2855l.f(iArrCopyOf, "copyOf(this, newSize)");
            this.f29538g = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f29539h, i13 << 1);
            AbstractC2855l.f(objArrCopyOf, "copyOf(this, newSize)");
            this.f29539h = objArrCopyOf;
            if (i10 != this.f29540i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f29538g;
            int i14 = i12 + 1;
            AbstractC2793j.g(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f29539h;
            AbstractC2793j.i(objArr2, objArr2, i14 << 1, i12 << 1, this.f29540i << 1);
        }
        int i15 = this.f29540i;
        if (i10 == i15) {
            int[] iArr3 = this.f29538g;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f29539h;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f29540i = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public int size() {
        return this.f29540i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f29540i * 28);
        sb.append('{');
        int i10 = this.f29540i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i11);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public i(int i10) {
        this.f29538g = i10 == 0 ? AbstractC2956a.f30012a : new int[i10];
        this.f29539h = i10 == 0 ? AbstractC2956a.f30014c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC2855l.b(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC2855l.b(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public /* synthetic */ i(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public i(i iVar) {
        this(0, 1, null);
        if (iVar != null) {
            g(iVar);
        }
    }
}
