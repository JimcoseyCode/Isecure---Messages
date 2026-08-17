package J8;

import C8.S;
import I7.n;
import J8.f;
import L7.InterfaceC1300z;
import L7.t0;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6863a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f6864b = "second parameter must be of type KProperty<*> or its supertype";

    private j() {
    }

    @Override // J8.f
    public String a() {
        return f6864b;
    }

    @Override // J8.f
    public String b(InterfaceC1300z interfaceC1300z) {
        return f.a.a(this, interfaceC1300z);
    }

    @Override // J8.f
    public boolean c(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        t0 t0Var = (t0) functionDescriptor.i().get(1);
        n.b bVar = I7.n.f5095k;
        AbstractC2855l.d(t0Var);
        S sA = bVar.a(AbstractC3340e.s(t0Var));
        if (sA == null) {
            return false;
        }
        S type = t0Var.getType();
        AbstractC2855l.f(type, "getType(...)");
        return H8.d.w(sA, H8.d.A(type));
    }
}
