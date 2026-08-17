package I4;

import java.util.List;

/* JADX INFO: renamed from: I4.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0874g0 extends AbstractC0885h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient int f4763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final transient int f4764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ AbstractC0885h0 f4765l;

    C0874g0(AbstractC0885h0 abstractC0885h0, int i10, int i11) {
        this.f4765l = abstractC0885h0;
        this.f4763j = i10;
        this.f4764k = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f4764k, "index");
        return this.f4765l.get(i10 + this.f4763j);
    }

    @Override // I4.AbstractC0830c0
    final int o() {
        return this.f4765l.p() + this.f4763j + this.f4764k;
    }

    @Override // I4.AbstractC0830c0
    final int p() {
        return this.f4765l.p() + this.f4763j;
    }

    @Override // I4.AbstractC0830c0
    final Object[] q() {
        return this.f4765l.q();
    }

    @Override // I4.AbstractC0885h0
    /* JADX INFO: renamed from: r */
    public final AbstractC0885h0 subList(int i10, int i11) {
        r.d(i10, i11, this.f4764k);
        int i12 = this.f4763j;
        return this.f4765l.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4764k;
    }

    @Override // I4.AbstractC0885h0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
