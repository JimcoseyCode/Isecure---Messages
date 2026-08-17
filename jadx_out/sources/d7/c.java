package D7;

import C7.g;
import C7.m;
import F7.A;
import F7.C0539i0;
import F7.X;
import L7.InterfaceC1287l;
import L7.InterfaceC1300z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Collection a(C7.d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        Collection collectionL = ((X.a) ((X) dVar).W().getValue()).L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionL) {
            A a10 = (A) obj;
            if (e(a10) && (a10 instanceof m)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Collection b(C7.d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        Collection collectionH = ((X.a) ((X) dVar).W().getValue()).H();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionH) {
            A a10 = (A) obj;
            if (e(a10) && (a10 instanceof m)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final g c(C7.d dVar) {
        Object next;
        AbstractC2855l.g(dVar, "<this>");
        Iterator it = ((X) dVar).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            g gVar = (g) next;
            AbstractC2855l.e(gVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            InterfaceC1300z interfaceC1300zZ = ((C0539i0) gVar).Z();
            AbstractC2855l.e(interfaceC1300zZ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((InterfaceC1287l) interfaceC1300zZ).A()) {
                break;
            }
        }
        return (g) next;
    }

    private static final boolean d(A a10) {
        return a10.Z().h0() != null;
    }

    private static final boolean e(A a10) {
        return !d(a10);
    }
}
