package J4;

import java.io.UnsupportedEncodingException;
import r4.AbstractC3268i;
import x5.C3547d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 implements InterfaceC1203p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G3 f6515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private K4 f6516b = new K4();

    private y5(G3 g32, int i10) {
        this.f6515a = g32;
        K5.a();
    }

    public static InterfaceC1203p5 e(G3 g32) {
        return new y5(g32, 0);
    }

    @Override // J4.InterfaceC1203p5
    public final String a() {
        N4 n4C = this.f6515a.f().c();
        return (n4C == null || AbstractC1144h2.b(n4C.k())) ? "NA" : (String) AbstractC3268i.k(n4C.k());
    }

    @Override // J4.InterfaceC1203p5
    public final byte[] b(int i10, boolean z10) {
        this.f6516b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f6516b.e(Boolean.FALSE);
        this.f6515a.e(this.f6516b.m());
        try {
            K5.a();
            if (i10 == 0) {
                return new C3547d().j(N2.f5826a).k(true).i().b(this.f6515a.f()).getBytes("utf-8");
            }
            I3 i3F = this.f6515a.f();
            C1183n c1183n = new C1183n();
            N2.f5826a.a(c1183n);
            return c1183n.b().a(i3F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // J4.InterfaceC1203p5
    public final InterfaceC1203p5 c(K4 k42) {
        this.f6516b = k42;
        return this;
    }

    @Override // J4.InterfaceC1203p5
    public final InterfaceC1203p5 d(F3 f32) {
        this.f6515a.c(f32);
        return this;
    }
}
