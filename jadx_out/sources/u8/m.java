package U8;

import i7.C2735B;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class m extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function2 f11600g;

    public m(Function2 function2) {
        this.f11600g = function2;
    }

    @Override // U8.a
    public Object d(c cVar, n7.f fVar) {
        Object objInvoke = this.f11600g.invoke(cVar, fVar);
        return objInvoke == AbstractC3016b.e() ? objInvoke : C2735B.f28704a;
    }
}
