package y;

import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rational f33729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33731d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rational f33733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f33734c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33732a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f33735d = 0;

        public a(Rational rational, int i10) {
            this.f33733b = rational;
            this.f33734c = i10;
        }

        public L0 a() {
            H0.g.h(this.f33733b, "The crop aspect ratio must be set.");
            return new L0(this.f33732a, this.f33733b, this.f33734c, this.f33735d);
        }

        public a b(int i10) {
            this.f33735d = i10;
            return this;
        }

        public a c(int i10) {
            this.f33732a = i10;
            return this;
        }
    }

    L0(int i10, Rational rational, int i11, int i12) {
        this.f33728a = i10;
        this.f33729b = rational;
        this.f33730c = i11;
        this.f33731d = i12;
    }

    public Rational a() {
        return this.f33729b;
    }

    public int b() {
        return this.f33731d;
    }

    public int c() {
        return this.f33730c;
    }

    public int d() {
        return this.f33728a;
    }
}
