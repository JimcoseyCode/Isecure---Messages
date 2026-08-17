package F;

import F.k1;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;
import y.C3563H;

/* JADX INFO: renamed from: F.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0497n extends k1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0504q0 f1559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f1560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3563H f1564f;

    /* JADX INFO: renamed from: F.n$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends k1.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC0504q0 f1565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f1566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f1568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f1569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C3563H f1570f;

        b() {
        }

        @Override // F.k1.f.a
        public k1.f a() {
            AbstractC0504q0 abstractC0504q0 = this.f1565a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (abstractC0504q0 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " surface";
            }
            if (this.f1566b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f1568d == null) {
                str = str + " mirrorMode";
            }
            if (this.f1569e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f1570f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C0497n(this.f1565a, this.f1566b, this.f1567c, this.f1568d.intValue(), this.f1569e.intValue(), this.f1570f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F.k1.f.a
        public k1.f.a b(C3563H c3563h) {
            if (c3563h == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f1570f = c3563h;
            return this;
        }

        @Override // F.k1.f.a
        public k1.f.a c(int i10) {
            this.f1568d = Integer.valueOf(i10);
            return this;
        }

        @Override // F.k1.f.a
        public k1.f.a d(String str) {
            this.f1567c = str;
            return this;
        }

        @Override // F.k1.f.a
        public k1.f.a e(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f1566b = list;
            return this;
        }

        @Override // F.k1.f.a
        public k1.f.a f(int i10) {
            this.f1569e = Integer.valueOf(i10);
            return this;
        }

        public k1.f.a g(AbstractC0504q0 abstractC0504q0) {
            if (abstractC0504q0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f1565a = abstractC0504q0;
            return this;
        }
    }

    @Override // F.k1.f
    public C3563H b() {
        return this.f1564f;
    }

    @Override // F.k1.f
    public int c() {
        return this.f1562d;
    }

    @Override // F.k1.f
    public String d() {
        return this.f1561c;
    }

    @Override // F.k1.f
    public List e() {
        return this.f1560b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1.f) {
            k1.f fVar = (k1.f) obj;
            if (this.f1559a.equals(fVar.f()) && this.f1560b.equals(fVar.e()) && ((str = this.f1561c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f1562d == fVar.c() && this.f1563e == fVar.g() && this.f1564f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.k1.f
    public AbstractC0504q0 f() {
        return this.f1559a;
    }

    @Override // F.k1.f
    public int g() {
        return this.f1563e;
    }

    public int hashCode() {
        int iHashCode = (((this.f1559a.hashCode() ^ 1000003) * 1000003) ^ this.f1560b.hashCode()) * 1000003;
        String str = this.f1561c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f1562d) * 1000003) ^ this.f1563e) * 1000003) ^ this.f1564f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f1559a + ", sharedSurfaces=" + this.f1560b + ", physicalCameraId=" + this.f1561c + ", mirrorMode=" + this.f1562d + ", surfaceGroupId=" + this.f1563e + ", dynamicRange=" + this.f1564f + "}";
    }

    private C0497n(AbstractC0504q0 abstractC0504q0, List list, String str, int i10, int i11, C3563H c3563h) {
        this.f1559a = abstractC0504q0;
        this.f1560b = list;
        this.f1561c = str;
        this.f1562d = i10;
        this.f1563e = i11;
        this.f1564f = c3563h;
    }
}
