package F7;

import F7.AbstractC0548n;
import F7.AbstractC0552p;
import F7.K0;
import G7.i;
import G7.k;
import L7.AbstractC1294t;
import L7.InterfaceC1288m;
import i7.C2750m;
import i8.AbstractC2757a;
import j8.C2814i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import o8.AbstractC3029k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class P0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final G7.h b(K0.a aVar, boolean z10) {
        AbstractC0548n.e eVarC;
        Method methodC;
        G7.h aVar2;
        AbstractC2757a.c cVarB;
        Method methodZ;
        Method methodM;
        if (AbstractC0529d0.f2030g.a().d(aVar.j().j0())) {
            return G7.l.f3525a;
        }
        AbstractC0552p abstractC0552pF = f1.f2051a.f(aVar.j().Z());
        if (abstractC0552pF instanceof AbstractC0552p.c) {
            AbstractC0552p.c cVar = (AbstractC0552p.c) abstractC0552pF;
            AbstractC2757a.d dVarF = cVar.f();
            if (z10) {
                cVarB = dVarF.F() ? dVarF.A() : null;
                methodZ = cVarB == null ? aVar.j().S().z(cVar.d().getString(cVarB.w()), cVar.d().getString(cVarB.v())) : null;
                if (methodZ == null) {
                    aVar2 = !Modifier.isStatic(methodZ.getModifiers()) ? aVar.X() ? new i.h.a(methodZ, f(aVar)) : new i.h.e(methodZ) : d(aVar) ? aVar.X() ? new i.h.b(methodZ) : new i.h.f(methodZ) : aVar.X() ? new i.h.c(methodZ, f(aVar)) : new i.h.g(methodZ);
                } else if (AbstractC3029k.e(aVar.j().Z()) && AbstractC2855l.b(aVar.j().Z().getVisibility(), AbstractC1294t.f7346d)) {
                    Class clsT = G7.o.t(aVar.j().Z().b());
                    if (clsT == null || (methodM = G7.o.m(clsT, aVar.j().Z())) == null) {
                        throw new Y0("Underlying property of inline class " + aVar.j() + " should have a field");
                    }
                    aVar2 = aVar.X() ? new k.a(methodM, f(aVar)) : new k.b(methodM);
                } else {
                    Field fieldI0 = aVar.j().i0();
                    if (fieldI0 == null) {
                        throw new Y0("No accessors or field is found for property " + aVar.j());
                    }
                    aVar2 = c(aVar, z10, fieldI0);
                }
            } else {
                if (dVarF.G()) {
                    cVarB = dVarF.B();
                }
                if (cVarB == null) {
                }
                if (methodZ == null) {
                }
            }
        } else if (abstractC0552pF instanceof AbstractC0552p.a) {
            aVar2 = c(aVar, z10, ((AbstractC0552p.a) abstractC0552pF).b());
        } else {
            if (!(abstractC0552pF instanceof AbstractC0552p.b)) {
                if (!(abstractC0552pF instanceof AbstractC0552p.d)) {
                    throw new C2750m();
                }
                if (z10) {
                    eVarC = ((AbstractC0552p.d) abstractC0552pF).b();
                } else {
                    eVarC = ((AbstractC0552p.d) abstractC0552pF).c();
                    if (eVarC == null) {
                        throw new Y0("No setter found for property " + aVar.j());
                    }
                }
                Method methodZ2 = aVar.j().S().z(eVarC.c(), eVarC.b());
                if (methodZ2 != null) {
                    Modifier.isStatic(methodZ2.getModifiers());
                    return aVar.X() ? new i.h.a(methodZ2, f(aVar)) : new i.h.e(methodZ2);
                }
                throw new Y0("No accessor found for property " + aVar.j());
            }
            if (z10) {
                methodC = ((AbstractC0552p.b) abstractC0552pF).b();
            } else {
                AbstractC0552p.b bVar = (AbstractC0552p.b) abstractC0552pF;
                methodC = bVar.c();
                if (methodC == null) {
                    throw new Y0("No source found for setter of Java method property: " + bVar.b());
                }
            }
            aVar2 = aVar.X() ? new i.h.a(methodC, f(aVar)) : new i.h.e(methodC);
        }
        return G7.o.j(aVar2, aVar.Z(), false, 2, null);
    }

    private static final G7.i c(K0.a aVar, boolean z10, Field field) {
        return (g(aVar.j().Z()) || !Modifier.isStatic(field.getModifiers())) ? z10 ? aVar.X() ? new i.f.a(field, f(aVar)) : new i.f.c(field) : aVar.X() ? new i.g.a(field, e(aVar), f(aVar)) : new i.g.c(field, e(aVar)) : d(aVar) ? z10 ? aVar.X() ? new i.f.b(field) : new i.f.d(field) : aVar.X() ? new i.g.b(field, e(aVar)) : new i.g.d(field, e(aVar)) : z10 ? new i.f.e(field) : new i.g.e(field, e(aVar));
    }

    private static final boolean d(K0.a aVar) {
        return aVar.j().Z().getAnnotations().h(j1.j());
    }

    private static final boolean e(K0.a aVar) {
        return !C8.J0.l(aVar.j().Z().getType());
    }

    public static final Object f(K0.a aVar) {
        AbstractC2855l.g(aVar, "<this>");
        return aVar.j().e0();
    }

    private static final boolean g(L7.Z z10) {
        InterfaceC1288m interfaceC1288mB = z10.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        if (!AbstractC3027i.x(interfaceC1288mB)) {
            return false;
        }
        InterfaceC1288m interfaceC1288mB2 = interfaceC1288mB.b();
        if (AbstractC3027i.C(interfaceC1288mB2) || AbstractC3027i.t(interfaceC1288mB2)) {
            return (z10 instanceof A8.N) && C2814i.f(((A8.N) z10).D());
        }
        return true;
    }
}
