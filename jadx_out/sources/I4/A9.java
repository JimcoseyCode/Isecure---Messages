package I4;

import java.io.UnsupportedEncodingException;
import r4.AbstractC3268i;
import x5.C3547d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class A9 implements InterfaceC0949m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N6 f3940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private I8 f3941b = new I8();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3942c;

    private A9(N6 n62, int i10) {
        this.f3940a = n62;
        K9.a();
        this.f3942c = i10;
    }

    public static InterfaceC0949m9 a(N6 n62) {
        return new A9(n62, 0);
    }

    public static InterfaceC0949m9 f(N6 n62, int i10) {
        return new A9(n62, 1);
    }

    @Override // I4.InterfaceC0949m9
    public final String b() {
        K8 k8G = this.f3940a.j().g();
        return (k8G == null || AbstractC1015t.b(k8G.k())) ? "NA" : (String) AbstractC3268i.k(k8G.k());
    }

    @Override // I4.InterfaceC0949m9
    public final InterfaceC0949m9 c(M6 m62) {
        this.f3940a.f(m62);
        return this;
    }

    @Override // I4.InterfaceC0949m9
    public final byte[] d(int i10, boolean z10) {
        this.f3941b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f3941b.e(Boolean.FALSE);
        this.f3940a.i(this.f3941b.m());
        try {
            K9.a();
            if (i10 == 0) {
                return new C3547d().j(H5.f4117a).k(true).i().b(this.f3940a.j()).getBytes("utf-8");
            }
            P6 p6J = this.f3940a.j();
            R0 r02 = new R0();
            H5.f4117a.a(r02);
            return r02.b().a(p6J);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // I4.InterfaceC0949m9
    public final InterfaceC0949m9 e(I8 i82) {
        this.f3941b = i82;
        return this;
    }

    @Override // I4.InterfaceC0949m9
    public final int zza() {
        return this.f3942c;
    }
}
