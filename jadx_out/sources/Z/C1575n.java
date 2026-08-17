package Z;

import Z.z0;
import android.util.Range;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: Z.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1575n extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1585y f13446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Range f13448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13449f;

    /* JADX INFO: renamed from: Z.n$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends z0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1585y f13450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f13451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Range f13452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f13453d;

        @Override // Z.z0.a
        public z0 a() {
            C1585y c1585y = this.f13450a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (c1585y == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " qualitySelector";
            }
            if (this.f13451b == null) {
                str = str + " encodeFrameRate";
            }
            if (this.f13452c == null) {
                str = str + " bitrate";
            }
            if (this.f13453d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C1575n(this.f13450a, this.f13451b.intValue(), this.f13452c, this.f13453d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Z.z0.a
        z0.a b(int i10) {
            this.f13453d = Integer.valueOf(i10);
            return this;
        }

        @Override // Z.z0.a
        public z0.a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f13452c = range;
            return this;
        }

        @Override // Z.z0.a
        public z0.a d(int i10) {
            this.f13451b = Integer.valueOf(i10);
            return this;
        }

        @Override // Z.z0.a
        public z0.a e(C1585y c1585y) {
            if (c1585y == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f13450a = c1585y;
            return this;
        }

        b() {
        }

        private b(z0 z0Var) {
            this.f13450a = z0Var.e();
            this.f13451b = Integer.valueOf(z0Var.d());
            this.f13452c = z0Var.c();
            this.f13453d = Integer.valueOf(z0Var.b());
        }
    }

    @Override // Z.z0
    int b() {
        return this.f13449f;
    }

    @Override // Z.z0
    public Range c() {
        return this.f13448e;
    }

    @Override // Z.z0
    public int d() {
        return this.f13447d;
    }

    @Override // Z.z0
    public C1585y e() {
        return this.f13446c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f13446c.equals(z0Var.e()) && this.f13447d == z0Var.d() && this.f13448e.equals(z0Var.c()) && this.f13449f == z0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.z0
    public z0.a f() {
        return new b(this);
    }

    public int hashCode() {
        return ((((((this.f13446c.hashCode() ^ 1000003) * 1000003) ^ this.f13447d) * 1000003) ^ this.f13448e.hashCode()) * 1000003) ^ this.f13449f;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f13446c + ", encodeFrameRate=" + this.f13447d + ", bitrate=" + this.f13448e + ", aspectRatio=" + this.f13449f + "}";
    }

    private C1575n(C1585y c1585y, int i10, Range range, int i11) {
        this.f13446c = c1585y;
        this.f13447d = i10;
        this.f13448e = range;
        this.f13449f = i11;
    }
}
