package f8;

import m8.AbstractC2951j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum x implements AbstractC2951j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AbstractC2951j.b f27862n = new AbstractC2951j.b() { // from class: f8.x.a
        @Override // m8.AbstractC2951j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(int i10) {
            return x.h(i10);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27864g;

    x(int i10, int i11) {
        this.f27864g = i11;
    }

    public static x h(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // m8.AbstractC2951j.a
    public final int a() {
        return this.f27864g;
    }
}
