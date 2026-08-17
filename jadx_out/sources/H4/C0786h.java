package H4;

import java.util.Arrays;

/* JADX INFO: renamed from: H4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0786h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f3769a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3770b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C0785g f3771c;

    public final C0786h a(Object obj, Object obj2) {
        int i10 = this.f3770b + 1;
        Object[] objArr = this.f3769a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f3769a = Arrays.copyOf(objArr, AbstractC0780b.a(length, i11));
        }
        X.a(obj, obj2);
        Object[] objArr2 = this.f3769a;
        int i12 = this.f3770b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f3770b = i12 + 1;
        return this;
    }

    public final AbstractC0787i b() {
        C0785g c0785g = this.f3771c;
        if (c0785g != null) {
            throw c0785g.a();
        }
        C0795q c0795qG = C0795q.g(this.f3770b, this.f3769a, this);
        C0785g c0785g2 = this.f3771c;
        if (c0785g2 == null) {
            return c0795qG;
        }
        throw c0785g2.a();
    }
}
