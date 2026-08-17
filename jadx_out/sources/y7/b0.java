package Y7;

import Y7.U;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 extends U {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(X7.k c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        AbstractC2855l.g(c10, "c");
    }

    @Override // Y7.U
    protected void C(k8.f name, Collection result) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
    }

    @Override // Y7.U
    protected L7.c0 O() {
        return null;
    }

    @Override // Y7.U
    protected U.a Y(b8.r method, List methodTypeParameters, C8.S returnType, List valueParameters) {
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(methodTypeParameters, "methodTypeParameters");
        AbstractC2855l.g(returnType, "returnType");
        AbstractC2855l.g(valueParameters, "valueParameters");
        return new U.a(returnType, null, valueParameters, methodTypeParameters, false, AbstractC2800q.j());
    }
}
