package j9;

import e9.D;
import e9.v;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28958a = new a();

    private a() {
    }

    @Override // e9.v
    public D intercept(v.a chain) {
        AbstractC2855l.g(chain, "chain");
        k9.g gVar = (k9.g) chain;
        return k9.g.c(gVar, 0, gVar.e().r(gVar), null, 0, 0, 0, 61, null).a(gVar.i());
    }
}
