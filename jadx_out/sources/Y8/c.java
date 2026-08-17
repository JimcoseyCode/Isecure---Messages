package Y8;

import R8.J;
import W8.AbstractC1510m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f13126o = new c();

    private c() {
        super(j.f13138c, j.f13139d, j.f13140e, j.f13136a);
    }

    @Override // R8.J
    public J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return i10 >= j.f13138c ? AbstractC1510m.b(this, str) : super.M0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // R8.J
    public String toString() {
        return "Dispatchers.Default";
    }
}
