package O8;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f8628b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8629g;

        a() {
            this.f8629g = z.this.f8627a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8629g.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return z.this.f8628b.invoke(this.f8629g.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(i sequence, Function1 transformer) {
        AbstractC2855l.g(sequence, "sequence");
        AbstractC2855l.g(transformer, "transformer");
        this.f8627a = sequence;
        this.f8628b = transformer;
    }

    public final i e(Function1 iterator) {
        AbstractC2855l.g(iterator, "iterator");
        return new g(this.f8627a, this.f8628b, iterator);
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
