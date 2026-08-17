package u2;

import N2.b;
import N2.e;
import N2.i;
import N2.j;
import N2.n;
import com.facebook.drawee.drawable.F;
import d3.m;
import j2.InterfaceC2764b;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b extends N2.a implements Closeable, F {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC2764b f32665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f32666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i f32667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f32668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f32669m;

    public b(InterfaceC2764b interfaceC2764b, j jVar, i iVar) {
        this(interfaceC2764b, jVar, iVar, true);
    }

    private void I(j jVar, long j10) {
        jVar.R(false);
        jVar.L(j10);
        X(jVar, n.f8073l);
    }

    private void W(j jVar, e eVar) {
        jVar.H(eVar);
        this.f32667k.b(jVar, eVar);
        i iVar = this.f32668l;
        if (iVar != null) {
            iVar.b(jVar, eVar);
        }
    }

    private void X(j jVar, n nVar) {
        this.f32667k.a(jVar, nVar);
        i iVar = this.f32668l;
        if (iVar != null) {
            iVar.a(jVar, nVar);
        }
    }

    @Override // N2.a, N2.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m(String str, m mVar, b.a aVar) {
        long jNow = this.f32665i.now();
        j jVar = this.f32666j;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(mVar);
        W(jVar, e.f7977m);
    }

    @Override // N2.a, N2.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onIntermediateImageSet(String str, m mVar) {
        long jNow = this.f32665i.now();
        j jVar = this.f32666j;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(mVar);
        W(jVar, e.f7976l);
    }

    public void J(j jVar, long j10) {
        jVar.R(true);
        jVar.Q(j10);
        X(jVar, n.f8072k);
    }

    public void M() {
        this.f32666j.w();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        M();
    }

    @Override // com.facebook.drawee.drawable.F
    public void d(boolean z10) {
        if (z10) {
            J(this.f32666j, this.f32665i.now());
        } else {
            I(this.f32666j, this.f32665i.now());
        }
    }

    @Override // N2.a, N2.b
    public void e(String str, Throwable th, b.a aVar) {
        long jNow = this.f32665i.now();
        j jVar = this.f32666j;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th);
        W(jVar, e.f7978n);
        I(jVar, jNow);
    }

    @Override // N2.a, N2.b
    public void k(String str, b.a aVar) {
        long jNow = this.f32665i.now();
        j jVar = this.f32666j;
        jVar.F(aVar);
        jVar.B(str);
        W(jVar, e.f7980p);
        if (this.f32669m) {
            I(jVar, jNow);
        }
    }

    @Override // N2.a, N2.b
    public void s(String str, Object obj, b.a aVar) {
        long jNow = this.f32665i.now();
        j jVar = this.f32666j;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        W(jVar, e.f7975k);
        if (this.f32669m) {
            J(jVar, jNow);
        }
    }

    public b(InterfaceC2764b interfaceC2764b, j jVar, i iVar, boolean z10) {
        this.f32668l = null;
        this.f32665i = interfaceC2764b;
        this.f32666j = jVar;
        this.f32667k = iVar;
        this.f32669m = z10;
    }

    @Override // com.facebook.drawee.drawable.F
    public void onDraw() {
    }
}
