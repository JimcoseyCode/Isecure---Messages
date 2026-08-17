package O8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3487a f8596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f8597b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements Iterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f8598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8599h = -2;

        a() {
        }

        private final void c() {
            Object objInvoke;
            if (this.f8599h == -2) {
                objInvoke = h.this.f8596a.invoke();
            } else {
                Function1 function1 = h.this.f8597b;
                Object obj = this.f8598g;
                AbstractC2855l.d(obj);
                objInvoke = function1.invoke(obj);
            }
            this.f8598g = objInvoke;
            this.f8599h = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8599h < 0) {
                c();
            }
            return this.f8599h == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f8599h < 0) {
                c();
            }
            if (this.f8599h == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f8598g;
            AbstractC2855l.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f8599h = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(InterfaceC3487a getInitialValue, Function1 getNextValue) {
        AbstractC2855l.g(getInitialValue, "getInitialValue");
        AbstractC2855l.g(getNextValue, "getNextValue");
        this.f8596a = getInitialValue;
        this.f8597b = getNextValue;
    }

    @Override // O8.i
    public Iterator iterator() {
        return new a();
    }
}
