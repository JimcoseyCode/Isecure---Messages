package H4;

import java.util.Objects;

/* JADX INFO: renamed from: H4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0794p extends AbstractC0784f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f3785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f3786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f3787l;

    C0794p(Object[] objArr, int i10, int i11) {
        this.f3785j = objArr;
        this.f3786k = i10;
        this.f3787l = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f3787l, "index");
        Object obj = this.f3785j[i10 + i10 + this.f3786k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3787l;
    }
}
