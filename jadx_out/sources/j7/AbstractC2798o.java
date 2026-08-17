package j7;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;
import x7.InterfaceC3550a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2798o extends AbstractC2796m {

    /* JADX INFO: renamed from: j7.o$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterable, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object[] f28928g;

        public a(Object[] objArr) {
            this.f28928g = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2845b.a(this.f28928g);
        }
    }

    /* JADX INFO: renamed from: j7.o$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f28929a;

        public b(Object[] objArr) {
            this.f28929a = objArr;
        }

        @Override // O8.i
        public Iterator iterator() {
            return AbstractC2845b.a(this.f28929a);
        }
    }

    public static final boolean A(int[] iArr, int i10) {
        AbstractC2855l.g(iArr, "<this>");
        return P(iArr, i10) >= 0;
    }

    public static final List A0(double[] dArr) {
        AbstractC2855l.g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static boolean B(Object[] objArr, Object obj) {
        AbstractC2855l.g(objArr, "<this>");
        return Q(objArr, obj) >= 0;
    }

    public static final List B0(float[] fArr) {
        AbstractC2855l.g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static List C(Object[] objArr, int i10) {
        AbstractC2855l.g(objArr, "<this>");
        if (i10 >= 0) {
            return m0(objArr, B7.d.d(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List C0(int[] iArr) {
        AbstractC2855l.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static List D(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return (List) E(objArr, new ArrayList());
    }

    public static final List D0(long[] jArr) {
        AbstractC2855l.g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final Collection E(Object[] objArr, Collection destination) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static List E0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return new ArrayList(AbstractC2801s.g(objArr));
    }

    public static Object F(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List F0(short[] sArr) {
        AbstractC2855l.g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static Object G(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final List G0(boolean[] zArr) {
        AbstractC2855l.g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static B7.c H(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        return new B7.c(0, J(bArr));
    }

    public static Set H0(int[] iArr) {
        AbstractC2855l.g(iArr, "<this>");
        return (Set) n0(iArr, new LinkedHashSet(M.e(iArr.length)));
    }

    public static B7.c I(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return new B7.c(0, K(objArr));
    }

    public static Set I0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) o0(objArr, new LinkedHashSet(M.e(objArr.length))) : U.d(objArr[0]) : V.e();
    }

    public static final int J(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        return bArr.length - 1;
    }

    public static Iterable J0(final Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return new H(new InterfaceC3487a() { // from class: j7.n
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractC2798o.K0(objArr);
            }
        });
    }

    public static int K(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return objArr.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator K0(Object[] objArr) {
        return AbstractC2845b.a(objArr);
    }

    public static Double L(double[] dArr, int i10) {
        AbstractC2855l.g(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static List L0(int[] iArr, Object[] other) {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(i7.t.a(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    public static Integer M(int[] iArr, int i10) {
        AbstractC2855l.g(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static List M0(Object[] objArr, Iterable other) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(other, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2802t.u(other, 10), length));
        int i10 = 0;
        for (Object obj : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(i7.t.a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }

    public static Object N(Object[] objArr, int i10) {
        AbstractC2855l.g(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static List N0(Object[] objArr, Object[] other) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(i7.t.a(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final int O(char[] cArr, char c10) {
        AbstractC2855l.g(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int P(int[] iArr, int i10) {
        AbstractC2855l.g(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static int Q(Object[] objArr, Object obj) {
        AbstractC2855l.g(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC2855l.b(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable R(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable S(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable T(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            P8.q.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable U(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        CharSequence charSequence7 = i12 != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return T(objArr, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : function1);
    }

    public static final String V(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC2855l.g(bArr, "<this>");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        return ((StringBuilder) R(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String W(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        return ((StringBuilder) S(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String X(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        return ((StringBuilder) T(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String Y(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return V(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static /* synthetic */ String Z(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return W(iArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static /* synthetic */ String a0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return X(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object b0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[K(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int c0(int[] iArr, int i10) {
        AbstractC2855l.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static List d0(Object[] objArr, Function1 transform) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(transform, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(transform.invoke(obj));
        }
        return arrayList;
    }

    public static Comparable e0(Comparable[] comparableArr) {
        AbstractC2855l.g(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int iK = K(comparableArr);
        int i10 = 1;
        if (1 <= iK) {
            while (true) {
                Comparable comparable2 = comparableArr[i10];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i10 == iK) {
                    break;
                }
                i10++;
            }
        }
        return comparable;
    }

    public static Object[] f0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + objArr + '.');
            }
        }
        return objArr;
    }

    public static List g0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length == 0) {
            return AbstractC2801s.j();
        }
        List listE0 = E0(objArr);
        z.S(listE0);
        return listE0;
    }

    public static char h0(char[] cArr) {
        AbstractC2855l.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object i0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object j0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Object[] k0(Object[] objArr, Comparator comparator) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
        AbstractC2796m.v(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List l0(Object[] objArr, Comparator comparator) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(comparator, "comparator");
        return AbstractC2796m.e(k0(objArr, comparator));
    }

    public static final List m0(Object[] objArr, int i10) {
        AbstractC2855l.g(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2801s.j();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return v0(objArr);
        }
        if (i10 == 1) {
            return r.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static final Collection n0(int[] iArr, Collection destination) {
        AbstractC2855l.g(iArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    public static final Collection o0(Object[] objArr, Collection destination) {
        AbstractC2855l.g(objArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List p0(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? y0(bArr) : r.e(Byte.valueOf(bArr[0])) : AbstractC2801s.j();
    }

    public static List q0(char[] cArr) {
        AbstractC2855l.g(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? z0(cArr) : r.e(Character.valueOf(cArr[0])) : AbstractC2801s.j();
    }

    public static List r0(double[] dArr) {
        AbstractC2855l.g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? A0(dArr) : r.e(Double.valueOf(dArr[0])) : AbstractC2801s.j();
    }

    public static List s0(float[] fArr) {
        AbstractC2855l.g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? B0(fArr) : r.e(Float.valueOf(fArr[0])) : AbstractC2801s.j();
    }

    public static List t0(int[] iArr) {
        AbstractC2855l.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? C0(iArr) : r.e(Integer.valueOf(iArr[0])) : AbstractC2801s.j();
    }

    public static List u0(long[] jArr) {
        AbstractC2855l.g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? D0(jArr) : r.e(Long.valueOf(jArr[0])) : AbstractC2801s.j();
    }

    public static List v0(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? E0(objArr) : r.e(objArr[0]) : AbstractC2801s.j();
    }

    public static List w0(short[] sArr) {
        AbstractC2855l.g(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? F0(sArr) : r.e(Short.valueOf(sArr[0])) : AbstractC2801s.j();
    }

    public static Iterable x(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC2801s.j() : new a(objArr);
    }

    public static List x0(boolean[] zArr) {
        AbstractC2855l.g(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? G0(zArr) : r.e(Boolean.valueOf(zArr[0])) : AbstractC2801s.j();
    }

    public static O8.i y(Object[] objArr) {
        AbstractC2855l.g(objArr, "<this>");
        return objArr.length == 0 ? O8.l.i() : new b(objArr);
    }

    public static final List y0(byte[] bArr) {
        AbstractC2855l.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static boolean z(char[] cArr, char c10) {
        AbstractC2855l.g(cArr, "<this>");
        return O(cArr, c10) >= 0;
    }

    public static final List z0(char[] cArr) {
        AbstractC2855l.g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }
}
