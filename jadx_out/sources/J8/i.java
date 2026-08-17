package J8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f6862g = new i();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {
        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // J8.c
    public int d() {
        return 0;
    }

    @Override // J8.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // J8.c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // J8.c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void set(int i10, Void value) {
        AbstractC2855l.g(value, "value");
        throw new IllegalStateException();
    }
}
