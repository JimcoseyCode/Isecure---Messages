package J4;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class I2 extends AbstractC1113d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f5748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5749h;

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f5748g = i10;
        this.f5749h = i11;
    }

    protected abstract Object b(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5749h < this.f5748g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5749h > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5749h;
        this.f5749h = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5749h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f5749h - 1;
        this.f5749h = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5749h - 1;
    }
}
