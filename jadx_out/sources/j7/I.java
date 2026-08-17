package j7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class I implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Iterator f28901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28902h;

    public I(Iterator iterator) {
        AbstractC2855l.g(iterator, "iterator");
        this.f28901g = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C2783G next() {
        int i10 = this.f28902h;
        this.f28902h = i10 + 1;
        if (i10 < 0) {
            AbstractC2801s.t();
        }
        return new C2783G(i10, this.f28901g.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28901g.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
