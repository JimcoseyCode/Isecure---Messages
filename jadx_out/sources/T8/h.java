package T8;

import R8.AbstractC1397a;
import R8.B0;
import R8.G0;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends AbstractC1397a implements g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f10694j;

    public h(n7.j jVar, g gVar, boolean z10, boolean z11) {
        super(jVar, z10, z11);
        this.f10694j = gVar;
    }

    protected final g Q0() {
        return this.f10694j;
    }

    @Override // T8.v
    public Object a(n7.f fVar) {
        return this.f10694j.a(fVar);
    }

    @Override // T8.w
    public Object b(Object obj, n7.f fVar) {
        return this.f10694j.b(obj, fVar);
    }

    @Override // T8.v
    public Object c() {
        return this.f10694j.c();
    }

    @Override // T8.w
    public boolean h(Throwable th) {
        return this.f10694j.h(th);
    }

    @Override // T8.v
    public i iterator() {
        return this.f10694j.iterator();
    }

    @Override // R8.G0, R8.A0
    public final void k(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new B0(E(), null, this);
        }
        z(cancellationException);
    }

    @Override // T8.w
    public Object l(Object obj) {
        return this.f10694j.l(obj);
    }

    @Override // R8.G0
    public void z(Throwable th) {
        CancellationException cancellationExceptionF0 = G0.F0(this, th, null, 1, null);
        this.f10694j.k(cancellationExceptionF0);
        x(cancellationExceptionF0);
    }
}
