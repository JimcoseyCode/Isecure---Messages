package L7;

import C8.AbstractC0407d0;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3029k;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: L7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1293s {
    public static final InterfaceC1283h a(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        InterfaceC1288m interfaceC1288mB = interfaceC1288m.b();
        if (interfaceC1288mB != null && !(interfaceC1288m instanceof N)) {
            if (!b(interfaceC1288mB)) {
                return a(interfaceC1288mB);
            }
            if (interfaceC1288mB instanceof InterfaceC1283h) {
                return (InterfaceC1283h) interfaceC1288mB;
            }
        }
        return null;
    }

    public static final boolean b(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return interfaceC1288m.b() instanceof N;
    }

    public static final boolean c(InterfaceC1300z interfaceC1300z) {
        AbstractC0407d0 abstractC0407d0R;
        C8.S sD;
        C8.S returnType;
        AbstractC2855l.g(interfaceC1300z, "<this>");
        InterfaceC1288m interfaceC1288mB = interfaceC1300z.b();
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e != null) {
            InterfaceC1280e interfaceC1280e2 = AbstractC3029k.g(interfaceC1280e) ? interfaceC1280e : null;
            if (interfaceC1280e2 != null && (abstractC0407d0R = interfaceC1280e2.r()) != null && (sD = H8.d.D(abstractC0407d0R)) != null && (returnType = interfaceC1300z.getReturnType()) != null && AbstractC2855l.b(interfaceC1300z.getName(), J8.t.f6914e) && ((H8.d.s(returnType) || H8.d.t(returnType)) && interfaceC1300z.i().size() == 1)) {
                C8.S type = ((t0) interfaceC1300z.i().get(0)).getType();
                AbstractC2855l.f(type, "getType(...)");
                if (AbstractC2855l.b(H8.d.D(type), sD) && interfaceC1300z.m0().isEmpty() && interfaceC1300z.h0() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final InterfaceC1280e d(H h10, k8.c fqName, T7.b lookupLocation) {
        InterfaceC1283h interfaceC1283hF;
        InterfaceC3442k interfaceC3442kV0;
        AbstractC2855l.g(h10, "<this>");
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        k8.c cVarE = fqName.e();
        AbstractC2855l.f(cVarE, "parent(...)");
        InterfaceC3442k interfaceC3442kO = h10.e0(cVarE).o();
        k8.f fVarG = fqName.g();
        AbstractC2855l.f(fVarG, "shortName(...)");
        InterfaceC1283h interfaceC1283hF2 = interfaceC3442kO.f(fVarG, lookupLocation);
        InterfaceC1280e interfaceC1280e = interfaceC1283hF2 instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hF2 : null;
        if (interfaceC1280e != null) {
            return interfaceC1280e;
        }
        k8.c cVarE2 = fqName.e();
        AbstractC2855l.f(cVarE2, "parent(...)");
        InterfaceC1280e interfaceC1280eD = d(h10, cVarE2, lookupLocation);
        if (interfaceC1280eD == null || (interfaceC3442kV0 = interfaceC1280eD.v0()) == null) {
            interfaceC1283hF = null;
        } else {
            k8.f fVarG2 = fqName.g();
            AbstractC2855l.f(fVarG2, "shortName(...)");
            interfaceC1283hF = interfaceC3442kV0.f(fVarG2, lookupLocation);
        }
        if (interfaceC1283hF instanceof InterfaceC1280e) {
            return (InterfaceC1280e) interfaceC1283hF;
        }
        return null;
    }
}
