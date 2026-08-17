package C;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends A.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f455i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f457h = b.f447j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(int i10) {
        this.f456g = i10;
    }

    private final String g() {
        int i10 = this.f456g;
        if (i10 == 0) {
            return "JPEG";
        }
        if (i10 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + this.f456g + ')';
    }

    @Override // A.b
    public b c() {
        return this.f457h;
    }

    public final int f() {
        return this.f456g;
    }

    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + g() + ')';
    }
}
