package G4;

import java.util.List;

/* JADX INFO: renamed from: G4.p6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0700p6 extends C6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient int f3324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final transient int f3325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ C6 f3326l;

    C0700p6(C6 c62, int i10, int i11) {
        this.f3326l = c62;
        this.f3324j = i10;
        this.f3325k = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f3325k, "index");
        return this.f3326l.get(i10 + this.f3324j);
    }

    @Override // G4.M4
    final int o() {
        return this.f3326l.p() + this.f3324j + this.f3325k;
    }

    @Override // G4.M4
    final int p() {
        return this.f3326l.p() + this.f3324j;
    }

    @Override // G4.M4
    final Object[] q() {
        return this.f3326l.q();
    }

    @Override // G4.C6
    /* JADX INFO: renamed from: r */
    public final C6 subList(int i10, int i11) {
        G1.c(i10, i11, this.f3325k);
        C6 c62 = this.f3326l;
        int i12 = this.f3324j;
        return c62.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3325k;
    }

    @Override // G4.C6, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
