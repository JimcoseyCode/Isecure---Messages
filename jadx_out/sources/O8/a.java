package O8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f8570a;

    public a(i sequence) {
        AbstractC2855l.g(sequence, "sequence");
        this.f8570a = new AtomicReference(sequence);
    }

    @Override // O8.i
    public Iterator iterator() {
        i iVar = (i) this.f8570a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
