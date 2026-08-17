package I4;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: I4.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1026u extends F0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4897h;

    protected AbstractC1026u(int i10, int i11) {
        r.b(i11, i10, "index");
        this.f4896g = i10;
        this.f4897h = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4897h < this.f4896g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4897h > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4897h;
        this.f4897h = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4897h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4897h - 1;
        this.f4897h = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4897h - 1;
    }
}
