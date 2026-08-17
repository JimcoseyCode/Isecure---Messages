package J8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f6871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f6872h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f6873g = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6873g;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f6873g) {
                throw new NoSuchElementException();
            }
            this.f6873g = false;
            return o.this.p();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object value, int i10) {
        super(null);
        AbstractC2855l.g(value, "value");
        this.f6871g = value;
        this.f6872h = i10;
    }

    @Override // J8.c
    public int d() {
        return 1;
    }

    @Override // J8.c
    public Object get(int i10) {
        if (i10 == this.f6872h) {
            return this.f6871g;
        }
        return null;
    }

    @Override // J8.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public final int o() {
        return this.f6872h;
    }

    public final Object p() {
        return this.f6871g;
    }

    @Override // J8.c
    public void set(int i10, Object value) {
        AbstractC2855l.g(value, "value");
        throw new IllegalStateException();
    }
}
