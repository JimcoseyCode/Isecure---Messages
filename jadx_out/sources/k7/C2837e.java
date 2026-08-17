package k7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: k7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2837e extends AbstractC2833a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2836d f29181g;

    public C2837e(C2836d backing) {
        AbstractC2855l.g(backing, "backing");
        this.f29181g = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f29181g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        return this.f29181g.p(elements);
    }

    @Override // j7.AbstractC2790g
    public int d() {
        return this.f29181g.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f29181g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f29181g.u();
    }

    @Override // k7.AbstractC2833a
    public boolean p(Map.Entry element) {
        AbstractC2855l.g(element, "element");
        return this.f29181g.q(element);
    }

    @Override // k7.AbstractC2833a
    public boolean q(Map.Entry element) {
        AbstractC2855l.g(element, "element");
        return this.f29181g.L(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        AbstractC2855l.g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29181g.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29181g.n();
        return super.retainAll(elements);
    }
}
