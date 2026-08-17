package F;

import F.InterfaceC0515w0;

/* JADX INFO: renamed from: F.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0489j extends InterfaceC0515w0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1500f;

    C0489j(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f1495a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f1496b = str;
        this.f1497c = i11;
        this.f1498d = i12;
        this.f1499e = i13;
        this.f1500f = i14;
    }

    @Override // F.InterfaceC0515w0.a
    public int b() {
        return this.f1497c;
    }

    @Override // F.InterfaceC0515w0.a
    public int c() {
        return this.f1499e;
    }

    @Override // F.InterfaceC0515w0.a
    public int d() {
        return this.f1495a;
    }

    @Override // F.InterfaceC0515w0.a
    public String e() {
        return this.f1496b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0515w0.a) {
            InterfaceC0515w0.a aVar = (InterfaceC0515w0.a) obj;
            if (this.f1495a == aVar.d() && this.f1496b.equals(aVar.e()) && this.f1497c == aVar.b() && this.f1498d == aVar.g() && this.f1499e == aVar.c() && this.f1500f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // F.InterfaceC0515w0.a
    public int f() {
        return this.f1500f;
    }

    @Override // F.InterfaceC0515w0.a
    public int g() {
        return this.f1498d;
    }

    public int hashCode() {
        return ((((((((((this.f1495a ^ 1000003) * 1000003) ^ this.f1496b.hashCode()) * 1000003) ^ this.f1497c) * 1000003) ^ this.f1498d) * 1000003) ^ this.f1499e) * 1000003) ^ this.f1500f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f1495a + ", mediaType=" + this.f1496b + ", bitrate=" + this.f1497c + ", sampleRate=" + this.f1498d + ", channels=" + this.f1499e + ", profile=" + this.f1500f + "}";
    }
}
