package O8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8618b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f8619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Iterator f8620h;

        a(x xVar) {
            this.f8619g = xVar.f8618b;
            this.f8620h = xVar.f8617a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8619g > 0 && this.f8620h.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f8619g;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f8619g = i10 - 1;
            return this.f8620h.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(i sequence, int i10) {
        AbstractC2855l.g(sequence, "sequence");
        this.f8617a = sequence;
        this.f8618b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // O8.c
    public i a(int i10) {
        return i10 >= this.f8618b ? this : new x(this.f8617a, i10);
    }

    @Override // O8.c
    public i b(int i10) {
        int i11 = this.f8618b;
        return i10 >= i11 ? s.i() : new w(this.f8617a, i10, i11);
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a(this);
    }
}
