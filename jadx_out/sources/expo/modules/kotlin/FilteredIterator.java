package expo.modules.kotlin;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/FilteredIterator;", "E", PointerEventHelper.POINTER_TYPE_UNKNOWN, "iterator", "Lexpo/modules/kotlin/Filter;", ViewProps.FILTER, "<init>", "(Ljava/util/Iterator;Lexpo/modules/kotlin/Filter;)V", "Li7/B;", "findNext", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/util/Iterator;", "Lexpo/modules/kotlin/Filter;", "Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilteredIterator<E> implements Iterator<E>, InterfaceC3550a {
    private final Filter<E> filter;
    private final Iterator<E> iterator;
    private E next;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredIterator(Iterator<? extends E> iterator, Filter<E> filter) {
        AbstractC2855l.g(iterator, "iterator");
        AbstractC2855l.g(filter, "filter");
        this.iterator = iterator;
        this.filter = filter;
        findNext();
    }

    private final void findNext() {
        while (this.iterator.hasNext()) {
            E next = this.iterator.next();
            this.next = next;
            if (this.filter.apply(next)) {
                return;
            }
        }
        this.next = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public E next() {
        E e10 = this.next;
        AbstractC2855l.d(e10);
        findNext();
        return e10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
