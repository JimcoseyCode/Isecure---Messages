package E7;

import C7.e;
import C7.o;
import C7.p;
import F7.U0;
import F7.Y0;
import L7.EnumC1281f;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final C7.d a(e eVar) {
        Object obj;
        C7.d dVarB;
        AbstractC2855l.g(eVar, "<this>");
        if (eVar instanceof C7.d) {
            return (C7.d) eVar;
        }
        if (!(eVar instanceof p)) {
            throw new Y0("Cannot calculate JVM erasure for type: " + eVar);
        }
        List upperBounds = ((p) eVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            o oVar = (o) next;
            AbstractC2855l.e(oVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC1283h interfaceC1283hP = ((U0) oVar).v().K0().p();
            InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
            if (interfaceC1280e != null && interfaceC1280e.getKind() != EnumC1281f.f7321i && interfaceC1280e.getKind() != EnumC1281f.f7324l) {
                obj = next;
                break;
            }
        }
        o oVar2 = (o) obj;
        if (oVar2 == null) {
            oVar2 = (o) AbstractC2800q.g0(upperBounds);
        }
        return (oVar2 == null || (dVarB = b(oVar2)) == null) ? D.b(Object.class) : dVarB;
    }

    public static final C7.d b(o oVar) {
        C7.d dVarA;
        AbstractC2855l.g(oVar, "<this>");
        e classifier = oVar.getClassifier();
        if (classifier != null && (dVarA = a(classifier)) != null) {
            return dVarA;
        }
        throw new Y0("Cannot calculate JVM erasure for type: " + oVar);
    }
}
