package F;

import F.InterfaceC0515w0;

/* JADX INFO: renamed from: F.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0493l extends InterfaceC0515w0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f1550j;

    C0493l(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f1541a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f1542b = str;
        this.f1543c = i11;
        this.f1544d = i12;
        this.f1545e = i13;
        this.f1546f = i14;
        this.f1547g = i15;
        this.f1548h = i16;
        this.f1549i = i17;
        this.f1550j = i18;
    }

    @Override // F.InterfaceC0515w0.c
    public int b() {
        return this.f1548h;
    }

    @Override // F.InterfaceC0515w0.c
    public int c() {
        return this.f1543c;
    }

    @Override // F.InterfaceC0515w0.c
    public int d() {
        return this.f1549i;
    }

    @Override // F.InterfaceC0515w0.c
    public int e() {
        return this.f1541a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0515w0.c) {
            InterfaceC0515w0.c cVar = (InterfaceC0515w0.c) obj;
            if (this.f1541a == cVar.e() && this.f1542b.equals(cVar.i()) && this.f1543c == cVar.c() && this.f1544d == cVar.f() && this.f1545e == cVar.l() && this.f1546f == cVar.h() && this.f1547g == cVar.j() && this.f1548h == cVar.b() && this.f1549i == cVar.d() && this.f1550j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.InterfaceC0515w0.c
    public int f() {
        return this.f1544d;
    }

    @Override // F.InterfaceC0515w0.c
    public int g() {
        return this.f1550j;
    }

    @Override // F.InterfaceC0515w0.c
    public int h() {
        return this.f1546f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f1541a ^ 1000003) * 1000003) ^ this.f1542b.hashCode()) * 1000003) ^ this.f1543c) * 1000003) ^ this.f1544d) * 1000003) ^ this.f1545e) * 1000003) ^ this.f1546f) * 1000003) ^ this.f1547g) * 1000003) ^ this.f1548h) * 1000003) ^ this.f1549i) * 1000003) ^ this.f1550j;
    }

    @Override // F.InterfaceC0515w0.c
    public String i() {
        return this.f1542b;
    }

    @Override // F.InterfaceC0515w0.c
    public int j() {
        return this.f1547g;
    }

    @Override // F.InterfaceC0515w0.c
    public int l() {
        return this.f1545e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f1541a + ", mediaType=" + this.f1542b + ", bitrate=" + this.f1543c + ", frameRate=" + this.f1544d + ", width=" + this.f1545e + ", height=" + this.f1546f + ", profile=" + this.f1547g + ", bitDepth=" + this.f1548h + ", chromaSubsampling=" + this.f1549i + ", hdrFormat=" + this.f1550j + "}";
    }
}
