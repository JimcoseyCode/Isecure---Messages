package H4;

import java.util.Iterator;

/* JADX INFO: renamed from: H4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0793o extends AbstractC0788j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient AbstractC0787i f3783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient AbstractC0784f f3784j;

    C0793o(AbstractC0787i abstractC0787i, AbstractC0784f abstractC0784f) {
        this.f3783i = abstractC0787i;
        this.f3784j = abstractC0784f;
    }

    @Override // H4.AbstractC0781c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3783i.get(obj) != null;
    }

    @Override // H4.AbstractC0781c
    final int d(Object[] objArr, int i10) {
        return this.f3784j.d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f3784j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3783i.size();
    }
}
