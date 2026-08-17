package R8;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: R8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1397a extends G0 implements A0, n7.f, N {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n7.j f10168i;

    public AbstractC1397a(n7.j jVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            c0((A0) jVar.e(A0.f10112c));
        }
        this.f10168i = jVar.X(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R8.G0
    public String E() {
        return S.a(this) + " was cancelled";
    }

    protected void M0(Object obj) {
        u(obj);
    }

    public final void P0(P p10, Object obj, Function2 function2) {
        p10.j(function2, obj, this);
    }

    @Override // R8.G0
    public final void b0(Throwable th) {
        L.a(this.f10168i, th);
    }

    @Override // R8.G0, R8.A0
    public boolean d() {
        return super.d();
    }

    @Override // n7.f
    public final n7.j getContext() {
        return this.f10168i;
    }

    @Override // R8.N
    public n7.j i() {
        return this.f10168i;
    }

    @Override // R8.G0
    public String m0() {
        String strG = H.g(this.f10168i);
        if (strG == null) {
            return super.m0();
        }
        return '\"' + strG + "\":" + super.m0();
    }

    @Override // R8.G0
    protected final void r0(Object obj) {
        if (!(obj instanceof B)) {
            O0(obj);
        } else {
            B b10 = (B) obj;
            N0(b10.f10115a, b10.a());
        }
    }

    @Override // n7.f
    public final void resumeWith(Object obj) {
        Object objJ0 = j0(D.b(obj));
        if (objJ0 == H0.f10133b) {
            return;
        }
        M0(objJ0);
    }

    protected void O0(Object obj) {
    }

    protected void N0(Throwable th, boolean z10) {
    }
}
