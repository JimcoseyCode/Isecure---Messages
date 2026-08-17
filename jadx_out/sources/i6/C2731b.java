package i6;

import r4.AbstractC3267h;

/* JADX INFO: renamed from: i6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2731b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28700c;

    /* JADX INFO: renamed from: i6.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28701a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f28703c;

        public C2731b a() {
            return new C2731b(this.f28701a, this.f28702b, this.f28703c, null);
        }

        public a b(int i10, int... iArr) {
            this.f28701a = i10;
            for (int i11 : iArr) {
                this.f28701a = i11 | this.f28701a;
            }
            return this;
        }
    }

    /* synthetic */ C2731b(int i10, boolean z10, boolean z11, AbstractC2733d abstractC2733d) {
        this.f28698a = i10;
        this.f28699b = z10;
        this.f28700c = z11;
    }

    public final int a() {
        return this.f28698a;
    }

    public final boolean b() {
        return this.f28700c;
    }

    public final boolean c() {
        return this.f28699b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2731b)) {
            return false;
        }
        C2731b c2731b = (C2731b) obj;
        return this.f28698a == c2731b.f28698a && this.f28699b == c2731b.f28699b && this.f28700c == c2731b.f28700c;
    }

    public int hashCode() {
        return AbstractC3267h.b(Integer.valueOf(this.f28698a), Boolean.valueOf(this.f28699b), Boolean.valueOf(this.f28700c));
    }
}
