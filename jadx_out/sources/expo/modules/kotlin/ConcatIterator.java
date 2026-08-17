package expo.modules.kotlin;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/ConcatIterator;", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "first", "second", "<init>", "(Ljava/util/Iterator;Ljava/util/Iterator;)V", "hasNext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "next", "()Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConcatIterator<T> implements Iterator<T>, InterfaceC3550a {
    private final Iterator<T> first;
    private final Iterator<T> second;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcatIterator(Iterator<? extends T> first, Iterator<? extends T> second) {
        AbstractC2855l.g(first, "first");
        AbstractC2855l.g(second, "second");
        this.first = first;
        this.second = second;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.first.hasNext() || this.second.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.first.hasNext() ? this.first.next() : this.second.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
