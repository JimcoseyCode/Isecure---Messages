package g0;

import F.v1;
import com.facebook.react.uimanager.events.PointerEventHelper;
import g0.AbstractC2635a;

/* JADX INFO: renamed from: g0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2637c extends AbstractC2635a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1 f28009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28013g;

    /* JADX INFO: renamed from: g0.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC2635a.AbstractC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f28015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v1 f28016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f28017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f28018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f28019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f28020g;

        b() {
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        AbstractC2635a a() {
            String str = this.f28014a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " mimeType";
            }
            if (this.f28015b == null) {
                str2 = str2 + " profile";
            }
            if (this.f28016c == null) {
                str2 = str2 + " inputTimebase";
            }
            if (this.f28017d == null) {
                str2 = str2 + " bitrate";
            }
            if (this.f28018e == null) {
                str2 = str2 + " captureSampleRate";
            }
            if (this.f28019f == null) {
                str2 = str2 + " encodeSampleRate";
            }
            if (this.f28020g == null) {
                str2 = str2 + " channelCount";
            }
            if (str2.isEmpty()) {
                return new C2637c(this.f28014a, this.f28015b.intValue(), this.f28016c, this.f28017d.intValue(), this.f28018e.intValue(), this.f28019f.intValue(), this.f28020g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a c(int i10) {
            this.f28017d = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a d(int i10) {
            this.f28018e = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a e(int i10) {
            this.f28020g = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a f(int i10) {
            this.f28019f = Integer.valueOf(i10);
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a g(v1 v1Var) {
            if (v1Var == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            this.f28016c = v1Var;
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a h(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f28014a = str;
            return this;
        }

        @Override // g0.AbstractC2635a.AbstractC0281a
        public AbstractC2635a.AbstractC0281a i(int i10) {
            this.f28015b = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // g0.AbstractC2635a, g0.InterfaceC2648n
    public v1 b() {
        return this.f28009c;
    }

    @Override // g0.AbstractC2635a
    public int d() {
        return this.f28010d;
    }

    @Override // g0.AbstractC2635a
    public int e() {
        return this.f28011e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2635a) {
            AbstractC2635a abstractC2635a = (AbstractC2635a) obj;
            if (this.f28007a.equals(abstractC2635a.getMimeType()) && this.f28008b == abstractC2635a.h() && this.f28009c.equals(abstractC2635a.b()) && this.f28010d == abstractC2635a.d() && this.f28011e == abstractC2635a.e() && this.f28012f == abstractC2635a.g() && this.f28013g == abstractC2635a.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.AbstractC2635a
    public int f() {
        return this.f28013g;
    }

    @Override // g0.AbstractC2635a
    public int g() {
        return this.f28012f;
    }

    @Override // g0.AbstractC2635a, g0.InterfaceC2648n
    public String getMimeType() {
        return this.f28007a;
    }

    @Override // g0.AbstractC2635a
    public int h() {
        return this.f28008b;
    }

    public int hashCode() {
        return ((((((((((((this.f28007a.hashCode() ^ 1000003) * 1000003) ^ this.f28008b) * 1000003) ^ this.f28009c.hashCode()) * 1000003) ^ this.f28010d) * 1000003) ^ this.f28011e) * 1000003) ^ this.f28012f) * 1000003) ^ this.f28013g;
    }

    public String toString() {
        return "AudioEncoderConfig{mimeType=" + this.f28007a + ", profile=" + this.f28008b + ", inputTimebase=" + this.f28009c + ", bitrate=" + this.f28010d + ", captureSampleRate=" + this.f28011e + ", encodeSampleRate=" + this.f28012f + ", channelCount=" + this.f28013g + "}";
    }

    private C2637c(String str, int i10, v1 v1Var, int i11, int i12, int i13, int i14) {
        this.f28007a = str;
        this.f28008b = i10;
        this.f28009c = v1Var;
        this.f28010d = i11;
        this.f28011e = i12;
        this.f28012f = i13;
        this.f28013g = i14;
    }
}
