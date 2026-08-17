package k7;

import j7.AbstractC2788e;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3551b;

/* JADX INFO: renamed from: k7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2839g extends AbstractC2788e implements Collection, InterfaceC3551b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2836d f29183g;

    public C2839g(C2836d backing) {
        AbstractC2855l.g(backing, "backing");
        this.f29183g = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f29183g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f29183g.containsValue(obj);
    }

    @Override // j7.AbstractC2788e
    public int d() {
        return this.f29183g.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f29183g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f29183g.R();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f29183g.P(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29183g.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29183g.n();
        return super.retainAll(elements);
    }
}
