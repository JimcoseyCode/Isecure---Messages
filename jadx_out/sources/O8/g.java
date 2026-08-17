package O8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f8590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f8591c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Iterator f8593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8594i;

        a() {
            this.f8592g = g.this.f8589a.iterator();
        }

        private final boolean c() {
            Iterator it = this.f8593h;
            if (it != null && it.hasNext()) {
                this.f8594i = 1;
                return true;
            }
            while (this.f8592g.hasNext()) {
                Iterator it2 = (Iterator) g.this.f8591c.invoke(g.this.f8590b.invoke(this.f8592g.next()));
                if (it2.hasNext()) {
                    this.f8593h = it2;
                    this.f8594i = 1;
                    return true;
                }
            }
            this.f8594i = 2;
            this.f8593h = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f8594i;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return c();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f8594i;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !c()) {
                throw new NoSuchElementException();
            }
            this.f8594i = 0;
            Iterator it = this.f8593h;
            AbstractC2855l.d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(i sequence, Function1 transformer, Function1 iterator) {
        AbstractC2855l.g(sequence, "sequence");
        AbstractC2855l.g(transformer, "transformer");
        AbstractC2855l.g(iterator, "iterator");
        this.f8589a = sequence;
        this.f8590b = transformer;
        this.f8591c = iterator;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
