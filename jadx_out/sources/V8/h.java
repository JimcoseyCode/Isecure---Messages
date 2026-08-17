package V8;

import i7.C2735B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    public /* synthetic */ h(U8.b bVar, n7.j jVar, int i10, T8.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? n7.k.f30068g : jVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? T8.a.f10646g : aVar);
    }

    @Override // V8.e
    protected e g(n7.j jVar, int i10, T8.a aVar) {
        return new h(this.f11859j, jVar, i10, aVar);
    }

    @Override // V8.g
    protected Object n(U8.c cVar, n7.f fVar) {
        Object objB = this.f11859j.b(cVar, fVar);
        return objB == AbstractC3016b.e() ? objB : C2735B.f28704a;
    }

    public h(U8.b bVar, n7.j jVar, int i10, T8.a aVar) {
        super(bVar, jVar, i10, aVar);
    }
}
