package O8;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f8575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f8576b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterator f8577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8578h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f8579i;

        a() {
            this.f8577g = d.this.f8575a.iterator();
        }

        private final void c() {
            while (this.f8577g.hasNext()) {
                Object next = this.f8577g.next();
                if (!((Boolean) d.this.f8576b.invoke(next)).booleanValue()) {
                    this.f8579i = next;
                    this.f8578h = 1;
                    return;
                }
            }
            this.f8578h = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8578h == -1) {
                c();
            }
            return this.f8578h == 1 || this.f8577g.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f8578h == -1) {
                c();
            }
            if (this.f8578h != 1) {
                return this.f8577g.next();
            }
            Object obj = this.f8579i;
            this.f8579i = null;
            this.f8578h = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(i sequence, Function1 predicate) {
        AbstractC2855l.g(sequence, "sequence");
        AbstractC2855l.g(predicate, "predicate");
        this.f8575a = sequence;
        this.f8576b = predicate;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
