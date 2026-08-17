package j7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2796m extends AbstractC2795l {

    /* JADX INFO: renamed from: j7.m$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2787d implements RandomAccess {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int[] f28926h;

        a(int[] iArr) {
            this.f28926h = iArr;
        }

        @Override // j7.AbstractC2785b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return contains(((Number) obj).intValue());
            }
            return false;
        }

        @Override // j7.AbstractC2787d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return r(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // j7.AbstractC2785b, java.util.Collection
        public boolean isEmpty() {
            return this.f28926h.length == 0;
        }

        @Override // j7.AbstractC2787d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return s(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // j7.AbstractC2785b
        public int o() {
            return this.f28926h.length;
        }

        @Override // j7.AbstractC2787d, java.util.List
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f28926h[i10]);
        }

        public int r(int i10) {
            return AbstractC2798o.P(this.f28926h, i10);
        }

        public int s(int i10) {
            return AbstractC2798o.c0(this.f28926h, i10);
        }

        public boolean contains(int i10) {
            return AbstractC2798o.A(this.f28926h, i10);
        }
    }

    public static List d(int[] iArr) {
        AbstractC2855l.g(iArr, "<this>");
        return new a(iArr);
    }

    public static List e(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        List listA = AbstractC2799p.a(objArr);
        AbstractC2855l.f(listA, "asList(...)");
        return listA;
    }

    public static byte[] f(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] g(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] h(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC2855l.g(jArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] i(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return f(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] k(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return g(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] l(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return i(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] m(byte[] bArr, int i10, int i11) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2794k.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC2855l.f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] n(Object[] objArr, int i10, int i11) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2794k.b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC2855l.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void o(float[] fArr, float f10, int i10, int i11) {
        AbstractC2855l.g(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    public static void p(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC2855l.g(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void q(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        o(fArr, f10, i10, i11);
    }

    public static /* synthetic */ void r(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        p(objArr, obj, i10, i11);
    }

    public static byte[] s(byte[] bArr, byte[] elements) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC2855l.d(bArrCopyOf);
        return bArrCopyOf;
    }

    public static Object[] t(Object[] objArr, Object[] elements) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC2855l.d(objArrCopyOf);
        return objArrCopyOf;
    }

    public static final void u(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void v(Object[] objArr, Comparator comparator) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
