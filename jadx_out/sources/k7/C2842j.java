package k7;

import j7.AbstractC2790g;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3554e;

/* JADX INFO: renamed from: k7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2842j extends AbstractC2790g implements Set, Serializable, InterfaceC3554e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f29189h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2842j f29190i = new C2842j(C2836d.f29159t.e());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2836d f29191g;

    /* JADX INFO: renamed from: k7.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2842j(C2836d backing) {
        AbstractC2855l.g(backing, "backing");
        this.f29191g = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f29191g.E()) {
            return new C2840h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f29191g.k(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29191g.n();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f29191g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f29191g.containsKey(obj);
    }

    @Override // j7.AbstractC2790g
    public int d() {
        return this.f29191g.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f29191g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f29191g.F();
    }

    public final Set o() {
        this.f29191g.m();
        return size() > 0 ? this : f29190i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f29191g.O(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29191g.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        this.f29191g.n();
        return super.retainAll(elements);
    }

    public C2842j() {
        this(new C2836d());
    }

    public C2842j(int i10) {
        this(new C2836d(i10));
    }
}
