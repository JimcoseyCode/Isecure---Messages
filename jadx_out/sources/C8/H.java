package C8;

import java.util.HashSet;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    public static final G8.i a(H0 h02, G8.i inlineClassType) {
        AbstractC2855l.g(h02, "<this>");
        AbstractC2855l.g(inlineClassType, "inlineClassType");
        return b(h02, inlineClassType, new HashSet());
    }

    private static final G8.i b(H0 h02, G8.i iVar, HashSet hashSet) {
        G8.i iVarB;
        G8.m mVarD0 = h02.D0(iVar);
        if (!hashSet.add(mVarD0)) {
            return null;
        }
        G8.n nVarN = h02.n(mVarD0);
        if (nVarN != null) {
            G8.i iVarH0 = h02.h0(nVarN);
            G8.i iVarB2 = b(h02, iVarH0, hashSet);
            if (iVarB2 != null) {
                return ((iVarB2 instanceof G8.j) && h02.j0((G8.j) iVarB2) && h02.u0(iVar) && (h02.g0(h02.D0(iVarH0)) || ((iVarH0 instanceof G8.j) && h02.j0((G8.j) iVarH0)))) ? h02.k0(iVarH0) : (h02.u0(iVarB2) || !h02.v0(iVar)) ? iVarB2 : h02.k0(iVarB2);
            }
            return null;
        }
        if (h02.g0(mVarD0)) {
            G8.i iVarA0 = h02.a0(iVar);
            if (iVarA0 == null || (iVarB = b(h02, iVarA0, hashSet)) == null) {
                return null;
            }
            if (!h02.u0(iVar)) {
                return iVarB;
            }
            if (!h02.u0(iVarB) && (!(iVarB instanceof G8.j) || !h02.j0((G8.j) iVarB))) {
                return h02.k0(iVarB);
            }
        }
        return iVar;
    }
}
