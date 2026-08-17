package O8;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8572b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8573g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8574h;

        a(b bVar) {
            this.f8573g = bVar.f8571a.iterator();
            this.f8574h = bVar.f8572b;
        }

        private final void c() {
            while (this.f8574h > 0 && this.f8573g.hasNext()) {
                this.f8573g.next();
                this.f8574h--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f8573g.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            return this.f8573g.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(i sequence, int i10) {
        AbstractC2855l.g(sequence, "sequence");
        this.f8571a = sequence;
        this.f8572b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // O8.c
    public i a(int i10) {
        int i11 = this.f8572b;
        int i12 = i11 + i10;
        return i12 < 0 ? new x(this, i10) : new w(this.f8571a, i11, i12);
    }

    @Override // O8.c
    public i b(int i10) {
        int i11 = this.f8572b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f8571a, i11);
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a(this);
    }
}
