package I4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class T implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f4589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f4590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f4591i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ X f4592j;

    /* synthetic */ T(X x10, S s10) {
        this.f4592j = x10;
        this.f4589g = x10.f4633k;
        this.f4590h = x10.h();
    }

    private final void c() {
        if (this.f4592j.f4633k != this.f4589g) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object b(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4590h >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4590h;
        this.f4591i = i10;
        Object objB = b(i10);
        this.f4590h = this.f4592j.i(this.f4590h);
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        r.e(this.f4591i >= 0, "no calls to next() since the last call to remove()");
        this.f4589g += 32;
        int i10 = this.f4591i;
        X x10 = this.f4592j;
        x10.remove(X.j(x10, i10));
        this.f4590h--;
        this.f4591i = -1;
    }
}
