package B7;

import j7.J;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends J {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f403j;

    public b(int i10, int i11, int i12) {
        this.f400g = i12;
        this.f401h = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f402i = z10;
        this.f403j = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402i;
    }

    @Override // j7.J
    public int nextInt() {
        int i10 = this.f403j;
        if (i10 != this.f401h) {
            this.f403j = this.f400g + i10;
            return i10;
        }
        if (!this.f402i) {
            throw new NoSuchElementException();
        }
        this.f402i = false;
        return i10;
    }
}
