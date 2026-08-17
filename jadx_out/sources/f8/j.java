package f8;

import m8.AbstractC2951j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum j implements AbstractC2951j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static AbstractC2951j.b f27568l = new AbstractC2951j.b() { // from class: f8.j.a
        @Override // m8.AbstractC2951j.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(int i10) {
            return j.h(i10);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27570g;

    j(int i10, int i11) {
        this.f27570g = i11;
    }

    public static j h(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // m8.AbstractC2951j.a
    public final int a() {
        return this.f27570g;
    }
}
