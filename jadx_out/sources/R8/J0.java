package R8;

import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class J0 extends R0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n7.f f10141j;

    public J0(n7.j jVar, Function2 function2) {
        super(jVar, false);
        this.f10141j = AbstractC3016b.a(function2, this, this);
    }

    @Override // R8.G0
    protected void s0() throws Throwable {
        X8.a.c(this.f10141j, this);
    }
}
