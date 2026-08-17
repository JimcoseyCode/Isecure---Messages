package I4;

import java.util.Objects;

/* JADX INFO: renamed from: I4.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1038v0 extends AbstractC0885h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final AbstractC0885h0 f4917l = new C1038v0(new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f4918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f4919k;

    C1038v0(Object[] objArr, int i10) {
        this.f4918j = objArr;
        this.f4919k = i10;
    }

    @Override // I4.AbstractC0885h0, I4.AbstractC0830c0
    final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f4918j, 0, objArr, i10, this.f4919k);
        return i10 + this.f4919k;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f4919k, "index");
        Object obj = this.f4918j[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // I4.AbstractC0830c0
    final int o() {
        return this.f4919k;
    }

    @Override // I4.AbstractC0830c0
    final int p() {
        return 0;
    }

    @Override // I4.AbstractC0830c0
    final Object[] q() {
        return this.f4918j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4919k;
    }
}
