package H4;

import java.util.List;

/* JADX INFO: renamed from: H4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0783e extends AbstractC0784f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient int f3761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final transient int f3762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ AbstractC0784f f3763l;

    C0783e(AbstractC0784f abstractC0784f, int i10, int i11) {
        this.f3763l = abstractC0784f;
        this.f3761j = i10;
        this.f3762k = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        U.a(i10, this.f3762k, "index");
        return this.f3763l.get(i10 + this.f3761j);
    }

    @Override // H4.AbstractC0781c
    final int o() {
        return this.f3763l.p() + this.f3761j + this.f3762k;
    }

    @Override // H4.AbstractC0781c
    final int p() {
        return this.f3763l.p() + this.f3761j;
    }

    @Override // H4.AbstractC0781c
    final Object[] q() {
        return this.f3763l.q();
    }

    @Override // H4.AbstractC0784f
    /* JADX INFO: renamed from: r */
    public final AbstractC0784f subList(int i10, int i11) {
        U.c(i10, i11, this.f3762k);
        int i12 = this.f3761j;
        return this.f3763l.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3762k;
    }

    @Override // H4.AbstractC0784f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
