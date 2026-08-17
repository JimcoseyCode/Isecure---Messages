package g0;

import F.v1;
import android.util.Size;
import com.facebook.react.uimanager.events.PointerEventHelper;
import g0.q0;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2638d extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1 f28025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Size f28026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0 f28028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f28030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f28031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f28032j;

    /* JADX INFO: renamed from: g0.d$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends q0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f28034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v1 f28035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Size f28036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f28037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private r0 f28038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f28039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f28040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f28041i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Integer f28042j;

        @Override // g0.q0.a
        public q0 a() {
            String str = this.f28033a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " mimeType";
            }
            if (this.f28034b == null) {
                str2 = str2 + " profile";
            }
            if (this.f28035c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f28036d == null) {
                str2 = str2 + " resolution";
            }
            if (this.f28037e == null) {
                str2 = str2 + " colorFormat";
            }
            if (this.f28038f == null) {
                str2 = str2 + " dataSpace";
            }
            if (this.f28039g == null) {
                str2 = str2 + " captureFrameRate";
            }
            if (this.f28040h == null) {
                str2 = str2 + " encodeFrameRate";
            }
            if (this.f28041i == null) {
                str2 = str2 + " IFrameInterval";
            }
            if (this.f28042j == null) {
                str2 = str2 + " bitrate";
            }
            if (str2.isEmpty()) {
                return new C2638d(this.f28033a, this.f28034b.intValue(), this.f28035c, this.f28036d, this.f28037e.intValue(), this.f28038f, this.f28039g.intValue(), this.f28040h.intValue(), this.f28041i.intValue(), this.f28042j.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // g0.q0.a
        public q0.a b(int i10) {
            this.f28042j = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a c(int i10) {
            this.f28039g = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a d(int i10) {
            this.f28037e = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a e(r0 r0Var) {
            if (r0Var == null) {
                throw new NullPointerException("Null dataSpace");
            }
            this.f28038f = r0Var;
            return this;
        }

        @Override // g0.q0.a
        public q0.a f(int i10) {
            this.f28040h = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a g(int i10) {
            this.f28041i = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a h(v1 v1Var) {
            if (v1Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f28035c = v1Var;
            return this;
        }

        @Override // g0.q0.a
        public q0.a i(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f28033a = str;
            return this;
        }

        @Override // g0.q0.a
        public q0.a j(int i10) {
            this.f28034b = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.q0.a
        public q0.a k(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f28036d = size;
            return this;
        }

        b() {
        }

        private b(q0 q0Var) {
            this.f28033a = q0Var.getMimeType();
            this.f28034b = Integer.valueOf(q0Var.j());
            this.f28035c = q0Var.b();
            this.f28036d = q0Var.k();
            this.f28037e = Integer.valueOf(q0Var.f());
            this.f28038f = q0Var.g();
            this.f28039g = Integer.valueOf(q0Var.e());
            this.f28040h = Integer.valueOf(q0Var.h());
            this.f28041i = Integer.valueOf(q0Var.i());
            this.f28042j = Integer.valueOf(q0Var.d());
        }
    }

    @Override // g0.q0, g0.InterfaceC2648n
    public v1 b() {
        return this.f28025c;
    }

    @Override // g0.q0
    public int d() {
        return this.f28032j;
    }

    @Override // g0.q0
    public int e() {
        return this.f28029g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f28023a.equals(q0Var.getMimeType()) && this.f28024b == q0Var.j() && this.f28025c.equals(q0Var.b()) && this.f28026d.equals(q0Var.k()) && this.f28027e == q0Var.f() && this.f28028f.equals(q0Var.g()) && this.f28029g == q0Var.e() && this.f28030h == q0Var.h() && this.f28031i == q0Var.i() && this.f28032j == q0Var.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.q0
    public int f() {
        return this.f28027e;
    }

    @Override // g0.q0
    public r0 g() {
        return this.f28028f;
    }

    @Override // g0.q0, g0.InterfaceC2648n
    public String getMimeType() {
        return this.f28023a;
    }

    @Override // g0.q0
    public int h() {
        return this.f28030h;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f28023a.hashCode() ^ 1000003) * 1000003) ^ this.f28024b) * 1000003) ^ this.f28025c.hashCode()) * 1000003) ^ this.f28026d.hashCode()) * 1000003) ^ this.f28027e) * 1000003) ^ this.f28028f.hashCode()) * 1000003) ^ this.f28029g) * 1000003) ^ this.f28030h) * 1000003) ^ this.f28031i) * 1000003) ^ this.f28032j;
    }

    @Override // g0.q0
    public int i() {
        return this.f28031i;
    }

    @Override // g0.q0
    public int j() {
        return this.f28024b;
    }

    @Override // g0.q0
    public Size k() {
        return this.f28026d;
    }

    @Override // g0.q0
    public q0.a l() {
        return new b(this);
    }

    public String toString() {
        return "VideoEncoderConfig{mimeType=" + this.f28023a + ", profile=" + this.f28024b + ", inputTimebase=" + this.f28025c + ", resolution=" + this.f28026d + ", colorFormat=" + this.f28027e + ", dataSpace=" + this.f28028f + ", captureFrameRate=" + this.f28029g + ", encodeFrameRate=" + this.f28030h + ", IFrameInterval=" + this.f28031i + ", bitrate=" + this.f28032j + "}";
    }

    private C2638d(String str, int i10, v1 v1Var, Size size, int i11, r0 r0Var, int i12, int i13, int i14, int i15) {
        this.f28023a = str;
        this.f28024b = i10;
        this.f28025c = v1Var;
        this.f28026d = size;
        this.f28027e = i11;
        this.f28028f = r0Var;
        this.f28029g = i12;
        this.f28030h = i13;
        this.f28031i = i14;
        this.f28032j = i15;
    }
}
