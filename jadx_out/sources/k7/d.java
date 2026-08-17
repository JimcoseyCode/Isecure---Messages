package K7;

import L7.InterfaceC1280e;
import j7.AbstractC2800q;
import j7.T;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7130a = new d();

    private d() {
    }

    public static /* synthetic */ InterfaceC1280e f(d dVar, k8.c cVar, I7.i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, iVar, num);
    }

    public final InterfaceC1280e a(InterfaceC1280e mutable) {
        AbstractC2855l.g(mutable, "mutable");
        k8.c cVarO = c.f7110a.o(AbstractC3027i.m(mutable));
        if (cVarO != null) {
            InterfaceC1280e interfaceC1280eO = AbstractC3340e.m(mutable).o(cVarO);
            AbstractC2855l.f(interfaceC1280eO, "getBuiltInClassByFqName(...)");
            return interfaceC1280eO;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC1280e b(InterfaceC1280e readOnly) {
        AbstractC2855l.g(readOnly, "readOnly");
        k8.c cVarP = c.f7110a.p(AbstractC3027i.m(readOnly));
        if (cVarP != null) {
            InterfaceC1280e interfaceC1280eO = AbstractC3340e.m(readOnly).o(cVarP);
            AbstractC2855l.f(interfaceC1280eO, "getBuiltInClassByFqName(...)");
            return interfaceC1280eO;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC1280e mutable) {
        AbstractC2855l.g(mutable, "mutable");
        return c.f7110a.k(AbstractC3027i.m(mutable));
    }

    public final boolean d(InterfaceC1280e readOnly) {
        AbstractC2855l.g(readOnly, "readOnly");
        return c.f7110a.l(AbstractC3027i.m(readOnly));
    }

    public final InterfaceC1280e e(k8.c fqName, I7.i builtIns, Integer num) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(builtIns, "builtIns");
        k8.b bVarM = (num == null || !AbstractC2855l.b(fqName, c.f7110a.h())) ? c.f7110a.m(fqName) : I7.o.a(num.intValue());
        if (bVarM != null) {
            return builtIns.o(bVarM.a());
        }
        return null;
    }

    public final Collection g(k8.c fqName, I7.i builtIns) {
        AbstractC2855l.g(fqName, "fqName");
        AbstractC2855l.g(builtIns, "builtIns");
        InterfaceC1280e interfaceC1280eF = f(this, fqName, builtIns, null, 4, null);
        if (interfaceC1280eF == null) {
            return T.e();
        }
        k8.c cVarP = c.f7110a.p(AbstractC3340e.p(interfaceC1280eF));
        return cVarP == null ? T.d(interfaceC1280eF) : AbstractC2800q.m(interfaceC1280eF, builtIns.o(cVarP));
    }
}
