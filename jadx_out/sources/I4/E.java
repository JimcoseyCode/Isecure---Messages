package I4;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class E extends C implements ListIterator {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ F f3966j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(F f10) {
        super(f10);
        this.f3966j = f10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f3966j.isEmpty();
        b();
        ((ListIterator) this.f3947g).add(obj);
        this.f3966j.f3971l.f4108j++;
        if (zIsEmpty) {
            this.f3966j.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.f3947g).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.f3947g).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.f3947g).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.f3947g).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.f3947g).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f10, int i10) {
        super(f10, ((List) f10.f3956h).listIterator(i10));
        this.f3966j = f10;
    }
}
