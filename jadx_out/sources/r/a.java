package R;

import R.e;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9899d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9903d;

        b() {
        }

        @Override // R.e.a
        public e a() {
            String str = this.f9900a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " glVersion";
            }
            if (this.f9901b == null) {
                str2 = str2 + " eglVersion";
            }
            if (this.f9902c == null) {
                str2 = str2 + " glExtensions";
            }
            if (this.f9903d == null) {
                str2 = str2 + " eglExtensions";
            }
            if (str2.isEmpty()) {
                return new a(this.f9900a, this.f9901b, this.f9902c, this.f9903d);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // R.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f9903d = str;
            return this;
        }

        @Override // R.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f9901b = str;
            return this;
        }

        @Override // R.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f9902c = str;
            return this;
        }

        @Override // R.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f9900a = str;
            return this;
        }
    }

    @Override // R.e
    public String b() {
        return this.f9899d;
    }

    @Override // R.e
    public String c() {
        return this.f9897b;
    }

    @Override // R.e
    public String d() {
        return this.f9898c;
    }

    @Override // R.e
    public String e() {
        return this.f9896a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f9896a.equals(eVar.e()) && this.f9897b.equals(eVar.c()) && this.f9898c.equals(eVar.d()) && this.f9899d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f9896a.hashCode() ^ 1000003) * 1000003) ^ this.f9897b.hashCode()) * 1000003) ^ this.f9898c.hashCode()) * 1000003) ^ this.f9899d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f9896a + ", eglVersion=" + this.f9897b + ", glExtensions=" + this.f9898c + ", eglExtensions=" + this.f9899d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f9896a = str;
        this.f9897b = str2;
        this.f9898c = str3;
        this.f9899d = str4;
    }
}
