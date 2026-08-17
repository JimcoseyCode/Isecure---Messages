package O8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f8583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f8584c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8586h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f8587i;

        a() {
            this.f8585g = f.this.f8582a.iterator();
        }

        private final void c() {
            while (this.f8585g.hasNext()) {
                Object next = this.f8585g.next();
                if (((Boolean) f.this.f8584c.invoke(next)).booleanValue() == f.this.f8583b) {
                    this.f8587i = next;
                    this.f8586h = 1;
                    return;
                }
            }
            this.f8586h = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8586h == -1) {
                c();
            }
            return this.f8586h == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f8586h == -1) {
                c();
            }
            if (this.f8586h == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f8587i;
            this.f8587i = null;
            this.f8586h = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(i sequence, boolean z10, Function1 predicate) {
        AbstractC2855l.g(sequence, "sequence");
        AbstractC2855l.g(predicate, "predicate");
        this.f8582a = sequence;
        this.f8583b = z10;
        this.f8584c = predicate;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
