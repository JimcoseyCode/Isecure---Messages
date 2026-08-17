package M8;

import j7.AbstractC2790g;
import j7.AbstractC2793j;
import j7.T;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractC2790g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f7676i = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f7677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7678h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f7679g;

        public a(Object[] array) {
            AbstractC2855l.g(array, "array");
            this.f7679g = AbstractC2845b.a(array);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7679g.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f7679g.next();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            return new l(null);
        }

        public final l b(Collection set) {
            AbstractC2855l.g(set, "set");
            l lVar = new l(null);
            lVar.addAll(set);
            return lVar;
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f7680g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7681h = true;

        public c(Object obj) {
            this.f7680g = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7681h;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7681h) {
                throw new NoSuchElementException();
            }
            this.f7681h = false;
            return this.f7680g;
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final l o() {
        return f7676i.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f7677g = obj;
        } else if (size() == 1) {
            if (AbstractC2855l.b(this.f7677g, obj)) {
                return false;
            }
            this.f7677g = new Object[]{this.f7677g, obj};
        } else if (size() < 5) {
            Object obj3 = this.f7677g;
            AbstractC2855l.e(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (AbstractC2793j.B(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetF = T.f(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetF.add(obj);
                obj2 = linkedHashSetF;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f7677g = obj2;
        } else {
            Object obj4 = this.f7677g;
            AbstractC2855l.e(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!I.d(obj4).add(obj)) {
                return false;
            }
        }
        p(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f7677g = null;
        p(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC2855l.b(this.f7677g, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f7677g;
            AbstractC2855l.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC2793j.B((Object[]) obj2, obj);
        }
        Object obj3 = this.f7677g;
        AbstractC2855l.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // j7.AbstractC2790g
    public int d() {
        return this.f7678h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f7677g);
        }
        if (size() < 5) {
            Object obj = this.f7677g;
            AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f7677g;
        AbstractC2855l.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return I.d(obj2).iterator();
    }

    public void p(int i10) {
        this.f7678h = i10;
    }

    private l() {
    }
}
