package G4;

import java.io.UnsupportedEncodingException;
import r4.AbstractC3268i;
import x5.C3547d;

/* JADX INFO: renamed from: G4.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C0715r6 implements InterfaceC0620f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0690o4 f3357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E5 f3358b = new E5();

    private C0715r6(C0690o4 c0690o4, int i10) {
        this.f3357a = c0690o4;
        A6.a();
    }

    public static InterfaceC0620f6 e(C0690o4 c0690o4) {
        return new C0715r6(c0690o4, 0);
    }

    @Override // G4.InterfaceC0620f6
    public final String a() {
        G5 g5C = this.f3357a.f().c();
        return (g5C == null || AbstractC0632h2.b(g5C.k())) ? "NA" : (String) AbstractC3268i.k(g5C.k());
    }

    @Override // G4.InterfaceC0620f6
    public final byte[] b(int i10, boolean z10) {
        this.f3358b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f3358b.e(Boolean.FALSE);
        this.f3357a.e(this.f3358b.m());
        try {
            A6.a();
            if (i10 == 0) {
                return new C3547d().j(C0705q3.f3338a).k(true).i().b(this.f3357a.f()).getBytes("utf-8");
            }
            C0706q4 c0706q4F = this.f3357a.f();
            C0669m c0669m = new C0669m();
            C0705q3.f3338a.a(c0669m);
            return c0669m.b().a(c0706q4F);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // G4.InterfaceC0620f6
    public final InterfaceC0620f6 c(EnumC0682n4 enumC0682n4) {
        this.f3357a.d(enumC0682n4);
        return this;
    }

    @Override // G4.InterfaceC0620f6
    public final InterfaceC0620f6 d(E5 e52) {
        this.f3358b = e52;
        return this;
    }
}
