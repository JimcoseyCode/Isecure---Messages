package y;

/* JADX INFO: renamed from: y.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3561F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3561F f33635d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f33636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H0.d f33637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H0.d f33638c;

    /* JADX INFO: renamed from: y.F$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f33639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private H0.d f33640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private H0.d f33641c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f33639a = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.f33640b = H0.d.a(fValueOf2, fValueOf2);
            this.f33641c = H0.d.a(fValueOf, fValueOf);
        }

        public C3561F a() {
            return new C3561F(this.f33639a, this.f33640b, this.f33641c);
        }

        public b b(float f10) {
            this.f33639a = f10;
            return this;
        }

        public b c(float f10, float f11) {
            this.f33640b = H0.d.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }

        public b d(float f10, float f11) {
            this.f33641c = H0.d.a(Float.valueOf(f10), Float.valueOf(f11));
            return this;
        }
    }

    public float a() {
        return this.f33636a;
    }

    public H0.d b() {
        return this.f33637b;
    }

    public H0.d c() {
        return this.f33638c;
    }

    private C3561F(float f10, H0.d dVar, H0.d dVar2) {
        this.f33636a = f10;
        this.f33637b = dVar;
        this.f33638c = dVar2;
    }
}
