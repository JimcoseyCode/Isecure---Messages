package y8;

import L7.r0;
import h8.InterfaceC2710c;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z {
    public static final r0 a(f8.c cVar, InterfaceC2710c nameResolver, h8.g typeTable, Function1 typeDeserializer, Function1 typeOfPublicProperty) {
        G8.j jVar;
        List listR0;
        AbstractC2855l.g(cVar, "<this>");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2855l.g(typeDeserializer, "typeDeserializer");
        AbstractC2855l.g(typeOfPublicProperty, "typeOfPublicProperty");
        if (cVar.L0() <= 0) {
            if (!cVar.n1()) {
                return null;
            }
            k8.f fVarB = AbstractC3638L.b(nameResolver, cVar.I0());
            f8.q qVarI = h8.f.i(cVar, typeTable);
            if ((qVarI != null && (jVar = (G8.j) typeDeserializer.invoke(qVarI)) != null) || (jVar = (G8.j) typeOfPublicProperty.invoke(fVarB)) != null) {
                return new L7.A(fVarB, jVar);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC3638L.b(nameResolver, cVar.E0()) + " with property " + fVarB).toString());
        }
        List<Integer> listM0 = cVar.M0();
        AbstractC2855l.f(listM0, "getMultiFieldValueClassUnderlyingNameList(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM0, 10));
        for (Integer num : listM0) {
            AbstractC2855l.d(num);
            arrayList.add(AbstractC3638L.b(nameResolver, num.intValue()));
        }
        Pair pairA = i7.t.a(Integer.valueOf(cVar.P0()), Integer.valueOf(cVar.O0()));
        if (AbstractC2855l.b(pairA, i7.t.a(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> listQ0 = cVar.Q0();
            AbstractC2855l.f(listQ0, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            listR0 = new ArrayList(AbstractC2800q.u(listQ0, 10));
            for (Integer num2 : listQ0) {
                AbstractC2855l.d(num2);
                listR0.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!AbstractC2855l.b(pairA, i7.t.a(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + AbstractC3638L.b(nameResolver, cVar.E0()) + " has illegal multi-field value class representation").toString());
            }
            listR0 = cVar.R0();
        }
        AbstractC2855l.d(listR0);
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listR0, 10));
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new L7.I(AbstractC2800q.X0(arrayList, arrayList2));
    }
}
