package b8;

import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    private static final boolean a(r rVar) {
        k8.c cVarD;
        InterfaceC1814B interfaceC1814B = (InterfaceC1814B) AbstractC2800q.E0(rVar.i());
        x type = interfaceC1814B != null ? interfaceC1814B.getType() : null;
        InterfaceC1826j interfaceC1826j = type instanceof InterfaceC1826j ? (InterfaceC1826j) type : null;
        if (interfaceC1826j == null) {
            return false;
        }
        InterfaceC1825i classifier = interfaceC1826j.getClassifier();
        return (classifier instanceof InterfaceC1823g) && (cVarD = ((InterfaceC1823g) classifier).d()) != null && AbstractC2855l.b(cVarD.b(), "java.lang.Object");
    }

    private static final boolean b(r rVar) {
        String strJ = rVar.getName().j();
        int iHashCode = strJ.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strJ.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strJ.equals("hashCode")) {
                return false;
            }
        } else if (!strJ.equals("toString")) {
            return false;
        }
        return rVar.i().isEmpty();
    }

    public static final boolean c(q qVar) {
        AbstractC2855l.g(qVar, "<this>");
        return qVar.L().D() && (qVar instanceof r) && b((r) qVar);
    }
}
