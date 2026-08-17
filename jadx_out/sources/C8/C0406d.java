package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0406d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0406d f630a = new C0406d();

    private C0406d() {
    }

    private final boolean a(G8.o oVar, G8.j jVar, G8.j jVar2) {
        if (oVar.x0(jVar) == oVar.x0(jVar2) && oVar.W(jVar) == oVar.W(jVar2)) {
            if ((oVar.B0(jVar) == null) == (oVar.B0(jVar2) == null) && oVar.V(oVar.c(jVar), oVar.c(jVar2))) {
                if (oVar.w0(jVar, jVar2)) {
                    return true;
                }
                int iX0 = oVar.x0(jVar);
                for (int i10 = 0; i10 < iX0; i10++) {
                    G8.l lVarT = oVar.T(jVar, i10);
                    G8.l lVarT2 = oVar.T(jVar2, i10);
                    if (oVar.l(lVarT) != oVar.l(lVarT2)) {
                        return false;
                    }
                    if (!oVar.l(lVarT) && (oVar.A0(lVarT) != oVar.A0(lVarT2) || !c(oVar, oVar.h(lVarT), oVar.h(lVarT2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(G8.o oVar, G8.i iVar, G8.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        G8.j jVarA = oVar.a(iVar);
        G8.j jVarA2 = oVar.a(iVar2);
        if (jVarA != null && jVarA2 != null) {
            return a(oVar, jVarA, jVarA2);
        }
        G8.g gVarB0 = oVar.b0(iVar);
        G8.g gVarB02 = oVar.b0(iVar2);
        return gVarB0 != null && gVarB02 != null && a(oVar, oVar.f(gVarB0), oVar.f(gVarB02)) && a(oVar, oVar.e(gVarB0), oVar.e(gVarB02));
    }

    public final boolean b(G8.o context, G8.i a10, G8.i b10) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return c(context, a10, b10);
    }
}
