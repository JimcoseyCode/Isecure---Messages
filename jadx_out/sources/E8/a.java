package E8;

import C8.E0;
import C8.G0;
import L7.AbstractC1294t;
import L7.E;
import L7.EnumC1281f;
import L7.H;
import L7.InterfaceC1280e;
import L7.h0;
import O7.C1330i;
import O7.C1332k;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import j7.T;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends C1332k {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(k8.f name) {
        AbstractC2855l.g(name, "name");
        l lVar = l.f1253a;
        H hI = lVar.i();
        E e10 = E.f7285j;
        EnumC1281f enumC1281f = EnumC1281f.f7320h;
        List listJ = AbstractC2800q.j();
        h0 h0Var = h0.f7335a;
        super(hI, name, e10, enumC1281f, listJ, h0Var, false, B8.f.f411e);
        C1330i c1330iK1 = C1330i.k1(this, M7.h.f7570a.b(), true, h0Var);
        c1330iK1.n1(AbstractC2800q.j(), AbstractC1294t.f7346d);
        AbstractC2855l.f(c1330iK1, "apply(...)");
        InterfaceC3442k interfaceC3442kB = l.b(h.f1150p, c1330iK1.getName().toString(), PointerEventHelper.POINTER_TYPE_UNKNOWN);
        k kVar = k.f1250z0;
        c1330iK1.d1(new i(lVar.e(kVar, new String[0]), interfaceC3442kB, kVar, null, false, new String[0], 24, null));
        H0(interfaceC3442kB, T.d(c1330iK1), c1330iK1);
    }

    @Override // O7.AbstractC1322a, L7.j0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1280e c(G0 substitutor) {
        AbstractC2855l.g(substitutor, "substitutor");
        return this;
    }

    @Override // O7.AbstractC1322a, O7.z
    public InterfaceC3442k G(E0 typeSubstitution, D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(typeSubstitution, "typeSubstitution");
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.f1150p, getName().toString(), typeSubstitution.toString());
    }

    @Override // O7.C1332k
    public String toString() {
        String strJ = getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return strJ;
    }
}
