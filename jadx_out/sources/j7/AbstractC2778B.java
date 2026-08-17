package j7;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j7.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2778B extends z {

    /* JADX INFO: renamed from: j7.B$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements O8.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f28893a;

        public a(Iterable iterable) {
            this.f28893a = iterable;
        }

        @Override // O8.i
        public Iterator iterator() {
            return this.f28893a.iterator();
        }
    }

    public static List A0(Collection collection, Object obj) {
        AbstractC2855l.g(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object B0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            return C0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object C0(List list) {
        AbstractC2855l.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object D0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object E0(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List F0(List list, B7.c indices) {
        AbstractC2855l.g(list, "<this>");
        AbstractC2855l.g(indices, "indices");
        return indices.isEmpty() ? AbstractC2801s.j() : P0(list.subList(indices.t().intValue(), indices.s().intValue() + 1));
    }

    public static List G0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listQ0 = Q0(iterable);
            AbstractC2805w.x(listQ0);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC2796m.u((Comparable[]) array);
        return AbstractC2796m.e(array);
    }

    public static List H0(Iterable iterable, Comparator comparator) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listQ0 = Q0(iterable);
            AbstractC2805w.y(listQ0, comparator);
            return listQ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return P0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC2796m.v(array, comparator);
        return AbstractC2796m.e(array);
    }

    public static List I0(Iterable iterable, int i10) {
        AbstractC2855l.g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2801s.j();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return P0(iterable);
            }
            if (i10 == 1) {
                return r.e(d0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC2801s.q(arrayList);
    }

    public static List J0(List list, int i10) {
        AbstractC2855l.g(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC2801s.j();
        }
        int size = list.size();
        if (i10 >= size) {
            return P0(list);
        }
        if (i10 == 1) {
            return r.e(q0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final Collection K0(Iterable iterable, Collection destination) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static double[] L0(Collection collection) {
        AbstractC2855l.g(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    public static float[] M0(Collection collection) {
        AbstractC2855l.g(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static HashSet N0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return (HashSet) K0(iterable, new HashSet(M.e(AbstractC2802t.u(iterable, 12))));
    }

    public static int[] O0(Collection collection) {
        AbstractC2855l.g(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List P0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC2801s.q(Q0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC2801s.j();
        }
        if (size != 1) {
            return R0(collection);
        }
        return r.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List Q0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return iterable instanceof Collection ? R0((Collection) iterable) : (List) K0(iterable, new ArrayList());
    }

    public static List R0(Collection collection) {
        AbstractC2855l.g(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set S0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) K0(iterable, new LinkedHashSet());
    }

    public static Set T0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return V.g((Set) K0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return V.e();
        }
        if (size != 1) {
            return (Set) K0(iterable, new LinkedHashSet(M.e(collection.size())));
        }
        return U.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static boolean U(Iterable iterable, Function1 predicate) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static Set U0(Iterable iterable, Iterable other) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(other, "other");
        Set setS0 = S0(iterable);
        x.A(setS0, other);
        return setS0;
    }

    public static O8.i V(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return new a(iterable);
    }

    public static Iterable V0(final Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return new H(new InterfaceC3487a() { // from class: j7.A
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return AbstractC2778B.W0(iterable);
            }
        });
    }

    public static double W(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i10++;
            if (i10 < 0) {
                AbstractC2801s.s();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator W0(Iterable iterable) {
        return iterable.iterator();
    }

    public static boolean X(Iterable iterable, Object obj) {
        AbstractC2855l.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : i0(iterable, obj) >= 0;
    }

    public static List X0(Iterable iterable, Iterable other) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2802t.u(iterable, 10), AbstractC2802t.u(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(i7.t.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List Y(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        return P0(S0(iterable));
    }

    public static List Z(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC2855l.g(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return P0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC2801s.j();
            }
            if (size == 1) {
                return r.e(p0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC2801s.q(arrayList);
    }

    public static List a0(List list, int i10) {
        AbstractC2855l.g(list, "<this>");
        if (i10 >= 0) {
            return I0(list, B7.d.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List b0(Iterable iterable, Function1 predicate) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Collection c0(Iterable iterable, Collection destination) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object d0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            return e0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object e0(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object f0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object g0(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object h0(List list, int i10) {
        AbstractC2855l.g(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int i0(Iterable iterable, Object obj) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC2801s.t();
            }
            if (AbstractC2855l.b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int j0(List list, Object obj) {
        AbstractC2855l.g(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set k0(Iterable iterable, Iterable other) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(other, "other");
        Set setS0 = S0(iterable);
        x.J(setS0, other);
        return setS0;
    }

    public static final Appendable l0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
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

    public static /* synthetic */ Appendable m0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        CharSequence charSequence7 = i12 != 0 ? PointerEventHelper.POINTER_TYPE_UNKNOWN : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return l0(iterable, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : function1);
    }

    public static final String n0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        return ((StringBuilder) l0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String o0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return n0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object p0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object q0(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2801s.l(list));
    }

    public static Object r0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object s0(List list) {
        AbstractC2855l.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List t0(Iterable iterable, Function1 transform) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(transform, "transform");
        ArrayList arrayList = new ArrayList(AbstractC2802t.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable u0(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List v0(Iterable iterable, Iterable elements) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(elements, "elements");
        Collection collectionC = x.C(elements);
        if (collectionC.isEmpty()) {
            return P0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionC.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List w0(Iterable iterable, Object obj) {
        AbstractC2855l.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC2802t.u(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC2855l.b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List x0(Iterable iterable, Iterable elements) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(elements, "elements");
        if (iterable instanceof Collection) {
            return z0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        x.A(arrayList, iterable);
        x.A(arrayList, elements);
        return arrayList;
    }

    public static List y0(Iterable iterable, Object obj) {
        AbstractC2855l.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return A0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        x.A(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List z0(Collection collection, Iterable elements) {
        AbstractC2855l.g(collection, "<this>");
        AbstractC2855l.g(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            x.A(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }
}
