package J4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class M5 extends N5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final transient int f5815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient int f5816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ N5 f5817k;

    M5(N5 n52, int i10, int i11) {
        this.f5817k = n52;
        this.f5815i = i10;
        this.f5816j = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f5816j, "index");
        return this.f5817k.get(i10 + this.f5815i);
    }

    @Override // J4.M4
    final int o() {
        return this.f5817k.p() + this.f5815i + this.f5816j;
    }

    @Override // J4.M4
    final int p() {
        return this.f5817k.p() + this.f5815i;
    }

    @Override // J4.M4
    final Object[] q() {
        return this.f5817k.q();
    }

    @Override // J4.N5
    /* JADX INFO: renamed from: r */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f5816j);
        N5 n52 = this.f5817k;
        int i12 = this.f5815i;
        return n52.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5816j;
    }

    @Override // J4.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
