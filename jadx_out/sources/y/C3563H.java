package y;

/* JADX INFO: renamed from: y.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3563H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3563H f33649c = new C3563H(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3563H f33650d = new C3563H(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3563H f33651e = new C3563H(2, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3563H f33652f = new C3563H(3, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3563H f33653g = new C3563H(4, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3563H f33654h = new C3563H(5, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3563H f33655i = new C3563H(6, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C3563H f33656j = new C3563H(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33658b;

    public C3563H(int i10, int i11) {
        this.f33657a = i10;
        this.f33658b = i11;
    }

    private static String c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f33658b;
    }

    public int b() {
        return this.f33657a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3563H) {
            C3563H c3563h = (C3563H) obj;
            if (this.f33657a == c3563h.b() && this.f33658b == c3563h.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33657a ^ 1000003) * 1000003) ^ this.f33658b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f33657a) + ", bitDepth=" + this.f33658b + "}";
    }
}
