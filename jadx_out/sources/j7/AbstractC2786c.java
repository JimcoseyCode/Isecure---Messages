package j7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: j7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2786c implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f28911h;

    private final boolean f() {
        this.f28910g = 3;
        c();
        return this.f28910g == 1;
    }

    protected abstract void c();

    protected final void d() {
        this.f28910g = 2;
    }

    protected final void e(Object obj) {
        this.f28911h = obj;
        this.f28910g = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f28910g;
        if (i10 == 0) {
            return f();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f28910g;
        if (i10 == 1) {
            this.f28910g = 0;
            return this.f28911h;
        }
        if (i10 == 2 || !f()) {
            throw new NoSuchElementException();
        }
        this.f28910g = 0;
        return this.f28911h;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
