package d8;

import d8.C2343A;
import h8.InterfaceC2710c;
import i8.AbstractC2757a;
import j8.AbstractC2809d;
import j8.C2814i;
import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;

/* JADX INFO: renamed from: d8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2358f {
    public static final C2343A a(f8.n proto, InterfaceC2710c nameResolver, h8.g typeTable, boolean z10, boolean z11, boolean z12) {
        AbstractC2855l.g(proto, "proto");
        AbstractC2855l.g(nameResolver, "nameResolver");
        AbstractC2855l.g(typeTable, "typeTable");
        AbstractC2950i.f propertySignature = AbstractC2757a.f28747d;
        AbstractC2855l.f(propertySignature, "propertySignature");
        AbstractC2757a.d dVar = (AbstractC2757a.d) h8.e.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            AbstractC2809d.a aVarC = C2814i.f28956a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return C2343A.f25678b.b(aVarC);
        }
        if (!z11 || !dVar.H()) {
            return null;
        }
        C2343A.a aVar = C2343A.f25678b;
        AbstractC2757a.c cVarC = dVar.C();
        AbstractC2855l.f(cVarC, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, cVarC);
    }

    public static /* synthetic */ C2343A b(f8.n nVar, InterfaceC2710c interfaceC2710c, h8.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(nVar, interfaceC2710c, gVar, z10, z11, z12);
    }
}
