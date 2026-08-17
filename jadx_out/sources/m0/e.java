package m0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29523i;

    public e(int i10) {
        this.f29521g = i10;
    }

    protected abstract Object c(int i10);

    protected abstract void d(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29522h < this.f29521g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objC = c(this.f29522h);
        this.f29522h++;
        this.f29523i = true;
        return objC;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f29523i) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f29522h - 1;
        this.f29522h = i10;
        d(i10);
        this.f29521g--;
        this.f29523i = false;
    }
}
