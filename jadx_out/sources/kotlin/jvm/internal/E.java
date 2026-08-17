package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class E {
    public C7.d b(Class cls) {
        return new C2848e(cls);
    }

    public C7.f c(Class cls, String str) {
        return new r(cls, str);
    }

    public String h(InterfaceC2851h interfaceC2851h) {
        String string = interfaceC2851h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(n nVar) {
        return h(nVar);
    }

    public C7.o j(C7.e eVar, List list, boolean z10) {
        return new L(eVar, list, z10);
    }

    public C7.g a(AbstractC2852i abstractC2852i) {
        return abstractC2852i;
    }

    public C7.i d(o oVar) {
        return oVar;
    }

    public C7.l e(s sVar) {
        return sVar;
    }

    public C7.m f(u uVar) {
        return uVar;
    }

    public C7.n g(w wVar) {
        return wVar;
    }
}
