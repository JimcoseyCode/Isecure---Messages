package c0;

import c0.AbstractC1834a;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class u extends AbstractC1834a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18774f;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends AbstractC1834a.AbstractC0199a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f18775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f18776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f18777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f18778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f18779e;

        b() {
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        AbstractC1834a a() {
            Integer num = this.f18775a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (num == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " audioSource";
            }
            if (this.f18776b == null) {
                str = str + " captureSampleRate";
            }
            if (this.f18777c == null) {
                str = str + " encodeSampleRate";
            }
            if (this.f18778d == null) {
                str = str + " channelCount";
            }
            if (this.f18779e == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new u(this.f18775a.intValue(), this.f18776b.intValue(), this.f18777c.intValue(), this.f18778d.intValue(), this.f18779e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        public AbstractC1834a.AbstractC0199a c(int i10) {
            this.f18779e = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        public AbstractC1834a.AbstractC0199a d(int i10) {
            this.f18775a = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        public AbstractC1834a.AbstractC0199a e(int i10) {
            this.f18776b = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        public AbstractC1834a.AbstractC0199a f(int i10) {
            this.f18778d = Integer.valueOf(i10);
            return this;
        }

        @Override // c0.AbstractC1834a.AbstractC0199a
        public AbstractC1834a.AbstractC0199a g(int i10) {
            this.f18777c = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // c0.AbstractC1834a
    public int b() {
        return this.f18774f;
    }

    @Override // c0.AbstractC1834a
    public int c() {
        return this.f18770b;
    }

    @Override // c0.AbstractC1834a
    public int e() {
        return this.f18771c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1834a) {
            AbstractC1834a abstractC1834a = (AbstractC1834a) obj;
            if (this.f18770b == abstractC1834a.c() && this.f18771c == abstractC1834a.e() && this.f18772d == abstractC1834a.g() && this.f18773e == abstractC1834a.f() && this.f18774f == abstractC1834a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // c0.AbstractC1834a
    public int f() {
        return this.f18773e;
    }

    @Override // c0.AbstractC1834a
    public int g() {
        return this.f18772d;
    }

    public int hashCode() {
        return ((((((((this.f18770b ^ 1000003) * 1000003) ^ this.f18771c) * 1000003) ^ this.f18772d) * 1000003) ^ this.f18773e) * 1000003) ^ this.f18774f;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f18770b + ", captureSampleRate=" + this.f18771c + ", encodeSampleRate=" + this.f18772d + ", channelCount=" + this.f18773e + ", audioFormat=" + this.f18774f + "}";
    }

    private u(int i10, int i11, int i12, int i13, int i14) {
        this.f18770b = i10;
        this.f18771c = i11;
        this.f18772d = i12;
        this.f18773e = i13;
        this.f18774f = i14;
    }
}
