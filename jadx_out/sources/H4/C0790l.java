package H4;

import java.util.Objects;

/* JADX INFO: renamed from: H4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0790l extends AbstractC0784f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final AbstractC0784f f3776l = new C0790l(new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f3777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f3778k;

    C0790l(Object[] objArr, int i10) {
        this.f3777j = objArr;
        this.f3778k = i10;
    }

    @Override // H4.AbstractC0784f, H4.AbstractC0781c
    final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f3777j, 0, objArr, 0, this.f3778k);
        return this.f3778k;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f3778k, "index");
        Object obj = this.f3777j[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // H4.AbstractC0781c
    final int o() {
        return this.f3778k;
    }

    @Override // H4.AbstractC0781c
    final int p() {
        return 0;
    }

    @Override // H4.AbstractC0781c
    final Object[] q() {
        return this.f3777j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3778k;
    }
}
