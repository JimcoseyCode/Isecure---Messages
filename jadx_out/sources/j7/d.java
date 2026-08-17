package J7;

import B8.n;
import J7.f;
import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.AbstractC3437f;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractC3437f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n storageManager, b containingClass) {
        super(storageManager, containingClass);
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(containingClass, "containingClass");
    }

    @Override // v8.AbstractC3437f
    protected List j() {
        InterfaceC1280e interfaceC1280eM = m();
        AbstractC2855l.e(interfaceC1280eM, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f fVarR0 = ((b) interfaceC1280eM).R0();
        return AbstractC2855l.b(fVarR0, f.a.f6828e) ? AbstractC2800q.e(e.f6823K.a((b) m(), false)) : AbstractC2855l.b(fVarR0, f.d.f6831e) ? AbstractC2800q.e(e.f6823K.a((b) m(), true)) : AbstractC2800q.j();
    }
}
