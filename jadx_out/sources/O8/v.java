package O8;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2853j;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v extends t {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterable, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f8609g;

        public a(i iVar) {
            this.f8609g = iVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f8609g.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2853j implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f8610g = new b();

        b() {
            super(1, i.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(i p02) {
            AbstractC2855l.g(p02, "p0");
            return p02.iterator();
        }
    }

    public static i A(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        i iVarZ = z(iVar, new Function1() { // from class: O8.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(v.B(obj));
            }
        });
        AbstractC2855l.e(iVarZ, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iVarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(Object obj) {
        return obj == null;
    }

    public static Object C(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static i D(i iVar, Function1 transform) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(transform, "transform");
        return new g(iVar, transform, b.f8610g);
    }

    public static int E(i iVar, Object obj) {
        AbstractC2855l.g(iVar, "<this>");
        int i10 = 0;
        for (Object obj2 : iVar) {
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            if (AbstractC2855l.b(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable F(i iVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(buffer, "buffer");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iVar) {
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

    public static final String G(i iVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(separator, "separator");
        AbstractC2855l.g(prefix, "prefix");
        AbstractC2855l.g(postfix, "postfix");
        AbstractC2855l.g(truncated, "truncated");
        return ((StringBuilder) F(iVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String H(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return G(iVar, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static Object I(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static i J(i iVar, Function1 transform) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(transform, "transform");
        return new z(iVar, transform);
    }

    public static i K(i iVar, Function1 transform) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(transform, "transform");
        return A(new z(iVar, transform));
    }

    public static i L(i iVar, i elements) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(elements, "elements");
        return s.j(s.r(iVar, elements));
    }

    public static i M(i iVar, Iterable elements) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(elements, "elements");
        return s.j(s.r(iVar, AbstractC2800q.V(elements)));
    }

    public static i N(i iVar, Object obj) {
        AbstractC2855l.g(iVar, "<this>");
        return s.j(s.r(iVar, s.r(obj)));
    }

    public static long O(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        Iterator it = iVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static i P(i iVar, int i10) {
        AbstractC2855l.g(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? s.i() : iVar instanceof c ? ((c) iVar).a(i10) : new x(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static i Q(i iVar, Function1 predicate) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return new y(iVar, predicate);
    }

    public static final Collection R(i iVar, Collection destination) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(destination, "destination");
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List S(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return AbstractC2800q.j();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2800q.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List T(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return (List) R(iVar, new ArrayList());
    }

    public static Iterable t(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        return new a(iVar);
    }

    public static boolean u(i iVar, Object obj) {
        AbstractC2855l.g(iVar, "<this>");
        return E(iVar, obj) >= 0;
    }

    public static int v(i iVar) {
        AbstractC2855l.g(iVar, "<this>");
        Iterator it = iVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC2800q.s();
            }
        }
        return i10;
    }

    public static i w(i iVar, int i10) {
        AbstractC2855l.g(iVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? iVar : iVar instanceof c ? ((c) iVar).b(i10) : new O8.b(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static i x(i iVar, Function1 predicate) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return new d(iVar, predicate);
    }

    public static i y(i iVar, Function1 predicate) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return new f(iVar, true, predicate);
    }

    public static i z(i iVar, Function1 predicate) {
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return new f(iVar, false, predicate);
    }
}
