package d8;

import C8.B0;
import C8.J0;
import C8.N0;
import C8.Q;
import C8.S;
import C8.v0;
import L7.EnumC1281f;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.N;
import L7.a0;
import L7.l0;
import L7.m0;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3029k;

/* JADX INFO: renamed from: d8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2362j {
    public static final String a(InterfaceC1280e klass, InterfaceC2349G typeMappingConfiguration) {
        AbstractC2855l.g(klass, "klass");
        AbstractC2855l.g(typeMappingConfiguration, "typeMappingConfiguration");
        String strE = typeMappingConfiguration.e(klass);
        if (strE != null) {
            return strE;
        }
        InterfaceC1288m interfaceC1288mB = klass.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        String strM = k8.h.b(klass.getName()).m();
        AbstractC2855l.f(strM, "getIdentifier(...)");
        if (interfaceC1288mB instanceof N) {
            k8.c cVarD = ((N) interfaceC1288mB).d();
            if (cVarD.d()) {
                return strM;
            }
            StringBuilder sb = new StringBuilder();
            String strB = cVarD.b();
            AbstractC2855l.f(strB, "asString(...)");
            sb.append(P8.q.D(strB, '.', '/', false, 4, null));
            sb.append('/');
            sb.append(strM);
            return sb.toString();
        }
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e == null) {
            throw new IllegalArgumentException("Unexpected container: " + interfaceC1288mB + " for " + klass);
        }
        String strC = typeMappingConfiguration.c(interfaceC1280e);
        if (strC == null) {
            strC = a(interfaceC1280e, typeMappingConfiguration);
        }
        return strC + '$' + strM;
    }

    public static /* synthetic */ String b(InterfaceC1280e interfaceC1280e, InterfaceC2349G interfaceC2349G, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC2349G = C2350H.f25683a;
        }
        return a(interfaceC1280e, interfaceC2349G);
    }

    public static final boolean c(InterfaceC1276a descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        if (descriptor instanceof InterfaceC1287l) {
            return true;
        }
        S returnType = descriptor.getReturnType();
        AbstractC2855l.d(returnType);
        if (!I7.i.C0(returnType)) {
            return false;
        }
        S returnType2 = descriptor.getReturnType();
        AbstractC2855l.d(returnType2);
        return (J0.l(returnType2) || (descriptor instanceof a0)) ? false : true;
    }

    public static final Object d(S kotlinType, InterfaceC2372t factory, C2351I mode, InterfaceC2349G typeMappingConfiguration, AbstractC2369q abstractC2369q, w7.o writeGenericType) {
        Object objA;
        S s10;
        Object objD;
        AbstractC2855l.g(kotlinType, "kotlinType");
        AbstractC2855l.g(factory, "factory");
        AbstractC2855l.g(mode, "mode");
        AbstractC2855l.g(typeMappingConfiguration, "typeMappingConfiguration");
        AbstractC2855l.g(writeGenericType, "writeGenericType");
        S sD = typeMappingConfiguration.d(kotlinType);
        if (sD != null) {
            return d(sD, factory, mode, typeMappingConfiguration, abstractC2369q, writeGenericType);
        }
        if (I7.h.r(kotlinType)) {
            return d(I7.p.a(kotlinType), factory, mode, typeMappingConfiguration, abstractC2369q, writeGenericType);
        }
        D8.s sVar = D8.s.f846a;
        Object objB = AbstractC2352J.b(sVar, kotlinType, factory, mode);
        if (objB != null) {
            Object objA2 = AbstractC2352J.a(factory, objB, mode.d());
            writeGenericType.invoke(kotlinType, objA2, mode);
            return objA2;
        }
        v0 v0VarK0 = kotlinType.K0();
        if (v0VarK0 instanceof Q) {
            Q q10 = (Q) v0VarK0;
            S sH = q10.h();
            if (sH == null) {
                sH = typeMappingConfiguration.b(q10.g());
            }
            return d(H8.d.D(sH), factory, mode, typeMappingConfiguration, abstractC2369q, writeGenericType);
        }
        InterfaceC1283h interfaceC1283hP = v0VarK0.p();
        if (interfaceC1283hP == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (E8.l.m(interfaceC1283hP)) {
            Object objD2 = factory.d("error/NonExistentClass");
            typeMappingConfiguration.f(kotlinType, (InterfaceC1280e) interfaceC1283hP);
            return objD2;
        }
        boolean z10 = interfaceC1283hP instanceof InterfaceC1280e;
        if (z10 && I7.i.c0(kotlinType)) {
            if (kotlinType.I0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            B0 b02 = (B0) kotlinType.I0().get(0);
            S type = b02.getType();
            AbstractC2855l.f(type, "getType(...)");
            if (b02.a() == N0.f593l) {
                objD = factory.d("java/lang/Object");
            } else {
                N0 n0A = b02.a();
                AbstractC2855l.f(n0A, "getProjectionKind(...)");
                objD = d(type, factory, mode.f(n0A, true), typeMappingConfiguration, abstractC2369q, writeGenericType);
            }
            return factory.c('[' + factory.a(objD));
        }
        if (!z10) {
            if (interfaceC1283hP instanceof m0) {
                S sO = H8.d.o((m0) interfaceC1283hP);
                if (kotlinType.L0()) {
                    sO = H8.d.B(sO);
                }
                return d(sO, factory, mode, typeMappingConfiguration, null, M8.j.l());
            }
            if ((interfaceC1283hP instanceof l0) && mode.b()) {
                return d(((l0) interfaceC1283hP).T(), factory, mode, typeMappingConfiguration, abstractC2369q, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (AbstractC3029k.b(interfaceC1283hP) && !mode.c() && (s10 = (S) C8.H.a(sVar, kotlinType)) != null) {
            return d(s10, factory, mode.g(), typeMappingConfiguration, abstractC2369q, writeGenericType);
        }
        if (mode.e() && I7.i.l0((InterfaceC1280e) interfaceC1283hP)) {
            objA = factory.f();
        } else {
            InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1283hP;
            InterfaceC1280e interfaceC1280eA = interfaceC1280e.a();
            AbstractC2855l.f(interfaceC1280eA, "getOriginal(...)");
            objA = typeMappingConfiguration.a(interfaceC1280eA);
            if (objA == null) {
                if (interfaceC1280e.getKind() == EnumC1281f.f7323k) {
                    InterfaceC1288m interfaceC1288mB = interfaceC1280e.b();
                    AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    interfaceC1280e = (InterfaceC1280e) interfaceC1288mB;
                }
                InterfaceC1280e interfaceC1280eA2 = interfaceC1280e.a();
                AbstractC2855l.f(interfaceC1280eA2, "getOriginal(...)");
                objA = factory.d(a(interfaceC1280eA2, typeMappingConfiguration));
            }
        }
        writeGenericType.invoke(kotlinType, objA, mode);
        return objA;
    }

    public static /* synthetic */ Object e(S s10, InterfaceC2372t interfaceC2372t, C2351I c2351i, InterfaceC2349G interfaceC2349G, AbstractC2369q abstractC2369q, w7.o oVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            oVar = M8.j.l();
        }
        return d(s10, interfaceC2372t, c2351i, interfaceC2349G, abstractC2369q, oVar);
    }
}
