package f8;

import m8.AbstractC2951j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum k implements AbstractC2951j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static AbstractC2951j.b f27575l = new AbstractC2951j.b() { // from class: f8.k.a
        @Override // m8.AbstractC2951j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(int i10) {
            return k.h(i10);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27577g;

    k(int i10, int i11) {
        this.f27577g = i11;
    }

    public static k h(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // m8.AbstractC2951j.a
    public final int a() {
        return this.f27577g;
    }
}
