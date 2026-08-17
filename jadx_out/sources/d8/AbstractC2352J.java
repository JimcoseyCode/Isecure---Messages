package d8;

import C8.H0;
import K7.c;
import c8.AbstractC1916l0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import t8.C3381d;
import t8.EnumC3382e;

/* JADX INFO: renamed from: d8.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2352J {
    public static final Object a(InterfaceC2372t interfaceC2372t, Object possiblyPrimitiveType, boolean z10) {
        AbstractC2855l.g(interfaceC2372t, "<this>");
        AbstractC2855l.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? interfaceC2372t.e(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object b(H0 h02, G8.i type, InterfaceC2372t typeFactory, C2351I mode) {
        List listI;
        AbstractC2855l.g(h02, "<this>");
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(typeFactory, "typeFactory");
        AbstractC2855l.g(mode, "mode");
        G8.m mVarD0 = h02.D0(type);
        if (!h02.t0(mVarD0)) {
            return null;
        }
        I7.l lVarD0 = h02.d0(mVarD0);
        if (lVarD0 != null) {
            return a(typeFactory, typeFactory.b(lVarD0), h02.u0(type) || AbstractC1916l0.c(h02, type));
        }
        I7.l lVarP = h02.P(mVarD0);
        if (lVarP != null) {
            return typeFactory.c('[' + EnumC3382e.j(lVarP).m());
        }
        if (h02.A(mVarD0)) {
            k8.d dVarP = h02.p(mVarD0);
            k8.b bVarN = dVarP != null ? K7.c.f7110a.n(dVarP) : null;
            if (bVarN != null) {
                if (!mode.a() && ((listI = K7.c.f7110a.i()) == null || !listI.isEmpty())) {
                    Iterator it = listI.iterator();
                    while (it.hasNext()) {
                        if (AbstractC2855l.b(((c.a) it.next()).d(), bVarN)) {
                            return null;
                        }
                    }
                }
                String strH = C3381d.h(bVarN);
                AbstractC2855l.f(strH, "internalNameByClassId(...)");
                return typeFactory.d(strH);
            }
        }
        return null;
    }
}
