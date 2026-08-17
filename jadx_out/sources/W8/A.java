package W8;

import R8.AbstractC1397a;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class A extends AbstractC1397a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n7.f f12152j;

    public A(n7.j jVar, n7.f fVar) {
        super(jVar, true, true);
        this.f12152j = fVar;
    }

    @Override // R8.AbstractC1397a
    protected void M0(Object obj) {
        n7.f fVar = this.f12152j;
        fVar.resumeWith(R8.D.a(obj, fVar));
    }

    @Override // R8.G0
    protected final boolean f0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n7.f fVar = this.f12152j;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // R8.G0
    protected void u(Object obj) {
        AbstractC1507j.b(AbstractC3016b.c(this.f12152j), R8.D.a(obj, this.f12152j));
    }

    public void Q0() {
    }
}
