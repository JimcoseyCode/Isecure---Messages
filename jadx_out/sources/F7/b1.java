package F7;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC2846c;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.InterfaceC2847d;
import kotlin.jvm.internal.InterfaceC2851h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b1 extends kotlin.jvm.internal.E {
    private static AbstractC0529d0 k(AbstractC2846c abstractC2846c) {
        C7.f owner = abstractC2846c.getOwner();
        return owner instanceof AbstractC0529d0 ? (AbstractC0529d0) owner : C0542k.f2075j;
    }

    @Override // kotlin.jvm.internal.E
    public C7.g a(AbstractC2852i abstractC2852i) {
        return new C0539i0(k(abstractC2852i), abstractC2852i.getName(), abstractC2852i.getSignature(), abstractC2852i.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.E
    public C7.d b(Class cls) {
        return AbstractC0536h.m(cls);
    }

    @Override // kotlin.jvm.internal.E
    public C7.f c(Class cls, String str) {
        return AbstractC0536h.n(cls);
    }

    @Override // kotlin.jvm.internal.E
    public C7.i d(kotlin.jvm.internal.o oVar) {
        return new C0547m0(k(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.E
    public C7.l e(kotlin.jvm.internal.s sVar) {
        return new B0(k(sVar), sVar.getName(), sVar.getSignature(), sVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.E
    public C7.m f(kotlin.jvm.internal.u uVar) {
        return new E0(k(uVar), uVar.getName(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.E
    public C7.n g(kotlin.jvm.internal.w wVar) {
        return new H0(k(wVar), wVar.getName(), wVar.getSignature());
    }

    @Override // kotlin.jvm.internal.E
    public String h(InterfaceC2851h interfaceC2851h) {
        C0539i0 c0539i0C;
        C7.g gVarA = E7.d.a(interfaceC2851h);
        return (gVarA == null || (c0539i0C = j1.c(gVarA)) == null) ? super.h(interfaceC2851h) : e1.f2045a.h(c0539i0C.Z());
    }

    @Override // kotlin.jvm.internal.E
    public String i(kotlin.jvm.internal.n nVar) {
        return h(nVar);
    }

    @Override // kotlin.jvm.internal.E
    public C7.o j(C7.e eVar, List list, boolean z10) {
        return eVar instanceof InterfaceC2847d ? AbstractC0536h.k(((InterfaceC2847d) eVar).b(), list, z10) : D7.d.b(eVar, list, z10, Collections.EMPTY_LIST);
    }
}
