package J8;

import J8.f;
import L7.InterfaceC1300z;
import L7.t0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6869a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f6870b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // J8.f
    public String a() {
        return f6870b;
    }

    @Override // J8.f
    public String b(InterfaceC1300z interfaceC1300z) {
        return f.a.a(this, interfaceC1300z);
    }

    @Override // J8.f
    public boolean c(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        List<t0> listI = functionDescriptor.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        if (listI != null && listI.isEmpty()) {
            return true;
        }
        for (t0 t0Var : listI) {
            AbstractC2855l.d(t0Var);
            if (AbstractC3340e.f(t0Var) || t0Var.f0() != null) {
                return false;
            }
        }
        return true;
    }
}
