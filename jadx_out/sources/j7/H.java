package j7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class H implements Iterable, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3487a f28900g;

    public H(InterfaceC3487a iteratorFactory) {
        AbstractC2855l.g(iteratorFactory, "iteratorFactory");
        this.f28900g = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new I((Iterator) this.f28900g.invoke());
    }
}
